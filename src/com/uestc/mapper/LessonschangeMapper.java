package com.uestc.mapper;

import com.uestc.model.Lessonschange;
import com.uestc.model.LessonschangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LessonschangeMapper {
    int countByExample(LessonschangeExample example);

    int deleteByExample(LessonschangeExample example);

    int deleteByPrimaryKey(String lessonsChangeId);

    int insert(Lessonschange record);

    int insertSelective(Lessonschange record);

    List<Lessonschange> selectByExample(LessonschangeExample example);

    Lessonschange selectByPrimaryKey(String lessonsChangeId);

    int updateByExampleSelective(@Param("record") Lessonschange record, @Param("example") LessonschangeExample example);

    int updateByExample(@Param("record") Lessonschange record, @Param("example") LessonschangeExample example);

    int updateByPrimaryKeySelective(Lessonschange record);

    int updateByPrimaryKey(Lessonschange record);
}