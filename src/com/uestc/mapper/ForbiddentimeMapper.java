package com.uestc.mapper;

import com.uestc.model.Forbiddentime;
import com.uestc.model.ForbiddentimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForbiddentimeMapper {
    int countByExample(ForbiddentimeExample example);

    int deleteByExample(ForbiddentimeExample example);

    int deleteByPrimaryKey(Integer forbiddenTimeId);

    int insert(Forbiddentime record);

    int insertSelective(Forbiddentime record);

    List<Forbiddentime> selectByExample(ForbiddentimeExample example);

    Forbiddentime selectByPrimaryKey(Integer forbiddenTimeId);

    int updateByExampleSelective(@Param("record") Forbiddentime record, @Param("example") ForbiddentimeExample example);

    int updateByExample(@Param("record") Forbiddentime record, @Param("example") ForbiddentimeExample example);

    int updateByPrimaryKeySelective(Forbiddentime record);

    int updateByPrimaryKey(Forbiddentime record);
}