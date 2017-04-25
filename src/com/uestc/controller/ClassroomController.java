package com.uestc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.uestc.model.Classroom;
import com.uestc.newmodel.ClassroomStr;
import com.uestc.service.ClassroomManageService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import netscape.javascript.JSObject;


@Controller
public class ClassroomController {
	
	@Autowired
	private ClassroomManageService classroomManageService;
	
	@RequestMapping(value = "/getClassroomInfo")
	public Object getClassroomInfo() throws Exception{
		List<Classroom> regularList=classroomManageService.getRegularClassroom();
		List<Classroom> unregularList=classroomManageService.getUnregularClassroom();
//		for(int i=0;i<regularList.size();i++){
//			ClassroomStr cStr= new ClassroomStr();
//			cStr.setClassroomId(regularList.get(i).getClassroomId());
//			cStr.setClassroomSize(regularList.get(i).getClassroomSize());
//			if(regularList.get(i).getClassType()== (byte)1){
//				cStr.setClassType("普通教室");
//			}else if(regularList.get(i).getClassType()== (byte)2){
//				cStr.setClassType("机房");
//			}
//			
//		}
		Map<String,List<Classroom>> classroomMap=new HashMap<String,List<Classroom>>();
		classroomMap.put("regularClassroomList", regularList);
		classroomMap.put("unregularClassroomList", unregularList);
		return classroomMap;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/addClassroom")
	public Object addClassroom(@RequestBody ClassroomStr classroomStr,HttpServletResponse response) throws Exception{
		Classroom classroom=new Classroom();
		classroom.setClassroomId(classroomStr.getClassroomId());
		classroom.setClassroomSize(classroomStr.getClassroomSize());
		if(classroomStr.getClassType().equals("普通教室")){
			classroom.setClassType((byte)1);
		}else if(classroomStr.getClassType().equals("机房")){
			classroom.setClassType((byte)2);
		}
		int result=classroomManageService.addClassroom(classroom);
		Map<String,String> resultMap=new HashMap<String,String>();
		if(result == 1){
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "failure");
		}
		//JSONObject jsonResult = JSONObject.fromObject(resultMap);
		return resultMap;
	}
	
	@ResponseBody
	@RequestMapping(value = "/editClassroom")
	public Object editClassroom(@RequestBody ClassroomStr classroomStr,HttpServletResponse response) throws Exception{
		Classroom classroom=new Classroom();
		classroom.setClassroomId(classroomStr.getClassroomId());
		classroom.setClassroomSize(classroomStr.getClassroomSize());
		if(classroomStr.getClassType().equals("普通教室")){
			classroom.setClassType((byte)1);
		}else if(classroomStr.getClassType().equals("机房")){
			classroom.setClassType((byte)2);
		}
		int result=classroomManageService.editClassroom(classroom);
		Map<String,String> resultMap=new HashMap<String,String>();
		if(result == 1){
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "failure");
		}
		//JSONObject jsonResult = JSONObject.fromObject(resultMap);
		return resultMap;
	}
	
	@ResponseBody
	@RequestMapping(value = "/deleteClassroom")
	public Object deleteClassroom(@RequestBody String classroomId,HttpServletResponse response) throws Exception{
		
		int result=classroomManageService.deleteClassroom(classroomId);
		Map<String,String> resultMap=new HashMap<String,String>();
		if(result == 1){
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "failure");
		}
		//JSONObject jsonResult = JSONObject.fromObject(resultMap);
		return resultMap;
	}
}
