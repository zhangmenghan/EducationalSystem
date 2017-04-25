package com.uestc.service;

import org.springframework.stereotype.Service;

/*
 * 教务人员管理
 */
public interface EduadminManageService {
	/*
	 * 系统管理员增加教务
	 */
	public void createEDUAdminAccount() throws Exception;
	
	/*
	 * 系统管理员删除教务
	 */
	public void deleteEDUAdminAccount() throws Exception;
	
	/*
	 * 教务修改个人信息
	 */
	public void editEDUAdminInfo() throws Exception;
	
	/*
	 * 超级管理员查找教务
	 */
	public void getEDUAdminInfo() throws Exception;

}
