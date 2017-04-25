package com.uestc.mapper;

import com.uestc.model.Teacherpayroll;
import com.uestc.model.TeacherpayrollExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherpayrollMapper {
    int countByExample(TeacherpayrollExample example);

    int deleteByExample(TeacherpayrollExample example);

    int deleteByPrimaryKey(Integer payrollId);

    int insert(Teacherpayroll record);

    int insertSelective(Teacherpayroll record);

    List<Teacherpayroll> selectByExample(TeacherpayrollExample example);

    Teacherpayroll selectByPrimaryKey(Integer payrollId);

    int updateByExampleSelective(@Param("record") Teacherpayroll record, @Param("example") TeacherpayrollExample example);

    int updateByExample(@Param("record") Teacherpayroll record, @Param("example") TeacherpayrollExample example);

    int updateByPrimaryKeySelective(Teacherpayroll record);

    int updateByPrimaryKey(Teacherpayroll record);
}