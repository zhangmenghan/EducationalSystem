package com.uestc.service;

import java.util.List;

import com.uestc.model.*;
import com.uestc.newmodel.Roleauthority;
import com.uestc.newmodel.Userrole;

/**
 * 
 * @author zw
 *
 */
public interface ManageRoleAuthorityService {

	
	/**
	 * 根据用户ID或者名字得到用户列表
	 * @param userIdOrName
	 * @return
	 * @throws Exception
	 */
	public List<Userinfo> findUserByIdOrName(String userIdOrName) throws Exception;
	
	
	/**
	 * 查询单个用户的权限
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	public List<Roleauthority> getAuthorityByUser(String userId) ;
	
	
	/**
	 * 设置单个账号的角色
	 * @param userRoleKeys
	 * @return
	 * @throws Exception
	 */
	public String setUserRole(List<UserroleKey> userRoleKeys) throws Exception;
	
	/**
	 * 得到单个账号的所有角色
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	public List<Userrole> getUserRole(String userId) ;
	
	/**
	 * 根据角色得到该角色下的所有用户
	 * @param roleId
	 * @return
	 * @throws Exception
	 */
	public List<Userrole> getUserByRoleId(int roleId) throws Exception;
	
	/**
	 * 得到所有的角色
	 * @return
	 * @throws Exception
	 */
	public List<Roleinfo> getAllRole() throws Exception;
	
	/**
	 * 添加一个自定义的角色
	 * @param roleinfo
	 * @return
	 * @throws Exception
	 */
	public int addNewRole() throws Exception;
	
	/**
	 * 保存的角色的修改信息
	 * @param roleinfo
	 * @return
	 * @throws Exception
	 */
	public String saveNewRole(Roleinfo roleinfo) throws Exception;
	
	/**
	 * 删除指定角色
	 * @param roleId
	 * @return
	 * @throws Exception
	 */
	public String deleteRole(int roleId) throws Exception;
	
	/**
	 * 设置单个角色的权限
	 * @param roleAuthorityKeys
	 * @return
	 * @throws Exception
	 */
	public String setRoleAuthority(List<RoleauthorityKey> roleAuthorityKeys) throws Exception;
	
	/**
	 * 得到单个角色的权限
	 * @param roleid
	 * @return
	 * @throws Exception
	 */
	public List<Roleauthority> getRoleAuthority(int roleId);
	
	/**
	 * 得到所有权限
	 * @return
	 * @throws Exception
	 */
	public List<Authoritylist> getAllAuthority() throws Exception;
	
	
	
}
