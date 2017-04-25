package com.uestc.newmapper;

import java.util.List;

import com.uestc.model.Classinfo;

public interface ClassManageMapper {
	
	/**
	 * 根据年级查找班级信息
	 * @param gradeId
	 * @return
	 */
	List<Classinfo> selectByGradeId(String gradeId);
	
	/**
	 * 根据班级编号查找班级信息
	 * @param classId
	 * @return
	 */
	List<Classinfo> selectByClassId(String classId);
	
	
	/**
	 * 根据班主任工号查找班级信息
	 * @param classTeacherId
	 * @return
	 */
	Classinfo selectByClassTeacherId(String classTeacherId);
	
	/**
	 * 查找班级人数
	 * @param classId
	 * @return
	 */
	int countStudentNumByClassId(String classId);
	
	/**
	 * 根据年级ID查找班级ID
	 * @param gradeId
	 * @return
	 */
	List<String> selectClassIdByGradeId(String gradeId);
}
