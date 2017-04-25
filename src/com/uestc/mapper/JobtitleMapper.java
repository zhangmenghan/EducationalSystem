package com.uestc.mapper;

import com.uestc.model.Jobtitle;
import com.uestc.model.JobtitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobtitleMapper {
    int countByExample(JobtitleExample example);

    int deleteByExample(JobtitleExample example);

    int deleteByPrimaryKey(Integer jobId);

    int insert(Jobtitle record);

    int insertSelective(Jobtitle record);

    List<Jobtitle> selectByExample(JobtitleExample example);

    Jobtitle selectByPrimaryKey(Integer jobId);

    int updateByExampleSelective(@Param("record") Jobtitle record, @Param("example") JobtitleExample example);

    int updateByExample(@Param("record") Jobtitle record, @Param("example") JobtitleExample example);

    int updateByPrimaryKeySelective(Jobtitle record);

    int updateByPrimaryKey(Jobtitle record);
}