package com.uestc.mapper;

import com.uestc.model.Superviseinfo;
import com.uestc.model.SuperviseinfoExample;
import com.uestc.model.SuperviseinfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperviseinfoMapper {
    int countByExample(SuperviseinfoExample example);

    int deleteByExample(SuperviseinfoExample example);

    int deleteByPrimaryKey(String superviseId);

    int insert(SuperviseinfoWithBLOBs record);

    int insertSelective(SuperviseinfoWithBLOBs record);

    List<SuperviseinfoWithBLOBs> selectByExampleWithBLOBs(SuperviseinfoExample example);

    List<Superviseinfo> selectByExample(SuperviseinfoExample example);

    SuperviseinfoWithBLOBs selectByPrimaryKey(String superviseId);

    int updateByExampleSelective(@Param("record") SuperviseinfoWithBLOBs record, @Param("example") SuperviseinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SuperviseinfoWithBLOBs record, @Param("example") SuperviseinfoExample example);

    int updateByExample(@Param("record") Superviseinfo record, @Param("example") SuperviseinfoExample example);

    int updateByPrimaryKeySelective(SuperviseinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SuperviseinfoWithBLOBs record);

    int updateByPrimaryKey(Superviseinfo record);
}