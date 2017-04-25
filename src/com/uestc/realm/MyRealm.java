package com.uestc.realm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Autowired;

import com.uestc.model.Userinfo;
import com.uestc.newmodel.Roleauthority;
import com.uestc.newmodel.Userrole;
import com.uestc.service.ManageRoleAuthorityService;
import com.uestc.service.UserLoginService;
import javax.annotation.Resource;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * shiro 安全登录测试
 * 
 * @author zw
 *
 */
public class MyRealm extends AuthorizingRealm {

	@Resource
	private UserLoginService userLoginService;

	@Resource
	private ManageRoleAuthorityService manageRoleAuthorityService;

	@Resource
	private SessionDAO sessionDAO;

	
	/**
	 * 用于的权限的认证。
	 * 
	 * @param principalCollection
	 * @return
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

		System.out.println("********** 用户角色与权限：doGetAuthorizationInfo **********");
		int i = 0;
		String userId = (String) principalCollection.getPrimaryPrincipal() ;
		
		// // 取得用户登录名
		//String userId = (String) principalCollection.fromRealm(getName()).iterator().next();

		System.out.println(userId);
		
		// 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(); // 定义授权信息的返回数据
		Set<String> roles = new HashSet<>(); // 所有的角色必须以Set集合的形式出现
		Set<String> perms = new HashSet<>();// 所有的权限必须以Set集合的形式出现

		// ———————————————— 进行业务层处理——————————————//
		
		List<Userrole> userroles = manageRoleAuthorityService.getUserRole(userId);

		for (i = 0; i < userroles.size(); i++) {
			roles.add(userroles.get(i).getRoleId());
			int roleId = Integer.parseInt(userroles.get(i).getRoleId());
			List<Roleauthority> roleauthorities = manageRoleAuthorityService.getRoleAuthority(roleId);
			for (Roleauthority roleauthority : roleauthorities) {
				perms.add(roleauthority.getAuthorityId());
			}
			info.setRoles(roles);
			info.setStringPermissions(perms);
		}
		
		
		System.out.println(">>>>>>>>>>>>>>>>角色");
		System.out.println(roles);
		System.out.println(">>>>>>>>>>>>>>>>权限");
		System.out.println(perms);

		return info;
	}

	/**
	 * 首先执行这个登录验证
	 * 
	 * @param token
	 * @return
	 * @throws AuthenticationException
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {
		// 获取用户账号
		String msg = "";

		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		String userId = token.getUsername();
		char[] loginPwdTpt = token.getPassword();
		String loginPwd = String.valueOf(loginPwdTpt);
		
		
		Map<String, Object> map = new HashMap<>();
		map =  userLoginService.findUserId(userId);
		
		
		msg = (String) map.get("result");

		System.out.println("loginPwd:"+loginPwd);
		System.out.println(msg);
		
		if (msg.equals("1")) {
			Userinfo userinfo = (Userinfo) map.get("userinfo");
			//异地二次登录判断
			if(userinfo.getUserPwd().equals(loginPwd)){
				//异地二次登录判断
				DefaultWebSecurityManager securityManager = (DefaultWebSecurityManager) SecurityUtils.getSecurityManager();
				DefaultWebSessionManager sessionManager = (DefaultWebSessionManager)securityManager.getSessionManager();
				Collection<Session> sessions = sessionManager.getSessionDAO().getActiveSessions();//获取当前已登录的用户session列表
				
				for(Session session:sessions){
				//清除该用户以前登录时保存的session
				System.out.println("可能要删除了");
				System.out.println(userId);
				System.out.println(String.valueOf(session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY)));
				if(userId.equals(String.valueOf(session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY)))) {
				       sessionManager.getSessionDAO().delete(session);
				   }
				}
			}
			
			// 根据用户的情况，来构建AuthenticationInfo对象并返回，通常使用的实现类为SimpleAuthenticationInfo
			// 以下信息从数据库中获取
			// （1）principal：认证的实体信息，可以是email，也可以是数据表对应的用户的实体类对象

			Object principal = userId;

			// （2）credentials：密码
			Object credentials = userinfo.getUserPwd();
			// （3）realmName：当前realm对象的name，调用父类的getName()方法即可
			String realmName = getName();

			// （4）盐值：取用户信息中唯一的字段来生成盐值，避免由于两个用户原始密码相同，加密后的密码也相同
			ByteSource credentialsSalt = ByteSource.Util.bytes(userId);

			try {
				SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt,
						realmName);

				return info;
			} catch (Throwable t) {
				 t.printStackTrace();
		         throw new AuthenticationException();
			}
			
		} else {
			
			throw new UnknownAccountException();
			
		}

	}

	/**
	 * 更新用户授权信息缓存.
	 */
	public void clearCachedAuthorizationInfo(String principal) {
		SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
		clearCachedAuthorizationInfo(principals);
	}

	/**
	 * 清除所有用户授权信息缓存.
	 */
	public void clearAllCachedAuthorizationInfo() {
		Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
		if (cache != null) {
			for (Object key : cache.keys()) {
				cache.remove(key);
			}
		}
	}
	
	public void removeUserCache(String userId) {
		SimplePrincipalCollection spc = new SimplePrincipalCollection();
		spc.add(userId, super.getName());
		super.clearCachedAuthorizationInfo(spc);
		System.out.println(">>>>>>>>>chenggong");
	}

	/** 重写退出时缓存处理方法 */
	public void clearCached() {
		PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
		super.clearCache(principals);
	}

}