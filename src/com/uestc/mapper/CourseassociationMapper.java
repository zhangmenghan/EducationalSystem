package com.uestc.mapper;

import com.uestc.model.Courseassociation;
import com.uestc.model.CourseassociationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseassociationMapper {
    int countByExample(CourseassociationExample example);

    int deleteByExample(CourseassociationExample example);

    int deleteByPrimaryKey(String courseAssociationId);

    int insert(Courseassociation record);

    int insertSelective(Courseassociation record);

    List<Courseassociation> selectByExample(CourseassociationExample example);

    Courseassociation selectByPrimaryKey(String courseAssociationId);

    int updateByExampleSelective(@Param("record") Courseassociation record, @Param("example") CourseassociationExample example);

    int updateByExample(@Param("record") Courseassociation record, @Param("example") CourseassociationExample example);

    int updateByPrimaryKeySelective(Courseassociation record);

    int updateByPrimaryKey(Courseassociation record);
}