package com.uestc.newmapper;

public interface CourseTypeMapper {
	
	/**
	 * 根据课程类型名称查找课程类型ID
	 * @param CourseName
	 * @return
	 */
	Byte findIdByName(String CourseTypeName);
}
