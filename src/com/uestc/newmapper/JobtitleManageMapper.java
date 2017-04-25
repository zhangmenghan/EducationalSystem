package com.uestc.newmapper;

import java.util.List;

import com.uestc.model.Jobtitle;

public interface JobtitleManageMapper {
	
	
	/**
	 * 获取所有的职称信息
	 * @return
	 */
	List<Jobtitle> selectAllJobTitle();

}
