package com.uestc.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uestc.model.Studentinfo;

/*
 * 学生信息管理
 */
public interface StudentInfoManageService {
	/**
	 * 教务上传学生基本信息，同时生成学生账号
	 * @throws Exception
	 */
	public void createStudentAccount(String filename) throws Exception;
	
	
	/**
	 * 学生修改个人信息
	 * @param student
	 * @throws Exception
	 */
	public int editStudentInfo(Studentinfo student) throws Exception;
	
	
	/**
	 * 根据学制查找学生信息
	 * @throws Exception
	 */
	public void findStudentInfoBySchoolYearType(byte schoolYearType)throws Exception;
	
	/**
	 * 根据年级查找学生信息
	 * @param gradeId
	 * @throws Exception
	 */
	public void findStudentInfoByGradeId(String gradeId)throws Exception;
	
	/**
	 * 根据班级查找学生信息
	 * @param classId
	 * @throws Exception
	 */
	public void findStudentInfoByClassId(String classId)throws Exception;
	
	/**
	 * 根据学号查找学生信息
	 * @param studentId
	 * @throws Exception
	 */
	public void findStudentInfoByStudentId(String studentId)throws Exception;
	/**
	 * 教务导出查询出的学生信息
	 * @param key
	 * @throws Exception
	 */
	public String doExportStudentBasicInfo(List<Studentinfo> studentList) throws Exception;

}
