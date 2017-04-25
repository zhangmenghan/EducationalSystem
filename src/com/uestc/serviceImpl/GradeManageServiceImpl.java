package com.uestc.serviceImpl;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uestc.mapper.ClassinfoMapper;
import com.uestc.mapper.GradeinfoMapper;
import com.uestc.model.Classinfo;
import com.uestc.model.Gradeinfo;
import com.uestc.newmapper.ClassManageMapper;
import com.uestc.newmapper.GradeManageMapper;
import com.uestc.newmapper.StudentManageMapper;
import com.uestc.service.GradeManageService;

@Service
public class GradeManageServiceImpl implements GradeManageService {
	@Autowired
	private GradeinfoMapper gradeinfoMapper;
	@Autowired
	private GradeManageMapper gradeManageMapper;
	@Autowired
	private ClassinfoMapper classinfoMapper;
	@Autowired
	private ClassManageMapper classManageMapper;
	@Autowired
	private StudentManageMapper studentManageMapper;
	@Override
	public int addGrade(Gradeinfo grade) throws Exception {
		
		int result = gradeinfoMapper.insert(grade);
		
		return result;
	}

	@Override
	public int deleteGrade(String gradeID) throws Exception {
		int result = gradeinfoMapper.deleteByPrimaryKey(gradeID);
		return result;
	}

	@Override
	public int editGrade(Gradeinfo grade) throws Exception {
		// TODO Auto-generated method stub
		//使用的是ByPrimaryKey接口，不会判断更新的数据字段中是否有null，不能修改主键
		int result=gradeinfoMapper.updateByPrimaryKey(grade);
		return 0;
	}

	@Override
	public List<Classinfo> getGradeClassInfo(String gradeId) throws Exception {
		
		//实例化一个List类，用于存放某个年级中的班级信息
		List<Classinfo> classOfGrade =new  ArrayList<Classinfo>();
		
		classOfGrade=classManageMapper.selectByGradeId(gradeId);
		
		
		return classOfGrade;
	}

	@Override
	public Map getCurrentGradeInfo() throws Exception {
		
		
		//获取三年制的Gradeinfo
		List<Gradeinfo> gradeList3=gradeManageMapper.selectThreeGradeinfo();
		//获取五年制的Gradeinfo
		List<Gradeinfo> gradeList5=gradeManageMapper.selectFiveGradeinfo();
		//三年制年级id数组
		List<Integer> gradeIdListInt3= new ArrayList<Integer>();
		//五年制年级id数组
		List<Integer> gradeIdListInt5= new ArrayList<Integer>();
		
		
		//将年级Id的前四位即年份转换为int类型（三年制）
		for(int i=0;i< gradeList3.size();i++){
			try{
				int gradeIdInt = Integer.parseInt(gradeList3.get(i).getGradeId().substring(0, 4));
				gradeIdListInt3.add(gradeIdInt);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		int size = gradeIdListInt3.size(),tempInt;
		Gradeinfo temp;
		//根据年份，对Gradeinfo进行排序（三年制）
	    for (int i = 0; i < size; i++) {   
	        int k = i;   
	        for (int j = size - 1; j >i; j--)  {   
	            if (gradeIdListInt3.get(j) > gradeIdListInt3.get(k))  k = j;
	        }
	        //对年级的年数进行排序,即gradeIdListInt3
	        tempInt=gradeIdListInt3.get(i);
	        gradeIdListInt3.set(i, gradeIdListInt3.get(k));
	        gradeIdListInt3.set(k, tempInt);
//	        //对年级信息数组进行排序,即gradeList3
//	        temp = gradeList3.get(i);   
//	        gradeList3.set(i, gradeList3.get(k));
//	        gradeList3.set(k, temp);
	    }
	    
	    //将年级Id的前四位即年份转换为int类型（五年制）
	    for(int i=0;i< gradeList5.size();i++){
			try{
				int gradeIdInt = Integer.parseInt(gradeList5.get(i).getGradeId().substring(0, 4));
				gradeIdListInt5.add(gradeIdInt);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		size = gradeIdListInt5.size();
		//根据年份，对Gradeinfo进行排序（五年制）
	    for (int i = 0; i < size; i++) {   
	        int k = i;   
	        for (int j = size - 1; j >i; j--)  {   
	            if (gradeIdListInt5.get(j) > gradeIdListInt5.get(k))  k = j;
	        
	        //对年级的年数进行排序,即gradeIdListInt3
	        tempInt=gradeIdListInt5.get(i);
	        gradeIdListInt5.set(i, gradeIdListInt5.get(k));
	        gradeIdListInt5.set(k, tempInt);
//	        //对年级信息数组进行排序,即gradeList3
//	        temp = gradeList5.get(i);   
//	        gradeList5.set(i, gradeList5.get(k));
//	        gradeList5.set(k, temp);
	        }
	    }
	    
	    
	    //取五年制的五个最大年级和三年制的三个最大年级
	    List<Integer> grade3= new ArrayList<Integer>();
	    List<Integer> grade5= new ArrayList<Integer>();
	    int max5=5,max3=3;
	    if (gradeList5.size()<5){
	    	max5=gradeList5.size();
	    }
	    if (gradeList3.size()<3){
	    	max5=gradeList3.size();
	    }
	    for(int i=0;i< max3;i++){
	    	grade3.add(gradeIdListInt3.get(i));
	    }
	    for(int i=0;i< max5;i++){
	    	grade5.add(gradeIdListInt5.get(i));
	    }
		Map<String,List<Integer>> map=new HashMap<String,List<Integer>>();
		map.put("3", grade3);
		map.put("5", grade5);
		return map;
	}

	@Override
	public int getStudentNum(String gradeId) throws Exception {
		//根据年级ID获取该年级的班级ID
		List<String> classList= classManageMapper.selectClassIdByGradeId(gradeId);
		int sum=0;
		for(int i=0;i<classList.size();i++){
			//根据班级ID获取学生数量
			int studentNum=studentManageMapper.countStudentNumByClassId(classList.get(i));
			sum+=studentNum;
		}
		return sum;
	} 

}
