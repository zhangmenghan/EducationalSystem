package com.uestc.mapper;

import com.uestc.model.Timeandplace;
import com.uestc.model.TimeandplaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeandplaceMapper {
    int countByExample(TimeandplaceExample example);

    int deleteByExample(TimeandplaceExample example);

    int deleteByPrimaryKey(String timeAndPlaceId);

    int insert(Timeandplace record);

    int insertSelective(Timeandplace record);

    List<Timeandplace> selectByExample(TimeandplaceExample example);

    Timeandplace selectByPrimaryKey(String timeAndPlaceId);

    int updateByExampleSelective(@Param("record") Timeandplace record, @Param("example") TimeandplaceExample example);

    int updateByExample(@Param("record") Timeandplace record, @Param("example") TimeandplaceExample example);

    int updateByPrimaryKeySelective(Timeandplace record);

    int updateByPrimaryKey(Timeandplace record);
}