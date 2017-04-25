package com.uestc.newmapper;

import java.util.Date;
import java.util.List;

import com.uestc.model.Schooltime;

public interface SchooltimeManageMapper {
	List<Schooltime> getAllSchoolTime();
	
	Schooltime selectByStartTime(Date StartTime);
}
