package com.uestc.newmapper;

import com.uestc.model.Teachplan;
import com.uestc.model.TeachplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachplanManageMapper {
	/**
	 * 根据课程名称查询教学计划
	 * @param courseName
	 * @return
	 */
	Teachplan selectByCourseName(String courseName);
	
	/**
	 * 根据课程编号查询课程名称
	 * @param courseId
	 * @return
	 */
	String selectCourseNameByCourseId(String courseId);
	
	/**
	 * 根据课程编号查询课程的学制
	 * @param courseId
	 * @return
	 */
	byte selectYearTypeById(String courseId);
}