package com.uestc.mapper;

import com.uestc.model.TeacherjobtitleExample;
import com.uestc.model.TeacherjobtitleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherjobtitleMapper {
    int countByExample(TeacherjobtitleExample example);

    int deleteByExample(TeacherjobtitleExample example);

    int deleteByPrimaryKey(TeacherjobtitleKey key);

    int insert(TeacherjobtitleKey record);

    int insertSelective(TeacherjobtitleKey record);

    List<TeacherjobtitleKey> selectByExample(TeacherjobtitleExample example);

    int updateByExampleSelective(@Param("record") TeacherjobtitleKey record, @Param("example") TeacherjobtitleExample example);

    int updateByExample(@Param("record") TeacherjobtitleKey record, @Param("example") TeacherjobtitleExample example);
}