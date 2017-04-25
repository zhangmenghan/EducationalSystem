package com.uestc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uestc.mapper.ClassroomMapper;
import com.uestc.model.Classroom;
import com.uestc.newmapper.ClassroomManageMapper;
import com.uestc.service.ClassroomManageService;

@Service
public class ClassroomManageServiceImpl implements ClassroomManageService {
	//@Scope("prototype")
	@Autowired
	private ClassroomMapper classroomMapper;
	@Autowired
	private ClassroomManageMapper classroomManageMapper;
	@Override
	public int addClassroom(Classroom classroom) throws Exception {
		int result=classroomMapper.insertSelective(classroom);
		if(result==0){
			throw new Exception("添加教室"+classroom.getClassroomId()+"的信息失败");
		}
		return result;
	}

	@Override
	public int deleteClassroom(String classroomId) throws Exception {
		int result=classroomMapper.deleteByPrimaryKey(classroomId);
		if(result==0){
			throw new Exception("删除教室"+classroomId+"的信息失败");
		}
		return result;
	}

	@Override
	public int editClassroom(Classroom classroom) throws Exception {
		int result=classroomMapper.updateByPrimaryKeySelective(classroom);
		if(result==0){
			throw new Exception("修改教室"+classroom.getClassroomId()+"的信息失败");
		}
		return result;
	}

	@Override
	public List<Classroom> getAllClassroom() throws Exception {
		List<Classroom> classroomList=classroomManageMapper.selectAllClassroom();
		if(classroomList == null || classroomList.size()==0){
			throw new Exception("数据库查询教室信息失败");
		}
		return null;
	}

	@Override
	public List<Classroom> getRegularClassroom() throws Exception {
		List<Classroom> classroomList=classroomManageMapper.selectRegularClassroom();
		return classroomList;
	}

	@Override
	public List<Classroom> getUnregularClassroom() throws Exception {
		List<Classroom> classroomList=classroomManageMapper.selectUnregularClassroom();
		return classroomList;
	}

	

}
