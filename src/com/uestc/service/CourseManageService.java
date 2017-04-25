package com.uestc.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uestc.model.Teachplan;;

/*
 * 课程管理
 * 与教学计划的功能相联系
 */
public interface CourseManageService {
	/**
	 * 添加课程
	 * 返回值对应数据库操作的结果
	 */
	public int addCourse(Teachplan course) throws Exception;
	
	/**
	 * 删除课程
	 */
	public int deleteCourse(String courseId) throws Exception;
	/**
	 * 修改课程信息
	 */
	public int editCourseInfo(Teachplan course) throws Exception;
	
	/**
	 * 上传课程信息
	 * @param fileUrl
	 * @return
	 * @throws Exception
	 */
	public int doUploadCourseInfo(String fileUrl) throws Exception;
	
	/**
	 * 导出所有课程信息
	 * @param courseInfo
	 * @return
	 * @throws Exception
	 */
	public void doExportCourseInfo() throws Exception;


	/**
	 * 获取所有课程信息
	 * @param courseId
	 * @return
	 * @throws Exception
	 */
	public 	List<Teachplan>	getAllCourseInfo() throws Exception;

}

