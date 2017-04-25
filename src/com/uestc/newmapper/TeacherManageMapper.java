package com.uestc.newmapper;

import java.util.List;

import com.uestc.model.Teacherinfo;

public interface TeacherManageMapper {
	/**
	 * 根据教师id查找教师姓名
	 * @param teacherId
	 * @return
	 */
	String selectNameById(String teacherId);
	
	/**
	 * 根据教师姓名查找教师ID
	 * @param teacherName
	 * @return
	 */
	String selectIdByName(String teacherName);
	 
	
	/**
	 * 获取所有教师信息
	 * @return
	 */
	List<Teacherinfo> selectAllTeacher();
	
	
	
	List<Teacherinfo> selectByName();
}
