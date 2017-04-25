package com.uestc.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.relation.RoleList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uestc.model.Authoritylist;
import com.uestc.model.RoleauthorityKey;
import com.uestc.newmodel.Roleauthority;
import com.uestc.newmodel.UserRoleAuthority;
import com.uestc.model.Roleinfo;
import com.uestc.model.Userinfo;
import com.uestc.newmodel.Userrole;
import com.uestc.model.UserroleKey;
import com.uestc.service.ManageRoleAuthorityService;
import com.uestc.service.UserLoginService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class RoleAuthorityManageController {
	
	
	
	@Autowired
	private UserLoginService userLoginService;
	
	@Autowired
	private ManageRoleAuthorityService manageRoleAuthorityService;
   
	/**
	 * 根据输入的用户ID或名字查找用户
	 * @param userRoleAuthority
	 * @param request
	 * @return userListMap
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/getUserByIdOrName",method =RequestMethod.POST,consumes = "application/json")  
    public Object getUserByIdOrName(@RequestBody UserRoleAuthority userRoleAuthority,HttpServletRequest request) throws Exception {  
        
        String userIdOrName = userRoleAuthority.getUserIdOrName();
    	String result = "1";   
    	/*UserRoleAuthority userRoleAuthority = null;
    	userRoleAuthority.setUserIdOrName(userIdOrName);*/
    	//查找用户列表
        List<Userinfo> userList = manageRoleAuthorityService.findUserByIdOrName(userIdOrName);
        Map<String, Object> userListMap = new HashMap<>();    
        userListMap.put("userList",userList);
        userListMap.put("result", result);
        //输出JSON测试
		JSONObject jsonObject = JSONObject.fromObject(userListMap);		
        System.out.println(jsonObject);
     
        return userListMap;  
    }  
	
	
	/**
	 * 根据用户账号获得该账号的所有角色
	 * @param userRoleAuthority
	 * @param request
	 * @return roleMap
	 * @throws Exception
	 */
	@ResponseBody
    @RequestMapping(value = "/getUserRole",method =RequestMethod.POST,consumes = "application/json")  
    public Object getUserRole(@RequestBody UserRoleAuthority userRoleAuthority,HttpServletRequest request) throws Exception {  
        
    	 //Json格式  /*@RequestBody UserRoleAuthority userRoleAuthority,*/
    	/*String msg = "";
    	UserRoleAuthority userRoleAuthority;
		Map<String, Object> map = new HashMap<>();
		map.put("userList",userroles)
		map.put("msg",msg); */
		
        String userId = userRoleAuthority.getUserId();
    	String result = "1";   
        List<Userrole> userroles = manageRoleAuthorityService.getUserRole(userId);
        Map<String, Object> roleMap = new HashMap<>();    
        
        List<String> roleIdList = new ArrayList<>();
        
        for(Userrole userrole:userroles){
        	roleIdList.add(userrole.getRoleId());
        }
        
        roleMap.put("roleIdList",roleIdList);
        roleMap.put("result", result);
        
        //测试JSON输出
		JSONObject jsonObject = JSONObject.fromObject(roleMap);		
        System.out.println(jsonObject);
        
        return roleMap;  
    }  
    
	/**
	 * 根据角色获得该账号的所有用户
	 * @param request
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
    @RequestMapping(value = "/getRoleUser",method =RequestMethod.POST,consumes = "application/json")  
    public Object getRoleUser(@RequestBody UserRoleAuthority userRoleAuthority,HttpServletRequest request) throws Exception {  
        
        int roleId = Integer.valueOf(userRoleAuthority.getRoleId());
        String result = "1";
        System.out.println(roleId);  
        
        List<Userrole> userroles = manageRoleAuthorityService.getUserByRoleId(roleId);
        
        Map<String, Object> userMap = new HashMap<>();    
        userMap.put("userList",userroles);
        userMap.put("result", result);
        
		//通过JSON删除返回值列表中不需要的键值对
		/*JSONObject jsonObject = new JSONObject();  
		JSONObject jsonObject1 = new JSONObject(); 
		JSONArray JsonArray = new JSONArray();  		
		System.out.println(jsonObject1);	
		//截取列表数据
		JSONArray jsonArray = JSONArray.fromObject(userroles);
		for (int i = 0; i < jsonArray.size(); i++) {
		 jsonObject1 = (JSONObject) jsonArray.get(i);
		 jsonObject1 = jsonObject1.discard("roleId");
		 jsonObject1 = jsonObject1.discard("roleName");		
		 JsonArray.add(jsonObject1);
	 	 System.out.println(jsonObject1);
		}	    
		jsonObject.put("result","1");
		jsonObject.put("userList",JsonArray);//JSONObject对象中添加键值对  
		JsonArray.add(jsonObject);//将JSONObject对象添加到Json数组中  
		System.out.println("JsonArray："+JsonArray.toString());
		System.out.println("Json:"+jsonObject);*/

		//测试JSON数据
		JSONObject jsonObject4 = JSONObject.fromObject(userMap);		
        System.out.println(jsonObject4);
        
        return userMap;  
    }  

	/**
	 * 根据选择更改用户角色
	 * @param request
	 * @param model
	 * @return resultMap
	 * @throws Exception
	 */
    @ResponseBody
    @RequestMapping(value = "/setUserRole",method =RequestMethod.POST,consumes = "application/json")  
    public Object setUserRole(@RequestBody  UserRoleAuthority userRoleAuthority ,HttpServletRequest request) throws Exception {  
        
    	String result = ""; 
        Map<String, Object> resultMap = new HashMap<>();
        List<String> roleList = new ArrayList<>();
        roleList = userRoleAuthority.getRoleIdList();
        
        //测试得到的角色列表
        System.out.println(userRoleAuthority.getRoleIdList());
        
        List<UserroleKey> userRoleKeys = new ArrayList<>();
        //*********封装插入列表start********//
        for(int i=0;i<roleList.size();i++){
      	  UserroleKey userroleKey  = new UserroleKey();
      	  userroleKey.setUserId(userRoleAuthority.getUserId());
      	  userroleKey.setRoleId(Integer.valueOf(userRoleAuthority.getRoleIdList().get(i)));
      	  userRoleKeys.add(userroleKey);
        }
        System.out.println(userRoleKeys.toString());
        //——————————END——————————————//
        result = manageRoleAuthorityService.setUserRole(userRoleKeys);
        
        resultMap.put("result",result);
        
        return resultMap;  
    }  
    
    /**
     * 获得所有教师以及所有角色
     * @param request
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/getAllTeacherAndRole",method =RequestMethod.POST,consumes = "application/json")  
    public Object getAllTeacherAndRole(HttpServletRequest request) throws Exception {  
    	
    	String result = "1";  
    	
    	List<Userrole> userroles = manageRoleAuthorityService.getUserByRoleId(2);
    	
    	List<Roleinfo> roleinfos = manageRoleAuthorityService.getAllRole();
         
        Map<String, Object> teacherAndRoleMap = new HashMap<>();
        teacherAndRoleMap.put("allteacherList",userroles);
        teacherAndRoleMap.put("allroleList",roleinfos);
        teacherAndRoleMap.put("result",result);
    	
        //测试输出JSON
		JSONObject jsonObject = JSONObject.fromObject(teacherAndRoleMap);		
        System.out.println("jsonObject AllRoleAuthority"+jsonObject);
        
        return teacherAndRoleMap;  
    }  
    
    /**
     * 添加新角色
     * @param request
     * @param model
     * @return AddRoleMap
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/addNewRole",method =RequestMethod.POST,consumes = "application/json")  
    public Object addNewRole(HttpServletRequest request) throws Exception {  
        
    	String result = "1"; 
    	
    	int roleId = manageRoleAuthorityService.addNewRole();
    	if(roleId == 0){
    		result = "新建角色冲突";
    	}
        Map<String, Object> newRoleMap = new HashMap<>();
        
        newRoleMap.put("roleId",roleId);
        newRoleMap.put("result",result);
        Map<String, Object> AddRoleMap = new HashMap<>();

        AddRoleMap.put("addNewRoleList",newRoleMap);
        
        return AddRoleMap;  
    }  
    
    /**
     * 保存角色ID与角色名
     * @param request
     * @param model
     * @return resultMap
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/saveNewRole",method =RequestMethod.POST,consumes = "application/json")  
    public Object saveNewRole(@RequestBody UserRoleAuthority userRoleAuthority,HttpServletRequest request) throws Exception {  
        
    	String result = "1";   

    	System.out.println(userRoleAuthority.getRoleId());  
        Roleinfo roleinfo = new Roleinfo();
        roleinfo.setRoleId(Integer.valueOf(userRoleAuthority.getRoleId()));
        roleinfo.setRoleName(userRoleAuthority.getRoleName());
        
        result = manageRoleAuthorityService.saveNewRole(roleinfo);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result",result);
        
        return resultMap;  
    }  
    
    /**
     * 根据角色ID删除角色
     * @param userRoleAuthority
     * @param request
     * @return resultMap
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/deleteRole",method =RequestMethod.POST,consumes = "application/json")  
    public Object deleteRole(@RequestBody  UserRoleAuthority userRoleAuthority,HttpServletRequest request) throws Exception {  
        
    	String result = "1";   
    	
        int roleId = Integer.valueOf(userRoleAuthority.getRoleId());
        result = manageRoleAuthorityService.deleteRole(roleId);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result",result);
        
        return resultMap;  
    }  
    
    /**
     * 根据角色名，查看对应身份权限
     * @param userRoleAuthority
     * @param request
     * @return getauthorityMap
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/getRoleAuthority",method =RequestMethod.POST,consumes = "application/json")  
    public Object getRoleAuthority(@RequestBody UserRoleAuthority userRoleAuthority,HttpServletRequest request ) throws Exception {  
        String result = "1"; 
      //Json格式  /*@RequestBody UserRoleAuthority userRoleAuthority,*/
    	/*String msg = "";
		Map<String, Object> authorityMap = new HashMap<>();
		authorityMap.put("authorityList",authorityList);
		authorityMap.put("result",result); 
		return authorityMap*/
        
        int roleId = Integer.valueOf(userRoleAuthority.getRoleId());
        System.out.println(roleId);  
        List<Roleauthority> roleauthorities = manageRoleAuthorityService.getRoleAuthority(roleId);
        
        List<String> authorityList = new ArrayList<>();
        
        for(Roleauthority roleauthority:roleauthorities){
        	authorityList.add(roleauthority.getAuthorityId());
        }
        
        
        //测试输出JSON数据
      	JSONArray jsonArray = JSONArray.fromObject(authorityList);
        System.out.println("jsonArray AuthorityList"+jsonArray.toString());
        
        Map<String, Object> authorityMap = new HashMap<>();
		authorityMap.put("authorityIdList",authorityList);
		authorityMap.put("result",result); 
		
        Map<String, Object> getauthorityMap = new HashMap<>();

        getauthorityMap.put("getRoleAuthorityList",authorityMap);
		return getauthorityMap;  
    } 
    
    /**
     * 设置角色权限信息
     * @param userRoleAuthority
     * @param request
     * @return resultMap
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/setRoleAuthority",method =RequestMethod.POST,consumes = "application/json")  
    public String setRoleAuthority(@RequestBody UserRoleAuthority userRoleAuthority,HttpServletRequest request) throws Exception {  
        String result = "1"; 
        
        System.out.println(userRoleAuthority.getAuthorityIdList());
        
        List<RoleauthorityKey> roleauthorityKeys = new ArrayList<>();
        //---------测试插入列表start——————————//
        for(int i=0;i<userRoleAuthority.getAuthorityIdList().size();i++){
          RoleauthorityKey roleauthorityKey  = new RoleauthorityKey();
          roleauthorityKey.setRoleId(Integer.valueOf(userRoleAuthority.getRoleId()));
          roleauthorityKey.setAuthorityId(Integer.valueOf(userRoleAuthority.getAuthorityIdList().get(i)));
          roleauthorityKeys.add(roleauthorityKey);
        }
        System.out.println(roleauthorityKeys.toString());
        //——————————END——————————————//
        
        result = manageRoleAuthorityService.setRoleAuthority(roleauthorityKeys);
       
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result",result);
        
        return result;  
    }  
    
    /**
     * 获得全部角色信息
     * @param request
     * @return roleListMap
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/getAllRole",method =RequestMethod.POST,consumes = "application/json")  
    public Object getAllRole(HttpServletRequest request ) throws Exception {  
        
    	String result = "1"; 
        List<Roleinfo> roleinfos = manageRoleAuthorityService.getAllRole();
        
        Map<String, Object> roleListMap = new HashMap<>();
        roleListMap.put("roleList",roleinfos);
        roleListMap.put("result",result);

        return roleListMap;  
    }  
    
    /**
     * 获得所有角色以及所有权限
     * @param request
     * @return allroleAuthorityMap
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/getAllRoleAuthority",method =RequestMethod.POST,consumes = "application/json")  
    public Object getAllRoleAuthority(HttpServletRequest request) throws Exception {  
    	
    	String result = "1";  
    	List<Roleinfo> roleinfos = manageRoleAuthorityService.getAllRole();
        List<Authoritylist> authoritylists = manageRoleAuthorityService.getAllAuthority();
        
        Map<String, Object> roleAuthoritymap = new HashMap<>();
        roleAuthoritymap.put("authorityList",authoritylists);
        roleAuthoritymap.put("roleList",roleinfos); 
        roleAuthoritymap.put("result",result); 
		
        Map<String, Object> allroleAuthorityMap = new HashMap<>();

        allroleAuthorityMap.put("getAllRoleAuthorityList",roleAuthoritymap); 
        //测试输出JSON
		JSONObject jsonObject = JSONObject.fromObject(allroleAuthorityMap);		
        System.out.println("jsonObject AllRoleAuthority"+jsonObject);
        
        return allroleAuthorityMap;  
    }  
    
}
