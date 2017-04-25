package com.uestc.mapper;

import com.uestc.model.RoleauthorityExample;
import com.uestc.model.RoleauthorityKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleauthorityMapper {
    int countByExample(RoleauthorityExample example);

    int deleteByExample(RoleauthorityExample example);

    int deleteByPrimaryKey(RoleauthorityKey key);

    int insert(RoleauthorityKey record);

    int insertSelective(RoleauthorityKey record);

    List<RoleauthorityKey> selectByExample(RoleauthorityExample example);

    int updateByExampleSelective(@Param("record") RoleauthorityKey record, @Param("example") RoleauthorityExample example);

    int updateByExample(@Param("record") RoleauthorityKey record, @Param("example") RoleauthorityExample example);
}