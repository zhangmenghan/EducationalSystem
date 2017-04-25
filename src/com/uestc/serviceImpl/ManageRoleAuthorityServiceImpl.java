package com.uestc.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uestc.mapper.RoleinfoMapper;
import com.uestc.model.Authoritylist;
import com.uestc.newmodel.Roleauthority;
import com.uestc.model.RoleauthorityKey;
import com.uestc.model.Roleinfo;
import com.uestc.model.Userinfo;
import com.uestc.newmodel.Userrole;
import com.uestc.model.UserroleKey;
import com.uestc.newmapper.RoleAuthorityAssociationMapper;
import com.uestc.newmapper.UserRoleAssociationMapper;
import com.uestc.service.ManageRoleAuthorityService;

@Service
public class ManageRoleAuthorityServiceImpl implements ManageRoleAuthorityService {


	@Autowired
	private UserRoleAssociationMapper userRoleAssociationMapper;
	
	@Autowired
	private RoleinfoMapper roleinfoMapper;
	


	@Autowired
	private RoleAuthorityAssociationMapper roleAuthorityAssociationMapper;
	
	@Override
	public List<Userinfo> findUserByIdOrName(String userIdOrName) throws Exception {
		// TODO Auto-generated method stub
		return userRoleAssociationMapper.selectAllUserByIdOrName(userIdOrName);
	}
	
	@Override
	public List<Roleauthority> getAuthorityByUser(String userId)  {
		// TODO Auto-generated method stub
		return roleAuthorityAssociationMapper.selectAuthorityByUserId(userId);
	}

	@Override
	public String setUserRole(List<UserroleKey> userRoleKeys) throws Exception {
		// TODO Auto-generated method stub
		String userId = userRoleKeys.get(0).getUserId();
		userRoleAssociationMapper.deleteRoleByUserId(userId);
		userRoleAssociationMapper.insertUserroleByChoose(userRoleKeys);
		
		return "1";
	}

	@Override
	public List<Userrole> getUserRole(String userId) {
		// TODO Auto-generated method stub
		return userRoleAssociationMapper.selectRoleByUserId(userId);
	}

	@Override
	public List<Userrole> getUserByRoleId(int roleId) throws Exception {
		// TODO Auto-generated method stub
		
		return userRoleAssociationMapper.selectUserByRoleId(roleId);
	}
	
	@Override
	public List<Roleinfo> getAllRole() throws Exception {
		// TODO Auto-generated method stub
		return userRoleAssociationMapper.selectAllRole();
	}

	@Override
	public int addNewRole() throws Exception {
		// TODO Auto-generated method stub
		int roleId = 0;
		String roleName = "未命名角色";
		try {
			 roleId = userRoleAssociationMapper.insertUndefinedRole(roleName);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);;
		}
		
		return roleId;
	}

	@Override
	public String saveNewRole(Roleinfo roleinfo) throws Exception {
		// TODO Auto-generated method stub
		String msg = "";
	    roleinfoMapper.updateByPrimaryKey(roleinfo);
	    msg = "1";
		return "msg";
	}

	@Override
	public String deleteRole(int roleId) throws Exception {
		// TODO Auto-generated method stub
		String msg = "1";
		roleinfoMapper.deleteByPrimaryKey(roleId);
		return msg;
	}

	
	@Override
	public String setRoleAuthority(List<RoleauthorityKey> roleAuthorityKeys) throws Exception {
		// TODO Auto-generated method stub
		String msg = "1";
		int roleId = roleAuthorityKeys.get(0).getRoleId();
		roleAuthorityAssociationMapper.deleteAuthorityByRoleId(roleId);
		roleAuthorityAssociationMapper.insertRoleauthorityByChoose(roleAuthorityKeys);	
		return msg;
	}

	@Override
	public List<Roleauthority> getRoleAuthority(int roleId) {
		// TODO Auto-generated method stub
		return roleAuthorityAssociationMapper.selectAuthorityByRoleId(roleId);
	}

	@Override
	public List<Authoritylist> getAllAuthority() throws Exception {
		// TODO Auto-generated method stub
		
		return roleAuthorityAssociationMapper.selectAllAuthority();
	}

	

	
}
