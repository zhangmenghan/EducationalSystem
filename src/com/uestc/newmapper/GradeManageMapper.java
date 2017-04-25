package com.uestc.newmapper;

import java.util.List;

import com.uestc.model.Gradeinfo;

public interface GradeManageMapper {
	
	List<String> selectAllGradeId();
    
    /**
     * 获取三年制的年级信息
     */
    List<Gradeinfo> selectThreeGradeinfo();
    
    /**
     * 获取五年制的年级信息
     */
    List<Gradeinfo> selectFiveGradeinfo();

}
