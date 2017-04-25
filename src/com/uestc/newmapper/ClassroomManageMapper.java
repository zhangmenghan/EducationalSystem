package com.uestc.newmapper;

import java.util.List;

import com.uestc.model.Classroom;

public interface ClassroomManageMapper {
	List<Classroom> selectAllClassroom();
	
	List<Classroom> selectRegularClassroom();
	
	List<Classroom> selectUnregularClassroom();
}
