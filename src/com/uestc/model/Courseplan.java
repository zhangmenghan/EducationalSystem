package com.uestc.model;

public class Courseplan {
    private String coursePlanId;

    private String teachPlanId;

    private Byte execSemster;

    private Byte execWeekPeriod;

    private Byte startWeekNum;

    private Byte persistWeekNum;

    private Byte assessmentType;

    private Byte isExecute;

    private Byte courseArrangeType;

    public String getCoursePlanId() {
        return coursePlanId;
    }

    public void setCoursePlanId(String coursePlanId) {
        this.coursePlanId = coursePlanId == null ? null : coursePlanId.trim();
    }

    public String getTeachPlanId() {
        return teachPlanId;
    }

    public void setTeachPlanId(String teachPlanId) {
        this.teachPlanId = teachPlanId == null ? null : teachPlanId.trim();
    }

    public Byte getExecSemster() {
        return execSemster;
    }

    public void setExecSemster(Byte execSemster) {
        this.execSemster = execSemster;
    }

    public Byte getExecWeekPeriod() {
        return execWeekPeriod;
    }

    public void setExecWeekPeriod(Byte execWeekPeriod) {
        this.execWeekPeriod = execWeekPeriod;
    }

    public Byte getStartWeekNum() {
        return startWeekNum;
    }

    public void setStartWeekNum(Byte startWeekNum) {
        this.startWeekNum = startWeekNum;
    }

    public Byte getPersistWeekNum() {
        return persistWeekNum;
    }

    public void setPersistWeekNum(Byte persistWeekNum) {
        this.persistWeekNum = persistWeekNum;
    }

    public Byte getAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(Byte assessmentType) {
        this.assessmentType = assessmentType;
    }

    public Byte getIsExecute() {
        return isExecute;
    }

    public void setIsExecute(Byte isExecute) {
        this.isExecute = isExecute;
    }

    public Byte getCourseArrangeType() {
        return courseArrangeType;
    }

    public void setCourseArrangeType(Byte courseArrangeType) {
        this.courseArrangeType = courseArrangeType;
    }
}