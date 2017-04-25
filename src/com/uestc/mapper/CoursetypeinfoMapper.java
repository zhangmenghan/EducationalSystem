package com.uestc.mapper;

import com.uestc.model.Coursetypeinfo;
import com.uestc.model.CoursetypeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursetypeinfoMapper {
    int countByExample(CoursetypeinfoExample example);

    int deleteByExample(CoursetypeinfoExample example);

    int deleteByPrimaryKey(Byte courseTypeId);

    int insert(Coursetypeinfo record);

    int insertSelective(Coursetypeinfo record);

    List<Coursetypeinfo> selectByExample(CoursetypeinfoExample example);

    Coursetypeinfo selectByPrimaryKey(Byte courseTypeId);

    int updateByExampleSelective(@Param("record") Coursetypeinfo record, @Param("example") CoursetypeinfoExample example);

    int updateByExample(@Param("record") Coursetypeinfo record, @Param("example") CoursetypeinfoExample example);

    int updateByPrimaryKeySelective(Coursetypeinfo record);

    int updateByPrimaryKey(Coursetypeinfo record);
}