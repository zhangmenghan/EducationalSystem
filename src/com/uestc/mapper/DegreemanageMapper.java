package com.uestc.mapper;

import com.uestc.model.Degreemanage;
import com.uestc.model.DegreemanageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DegreemanageMapper {
    int countByExample(DegreemanageExample example);

    int deleteByExample(DegreemanageExample example);

    int deleteByPrimaryKey(String teacherId);

    int insert(Degreemanage record);

    int insertSelective(Degreemanage record);

    List<Degreemanage> selectByExample(DegreemanageExample example);

    Degreemanage selectByPrimaryKey(String teacherId);

    int updateByExampleSelective(@Param("record") Degreemanage record, @Param("example") DegreemanageExample example);

    int updateByExample(@Param("record") Degreemanage record, @Param("example") DegreemanageExample example);

    int updateByPrimaryKeySelective(Degreemanage record);

    int updateByPrimaryKey(Degreemanage record);
}