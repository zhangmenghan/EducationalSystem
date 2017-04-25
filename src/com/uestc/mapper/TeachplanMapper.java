package com.uestc.mapper;

import com.uestc.model.Teachplan;
import com.uestc.model.TeachplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachplanMapper {
    int countByExample(TeachplanExample example);

    int deleteByExample(TeachplanExample example);

    int deleteByPrimaryKey(String teachPlanId);

    int insert(Teachplan record);

    int insertSelective(Teachplan record);

    List<Teachplan> selectByExample(TeachplanExample example);

    Teachplan selectByPrimaryKey(String teachPlanId);

    int updateByExampleSelective(@Param("record") Teachplan record, @Param("example") TeachplanExample example);

    int updateByExample(@Param("record") Teachplan record, @Param("example") TeachplanExample example);

    int updateByPrimaryKeySelective(Teachplan record);

    int updateByPrimaryKey(Teachplan record);
}