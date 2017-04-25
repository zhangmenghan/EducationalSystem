package com.uestc.mapper;

import com.uestc.model.Targroup;
import com.uestc.model.TargroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TargroupMapper {
    int countByExample(TargroupExample example);

    int deleteByExample(TargroupExample example);

    int deleteByPrimaryKey(String TARGroupId);

    int insert(Targroup record);

    int insertSelective(Targroup record);

    List<Targroup> selectByExample(TargroupExample example);

    Targroup selectByPrimaryKey(String TARGroupId);

    int updateByExampleSelective(@Param("record") Targroup record, @Param("example") TargroupExample example);

    int updateByExample(@Param("record") Targroup record, @Param("example") TargroupExample example);

    int updateByPrimaryKeySelective(Targroup record);

    int updateByPrimaryKey(Targroup record);
}