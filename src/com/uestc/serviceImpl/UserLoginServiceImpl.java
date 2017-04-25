package com.uestc.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.uestc.mapper.UserinfoMapper;
import com.uestc.model.Userinfo;
import com.uestc.service.UserLoginService;
import com.uestc.util.AESEnDecrypt;
import com.uestc.util.AesEncryptUtil;
import com.uestc.util.MD5Encrypt;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserinfoMapper userinfoMapper;
	
	@Autowired
	private SessionDAO sessionDAO;
	
	@Override
	public Map<String,Object> findUserId(String userId)  {
		
		String result = "";
		Map<String, Object> map = new HashMap<>();
		Userinfo userinfo = userinfoMapper.selectByPrimaryKey(userId);
		try{
        	if(!userinfo.equals(null)&&!userinfo.equals("")){  
        		result = "1";
        		map.put("userinfo", userinfo);
            }
        	else{
            	result="false";
        	}

        }catch (Exception e) {
        	result="false";
		}
		map.put("result", result);
		return map;
	}

	@Override
	public String verifyUserPwd(String userId,String loginPwd) throws Exception {
		
        Boolean bool = false;
        String msg = "";
        System.out.println("loginPwd"+loginPwd);
        
        AesEncryptUtil aesEnDecrypt = new AesEncryptUtil();
      /*  // 调用md5加密
        String salt = userId+"护士学校";
		String MD5pwd = new MD5Encrypt().encrypt(loginPwd,salt);
		System.out.println(MD5pwd);
		
		System.out.println(msg);
		
		
		
		// 调用AES加密进行测试

		String aesEncryptResult = aesEnDecrypt.encrypt(MD5pwd);
		
		System.out.println("加密后：" + aesEncryptResult);  */
		
        // 调用AES工具进行密码解密
        String aesDecryptPwd = aesEnDecrypt.desEncrypt(loginPwd);  
        System.out.println("解密后：" + aesDecryptPwd);  
        
        Subject currentUser = SecurityUtils.getSubject();
		// Session session = currentUser.getSession();
		currentUser.getSession().setAttribute("userId", userId);
		System.out.println("验证登录密码前的currentSession ： "+currentUser.getSession().getId());
		
        //upToken.setRememberMe(false);
        
        // 是否记住密码 boolean rememberMe =
     		// ServletRequestUtils.getBooleanParameter(request, "rememberMe",
     		// false);
        
        try {
        	UsernamePasswordToken upToken = new UsernamePasswordToken(userId, aesDecryptPwd);
        	upToken.setRememberMe(false);
			currentUser.login(upToken);
			
			Collection<Session> sessions = sessionDAO.getActiveSessions();
			List<Session> samesession = new ArrayList<Session>();
			for (Session session : sessions) {
					samesession.add(session);
					System.out.println("sessionId : " + session.getId());
					System.out.println("CurrentUserSessionId : " + currentUser.getSession().getId());
					System.out.println("登录用户" + session.getAttribute("userId"));
					System.out.println("最后操作日期:" + session.getLastAccessTime());
			
			}
			System.out.println(samesession);
			msg = "1";//登录认证成功
			return msg;

		} catch (UnknownAccountException uae) {
			System.out.println(uae);
			msg = "用户名不存在！";
		} catch (IncorrectCredentialsException ice) {
			System.out.println("用户/密码不匹配！");
			msg = "用户/密码不匹配！";
		} catch (LockedAccountException lae) {
			System.out.println("账户已被冻结！");
			msg = "帐户失效";
		}
        
        return msg;
        
	}
	
	@Override
	public byte getUserType(String UserId) throws Exception {
		
		Userinfo userinfo=userinfoMapper.selectByPrimaryKey(UserId);
		byte type = userinfo.getUserType();
		return type;
	}

}
