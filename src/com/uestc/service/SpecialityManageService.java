package com.uestc.service;

import org.springframework.stereotype.Service;

import com.uestc.model.Specialityinfo;

public interface SpecialityManageService {
	
	/**
	 * 增加专业
	 * @param speciality
	 * @return
	 * @throws Exception
	 */
	public int addSpeciality (Specialityinfo speciality) throws Exception;
	
	
	/**
	 * 删除专业
	 * @param specialityId
	 * @return
	 * @throws Exception
	 */
	public int deleteSpeciality (String  specialityId) throws Exception;

	
	/**
	 * 修改专业信息
	 * @param speciality
	 * @return
	 * @throws Exception
	 */
	public int editSpeciality (Specialityinfo speciality) throws Exception;
	
	
	
	/**
	 * 查看指定专业信息
	 * @param specialityId
	 * @return
	 * @throws Exception
	 */
	public Specialityinfo getSpecialityInfo (String specialityId) throws Exception;
	
	
	
	/**
	 * 获取所有专业的信息
	 * @param specialityId
	 * @return
	 * @throws Exception
	 */
	public Specialityinfo getAllSpecialityInfo (String specialityId) throws Exception;
}
