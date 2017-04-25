package com.uestc.model;

public class Superviseinfo {
    private String superviseId;

    private String courseAssociationId;

    private String supervisorId;

    private String superviseTime;

    private String teachContent;

    private Float teacherQualityScored;

    private Float teachGoalsScored;

    private Float teachContentScored;

    private Float teachMethodsScored;

    private Float teachRoutineScored;

    private Float teachEffectScored;

    private Byte status;

    public String getSuperviseId() {
        return superviseId;
    }

    public void setSuperviseId(String superviseId) {
        this.superviseId = superviseId == null ? null : superviseId.trim();
    }

    public String getCourseAssociationId() {
        return courseAssociationId;
    }

    public void setCourseAssociationId(String courseAssociationId) {
        this.courseAssociationId = courseAssociationId == null ? null : courseAssociationId.trim();
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId == null ? null : supervisorId.trim();
    }

    public String getSuperviseTime() {
        return superviseTime;
    }

    public void setSuperviseTime(String superviseTime) {
        this.superviseTime = superviseTime == null ? null : superviseTime.trim();
    }

    public String getTeachContent() {
        return teachContent;
    }

    public void setTeachContent(String teachContent) {
        this.teachContent = teachContent == null ? null : teachContent.trim();
    }

    public Float getTeacherQualityScored() {
        return teacherQualityScored;
    }

    public void setTeacherQualityScored(Float teacherQualityScored) {
        this.teacherQualityScored = teacherQualityScored;
    }

    public Float getTeachGoalsScored() {
        return teachGoalsScored;
    }

    public void setTeachGoalsScored(Float teachGoalsScored) {
        this.teachGoalsScored = teachGoalsScored;
    }

    public Float getTeachContentScored() {
        return teachContentScored;
    }

    public void setTeachContentScored(Float teachContentScored) {
        this.teachContentScored = teachContentScored;
    }

    public Float getTeachMethodsScored() {
        return teachMethodsScored;
    }

    public void setTeachMethodsScored(Float teachMethodsScored) {
        this.teachMethodsScored = teachMethodsScored;
    }

    public Float getTeachRoutineScored() {
        return teachRoutineScored;
    }

    public void setTeachRoutineScored(Float teachRoutineScored) {
        this.teachRoutineScored = teachRoutineScored;
    }

    public Float getTeachEffectScored() {
        return teachEffectScored;
    }

    public void setTeachEffectScored(Float teachEffectScored) {
        this.teachEffectScored = teachEffectScored;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}