package com.uestc.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.uestc.model.Targroup;
import com.uestc.newmodel.TARgroupAndTeacher;

/*
 * 教研组管理
 */
public interface TargroupManageService {
	/**
	 * 添加教研组
	 * @param targroup
	 * @throws Exception
	 */
	public int addTARGroup(Targroup targroup)throws Exception;
	
	/**
	 * 删除教研组
	 * @param targroup
	 * @throws Exception
	 */
	public int deleteTARGroup(String targroupId)throws Exception;
	
	/**
	 * 修改教研组信息
	 * @param targroup
	 * @throws Exception
	 */
	public int editTARGroup(Targroup targroup)throws Exception;
	
	/**
	 * 获取所有教研组的名称
	 * @return
	 */
	public List<String> getAllTARGroupName()throws Exception;
	
	/**
	 * 查看教研组信息
	 * @param targroup
	 * @throws Exception
	 */
	public TARgroupAndTeacher getTARGroupInfo(String targroupName)throws Exception;
	
	/**
	 * 添加教研组组长
	 * @param targroup
	 * @param teacherId
	 * @throws Exception
	 */
	public int addTARGroupLeader(String targroupId,String teacherName)throws Exception;
	
	/**
	 * 删除教研组组长
	 * @param targroup
	 * @param teacherId
	 * @throws Exception
	 */
	public int deleteTARGroupLeader(String targroupId,String teacherName)throws Exception;
	
	/**
	 *添加教研组组员 
	 * @param targroup
	 * @param teacherId
	 * @throws Exception
	 */
	public int addTARGroupTeacher(String targroupId,String teacherId)throws Exception;
	
	/**
	 * 删除教研组组员
	 * @param targroup
	 * @param teacherId
	 * @throws Exception
	 */
	public int deleteTARGroupTeacher(String targroupId,String teacherId)throws Exception;
	
	
	/**
	 * 根据教研组类型的名称，查找对应的教研组类型id
	 * @param TargroupTypeId
	 * @return
	 * @throws Exception
	 */
	public Byte getTargroupTypeIdByName(String TargroupTypeId)throws Exception;
}
