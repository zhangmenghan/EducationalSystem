package com.uestc.service;

import java.util.List;

import com.uestc.model.Authoritylist;
import com.uestc.model.Userinfo;

/**
 * 用户账号管理
 * @author zw
 * 
 */
public interface ManageUserCountService {

	/**
	 * 通过Excel表导入用户信息
	 * @param userinfos
	 * @return
	 * @throws Exception
	 */
	public String addUserinfoByExcel(List<Userinfo> userinfos) throws Exception;
	
	/**
	 * 删除账号
	 * @param UserId
	 * @return
	 * @throws Exception
	 */
	public String delete(String UserId) throws Exception;
	
	
}
