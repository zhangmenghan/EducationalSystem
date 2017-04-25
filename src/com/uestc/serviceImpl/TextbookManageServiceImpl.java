package com.uestc.serviceImpl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uestc.mapper.TextbookMapper;
import com.uestc.model.Classinfo;
import com.uestc.model.Classroom;

import com.uestc.model.Courseplan;
import com.uestc.model.Specialityinfo;
import com.uestc.model.Studentinfo;
import com.uestc.model.Teachplan;
import com.uestc.model.Textbook;
import com.uestc.newmapper.TeachplanManageMapper;
import com.uestc.newmapper.TextbookManageMapper;
import com.uestc.newmodel.TextbookAndYearType;
import com.uestc.service.TextbookManageService;
import com.uestc.util.ReadWriteExcel;
import com.uestc.util.WriteExcel;
@Service
public class TextbookManageServiceImpl implements TextbookManageService {
	
	@Autowired
	private TextbookMapper textbookMapper;
	@Autowired
	private TextbookManageMapper textbookManageMapper;
	@Autowired
	private TeachplanManageMapper teachplanManageMapper;

	@Override
	public int doUploadTextbookInfo(String fileUrl) throws Exception {
		ReadWriteExcel rw=new ReadWriteExcel();
		@SuppressWarnings("static-access")
		List<List<List<String>>> excelList=rw.getExcelList(fileUrl, 0);//从第1行读取数据
		List<List<String>> sheet1=excelList.get(0);
		
		System.out.println("共"+(sheet1.size()-3)+"行数据");
		
		java.text.SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");//设置date格式
		Date date=new Date();
		java.sql.Date sqlDate;
		int row , column;
		int finalResult=1;//如果在读取excel文件时，只要出现存储的错误，就会将finalResult置为0
		//前三行为表头及备注等信息，从第四行开始读取数据
		for(row =3 ;row < sheet1.size();row ++){
			Textbook textbook=new Textbook();//用于封装从Excel中读取的一行数据
			for(column = 0 ;column<sheet1.get(row).size();column++){
				if(sheet1.get(row).get(column).equals("#")){
					continue;
					//由于读取excel文件时，空字符用#来代替，存储进数据库是需要将#转换为空字符""
					//sheet1.get(row).set(column, "");
				}
				switch(column){
				case 0:
					//根据课程名称，查找该课程的ID
					Teachplan course=teachplanManageMapper.selectByCourseName(sheet1.get(row).get(column));
					//设置教材关联的课程ID
					textbook.setCourseId(course.getCourseId());
					break;
				case 1:
					//设置教材名称
					textbook.setTextbookName(sheet1.get(row).get(column));
					break;
				case 2:
					//设置出版社
					textbook.setPublisher(sheet1.get(row).get(column));
					break;
				case 3:
					date =  formatter.parse(sheet1.get(row).get(column));//将string转换为date
					sqlDate = new java.sql.Date(date.getTime());//将date转换为sql.date
					textbook.setPubtime(sqlDate);//设置出版时间
					break;
				case 4:
					textbook.setAuthor(sheet1.get(row).get(column));//设置教材的作者
					break;
				case 5:
					textbook.setISBN(sheet1.get(row).get(column));//设置教材的ISBN
					break;
				}
			}
			//完成了一层循环，读取到Excel的一行记录
			
			//下面，将读取到的改行记录存储进数据库
			if(textbook != null){		//防止读取一行空记录
				List<Textbook> textbookList=textbookManageMapper.selectByCourseId(textbook.getCourseId());//从数据库中查找该教材信息是否存在
				int result;//接收数据库操作的结果，1表示操作成功，0表示操作失败
				if(textbookList != null  && textbookList.size() != 0){
					//如果从数据库中查找到该教材的信息，则执行更新操作
					result=textbookManageMapper.updateSelectiveByISBN(textbook);
					if(result == 0){
						finalResult=0;
						throw new Exception("修改教材:"+textbook.getTextbookName()+"的信息失败!");
					}
				}
				else{
					//如果没有从数据库中查找到该教材的信息，则执行插入操作
//					result=textbookManageMapper.insertSelective(textbook);
					result=textbookMapper.insert(textbook);
					if(result == 0){
						finalResult=0;
						throw new Exception("添加教材:"+textbook.getTextbookName()+"的信息失败!");
					}
				}
			}
			
			
		}
		
		return finalResult;
	}

	@Override
	public void doExportTextbookInfo() throws Exception {
		List<Textbook> textbokList = textbookManageMapper.selectAllTextbook();
		List<List<List<String>>> excelList = new ArrayList<List<List<String>>>();
		List<List<String>> sheetList1 = new ArrayList<List<String>>();
		java.text.SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");//设置date格式
		
		java.sql.Date sqlDate;
		int row , column ;
		for(row = 0 ; row < textbokList.size() ;row ++){
			List<String> rowList=new ArrayList<String>();
			for (column = 0 ; column< 6;column ++){
				
				switch(column){
				case 0:
					//获取课程名称
					String courseName=teachplanManageMapper.selectCourseNameByCourseId(textbokList.get(row).getCourseId());
					rowList.add(courseName);
					break;
				case 1:
					//获取教材名称
					rowList.add(textbokList.get(row).getTextbookName());
					break;
				case 2:
					//获取出版社
					rowList.add(textbokList.get(row).getPublisher());
					break;
				case 3:
					//获取出版时间
					Date date=textbokList.get(row).getPubtime();
					//将date转换为string
					String publishTime=formatter.format(date);
					
					rowList.add(publishTime);
					break;
				case 4:
					//获取作者
					rowList.add(textbokList.get(row).getAuthor());
					break;
				case 5:
					//获取ISBN
					rowList.add(textbokList.get(row).getISBN());
					break;
				
				}
			}
			sheetList1.add(rowList);
			
		}
		excelList.add(sheetList1);
		
		
		String originXlsxPath = "E:/EXCEL/教材表模板.xls";
		String finalXlsxPath = "E:/EXCEl/教材表（导出）.xls";
		
		int rowBeginNumber = 3;
		
		WriteExcel writeExcel = new WriteExcel();
		writeExcel.writeExcel(excelList, originXlsxPath, finalXlsxPath, rowBeginNumber);
		
	}

	@Override
	public List<TextbookAndYearType> getAllTextbookInfo() throws Exception {
		List<Textbook> textbookList=textbookManageMapper.selectAllTextbook();
		List<TextbookAndYearType> tayList=new ArrayList<TextbookAndYearType>();//存放用于展示的教材信息，添加了学制字段
		for(int i=0;i< textbookList.size();i++){
			byte schoolYearType=teachplanManageMapper.selectYearTypeById(textbookList.get(i).getCourseId());//根据课程ID获取课程学制
			String courseName=teachplanManageMapper.selectCourseNameByCourseId(textbookList.get(i).getCourseId());
			TextbookAndYearType tay=new TextbookAndYearType();
			tay.setCourseId(textbookList.get(i).getCourseId());
			tay.setCourseName(courseName);
			tay.setISBN((textbookList.get(i).getISBN()));
			tay.setPublisher((textbookList.get(i).getPublisher()));
			tay.setPubtime((textbookList.get(i).getPubtime()));
			tay.setAuthor((textbookList.get(i).getAuthor()));
			tay.setTextbookName((textbookList.get(i).getTextbookName()));
			if(schoolYearType==3){
				tay.setSchoolYearType("三年制");
			}else if(schoolYearType==3){
				tay.setSchoolYearType("五年制");
			}
			
			tayList.add(tay);
		}
		return tayList;
	}
}
