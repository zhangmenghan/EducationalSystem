package com.uestc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uestc.model.Teacherinfo;
import com.uestc.newmodel.TeacherSimpleInfo;
import com.uestc.newmodel.TeacherinfoKey;
import com.uestc.service.TeacherinfoManageService;



@Controller
public class TeacherInfoController {
	@Autowired
	private TeacherinfoManageService teacherinfoManageService;
	
	@RequestMapping(value = "/getTeacherInfo",method =RequestMethod.POST,consumes = "application/json")
	public Object getTeacherInfo() throws Exception{
		List<Teacherinfo> teacherinfoList=teacherinfoManageService.getAllTeacherInfo();
		List<TeacherSimpleInfo> teacherSimpleInfoList=new ArrayList<TeacherSimpleInfo>();
		Teacherinfo  teacherinfo=new Teacherinfo();
		TeacherSimpleInfo tsInfo=new TeacherSimpleInfo();
		for(int i=0;i<teacherinfoList.size();i++){
			teacherinfo=teacherinfoList.get(i);
			tsInfo.setTeacherId(teacherinfo.getTeacherId());
			tsInfo.setTeacherName(teacherinfo.getTeacherName());
			tsInfo.setTeacherIDcard(teacherinfo.getTeacherIDcard());
			if(teacherinfo.getTeacherGender()== (byte)0){
				tsInfo.setTeacherGender("女");
			}
			else{
				tsInfo.setTeacherGender("男");
			}
			String phoneNum=teacherinfoManageService.getTeacherPhoneNum(teacherinfo.getTeacherId());
			tsInfo.setPhoneNum(phoneNum);
			tsInfo.setHireCampus(teacherinfo.getHireCampus());
			tsInfo.setCurrentWorkTitle(teacherinfo.getCurrentWorkTitle());
			tsInfo.setCurrentWorkDuty(teacherinfo.getCurrentWorkDuty());
			if(teacherinfo.getTeacherType()== 1){
				tsInfo.setTeacherType("在职");
			}else if(teacherinfo.getTeacherType()== 2){
				tsInfo.setTeacherType("离职");
			}else if(teacherinfo.getTeacherType()== 3){
				tsInfo.setTeacherType("外聘");
			}
			//将tsInfo加入到List中
			teacherSimpleInfoList.add(tsInfo);
		}
		Map<String,List<TeacherSimpleInfo>>	teacherMap=new HashMap<String,List<TeacherSimpleInfo>>();	
		teacherMap.put("teacherSimpleInfoList", teacherSimpleInfoList);
		return teacherMap;
	}
	

	
	@ResponseBody
	@RequestMapping(value = "/findTeacherInfo",method =RequestMethod.POST,consumes = "application/json")
	public Object findTeacherInfo(@RequestBody TeacherinfoKey teacherinfoKey) throws Exception{
		String name=teacherinfoKey.getTeacherName();
		String id=teacherinfoKey.getTeacherId();
		List<Teacherinfo> teacherList=new ArrayList<Teacherinfo>();
		if(id == null || id.equals("")){
			teacherList=teacherinfoManageService.getTeacherInfoByName(name);
		}
		else{
			Teacherinfo teacher=teacherinfoManageService.getTeacherInfoById(id);
			teacherList.add(teacher);
		}
		
		List<TeacherSimpleInfo> teacherSimpleInfoList=new ArrayList<TeacherSimpleInfo>();//页面显示的教师信息List
		Teacherinfo teacherinfo=new Teacherinfo();//查询到的教师信息
		TeacherSimpleInfo tsInfo=new TeacherSimpleInfo();//页面显示的教师信息
		for(int i=0;i<teacherList.size();i++){
			teacherinfo=teacherList.get(i);
			tsInfo.setTeacherId(teacherinfo.getTeacherId());
			tsInfo.setTeacherName(teacherinfo.getTeacherName());
			tsInfo.setTeacherIDcard(teacherinfo.getTeacherIDcard());
			if(teacherinfo.getTeacherGender()== (byte)0){
				tsInfo.setTeacherGender("女");
			}
			else{
				tsInfo.setTeacherGender("男");
			}
			String phoneNum=teacherinfoManageService.getTeacherPhoneNum(teacherinfo.getTeacherId());
			tsInfo.setPhoneNum(phoneNum);
			tsInfo.setHireCampus(teacherinfo.getHireCampus());
			tsInfo.setCurrentWorkTitle(teacherinfo.getCurrentWorkTitle());
			tsInfo.setCurrentWorkDuty(teacherinfo.getCurrentWorkDuty());
			if(teacherinfo.getTeacherType()== 1){
				tsInfo.setTeacherType("在职");
			}else if(teacherinfo.getTeacherType()== 2){
				tsInfo.setTeacherType("离职");
			}else if(teacherinfo.getTeacherType()== 3){
				tsInfo.setTeacherType("外聘");
			}
			//将tsInfo加入到List中
			teacherSimpleInfoList.add(tsInfo);
		}
		Map<String,List<TeacherSimpleInfo>>	teacherMap=new HashMap<String,List<TeacherSimpleInfo>>();	
		teacherMap.put("teacherSimpleInfoList", teacherSimpleInfoList);
		return teacherMap;
		
	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "/uploadTeacherinfo",method =RequestMethod.POST,consumes = "application/json")
	public Object uploadTeacherinfo(@RequestBody String fileUrl) throws Exception{
		int finalResult=teacherinfoManageService.doUploadTeacherInfo(fileUrl);
		Map<String,String> resultMap=new HashMap<String,String>();
		resultMap.put("result", finalResult+"");
		return resultMap;
	}
}
