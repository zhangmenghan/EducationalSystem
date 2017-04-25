package com.uestc.service;

import java.util.List;

import com.uestc.model.Userinfo;

/**
 * 
 * @author zw
 *
 */
public interface UserBaseInfoService {

	/**
	 * 设置用户信息
	 * @param User
	 * @return
	 * @throws Exception
	 */
	public String setUserInfo(Userinfo userinfo) throws Exception;
	
	/**
	 * 得到所有用户信息
	 * @return
	 * @throws Exception
	 */
	public List<Userinfo> findAllUser() throws Exception;
	
	/**
	 * 验证用户的邮箱信息
	 * @param UserId
	 * @param EmailAddress
	 * @param inputEmail
	 * @return
	 * @throws Exception
	 */
	public Boolean verifyUserEmail(String userId,String emailAddress,String inputEmail)throws Exception;
	
	/**
	 * 通过用户找回账号
	 * @param UserId
	 * @param EmailAddress
	 * @return
	 * @throws Exception
	 */
	public String findUserPwdByEmail(Userinfo userinfo,String bathPath)throws Exception;
	
	/**
	 * 验证找回链接是否正确或失效
	 * @param sid
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public String checkResetLink(String sid,Userinfo userinfo) throws Exception;
	
	
	
}
