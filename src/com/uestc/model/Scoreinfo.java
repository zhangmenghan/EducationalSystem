package com.uestc.model;

import java.util.Date;

public class Scoreinfo {
    private String scoreId;

    private String courseAssociationId;

    private String studentId;

    private Float usuallyGrade;

    private Float practiceGrade;

    private Float halfGrade;

    private Float finalExamGrade;

    private Float finalGrade;

    private Float endGrade;

    private Float makeupGrade;

    private Byte makeupExamNum;

    private Byte applyMakeup;

    private Date makeupApplyTime;

    private String remark;

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId == null ? null : scoreId.trim();
    }

    public String getCourseAssociationId() {
        return courseAssociationId;
    }

    public void setCourseAssociationId(String courseAssociationId) {
        this.courseAssociationId = courseAssociationId == null ? null : courseAssociationId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Float getUsuallyGrade() {
        return usuallyGrade;
    }

    public void setUsuallyGrade(Float usuallyGrade) {
        this.usuallyGrade = usuallyGrade;
    }

    public Float getPracticeGrade() {
        return practiceGrade;
    }

    public void setPracticeGrade(Float practiceGrade) {
        this.practiceGrade = practiceGrade;
    }

    public Float getHalfGrade() {
        return halfGrade;
    }

    public void setHalfGrade(Float halfGrade) {
        this.halfGrade = halfGrade;
    }

    public Float getFinalExamGrade() {
        return finalExamGrade;
    }

    public void setFinalExamGrade(Float finalExamGrade) {
        this.finalExamGrade = finalExamGrade;
    }

    public Float getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Float finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Float getEndGrade() {
        return endGrade;
    }

    public void setEndGrade(Float endGrade) {
        this.endGrade = endGrade;
    }

    public Float getMakeupGrade() {
        return makeupGrade;
    }

    public void setMakeupGrade(Float makeupGrade) {
        this.makeupGrade = makeupGrade;
    }

    public Byte getMakeupExamNum() {
        return makeupExamNum;
    }

    public void setMakeupExamNum(Byte makeupExamNum) {
        this.makeupExamNum = makeupExamNum;
    }

    public Byte getApplyMakeup() {
        return applyMakeup;
    }

    public void setApplyMakeup(Byte applyMakeup) {
        this.applyMakeup = applyMakeup;
    }

    public Date getMakeupApplyTime() {
        return makeupApplyTime;
    }

    public void setMakeupApplyTime(Date makeupApplyTime) {
        this.makeupApplyTime = makeupApplyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}