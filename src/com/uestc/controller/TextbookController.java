package com.uestc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uestc.newmodel.TextbookAndYearType;
import com.uestc.service.TextbookManageService;

@RequestMapping("/textbookManage")
@Controller
public class TextbookController {
	@Autowired
	private TextbookManageService textbookManageService;
	
	@ResponseBody
	@RequestMapping(value = "/getTextbookInfo",method =RequestMethod.POST)
	public Object getTextbookInfo () throws Exception{
		List<TextbookAndYearType> textbookList=textbookManageService.getAllTextbookInfo();
		Map<String,List<TextbookAndYearType>> textbookMap=new HashMap<String,List<TextbookAndYearType>>();
		textbookMap.put("TextbookAndYearType", textbookList);
		
		
		return textbookMap;
	}

	
	@ResponseBody
	@RequestMapping(value = "/uploadTextbookInfo",method =RequestMethod.POST)
	public Object uploadTextbookInfo(@RequestBody String fileUrl) throws Exception{
		int result=textbookManageService.doUploadTextbookInfo(fileUrl);
		Map<String,String> resultMap=new HashMap<String,String>();
		resultMap.put("result", result+"");
		return resultMap;
	}
	
	
	@RequestMapping(value = "/exportTextbookInfo",method =RequestMethod.POST)
	public Object exportTextbookInfo() throws Exception{
		textbookManageService.doExportTextbookInfo();
		return null;
	}
}
