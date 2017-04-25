package com.uestc.newmapper;

import java.util.List;

import com.uestc.model.Studentinfo;
import com.uestc.newmodel.StudentinfoKey;

public interface StudentManageMapper {
	List<Studentinfo> selectBySchoolYearType(byte schoolYearType);
    
    List<Studentinfo> selectByGradeId(String gradeId);
    
    List<Studentinfo> selectByClassId(String classId);
    
    List<Studentinfo> selectByStudentId(String studentId);
    
    List<Studentinfo> selectByKey(StudentinfoKey key);
    
    /**
     * 设置学生的在校状态
     * @param studentId
     * @return
     */
    int setStudentState(Studentinfo student);
    
    
    /**
     * 根据班级ID获取学生人数
     * @param gradeId
     * @return
     */
    int countStudentNumByClassId(String classId);
}
