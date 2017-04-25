package com.uestc.mapper;

import com.uestc.model.Roleinfo;
import com.uestc.model.RoleinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleinfoMapper {
    int countByExample(RoleinfoExample example);

    int deleteByExample(RoleinfoExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(Roleinfo record);

    int insertSelective(Roleinfo record);

    List<Roleinfo> selectByExample(RoleinfoExample example);

    Roleinfo selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") Roleinfo record, @Param("example") RoleinfoExample example);

    int updateByExample(@Param("record") Roleinfo record, @Param("example") RoleinfoExample example);

    int updateByPrimaryKeySelective(Roleinfo record);

    int updateByPrimaryKey(Roleinfo record);
}