package com.uestc.mapper;

import com.uestc.model.Targroupteacher;
import com.uestc.model.TargroupteacherExample;
import com.uestc.model.TargroupteacherKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TargroupteacherMapper {
    int countByExample(TargroupteacherExample example);

    int deleteByExample(TargroupteacherExample example);

    int deleteByPrimaryKey(TargroupteacherKey key);

    int insert(Targroupteacher record);

    int insertSelective(Targroupteacher record);

    List<Targroupteacher> selectByExample(TargroupteacherExample example);

    Targroupteacher selectByPrimaryKey(TargroupteacherKey key);

    int updateByExampleSelective(@Param("record") Targroupteacher record, @Param("example") TargroupteacherExample example);

    int updateByExample(@Param("record") Targroupteacher record, @Param("example") TargroupteacherExample example);

    int updateByPrimaryKeySelective(Targroupteacher record);

    int updateByPrimaryKey(Targroupteacher record);
}