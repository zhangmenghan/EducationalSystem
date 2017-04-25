package com.uestc.mapper;

import com.uestc.model.Statechangeinfo;
import com.uestc.model.StatechangeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatechangeinfoMapper {
    int countByExample(StatechangeinfoExample example);

    int deleteByExample(StatechangeinfoExample example);

    int insert(Statechangeinfo record);

    int insertSelective(Statechangeinfo record);

    List<Statechangeinfo> selectByExample(StatechangeinfoExample example);

    int updateByExampleSelective(@Param("record") Statechangeinfo record, @Param("example") StatechangeinfoExample example);

    int updateByExample(@Param("record") Statechangeinfo record, @Param("example") StatechangeinfoExample example);
}