package com.uestc.mapper;

import com.uestc.model.Textbook;
import com.uestc.model.TextbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextbookMapper {
    int countByExample(TextbookExample example);

    int deleteByExample(TextbookExample example);

    int deleteByPrimaryKey(String ISBN);

    int insert(Textbook record);

    int insertSelective(Textbook record);

    List<Textbook> selectByExample(TextbookExample example);

    Textbook selectByPrimaryKey(String ISBN);

    int updateByExampleSelective(@Param("record") Textbook record, @Param("example") TextbookExample example);

    int updateByExample(@Param("record") Textbook record, @Param("example") TextbookExample example);

    int updateByPrimaryKeySelective(Textbook record);

    int updateByPrimaryKey(Textbook record);
}