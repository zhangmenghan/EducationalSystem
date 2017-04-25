package com.uestc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uestc.mapper.SpecialityinfoMapper;
import com.uestc.model.Specialityinfo;
import com.uestc.service.SpecialityManageService;
@Service
public class SpecialityManageServiceImpl implements SpecialityManageService {
	@Autowired
	private SpecialityinfoMapper specialityinfoMapper;
	

	@Override
	public int addSpeciality(Specialityinfo speciality) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteSpeciality(String specialityId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editSpeciality(Specialityinfo speciality) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Specialityinfo getSpecialityInfo(String specialityId) throws Exception {
		Specialityinfo speciality=specialityinfoMapper.selectByPrimaryKey(specialityId);
		return speciality;
	}

	@Override
	public Specialityinfo getAllSpecialityInfo(String specialityId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
