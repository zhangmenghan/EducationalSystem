package com.uestc.mapper;

import com.uestc.model.Announcementinfo;
import com.uestc.model.AnnouncementinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnouncementinfoMapper {
    int countByExample(AnnouncementinfoExample example);

    int deleteByExample(AnnouncementinfoExample example);

    int deleteByPrimaryKey(Integer announcementId);

    int insert(Announcementinfo record);

    int insertSelective(Announcementinfo record);

    List<Announcementinfo> selectByExampleWithBLOBs(AnnouncementinfoExample example);

    List<Announcementinfo> selectByExample(AnnouncementinfoExample example);

    Announcementinfo selectByPrimaryKey(Integer announcementId);

    int updateByExampleSelective(@Param("record") Announcementinfo record, @Param("example") AnnouncementinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Announcementinfo record, @Param("example") AnnouncementinfoExample example);

    int updateByExample(@Param("record") Announcementinfo record, @Param("example") AnnouncementinfoExample example);

    int updateByPrimaryKeySelective(Announcementinfo record);

    int updateByPrimaryKeyWithBLOBs(Announcementinfo record);

    int updateByPrimaryKey(Announcementinfo record);
}