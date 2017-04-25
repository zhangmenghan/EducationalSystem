package com.uestc.mapper;

import com.uestc.model.Authoritylist;
import com.uestc.model.AuthoritylistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthoritylistMapper {
    int countByExample(AuthoritylistExample example);

    int deleteByExample(AuthoritylistExample example);

    int deleteByPrimaryKey(Integer authorityId);

    int insert(Authoritylist record);

    int insertSelective(Authoritylist record);

    List<Authoritylist> selectByExample(AuthoritylistExample example);

    Authoritylist selectByPrimaryKey(Integer authorityId);

    int updateByExampleSelective(@Param("record") Authoritylist record, @Param("example") AuthoritylistExample example);

    int updateByExample(@Param("record") Authoritylist record, @Param("example") AuthoritylistExample example);

    int updateByPrimaryKeySelective(Authoritylist record);

    int updateByPrimaryKey(Authoritylist record);
}