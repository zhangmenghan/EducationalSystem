package com.uestc.newmapper;

import java.util.List;

import com.uestc.model.Textbook;

public interface TextbookManageMapper {
	/**
	 * 查找所有的教材信息
	 * @return
	 */
	List<Textbook> selectAllTextbook();
	
	/**
	 * 根据课程ID查找教材信息
	 * @param CourseId
	 * @return
	 */
	List<Textbook> selectByCourseId(String CourseId);
	
	/**
	 * 添加教材信息，如果有部分字段为空，不设值
	 * @param record
	 * @return
	 */
	int insertSelective(Textbook record);
	
	/**
	 * 更新教材信息
	 * @param record
	 * @return
	 */
	int updateSelectiveByISBN(Textbook record);
}
