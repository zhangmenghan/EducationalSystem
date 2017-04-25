package com.uestc.mapper;

import com.uestc.model.Workexperience;
import com.uestc.model.WorkexperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkexperienceMapper {
    int countByExample(WorkexperienceExample example);

    int deleteByExample(WorkexperienceExample example);

    int deleteByPrimaryKey(Integer workExperienceId);

    int insert(Workexperience record);

    int insertSelective(Workexperience record);

    List<Workexperience> selectByExample(WorkexperienceExample example);

    Workexperience selectByPrimaryKey(Integer workExperienceId);

    int updateByExampleSelective(@Param("record") Workexperience record, @Param("example") WorkexperienceExample example);

    int updateByExample(@Param("record") Workexperience record, @Param("example") WorkexperienceExample example);

    int updateByPrimaryKeySelective(Workexperience record);

    int updateByPrimaryKey(Workexperience record);
}