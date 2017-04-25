package com.uestc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uestc.model.Jobtitle;
/**
 * 职称信息管理
 * 设置课酬单价
 */
public interface JobTitleManageService {
	
	/**
	 * 添加职称信息
	 * @param jobtitle
	 * @return
	 */
	public int addJobTitle(Jobtitle jobtitle) throws Exception;
	
	
	/**
	 * 删除职称信息
	 * @param jobtitleId职称编号
	 * @return
	 */
	public int deleteJobTitle(byte jobtitleId) throws Exception;
	
	
	/**
	 * 修改职称信息
	 * @param jobtitle
	 * @return
	 */
	public int editJobTitle(Jobtitle jobtitle) throws Exception;
	
	
	
	/**
	 * 查看所有职称信息
	 * @param jobtitle
	 * @return
	 */
	public List<Jobtitle> getAllJobTitle() throws Exception;
	
	/**
	 * 获取当前学年学期
	 * @return
	 * @throws Exception
	 */
	public String  getCurrentYearSemester() throws Exception;
}
