package com.uestc.newmodel;

public class UserCount {
	
    private String userId;
    
    private String loginPwd;
    
    private String userPwd;
    
    private String newPwd;
    
    private String sid;
    
    private String email;
    

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserCount [userId=" + userId + ", loginPwd=" + loginPwd + ", userPwd=" + userPwd + ", newPwd=" + newPwd
				+ ", sid=" + sid + ", email=" + email + "]";
	}
    
    
}