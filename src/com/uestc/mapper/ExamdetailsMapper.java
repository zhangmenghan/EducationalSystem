package com.uestc.mapper;

import com.uestc.model.Examdetails;
import com.uestc.model.ExamdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamdetailsMapper {
    int countByExample(ExamdetailsExample example);

    int deleteByExample(ExamdetailsExample example);

    int deleteByPrimaryKey(String examDetailsId);

    int insert(Examdetails record);

    int insertSelective(Examdetails record);

    List<Examdetails> selectByExample(ExamdetailsExample example);

    Examdetails selectByPrimaryKey(String examDetailsId);

    int updateByExampleSelective(@Param("record") Examdetails record, @Param("example") ExamdetailsExample example);

    int updateByExample(@Param("record") Examdetails record, @Param("example") ExamdetailsExample example);

    int updateByPrimaryKeySelective(Examdetails record);

    int updateByPrimaryKey(Examdetails record);
}