package com.uestc.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uestc.model.Classinfo;
import com.uestc.model.Statechangeinfo;
import com.uestc.model.Studentinfo;

/*
 * 班级管理
 */
public interface ClassManageService {
	/**
	 * 教务上传班级信息读取上传的excel文件，将excel数据解析并封装后，调用mapper层进行存储
	 */
	public void doUploadClassInfo(String filename) throws Exception;
	
	/**
	 * 教务添加班级
	 * @throws Exception
	 */
	public int  addClass(Classinfo classinfo) throws Exception;
	
	/**
	 * 教务修改班级基础信息
	 */
	public int  editClass(Classinfo classinfo) throws Exception;
	
	/**
	 * 教务删除班级
	 * @throws Exception
	 */
	
	public int  deleteClass(String classId) throws Exception;
	/**
	 * 班主任设置学生在校状态，该字段默认为在校
	 */
	public void setStudentState(String classTeacherId,String studentId,String studentState) throws Exception;
	
	/**
	 * 班主任查看班级信息
	 */
	public Classinfo  getClassInfo(String classTeacherId) throws Exception;
	
	
	/**
	 * 班主任导出班级信息
	 */
	public String  doExportClassInfo(String classTeacherId) throws Exception;
	
	/**
	 * 班主任查看班级中的学生详细信息
	 */
	public List<Studentinfo> getStudentInfo(String classTeacherId)throws Exception;
	
	
	/**
	 * 班主任导出学生详细信息
	 */
	public File doExportStudentInfo(String classTeacherId)throws Exception;
	
	

}
