package com.uestc.service;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.uestc.model.Gradeinfo;

import com.uestc.model.Classinfo;

/*
 * 年级管理
 *
 */
public interface GradeManageService {
	
	
	/**
	 * 添加年级
	 * @param grade
	 * @return
	 * @throws Exception
	 */
	public int addGrade(Gradeinfo grade) throws Exception;


	
	/**
	 * 删减年级
	 * @param gradeID
	 * @return
	 * @throws Exception
	 */
	public int deleteGrade(String gradeID) throws Exception;
	
	
	/**
	 * 修改年级信息
	 * @param grade
	 * @return
	 * @throws Exception
	 */
	public int editGrade(Gradeinfo grade) throws Exception;
	


	/**
	 * 获取某个年级的班级信息
	 * @param gradeID
	 * @return
	 * @throws Exception
	 */
	public List<Classinfo> getGradeClassInfo(String gradeID) throws Exception;
	


	/**
	 * 显示当前在读的所有年级的信息
	 */
	public Map getCurrentGradeInfo() throws Exception;
	
	/**
	 * 获取某个年级的学生人数
	 * @param gradeId
	 * @return
	 * @throws Exception
	 */
	public int getStudentNum(String gradeId) throws Exception;
}
