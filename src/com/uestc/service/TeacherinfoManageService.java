package com.uestc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uestc.model.Teacherinfo;

/*
 * 教室管理
 */
public interface TeacherinfoManageService {
	
	/**
	 * 上传教师信息
	 * @param fileUrl
	 * @throws Exception
	 */
	public int doUploadTeacherInfo(String fileUrl) throws Exception;
	
	
	/**
	 * 教务增加教师
	 * @throws Exception
	 */
	public void createTeacherAccount(Teacherinfo  teacher) throws Exception;
	
	
	/**
	 * 教务删除教师
	 * @throws Exception
	 */
	public void deleteTeacherAccount(String teacherId) throws Exception;
	
	
	/**
	 * 教务根据教师姓名查找教师
	 * @throws Exception
	 */
	public List<Teacherinfo> getTeacherInfoByName(String teacherName) throws Exception;
	
	/**
	 * 教务根据教师工号查找教师
	 * @throws Exception
	 */
	public Teacherinfo getTeacherInfoById(String teacherId) throws Exception;
	
	/**
	 * 教务导出教师信息
	 * @throws Exception
	 */
	public void doExportTeacherInfo(List<Teacherinfo> teacherInfo) throws Exception;
	
	
	/**
	 * 教师修改个人信息
	 * @throws Exception
	 */
	public void editTeacherInfo(Teacherinfo  teacher) throws Exception;

	/**
	 * 获取所有教师信息
	 * @return
	 * @throws Exception
	 */
	public List<Teacherinfo> getAllTeacherInfo() throws Exception;
	 
	
	/**
	 * 获取教师手机号码
	 * @param teacherId
	 * @return
	 * @throws Exception
	 */
	public String getTeacherPhoneNum(String teacherId) throws Exception;
	
	/**
	 * 获取所有教师姓名和工号的拼接字符串
	 * @return
	 * @throws Exception
	 */
	public List<String> getAllTeacherNameAndId() throws Exception;
}
