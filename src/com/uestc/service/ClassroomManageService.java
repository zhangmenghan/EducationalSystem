package com.uestc.service;


import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.uestc.model.Classroom;

/*
 * 教室管理
 */
public interface ClassroomManageService {
	/*
	 * 添加教室
	*/
	public int addClassroom(Classroom classroom) throws Exception;
	
	/*
	 * 删减教室
	*/
	public int  deleteClassroom(String classroomId) throws Exception;
	
	/*
	 * 修改教室信息
	 */
	public int editClassroom(Classroom classroom) throws Exception;
	
	/*
	 * 查看所有教室的信息
	 */
	public List<Classroom> getAllClassroom()throws Exception;
	
	/**
	 * 获取固定教室的信息
	 * @return
	 * @throws Exception
	 */
	public List<Classroom> getRegularClassroom( ) throws Exception;
	
	/**
	 * 获取流动教室的信息
	 * @return
	 * @throws Exception
	 */
	public List<Classroom> getUnregularClassroom( ) throws Exception;
}
