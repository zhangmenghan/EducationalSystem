package com.uestc.mapper;

import com.uestc.model.Specialityinfo;
import com.uestc.model.SpecialityinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialityinfoMapper {
    int countByExample(SpecialityinfoExample example);

    int deleteByExample(SpecialityinfoExample example);

    int deleteByPrimaryKey(String specialityId);

    int insert(Specialityinfo record);

    int insertSelective(Specialityinfo record);

    List<Specialityinfo> selectByExampleWithBLOBs(SpecialityinfoExample example);

    List<Specialityinfo> selectByExample(SpecialityinfoExample example);

    Specialityinfo selectByPrimaryKey(String specialityId);

    int updateByExampleSelective(@Param("record") Specialityinfo record, @Param("example") SpecialityinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Specialityinfo record, @Param("example") SpecialityinfoExample example);

    int updateByExample(@Param("record") Specialityinfo record, @Param("example") SpecialityinfoExample example);

    int updateByPrimaryKeySelective(Specialityinfo record);

    int updateByPrimaryKeyWithBLOBs(Specialityinfo record);

    int updateByPrimaryKey(Specialityinfo record);
}