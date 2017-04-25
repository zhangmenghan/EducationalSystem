package com.uestc.mapper;

import com.uestc.model.UserroleExample;
import com.uestc.model.UserroleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserroleMapper {
    int countByExample(UserroleExample example);

    int deleteByExample(UserroleExample example);

    int deleteByPrimaryKey(UserroleKey key);

    int insert(UserroleKey record);

    int insertSelective(UserroleKey record);

    List<UserroleKey> selectByExample(UserroleExample example);

    int updateByExampleSelective(@Param("record") UserroleKey record, @Param("example") UserroleExample example);

    int updateByExample(@Param("record") UserroleKey record, @Param("example") UserroleExample example);
}