package com.uestc.realm;

import org.apache.poi.hsmf.examples.Msg2txt;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.DefaultSessionKey;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.mail.handlers.message_rfc822;
import com.uestc.service.UserLoginService;
import com.uestc.util.AESEnDecrypt;
import com.uestc.util.MD5Encrypt;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class KickoutSessionControlFilter extends AccessControlFilter {

    private String kickoutUrl; //踢出后到的地址
    private boolean kickoutAfter = false; //踢出之前登录的/之后登录的用户 默认踢出之前登录的用户
    private int maxSession = 1; //同一个帐号最大会话数 默认1

	@Autowired
	private SessionDAO sessionDAO;

	@Autowired
	private UserLoginService userLoginService;
	
    private SessionManager sessionManager;
    private Cache<String, Deque<Serializable>> cache;

    public void setKickoutUrl(String kickoutUrl) {
        this.kickoutUrl = kickoutUrl;
    }

    public void setKickoutAfter(boolean kickoutAfter) {
        this.kickoutAfter = kickoutAfter;
    }

    public void setMaxSession(int maxSession) {
        this.maxSession = maxSession;
    }

    public void setSessionManager(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    public void setCacheManager(CacheManager cacheManager) {
        this.cache = cacheManager.getCache("shiro-kickout-session");
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        Subject subject = getSubject(request, response);
        
        boolean b = false;
        
        System.out.println("进入了登录用户判断，登录限制");
        String userId = request.getParameter("userId");
        String loginPwd = request.getParameter("loginPwd");
        
		if (SecurityUtils.getSubject().getSession() != null) {
			SecurityUtils.getSubject().logout();
		}
		
        if(!subject.isAuthenticated() && !subject.isRemembered()) {
            //如果没有登录，直接进行之后的流程
        	System.out.println("你还没在这个浏览器登录呢！");
        	
        	String msg = userLoginService.verifyUserPwd(userId, loginPwd);
        	System.out.println("msg");
        	if(msg.equals("0000")){
        		b = IskickoutUser(userId,subject,request,response);
        		System.out.println(b);
        	}
        	return true;
        }
        
        String msg = userLoginService.verifyUserPwd(userId, loginPwd);

    	System.out.println("msg");
    	
        if(msg.equals("0000")){
    		b = IskickoutUser(userId,subject,request,response);
    		System.out.println(b);
    	}
    	else {
			System.out.println(msg);
		}
    	return true;
    	
    	
        /*Session subjectsession = subject.getSession();
       // String userId = (String) subject.getPrincipal();
        Serializable sessionId = subjectsession.getId();*/

        
        
        /*System.out.println("进入判断");

        System.out.println("此次登录的session"+subjectsession.getId());
        
        System.out.println("此次登录的userId"+userId);
        
        System.out.println(cache.get(userId));*/
        
        /*Collection<Session> sessions = sessionDAO.getActiveSessions();
        
		List<Session> samesession = new ArrayList<Session>();
		
		for (Session session : sessions) {
			if (session.getAttribute("userId").equals(userId)) {
				samesession.add(session);
				System.out.println("sessionId : " + session.getId());
				System.out.println("CurrentUserSessionId : " + subject.getSession().getId());
				System.out.println("登录用户" + session.getAttribute("userId"));
				System.out.println("最后操作日期:" + session.getLastAccessTime());
		
				else{
					msg = "用户已存在，踢出用户成功！！！";
					session.setTimeout(0);
				}
			}
		}*/
        
        
        
        /*// 同步控制
        Deque<Serializable> deque = cache.get(userId);
        
        if(deque == null) {
            deque = new LinkedList<Serializable>();
            cache.put(userId, deque);
        }

        //如果队列里没有此sessionId，且用户没有被踢出；放入队列
        if(!deque.contains(sessionId) && subjectsession.getAttribute("kickout") == null) {
            deque.push(sessionId);
        }

        System.out.println(deque.size());

        System.out.println("第一次kickout:"+subjectsession.getAttribute("kickout"));
        
        //如果队列里的sessionId数超出最大会话数，开始踢人
        while(deque.size() > maxSession) {
            Serializable kickoutSessionId = null;
            if(kickoutAfter) { //如果踢出后者
                kickoutSessionId = deque.removeFirst();
            } else { //否则踢出前者
                kickoutSessionId = deque.removeLast();
            }
            try {
                Session kickoutSession = sessionManager.getSession(new DefaultSessionKey(kickoutSessionId));
                if(kickoutSession != null) {
                    //设置会话的kickout属性表示踢出了
                    kickoutSession.setAttribute("kickout", true);
                }
            } catch (Exception e) {//ignore exception
            }
        }

        
        System.out.println("第二次kickout:"+subjectsession.getAttribute("kickout"));
        
        //如果被踢出了，直接退出，重定向到踢出后的地址
        if (!subjectsession.getAttribute("kickout").equals("")&&!subjectsession.getAttribute("kickout").equals(null)) {
            //会话被踢出了
            try {
            	System.out.println("baibai");
                subject.logout();
            } catch (Exception e) { //ignore
            }
            saveRequest(request);
            
            HttpServletRequest httpRequest = WebUtils.toHttp(request);
            if (ShiroFilterUtils.isAjax(httpRequest)) {
                HttpServletResponse httpServletResponse = WebUtils.toHttp(response);  
                httpServletResponse.sendError(ShiroFilterUtils.HTTP_STATUS_SESSION_EXPIRE);
                return false;
            } else {
            WebUtils.issueRedirect(request, response, kickoutUrl);
            return false;
            //}
        }*/
        
        //return true;
    }
    
    @Override
    protected void redirectToLogin(ServletRequest request,ServletResponse response)throws IOException{
    	
    }
    
    private boolean IskickoutUser(String userId,Subject subject,ServletRequest request, ServletResponse response) {
    	
    	Session subjectsession = subject.getSession();
         // String userId = (String) subject.getPrincipal();
        Serializable sessionId = subjectsession.getId();
        
        System.out.println("进入判断");

        System.out.println("此次登录的session"+subjectsession.getId());
        
        System.out.println("此次登录的userId"+userId);
        
        System.out.println(cache.get(userId));
        
    	// 同步控制
        Deque<Serializable> deque = cache.get(userId);
        
        if(deque == null) {
            deque = new LinkedList<Serializable>();
            cache.put(userId, deque);
        }

        //如果队列里没有此sessionId，且用户没有被踢出；放入队列
        if(!deque.contains(sessionId) && subjectsession.getAttribute("kickout") == null) {
            deque.push(sessionId);
        }

        System.out.println(deque.size());
        
        Session kickoutSession = null;
        
        System.out.println("第一次kickout:"+subjectsession.getAttribute("kickout"));
        
        //如果队列里的sessionId数超出最大会话数，开始踢人
        while(deque.size() > maxSession) {
            Serializable kickoutSessionId = null;
            if(kickoutAfter) { //如果踢出后者
                kickoutSessionId = deque.removeFirst();
            } else { //否则踢出前者
                kickoutSessionId = deque.removeLast();
            }
            try {
                 kickoutSession = sessionManager.getSession(new DefaultSessionKey(kickoutSessionId));
                if(kickoutSession != null) {
                    //设置会话的kickout属性表示踢出了
                    kickoutSession.setAttribute("kickout", "1");
                }
            } catch (Exception e) {//ignore exception
            }
        }

        
        System.out.println("第二次kickout:"+kickoutSession.getAttribute("kickout"));
        
        //如果被踢出了，直接退出，重定向到踢出后的地址
        if (kickoutSession.getAttribute("kickout") != null) {
            //会话被踢出了
            
	    	System.out.println("baibai");
	        subject.logout();
	        return true;
           
            
            /*HttpServletRequest httpRequest = WebUtils.toHttp(request);
            if (ShiroFilterUtils.isAjax(httpRequest)) {
                HttpServletResponse httpServletResponse = WebUtils.toHttp(response);  
                httpServletResponse.sendError(ShiroFilterUtils.HTTP_STATUS_SESSION_EXPIRE);
                return false;
            } else {*/
           // WebUtils.issueRedirect(request, response, kickoutUrl);
           // return false;
            //}
        }
        
		return false;
    	
    }
    
    
    
    
}