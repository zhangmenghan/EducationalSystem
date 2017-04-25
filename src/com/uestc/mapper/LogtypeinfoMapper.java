package com.uestc.mapper;

import com.uestc.model.Logtypeinfo;
import com.uestc.model.LogtypeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogtypeinfoMapper {
    int countByExample(LogtypeinfoExample example);

    int deleteByExample(LogtypeinfoExample example);

    int deleteByPrimaryKey(Integer logTypeId);

    int insert(Logtypeinfo record);

    int insertSelective(Logtypeinfo record);

    List<Logtypeinfo> selectByExample(LogtypeinfoExample example);

    Logtypeinfo selectByPrimaryKey(Integer logTypeId);

    int updateByExampleSelective(@Param("record") Logtypeinfo record, @Param("example") LogtypeinfoExample example);

    int updateByExample(@Param("record") Logtypeinfo record, @Param("example") LogtypeinfoExample example);

    int updateByPrimaryKeySelective(Logtypeinfo record);

    int updateByPrimaryKey(Logtypeinfo record);
}