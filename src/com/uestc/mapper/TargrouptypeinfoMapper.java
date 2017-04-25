package com.uestc.mapper;

import com.uestc.model.Targrouptypeinfo;
import com.uestc.model.TargrouptypeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TargrouptypeinfoMapper {
    int countByExample(TargrouptypeinfoExample example);

    int deleteByExample(TargrouptypeinfoExample example);

    int deleteByPrimaryKey(Integer TARGroupTypeId);

    int insert(Targrouptypeinfo record);

    int insertSelective(Targrouptypeinfo record);

    List<Targrouptypeinfo> selectByExample(TargrouptypeinfoExample example);

    Targrouptypeinfo selectByPrimaryKey(Integer TARGroupTypeId);

    int updateByExampleSelective(@Param("record") Targrouptypeinfo record, @Param("example") TargrouptypeinfoExample example);

    int updateByExample(@Param("record") Targrouptypeinfo record, @Param("example") TargrouptypeinfoExample example);

    int updateByPrimaryKeySelective(Targrouptypeinfo record);

    int updateByPrimaryKey(Targrouptypeinfo record);
}