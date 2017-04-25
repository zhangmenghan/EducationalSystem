package com.uestc.model;

import java.util.Date;

public class Workexperience {
    private Integer workExperienceId;

    private String teacherId;

    private String clinicWorkUnit;

    private String workPost;

    private Date startTime;

    private Date endTime;

    public Integer getWorkExperienceId() {
        return workExperienceId;
    }

    public void setWorkExperienceId(Integer workExperienceId) {
        this.workExperienceId = workExperienceId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getClinicWorkUnit() {
        return clinicWorkUnit;
    }

    public void setClinicWorkUnit(String clinicWorkUnit) {
        this.clinicWorkUnit = clinicWorkUnit == null ? null : clinicWorkUnit.trim();
    }

    public String getWorkPost() {
        return workPost;
    }

    public void setWorkPost(String workPost) {
        this.workPost = workPost == null ? null : workPost.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}