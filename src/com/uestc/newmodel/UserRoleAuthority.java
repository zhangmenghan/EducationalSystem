package com.uestc.newmodel;

import java.util.List;

public class UserRoleAuthority {
	
	private String userId;
	
	private String userIdOrName;
	
    private String roleId;
    
    private String roleName;

    private List<String> roleIdList;
    
    private String authorityId;
    
    private String authorityName;
    
    private List<String> authorityIdList;
    
    

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdOrName() {
		return userIdOrName;
	}

	public void setUserIdOrName(String userIdOrName) {
		this.userIdOrName = userIdOrName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	

	public List<String> getRoleIdList() {
		return roleIdList;
	}

	public void setRoleIdList(List<String> roleIdList) {
		this.roleIdList = roleIdList;
	}

	public String getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	public List<String> getAuthorityIdList() {
		return authorityIdList;
	}

	public void setAuthorityIdList(List<String> authorityIdList) {
		this.authorityIdList = authorityIdList;
	}

	
	
    
}