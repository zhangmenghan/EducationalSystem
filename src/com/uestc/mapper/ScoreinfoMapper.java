package com.uestc.mapper;

import com.uestc.model.Scoreinfo;
import com.uestc.model.ScoreinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreinfoMapper {
    int countByExample(ScoreinfoExample example);

    int deleteByExample(ScoreinfoExample example);

    int deleteByPrimaryKey(String scoreId);

    int insert(Scoreinfo record);

    int insertSelective(Scoreinfo record);

    List<Scoreinfo> selectByExample(ScoreinfoExample example);

    Scoreinfo selectByPrimaryKey(String scoreId);

    int updateByExampleSelective(@Param("record") Scoreinfo record, @Param("example") ScoreinfoExample example);

    int updateByExample(@Param("record") Scoreinfo record, @Param("example") ScoreinfoExample example);

    int updateByPrimaryKeySelective(Scoreinfo record);

    int updateByPrimaryKey(Scoreinfo record);
}