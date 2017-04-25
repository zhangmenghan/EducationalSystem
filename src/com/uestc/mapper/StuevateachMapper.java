package com.uestc.mapper;

import com.uestc.model.Stuevateach;
import com.uestc.model.StuevateachExample;
import com.uestc.model.StuevateachKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuevateachMapper {
    int countByExample(StuevateachExample example);

    int deleteByExample(StuevateachExample example);

    int deleteByPrimaryKey(StuevateachKey key);

    int insert(Stuevateach record);

    int insertSelective(Stuevateach record);

    List<Stuevateach> selectByExampleWithBLOBs(StuevateachExample example);

    List<Stuevateach> selectByExample(StuevateachExample example);

    Stuevateach selectByPrimaryKey(StuevateachKey key);

    int updateByExampleSelective(@Param("record") Stuevateach record, @Param("example") StuevateachExample example);

    int updateByExampleWithBLOBs(@Param("record") Stuevateach record, @Param("example") StuevateachExample example);

    int updateByExample(@Param("record") Stuevateach record, @Param("example") StuevateachExample example);

    int updateByPrimaryKeySelective(Stuevateach record);

    int updateByPrimaryKeyWithBLOBs(Stuevateach record);

    int updateByPrimaryKey(Stuevateach record);
}