package com.uestc.mapper;

import com.uestc.model.Certificatemanage;
import com.uestc.model.CertificatemanageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificatemanageMapper {
    int countByExample(CertificatemanageExample example);

    int deleteByExample(CertificatemanageExample example);

    int deleteByPrimaryKey(Integer certificateId);

    int insert(Certificatemanage record);

    int insertSelective(Certificatemanage record);

    List<Certificatemanage> selectByExample(CertificatemanageExample example);

    Certificatemanage selectByPrimaryKey(Integer certificateId);

    int updateByExampleSelective(@Param("record") Certificatemanage record, @Param("example") CertificatemanageExample example);

    int updateByExample(@Param("record") Certificatemanage record, @Param("example") CertificatemanageExample example);

    int updateByPrimaryKeySelective(Certificatemanage record);

    int updateByPrimaryKey(Certificatemanage record);
}