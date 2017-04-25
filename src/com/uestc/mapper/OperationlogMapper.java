package com.uestc.mapper;

import com.uestc.model.Operationlog;
import com.uestc.model.OperationlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationlogMapper {
    int countByExample(OperationlogExample example);

    int deleteByExample(OperationlogExample example);

    int insert(Operationlog record);

    int insertSelective(Operationlog record);

    List<Operationlog> selectByExample(OperationlogExample example);

    int updateByExampleSelective(@Param("record") Operationlog record, @Param("example") OperationlogExample example);

    int updateByExample(@Param("record") Operationlog record, @Param("example") OperationlogExample example);
}