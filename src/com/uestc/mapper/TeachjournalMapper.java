package com.uestc.mapper;

import com.uestc.model.Teachjournal;
import com.uestc.model.TeachjournalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachjournalMapper {
    int countByExample(TeachjournalExample example);

    int deleteByExample(TeachjournalExample example);

    int deleteByPrimaryKey(String teachJournalId);

    int insert(Teachjournal record);

    int insertSelective(Teachjournal record);

    List<Teachjournal> selectByExampleWithBLOBs(TeachjournalExample example);

    List<Teachjournal> selectByExample(TeachjournalExample example);

    Teachjournal selectByPrimaryKey(String teachJournalId);

    int updateByExampleSelective(@Param("record") Teachjournal record, @Param("example") TeachjournalExample example);

    int updateByExampleWithBLOBs(@Param("record") Teachjournal record, @Param("example") TeachjournalExample example);

    int updateByExample(@Param("record") Teachjournal record, @Param("example") TeachjournalExample example);

    int updateByPrimaryKeySelective(Teachjournal record);

    int updateByPrimaryKeyWithBLOBs(Teachjournal record);

    int updateByPrimaryKey(Teachjournal record);
}