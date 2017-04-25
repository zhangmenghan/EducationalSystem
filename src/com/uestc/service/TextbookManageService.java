package com.uestc.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uestc.model.Textbook;
import com.uestc.newmodel.TextbookAndYearType;

/*
 * 教材管理
 */
public interface TextbookManageService {
	/**
	 * 上传教材信息
	 */
	public int doUploadTextbookInfo(String fileUrl) throws Exception;
	
	/**
	 * 导出教材信息表
	 */
	public void doExportTextbookInfo() throws Exception;
	
	/**
	 * 查看所有教材信息
	 */
	public List<TextbookAndYearType> getAllTextbookInfo() throws Exception;

}
