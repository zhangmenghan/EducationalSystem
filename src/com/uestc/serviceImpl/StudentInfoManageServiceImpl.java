package com.uestc.serviceImpl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uestc.mapper.StudentinfoMapper;
import com.uestc.model.Studentinfo;
import com.uestc.newmapper.StudentManageMapper;
import com.uestc.service.StudentInfoManageService;
import com.uestc.util.ReadWriteExcel;
@Service
public class StudentInfoManageServiceImpl implements StudentInfoManageService {
	
	@Autowired
	private StudentinfoMapper studentinfoMapper;
	
	@Autowired
	private StudentManageMapper studentManageMapper;
	
	@Override
	public void createStudentAccount(String fileUrl) throws Exception {
		ReadWriteExcel rw=new ReadWriteExcel();
		@SuppressWarnings("static-access")
		//将excel中的数据封装为三维数组
		List<List<List<String>>> excelList=rw.getExcelList(fileUrl, 0);
		List<List<String>> sheet1=excelList.get(0);
		System.out.println("第一行第一列为："+excelList.get(0).get(0).get(0));
		System.out.println("共"+sheet1.size()+"行");
		int row , column;
		java.text.SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");//设置date格式
		Date date=new Date();
		java.sql.Date d;
		for(row =3 ;row < sheet1.size();row ++){
			Studentinfo stu=new Studentinfo();	
			for(column = 0 ;column<sheet1.get(row).size();column++){
				if(sheet1.get(row).get(column).equals("#")){
					//由于读取excel文件时，空字符用#来代替，存储进数据库是需要将#转换为空字符""
					sheet1.get(row).set(column, "");
				}
				switch(column){
				case 0:
					stu.setStudentId(sheet1.get(row).get(column));//设置学生学号
					break;
				case 1:
					stu.setStudentIDcard(sheet1.get(row).get(column));//设置学生身份证号
					break;
				case 2:
					stu.setStudentName(sheet1.get(row).get(column));//设置学生姓名
					break;

				case 5:
					
					stu.setClassID(sheet1.get(row).get(3)+sheet1.get(row).get(12)+sheet1.get(row).get(column).substring(0, 1));//设置学生班级
					break;
				case 6:
					if(sheet1.get(row).get(column).equals("男")){//设置学生性别，在数据库中1表示男，2表示女
						stu.setStudentGender((byte) 1);
					}
					else	stu.setStudentGender((byte) 2);
					break;
				case 7:
					date =  formatter.parse(sheet1.get(row).get(column));//将string转换为date
					d = new java.sql.Date(date.getTime());
					stu.setBirthdate(d);//设置学生出生日期
					break;
				case 8:
					stu.setEthno(sheet1.get(row).get(column));//设置学生民族
					break;
				case 9:
					stu.setNativePlace(sheet1.get(row).get(column));//设置学生籍贯
					break;
				case 10:
					date =  formatter.parse(sheet1.get(row).get(column));//将string转换为date
					d = new java.sql.Date(date.getTime());
					stu.setAdmissionDate(d);//设置学生入学时间
					break;
				case 11:
					date =  formatter.parse(sheet1.get(row).get(column));//将string转换为date
					d = new java.sql.Date(date.getTime());
					stu.setGraduationTime(d);//设置学生毕业时间
					break;
				case 12:
					if(sheet1.get(row).get(column).equals("3")){
						stu.setSchoolYearType((byte) 3);;//设置学制为三年制
						stu.setSchoolLevel((byte)2);//设置学校层次为中专
						
					}
					else	if(sheet1.get(row).get(column).equals("5")){
						stu.setSchoolYearType((byte) 5);//设置学制为五年制
						stu.setSchoolLevel((byte)1);//设置学校层次为大专
					}
					break;
				case 13:
					stu.setHomeTelephone(sheet1.get(row).get(column));//设置联系电话
					break;
				case 14:
					stu.setHouseAddress(sheet1.get(row).get(column));//设置家庭住址
					break;
				}
			}
			stu.setCurrentState((byte)1);//设置学生在校状态，默认为在读
			List <Studentinfo> student=studentManageMapper.selectByStudentId(stu.getStudentId());
			int result;//接收数据库操作的结果，1表示操作成功，0表示操作失败
			if(student != null && student.size() != 0){//如果根据学号能够从数据库中查找到学生，则应该执行更新数据的操作
				result = studentinfoMapper.updateByPrimaryKeySelective(stu);
				if(result == 0){
					throw new Exception("修改学生:"+stu.getStudentId()+"的信息失败");
				}
			}
			else{										//根据学号没有从数据库中查找到学生，则应该执行插入数据的操作
				result=studentinfoMapper.insertSelective(stu);
				if(result == 0){
					throw new Exception("添加学生:"+stu.getStudentId()+stu.getStudentName()+"的信息失败");
				}
			}
			
			
		}
		//TODO 调用用户管理模块的方法，生成学生账号
	}

	@Override
	public int editStudentInfo(Studentinfo student) throws Exception {
		//学生修改学生信息
		int result=studentinfoMapper.updateByPrimaryKeySelective(student);
		if(result == 0){
			throw new Exception("修改个人信息失败");
		}
		return result;
	}

	
	

	

	@Override
	public void findStudentInfoBySchoolYearType(byte schoolYearType) throws Exception {
		List<Studentinfo> students= studentManageMapper.selectBySchoolYearType(schoolYearType);
		if(students.size() ==  0 ||  students==null){
			throw new Exception("未查找到学生信息");
		}
	}

	@Override
	public void findStudentInfoByGradeId(String gradeId) throws Exception {
		List<Studentinfo> students= studentManageMapper.selectByGradeId(gradeId);
		if(students.size() ==  0 ||  students==null){
			throw new Exception("未查找到学生信息");
		}
		
	}

	@Override
	public void findStudentInfoByClassId(String classId) throws Exception {
		List<Studentinfo> students= studentManageMapper.selectByClassId(classId);
		if(students.size() ==  0 ||  students==null){
			throw new Exception("未查找到学生信息");
		}
		
	}

	@Override
	public void findStudentInfoByStudentId(String studentId) throws Exception {
		List<Studentinfo> students= studentManageMapper.selectByStudentId(studentId);
		if(students.size() ==  0 ||  students==null){
			throw new Exception("未查找到学生信息");
		}
		
	}
	
	
	
	
	@Override
	public String doExportStudentBasicInfo(List<Studentinfo> stuList) throws Exception {
		// TODO Auto-generated method stub
		List<List<List<String>>> excelList = new ArrayList<List<List<String>>>();
		List<List<String>> sheetList1 = new ArrayList<List<String>>();
		
		return null;
		
		
		
	}
}
