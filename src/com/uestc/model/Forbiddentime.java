package com.uestc.model;

import java.util.Date;

public class Forbiddentime {
    private Integer forbiddenTimeId;

    private String teacherId;

    private String applicationTerm;

    private Byte applicationDay;

    private Byte auditType;

    private Date applicationTime;

    public Integer getForbiddenTimeId() {
        return forbiddenTimeId;
    }

    public void setForbiddenTimeId(Integer forbiddenTimeId) {
        this.forbiddenTimeId = forbiddenTimeId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getApplicationTerm() {
        return applicationTerm;
    }

    public void setApplicationTerm(String applicationTerm) {
        this.applicationTerm = applicationTerm == null ? null : applicationTerm.trim();
    }

    public Byte getApplicationDay() {
        return applicationDay;
    }

    public void setApplicationDay(Byte applicationDay) {
        this.applicationDay = applicationDay;
    }

    public Byte getAuditType() {
        return auditType;
    }

    public void setAuditType(Byte auditType) {
        this.auditType = auditType;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }
}