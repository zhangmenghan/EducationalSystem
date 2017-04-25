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

import com.uestc.model.Classinfo;
import com.uestc.model.Gradeinfo;
import com.uestc.model.Specialityinfo;
import com.uestc.model.Teacherinfo;
import com.uestc.newmodel.ClassInfoStr;
import com.uestc.newmodel.GradeAndNum;
import com.uestc.newmodel.GradeInfoStr;
import com.uestc.service.ClassManageService;
import com.uestc.service.GradeManageService;
import com.uestc.service.SpecialityManageService;
import com.uestc.service.TeacherinfoManageService;


@Controller
public class GradeController {
	@Autowired
	private GradeManageService gradeManageService;
	@Autowired
	private SpecialityManageService specialityManageService;
	@Autowired
	private TeacherinfoManageService teacherinfoManageService;
	
	
	
	
	@RequestMapping(value = "/getGradeInfoJson",method =RequestMethod.POST)
	public Object getGradeInfo() throws Exception{
		Map<String,List<Integer>> gradeMap=gradeManageService.getCurrentGradeInfo();
		List<Integer> grade3=gradeMap.get("3");
		List<Integer> grade5=gradeMap.get("5");
		Map<String,Object> allList=new HashMap<String,Object>();
		
		Map<String,Object> gradeList3=new HashMap<String,Object>();
		Map<String,Object> gradeList5=new HashMap<String,Object>();
		
		
		List<GradeAndNum> ganList3=new ArrayList<GradeAndNum>();
		List<Map> sList=new ArrayList<Map>();
		for(int i=0;i<grade3.size();i++){
			GradeAndNum gan=new GradeAndNum();
			gan.setGradeName(grade3.get(i)+"");//int转string
			int num=gradeManageService.getStudentNum(grade3.get(i)+"");
			gan.setStudentNum(num+"");
			ganList3.add(gan);
		}
		gradeList3.put("gradeList", ganList3);//第一层封装
		
		gradeList3.put("yearType", "3");//第二层封装

		
		List<GradeAndNum> ganList5=new ArrayList<GradeAndNum>();
		for(int i=0;i<grade5.size();i++){
			GradeAndNum gan=new GradeAndNum();
			gan.setGradeName(grade5.get(i)+"");
			int num=gradeManageService.getStudentNum(grade5.get(i)+"");
			gan.setStudentNum(num+"");
			ganList5.add(gan);
		}
		gradeList5.put("gradeList", ganList5);//第一层封装
		
		gradeList5.put("yearType", "5");//第二层封装

		
		sList.add(gradeList3);
		sList.add(gradeList5);
		allList.put("yearList", sList);//第三层封装
		//JSONObject jsonObject4 = JSONObject.fromObject(allList);
	    
		return allList;
	}

	@ResponseBody
	@RequestMapping(value = "/addGrade",method =RequestMethod.POST)
	public Object  addGrade(@RequestBody GradeInfoStr gradeInfoStr) throws Exception{
		Gradeinfo grade = new Gradeinfo();
		if(gradeInfoStr.getGradeType().equals("3")){
			grade.setGradeId(gradeInfoStr.getGradeName().substring(0, 4)+"3");
			grade.setGradeType((byte)3);
		}else if(gradeInfoStr.getGradeType().equals("5")){
			grade.setGradeId(gradeInfoStr.getGradeName().substring(0, 4)+"5");
			grade.setGradeType((byte)5);
		}
		
		int result=gradeManageService.addGrade(grade);
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("result", result);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/deleteGrade",method =RequestMethod.POST)
	public Object  deleteGrade(@RequestBody GradeInfoStr gradeInfoStr) throws Exception{
		
		String gradeId=null;
		if(gradeInfoStr.getGradeType().equals("3")){
			gradeId=gradeInfoStr.getGradeName().substring(0, 4)+"3";
		}else if(gradeInfoStr.getGradeType().equals("5")){
			gradeId=gradeInfoStr.getGradeName().substring(0, 4)+"5";
		}
		
		int result=gradeManageService.deleteGrade(gradeId);
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("result", result);
		return map;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/getGradeDetail",method =RequestMethod.POST)
	public Object getGradeDetail(@RequestBody GradeInfoStr gradeInfoStr) throws Exception{
		String gradeId=null;
		if(gradeInfoStr.getGradeType().equals("3")){
			gradeId=gradeInfoStr.getGradeName().substring(0, 4)+"3";
		}else if(gradeInfoStr.getGradeType().equals("5")){
			gradeId=gradeInfoStr.getGradeName().substring(0, 4)+"5";
		}
		List<Classinfo> classList=gradeManageService.getGradeClassInfo(gradeId);
		List<ClassInfoStr> classListStr=new ArrayList<ClassInfoStr>();
		for(int i=0;i<classList.size();i++){
			Classinfo classinfo=classList.get(i);
			ClassInfoStr classinfoStr=new ClassInfoStr();
			classinfoStr.setGradeName(classinfo.getGradeId().substring(0, 4));
			//根据专业ID获取专业名称
			Specialityinfo speciality=specialityManageService.getSpecialityInfo(classinfo.getSpecialityId());
			classinfoStr.setSpecialityName(speciality.getSpecialityName());
			classinfoStr.setClassId(classinfo.getClassId());
			classinfoStr.setClassTeacherId(classinfo.getClassTeacherId());
			Teacherinfo teacher=teacherinfoManageService.getTeacherInfoById(classinfo.getClassTeacherId());
			classinfoStr.setClassTeacherName(teacher.getTeacherName());
			
			classinfoStr.setSchoolYearType(classinfo.getStudyMode().toString());
			classinfoStr.setClassSize(classinfo.getClassSize().toString());
			
			classListStr.add(classinfoStr);
		}
		
		return classListStr;
	}
	
}
