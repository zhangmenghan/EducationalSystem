package com.uestc.newmodel;

public class GradeAndNum {
	private String gradeName;
	private String studentNum;
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	@Override
	public String toString() {
		return "GradeAndNum [gradeName=" + gradeName + ", studentNum=" + studentNum + "]";
	}
	
}
