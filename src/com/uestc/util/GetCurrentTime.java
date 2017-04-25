package com.uestc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GetCurrentTime {
	private static String datetime = "2015-03-01 00:00:00";//学期第一个星期一的日期
	int currentYear;
	int currentSemester;//1,2
	int currentWeek;//1-20
	int currentWeekdays;//1-7
	int currentLessonNum;//1,2,3
	public List<Integer> getCurrentTime() throws ParseException{
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");//设置日期格式
	String currentTime = df.format(new Date());// new Date()为获取当前系统时间
	String time[]=currentTime.split("-");  
	currentYear = Integer.valueOf(time[0]);
	
	if(Integer.valueOf(time[1])>=9 || Integer.valueOf(time[1])<=2){
		currentSemester = 1;
	}else{
		currentSemester = 2;
	}
	currentWeek = daysBetween(datetime,currentTime)/7;
	currentWeekdays = daysBetween(datetime,currentTime)%7;
	if(Integer.valueOf(time[3])>=13 && Integer.valueOf(time[3])<=7){
		currentLessonNum = 1;
	}else if(Integer.valueOf(time[3])>7 && Integer.valueOf(time[3])<9){
		currentLessonNum = 2;
	}else{
		currentLessonNum = 3;
	  }
	List<Integer> timeList = new ArrayList<>();
	timeList.add(currentYear);
	timeList.add(currentSemester);
	timeList.add(currentWeek);
	timeList.add(currentWeekdays);
	timeList.add(currentLessonNum);
	return timeList;
	}
	 public static int daysBetween(String smdate,String bdate) throws ParseException{  
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(sdf.parse(smdate));    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(sdf.parse(bdate));    
	        long time2 = cal.getTimeInMillis();         
	        long between_days=(time2-time1)/(1000*3600*24);  
	            
	       return Integer.parseInt(String.valueOf(between_days));//     
	    }  
}
