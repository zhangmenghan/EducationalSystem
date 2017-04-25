package com.uestc.mapper;

import com.uestc.model.Givelessonsdetails;
import com.uestc.model.GivelessonsdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GivelessonsdetailsMapper {
    int countByExample(GivelessonsdetailsExample example);

    int deleteByExample(GivelessonsdetailsExample example);

    int deleteByPrimaryKey(String giveLessonsDetailsId);

    int insert(Givelessonsdetails record);

    int insertSelective(Givelessonsdetails record);

    List<Givelessonsdetails> selectByExample(GivelessonsdetailsExample example);

    Givelessonsdetails selectByPrimaryKey(String giveLessonsDetailsId);

    int updateByExampleSelective(@Param("record") Givelessonsdetails record, @Param("example") GivelessonsdetailsExample example);

    int updateByExample(@Param("record") Givelessonsdetails record, @Param("example") GivelessonsdetailsExample example);

    int updateByPrimaryKeySelective(Givelessonsdetails record);

    int updateByPrimaryKey(Givelessonsdetails record);
}