package com.uestc.mapper;

import com.uestc.model.Schooltime;
import com.uestc.model.SchooltimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchooltimeMapper {
    int countByExample(SchooltimeExample example);

    int deleteByExample(SchooltimeExample example);

    int insert(Schooltime record);

    int insertSelective(Schooltime record);

    List<Schooltime> selectByExample(SchooltimeExample example);

    int updateByExampleSelective(@Param("record") Schooltime record, @Param("example") SchooltimeExample example);

    int updateByExample(@Param("record") Schooltime record, @Param("example") SchooltimeExample example);
}