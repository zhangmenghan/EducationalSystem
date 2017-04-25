package com.uestc.newmapper;

import com.uestc.model.Specialityinfo;

public interface SpecialityManageMapper {
	
	Specialityinfo selectBySpecialityName(String specialityName);

}
