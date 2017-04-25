package com.uestc.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.poi.hsmf.examples.Msg2txt;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uestc.model.Userinfo;
import com.uestc.newmodel.UserCount;
import com.uestc.service.ManageUserCountService;
import com.uestc.service.UserBaseInfoService;
import com.uestc.service.UserLoginService;
import com.uestc.util.AESEnDecrypt;
import com.uestc.util.AesEncryptUtil;
import com.uestc.util.MD5Encrypt;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

@Controller
public class UserManageController {

	@Autowired
	private UserLoginService userLoginService;

	@Autowired
	private UserBaseInfoService userBaseInfoService;

	@Autowired
	private ManageUserCountService manageUserCountService;

	@Autowired
	private SessionDAO sessionDAO;

	/**
	 * 测试JSON
	 * 
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/testJson")
	public Object testJson() throws Exception {

		Map<String, Object> map = new HashMap<>();
		// msg = userLoginService.verifyUserPwd(userId, loginPwd);
		map.put("msg", 123);
		map.put("ai", "如此美妙");
		List<String> list = new ArrayList<>();
		list.add("如");
		list.add("次");
		list.add("美");
		list.add("妙");
		map.put("list", list);

		// model.addAttribute("map", map);
		return map;
	}

	/**
	 * 登录验证
	 * 
	 * @param userCount
	 * @param request
	 * @return resultMap
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
	public Object login(@RequestBody UserCount userCount, HttpServletRequest request) throws Exception {

		String result = "1";
		if (SecurityUtils.getSubject().getSession() != null) {
			SecurityUtils.getSubject().logout();
		}

		// 查看此次登录session
		/*
		 * Subject currentUser = SecurityUtils.getSubject(); // Session session
		 * = currentUser.getSession();
		 * currentUser.getSession().setAttribute("userId", userId);
		 * System.out.println("验证登录密码前的currentSession ： "+currentUser.getSession
		 * ().getId());
		 * System.out.println("验证登录密码前的HttpSession ："+request.getSession().getId
		 * ());
		 */

		result = userLoginService.verifyUserPwd(userCount.getUserId(), userCount.getLoginPwd());

		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("result", result);

		return resultMap;

	}

	/**
	 * 找回密码
	 * 
	 * @param request
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/findbackPwd", method = RequestMethod.POST, consumes = "application/json")
	public Object findbackPwd(@RequestBody UserCount userCount, HttpServletRequest request) throws Exception {

		String result = "1";
		String userId = userCount.getUserId();

		HttpSession session = request.getSession();
		session.setAttribute("userId", userCount.getUserId());

		Map<String, Object> map = new HashMap<>();
		map = userLoginService.findUserId(userId);
		result = (String) map.get("result");

		if (result.equals("1")) {
			Userinfo userinfo = (Userinfo) map.get("userinfo");
			boolean bool = userBaseInfoService.verifyUserEmail(userId, userinfo.getEmailAddress(),
					userCount.getEmail());

			if (bool) {
				String path = request.getContextPath();
				String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
						+ path + "/";
				result = userBaseInfoService.findUserPwdByEmail(userinfo, basePath);
				System.out.println("msg");
			} else {
				result = "邮箱不正确";
			}
		} else {
			result = "用户名不存在";
		}
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("result", result);
		return resultMap;
	}

	/**
	 * 验证链接
	 * 
	 * @param request
	 * @return resultMap
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/checkLink", method = RequestMethod.POST, consumes = "application/json")
	public Object checkLink(@RequestBody UserCount userCount, HttpServletRequest request) throws Exception {

		String msg = "";
		String result = "";

		String sid = userCount.getSid();
		String userId = userCount.getUserId();

		System.out.println("sid>>>>>>>>" + sid);
		Map<String, Object> map = new HashMap<>();
		map = userLoginService.findUserId(userId);
		Userinfo userinfo = (Userinfo) map.get("userinfo");

		msg = userBaseInfoService.checkResetLink(sid, userinfo);

		if (msg.equals("success")) {
			result = "1";
		} else {
			result = msg;
		}

		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("result", result);
		// 测试输出JSON
		JSONObject jsonObject = JSONObject.fromObject(resultMap);
		System.out.println(jsonObject);

		return resultMap;
	}

	/**
	 * 找回链接验证成功后，设置新密码
	 * 
	 * @param userCount
	 * @param request
	 * @return resultMap
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/setNewPwd", method = RequestMethod.POST, consumes = "application/json")
	public Object setNewPwd(@RequestBody UserCount userCount, HttpServletRequest request) throws Exception {

		String result = "0";
		String userId = userCount.getUserId();
		String newPwd = userCount.getNewPwd();

		AesEncryptUtil aesEnDecrypt = new AesEncryptUtil();
		// 新密码调用AES工具进行密码解密
		String newaesDecryptPwd = aesEnDecrypt.desEncrypt(newPwd);
		System.out.println("解密后：" + newaesDecryptPwd);

		System.out.println(userId);

		Map<String, Object> map = new HashMap<>();
		map = userLoginService.findUserId(userId);

		String msg = (String) map.get("result");

		if (msg.equals("1")) {
			Userinfo userinfo = (Userinfo) map.get("userinfo");

			userinfo.setUserPwd(newaesDecryptPwd);
			result = userBaseInfoService.setUserInfo(userinfo);
		}
		

		System.out.println(userId);
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("result", result);

		return resultMap;

	}

	/**
	 * 重置密码
	 * 
	 * @param userCount
	 * @param request
	 * @return resultMap
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/resetPwd", method = RequestMethod.POST, consumes = "application/json")
	public Object resetPwd(@RequestBody UserCount userCount, HttpServletRequest request) throws Exception {

		String result = "0";
		String userId = userCount.getUserId();
		String userPwd = userCount.getUserPwd();
		String newPwd = userCount.getNewPwd();

		userId = "0402";
		
		AesEncryptUtil aesEnDecrypt = new AesEncryptUtil();
		// 新密码调用AES工具进行密码解密
		String aesDecryptPwd = aesEnDecrypt.desEncrypt(userPwd);
		System.out.println("解密后：" + aesDecryptPwd);

		// 新密码调用AES工具进行密码解密
		String newaesDecryptPwd = aesEnDecrypt.desEncrypt(newPwd);
		System.out.println("解密后：" + newaesDecryptPwd);

		System.out.println(userId);

		Map<String, Object> map = new HashMap<>();
		map = userLoginService.findUserId(userId);

		String msg = (String) map.get("result");

		System.out.println("msg"+msg);
		
		if (msg.equals("1")) {
			System.out.println("用户存在");
			Userinfo userinfo = (Userinfo) map.get("userinfo");
			if (userinfo.getUserPwd().equals(aesDecryptPwd)) {

				userinfo.setUserPwd(newaesDecryptPwd);
				result = userBaseInfoService.setUserInfo(userinfo);

			} else {
				result = "原密码错误，忘记了可以点找回密码哦";
			}
		}
		else{
		System.out.println("用户不存在");
		}

		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("result", result);

		return resultMap;

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST, consumes = "application/json")
	public String logOut(HttpServletRequest request, Model model) throws Exception {

		String msg = "";
		Subject currentUser = SecurityUtils.getSubject();
		System.out.println(currentUser.getSession());
		System.out.println(currentUser.getPrincipals());
		currentUser.logout();

		model.addAttribute("msg", msg);
		return "../login";
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST, consumes = "application/json")
	public ModelAndView deleteUser(HttpServletRequest request) throws Exception {

		String msg = "";
		String userId = request.getParameter("id");
		System.out.println(userId);
		msg = manageUserCountService.delete(userId);
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当于request的setAttribute，在jsp页面中通过usersList来获取
		modelAndView.addObject("msg", msg);
		// 指定视图
		modelAndView.setViewName("/resetpwd");
		System.out.println("注解方式:QuserUserComtroller......");
		return modelAndView;

	}

	@RequestMapping(value = "/setUserinfo", method = RequestMethod.POST, consumes = "application/json")
	public ModelAndView setUserinfo(HttpServletRequest request) throws Exception {

		// 调用Service查找数据库，查询用户列表
		String msg = "";
		String userPwd = request.getParameter("userPwd");
		String userId = "0401";

		// json格式
		/*
		 * String userId = userCount.getUserId(); String emailAddress =
		 * userCount.getEmail(); String msg = ""; Map<String, Object> map = new
		 * HashMap<>(); map.put("msg", msg);
		 */

		/*
		 * //---------测试插入列表start——————————// userinfos.clear(); String str =
		 * "";
		 * 
		 * for(int i=6;i<8;i++){ Userinfo userinfo = new Userinfo(); str =
		 * "040"+i; userinfo.setUserId(str); userinfo.setUserName("542");
		 * userinfo.setUserPwd("123456"); userinfo.setUserType((byte) 1);
		 * userinfo.setPhoneNumber("13146435896");
		 * userinfo.setEmailAddress("zaqizaba9527@163.com");
		 * userinfo.setValidataCode("asd"); userinfo.setOutDate(new Date());;
		 * userinfos.add(userinfo); } System.out.println(userinfos.toString());
		 * 
		 * str = manageUserCountService.addUserinfoByExcel(userinfos);
		 * System.out.println(str);
		 * 
		 * //——————————END——————————————//
		 */

		System.out.println(userPwd);

		Map<String, Object> map = new HashMap<>();
		map = userLoginService.findUserId(userId);
		Userinfo userinfo = (Userinfo) map.get("userinfo");

		userinfo.setUserPwd(userPwd);
		msg = userBaseInfoService.setUserInfo(userinfo);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", msg);

		// 相当于request的setAttribute，在jsp页面中通过usersList来获取
		modelAndView.setViewName("/jsptest/ok");

		System.out.println("注解方式:setUserinfoComtroller......");
		return modelAndView;
	}

	@RequestMapping(value = "/editUser", method = RequestMethod.POST, consumes = "application/json")
	public ModelAndView editUser(HttpServletRequest request) throws Exception {

		String msg = "";
		String userId = request.getParameter("id");
		System.out.println(userId);
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当于request的setAttribute，在jsp页面中通过usersList来获取
		modelAndView.addObject("msg", msg);
		// 指定视图
		modelAndView.setViewName("/resetpwd");
		System.out.println("注解方式:editUserComtroller......");
		return modelAndView;

	}

	@RequestMapping(value = "/queryAllUserinfo", method = RequestMethod.POST, consumes = "application/json")
	public ModelAndView queryUsers() throws Exception {

		// 调用Service查找数据库，查询用户列表
		List<Userinfo> userinfos = userBaseInfoService.findAllUser();
		System.out.println(userinfos);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当于request的setAttribute，在jsp页面中通过usersList来获取
		modelAndView.addObject("usersList", userinfos);
		// 指定视图
		modelAndView.setViewName("../login");
		System.out.println("注解方式:QuserUserComtroller......");
		return modelAndView;

	}

	@RequestMapping(value = "/queryActiveUser", method = RequestMethod.POST, consumes = "application/json")
	public String queryActiveUser(HttpServletRequest request, Model model) throws Exception {

		String msg = "";
		Collection<Session> sessions = sessionDAO.getActiveSessions();
		for (Session session : sessions) {
			System.out.println("sessionId" + session.getId());
			System.out.println("登录ip:" + session.getHost());
			System.out.println("登录用户" + session.getAttribute("userId"));
			System.out.println("最后操作日期:" + session.getLastAccessTime());
		}

		model.addAttribute("msg", msg);
		return "/jsptest/userindex";
	}

}
