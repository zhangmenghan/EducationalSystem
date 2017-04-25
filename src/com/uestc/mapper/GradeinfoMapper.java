package com.uestc.mapper;

import com.uestc.model.Gradeinfo;
import com.uestc.model.GradeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeinfoMapper {
    int countByExample(GradeinfoExample example);

    int deleteByExample(GradeinfoExample example);

    int deleteByPrimaryKey(String gradeId);

    int insert(Gradeinfo record);

    int insertSelective(Gradeinfo record);

    List<Gradeinfo> selectByExample(GradeinfoExample example);

    Gradeinfo selectByPrimaryKey(String gradeId);

    int updateByExampleSelective(@Param("record") Gradeinfo record, @Param("example") GradeinfoExample example);

    int updateByExample(@Param("record") Gradeinfo record, @Param("example") GradeinfoExample example);

    int updateByPrimaryKeySelective(Gradeinfo record);

    int updateByPrimaryKey(Gradeinfo record);
}