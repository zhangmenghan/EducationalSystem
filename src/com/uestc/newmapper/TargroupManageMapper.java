package com.uestc.newmapper;

import java.util.List;

import com.uestc.model.Targroup;

public interface TargroupManageMapper {
	
	/**
	 * 查找所有交教研组的名称
	 * @return
	 */
	List<String> selectAllTargroupName();
	
	
	/**
	 * 根据教研组名称查找教研组信息
	 * @param targroupName
	 * @return
	 */
	Targroup selectByTargroupName(String targroupName);
}
