package com.uestc.newmodel;

import java.util.List;

import com.uestc.model.Targroup;

public class TARgroupAndTeacher {
	
	String targroupId;//教研组编号
	String targroupName;//教研组名称
	String targroupType;//教研组类型
	List<String> targroupLeader;//教研组组长姓名
	List<String> targroupTeacher;//教研组成员姓名
	
	public List<String> getTargroupLeader() {
		return targroupLeader;
	}
	public void setTargroupLeader(List<String> targroupLeader) {
		this.targroupLeader = targroupLeader;
	}
	public List<String> getTargroupTeacher() {
		return targroupTeacher;
	}
	public void setTargroupTeacher(List<String> targroupTeacher) {
		this.targroupTeacher = targroupTeacher;
	}
	public String getTargroupId() {
		return targroupId;
	}
	public void setTargroupId(String targroupId) {
		this.targroupId = targroupId;
	}
	public String getTargroupName() {
		return targroupName;
	}
	public void setTargroupName(String targroupName) {
		this.targroupName = targroupName;
	}
	public String getTargroupType() {
		return targroupType;
	}
	public void setTargroupType(String targroupType) {
		this.targroupType = targroupType;
	}
	
	
	
}
