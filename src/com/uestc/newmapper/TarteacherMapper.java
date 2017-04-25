package com.uestc.newmapper;

import java.util.List;

import com.uestc.newmodel.QueryTarTeacher;

public interface TarteacherMapper {
	/**
	 * 查找教研组的组长姓名
	 * @param targroupId
	 * @return
	 */
	List<String> selectLeaderByTarId(String targroupId);
	
	/**
	 * 查找教研组的成员姓名
	 * @param targroupId
	 * @return
	 */
	List<String> selectTeacherByTarId(String targroupId);
	
	/**
	 * 删除教研组长
	 * @param queryTarTeacher
	 * @return
	 */
	int deleteTARLeader(QueryTarTeacher queryTarTeacher);
	
	/**
	 * 添加教研组长
	 * @param queryTarTeacher
	 * @return
	 */
	int addTARLeader(QueryTarTeacher queryTarTeacher);
}
