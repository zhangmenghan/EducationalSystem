package com.uestc.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uestc.mapper.TeacherinfoMapper;
import com.uestc.mapper.UserinfoMapper;
import com.uestc.model.Studentinfo;
import com.uestc.model.Teacherinfo;
import com.uestc.model.Textbook;
import com.uestc.model.Userinfo;
import com.uestc.newmapper.TeacherManageMapper;
import com.uestc.service.TeacherinfoManageService;
import com.uestc.util.ReadWriteExcel;
import com.uestc.util.WriteExcel;
@Service
public class TeacherinfoManageServiceImpl implements TeacherinfoManageService {
	@Autowired
	private TeacherinfoMapper teacherinfoMapper;
	@Autowired
	private TeacherManageMapper teacherManageMapper;
	@Autowired
	private UserinfoMapper userinfoMapper;
	
	@Override
	public void createTeacherAccount(Teacherinfo teacher) throws Exception {
		

	}

	@Override
	public void deleteTeacherAccount(String teacherId) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Teacherinfo> getTeacherInfoByName(String teacherName) throws Exception {
		List<Teacherinfo> teacherList=teacherManageMapper.selectByName();
		if(teacherList == null || teacherList.size() == 0){
			throw new Exception("查找教师"+teacherName+"的信息失败");
		}
		return teacherList;
	}

	@Override
	public Teacherinfo getTeacherInfoById(String teacherId) throws Exception {
		Teacherinfo teacher=teacherinfoMapper.selectByPrimaryKey(teacherId);
		if(teacher == null){
			throw new Exception("查找教师"+teacherId+"的信息失败");
		}
		return teacher;
	}
	
	
	@Override
	public void editTeacherInfo(Teacherinfo teacher) throws Exception {
		// TODO Auto-generated method stub

	}
	
	
	@Override
	public void doExportTeacherInfo(List<Teacherinfo> teacherInfo) throws Exception {
		List<Teacherinfo> teacherList = teacherManageMapper.selectAllTeacher();
		List<List<List<String>>> excelList = new ArrayList<List<List<String>>>();
		List<List<String>> sheetList1 = new ArrayList<List<String>>();
		
		int row , column ;
		for(row = 0 ; row < teacherList.size() ;row ++){
			List<String> rowList=new ArrayList<String>();
			for (column = 0 ; column< 6;column ++){
				
				switch(column){
				case 0:
					//获取教师工号
					rowList.add(teacherList.get(row).getTeacherId());
					break;
				case 1:
					//获取教师姓名
					rowList.add(teacherList.get(row).getTeacherName());
					break;
				case 2:
					//获取身份证号
					rowList.add(teacherList.get(row).getTeacherIDcard());
					break;
				case 3:
					//获取性别
					if(teacherList.get(row).getTeacherGender() == (byte)1){
						rowList.add("男");
					}else if(teacherList.get(row).getTeacherGender() == (byte)0){
						rowList.add("女");
					}
					break;
				case 4:
					//获取手机号码
					rowList.add(teacherList.get(row).getContactNumber());
					break;
				case 5:
					//获取聘用校区
					rowList.add(teacherList.get(row).getHireCampus());
					break;
				case 6:
					//获取工作职称
					rowList.add(teacherList.get(row).getCurrentWorkTitle());
					break;
				case 7:
					//获取工作职务
					rowList.add(teacherList.get(row).getCurrentWorkDuty());
					break;
				case 8:
					//获取教师类型
					if(teacherList.get(row).getTeacherType() == (byte)1){
						rowList.add("在职");
					}else if(teacherList.get(row).getTeacherType() == (byte)2){
						rowList.add("离职");
					}else if(teacherList.get(row).getTeacherType() == (byte)3){
						rowList.add("外聘");
					}
					break;
				}
			}
			sheetList1.add(rowList);
			
		}
		excelList.add(sheetList1);
		
		
		String originXlsxPath = "E:/EXCEL/教师信息（模板）.xls";
		String finalXlsxPath = "E:/EXCEl/教师信息（导出）.xls";
		
		int rowBeginNumber = 3;
		
		WriteExcel writeExcel = new WriteExcel();
		writeExcel.writeExcel(excelList, originXlsxPath, finalXlsxPath, rowBeginNumber);

	}

	

	@Override
	public int doUploadTeacherInfo(String fileUrl) throws Exception {
		ReadWriteExcel rw=new ReadWriteExcel();
		@SuppressWarnings("static-access")
		//将excel中的数据封装为三维数组
		List<List<List<String>>> excelList=rw.getExcelList(fileUrl, 0);
		List<List<String>> sheet1=excelList.get(0);
		
		int row , column;
		int finalResult=1;
		for(row =3 ;row < sheet1.size();row ++){
			Teacherinfo teacher=new Teacherinfo();	
			for(column = 0 ;column<sheet1.get(row).size();column++){
				if(sheet1.get(row).get(column).equals("#")){
					//由于读取excel文件时，空字符用#来代替，存储进数据库是需要将#转换为空字符""
					sheet1.get(row).set(column, "");
				}
				switch(column){
				case 0:
					//设置教师工号
					teacher.setTeacherId(sheet1.get(row).get(column));
					break;
				case 1:
					//设置教师姓名
					teacher.setTeacherName(sheet1.get(row).get(column));
					break;
				case 2:
					//设置教师身份证号
					teacher.setTeacherIDcard(sheet1.get(row).get(column));
					break;
				case 3:
					//设置教师性别
					if(sheet1.get(row).get(column).equals("男")){
						teacher.setTeacherGender((byte)1);
					}else{
						teacher.setTeacherGender((byte)0);
					}
					break;
				case 4:
					//设置教师手机号码
					String phoneNumber=sheet1.get(row).get(column);
				case 5:
					//设置聘用校区
					teacher.setHireCampus(sheet1.get(row).get(column));
					break;
				case 6:
					//设置工作职称
					if(sheet1.get(row).get(column).equals("无")||sheet1.get(row).get(column).equals("")){
						teacher.setCurrentWorkTitle("");
					}else{
						teacher.setCurrentWorkTitle(sheet1.get(row).get(column));
					}
					break;
				case 7:
					//设置工作职务
					if(sheet1.get(row).get(column).equals("无")||sheet1.get(row).get(column).equals("")){
						teacher.setCurrentWorkDuty("");
					}else{
						teacher.setCurrentWorkDuty(sheet1.get(row).get(column));
					}
					break;
				case 8:
					//设置教师类型
					String teacherType=sheet1.get(row).get(column);
					if(teacherType.equals("在职")){
						teacher.setTeacherType((byte)1);
					}else if(teacherType.equals("离职")){
						teacher.setTeacherType((byte)2);
					}else if(teacherType.equals("外聘")){
						teacher.setTeacherType((byte)3);
					}
					break;
				}
			}
			
			//设置教师“是否双师”
			if(teacher.getCurrentWorkTitle().equals("") || teacher.getCurrentWorkDuty().equals("")){
				//如果工作职称或工作职务有一项是无，则不是双师型
				teacher.setIsDoubleTeacher(false);
			}
			else{
				teacher.setIsDoubleTeacher(true);
			}
			Teacherinfo teacherResult=teacherinfoMapper.selectByPrimaryKey(teacher.getTeacherId());
			int result;//接收数据库操作的结果，1表示操作成功，0表示操作失败
			
			if(teacherResult != null ){//如果根据教师工号能够从数据库中查找到教师，则应该执行更新数据的操作
				result = teacherinfoMapper.updateByPrimaryKey(teacher);
				if(result == 0){
					finalResult=0;
					throw new Exception("修改教师:"+teacher.getTeacherId()+"的信息失败");
				}
			}
			else{										//根据学号没有从数据库中查找到学生，则应该执行插入数据的操作
				result=teacherinfoMapper.insert(teacher);
				if(result == 0){
					finalResult=0;
					throw new Exception("添加教师:"+teacher.getTeacherId()+teacher.getTeacherName()+"的信息失败");
				}
			}
			
		}
		
		return finalResult;
	}

	@Override
	public List<Teacherinfo> getAllTeacherInfo() throws Exception {
		List<Teacherinfo> teacherList=teacherManageMapper.selectAllTeacher();
		if(teacherList == null || teacherList.size() == 0){
			throw new Exception("未获取到教师信息 ");
		}
		return teacherList;
	}

	@Override
	public String getTeacherPhoneNum(String teacherId) throws Exception {
		Userinfo user=userinfoMapper.selectByPrimaryKey(teacherId);
		if(user == null) {
			throw new Exception("未查找到教师"+teacherId+"的用户信息");
		}
		String phoneNumber=user.getPhoneNumber();
		return phoneNumber;
	}

	@Override
	public List<String> getAllTeacherNameAndId() throws Exception {
		List<Teacherinfo> teacherList=teacherManageMapper.selectAllTeacher();
		List<String>  nameIdList=new ArrayList<String>();
		for(int i=0;i<teacherList.size();i++){
			String name=teacherList.get(i).getTeacherName();
			String Id=teacherList.get(i).getTeacherId();
			String nameAndId=name+"("+Id+")";
			nameIdList.add(nameAndId);
		}
		return nameIdList;
	}

	

}
