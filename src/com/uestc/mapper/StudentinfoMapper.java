package com.uestc.mapper;

import com.uestc.model.Studentinfo;
import com.uestc.model.StudentinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentinfoMapper {
    int countByExample(StudentinfoExample example);

    int deleteByExample(StudentinfoExample example);

    int deleteByPrimaryKey(String studentId);

    int insert(Studentinfo record);

    int insertSelective(Studentinfo record);

    List<Studentinfo> selectByExample(StudentinfoExample example);

    Studentinfo selectByPrimaryKey(String studentId);

    int updateByExampleSelective(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByExample(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByPrimaryKeySelective(Studentinfo record);

    int updateByPrimaryKey(Studentinfo record);
}