package com.uestc.model;

import java.util.Date;

public class Teacherinfo {
    private String teacherId;

    private String teacherName;

    private String teacherIDcard;

    private Byte teacherGender;

    private String teacherPhoto;

    private Date birthdate;

    private Date worktime;

    private Byte clinicWorkYear;

    private String currentWorkUnit;

    private String currentWorkTitle;

    private String currentWorkDuty;

    private Boolean isDoubleTeacher;

    private String hireCampus;

    private String contactNumber;

    private Long QQNumber;

    private Byte teacherType;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTeacherIDcard() {
        return teacherIDcard;
    }

    public void setTeacherIDcard(String teacherIDcard) {
        this.teacherIDcard = teacherIDcard == null ? null : teacherIDcard.trim();
    }

    public Byte getTeacherGender() {
        return teacherGender;
    }

    public void setTeacherGender(Byte teacherGender) {
        this.teacherGender = teacherGender;
    }

    public String getTeacherPhoto() {
        return teacherPhoto;
    }

    public void setTeacherPhoto(String teacherPhoto) {
        this.teacherPhoto = teacherPhoto == null ? null : teacherPhoto.trim();
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public Byte getClinicWorkYear() {
        return clinicWorkYear;
    }

    public void setClinicWorkYear(Byte clinicWorkYear) {
        this.clinicWorkYear = clinicWorkYear;
    }

    public String getCurrentWorkUnit() {
        return currentWorkUnit;
    }

    public void setCurrentWorkUnit(String currentWorkUnit) {
        this.currentWorkUnit = currentWorkUnit == null ? null : currentWorkUnit.trim();
    }

    public String getCurrentWorkTitle() {
        return currentWorkTitle;
    }

    public void setCurrentWorkTitle(String currentWorkTitle) {
        this.currentWorkTitle = currentWorkTitle == null ? null : currentWorkTitle.trim();
    }

    public String getCurrentWorkDuty() {
        return currentWorkDuty;
    }

    public void setCurrentWorkDuty(String currentWorkDuty) {
        this.currentWorkDuty = currentWorkDuty == null ? null : currentWorkDuty.trim();
    }

    public Boolean getIsDoubleTeacher() {
        return isDoubleTeacher;
    }

    public void setIsDoubleTeacher(Boolean isDoubleTeacher) {
        this.isDoubleTeacher = isDoubleTeacher;
    }

    public String getHireCampus() {
        return hireCampus;
    }

    public void setHireCampus(String hireCampus) {
        this.hireCampus = hireCampus == null ? null : hireCampus.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public Long getQQNumber() {
        return QQNumber;
    }

    public void setQQNumber(Long QQNumber) {
        this.QQNumber = QQNumber;
    }

    public Byte getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(Byte teacherType) {
        this.teacherType = teacherType;
    }
}