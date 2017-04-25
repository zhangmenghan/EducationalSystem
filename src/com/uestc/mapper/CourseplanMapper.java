package com.uestc.mapper;

import com.uestc.model.Courseplan;
import com.uestc.model.CourseplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseplanMapper {
    int countByExample(CourseplanExample example);

    int deleteByExample(CourseplanExample example);

    int deleteByPrimaryKey(String coursePlanId);

    int insert(Courseplan record);

    int insertSelective(Courseplan record);

    List<Courseplan> selectByExample(CourseplanExample example);

    Courseplan selectByPrimaryKey(String coursePlanId);

    int updateByExampleSelective(@Param("record") Courseplan record, @Param("example") CourseplanExample example);

    int updateByExample(@Param("record") Courseplan record, @Param("example") CourseplanExample example);

    int updateByPrimaryKeySelective(Courseplan record);

    int updateByPrimaryKey(Courseplan record);
}