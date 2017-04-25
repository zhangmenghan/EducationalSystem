package com.uestc.service;

import java.util.List;
import java.util.Map;

import com.uestc.model.Userinfo;

/**
 * 用户登录模块
 * @author zw
 *
 */
public interface UserLoginService {

	/**
	 * 查找用户信息
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> findUserId(String userId) ;
	
	/**
	 * 验证用户密码
	 * @param userId
	 * @param userPwd
	 * @param loginPwd
	 * @return
	 * @throws Exception
	 */
	public String verifyUserPwd(String userId,String loginPwd) throws Exception;
	
	/**
	 * 得到账号的类型
	 * @param UserId
	 * @return
	 * @throws Exception
	 */
	public byte getUserType(String userId)throws Exception;
	
	
}
