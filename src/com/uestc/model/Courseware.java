package com.uestc.model;

import java.util.Date;

public class Courseware {
    private Integer coursewareId;

    private String teacherId;

    private String courseId;

    private String coursewareUri;

    private Date coursewareUptime;

    private Byte coursewareType;

    private Byte TARAudit;

    private Byte EDUAudit;

    private Date auditTime;

    private String auditorsTARId;

    private String auditorsEDUId;

    private Float auditRecord;

    private String upSchoolTerm;

    public Integer getCoursewareId() {
        return coursewareId;
    }

    public void setCoursewareId(Integer coursewareId) {
        this.coursewareId = coursewareId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getCoursewareUri() {
        return coursewareUri;
    }

    public void setCoursewareUri(String coursewareUri) {
        this.coursewareUri = coursewareUri == null ? null : coursewareUri.trim();
    }

    public Date getCoursewareUptime() {
        return coursewareUptime;
    }

    public void setCoursewareUptime(Date coursewareUptime) {
        this.coursewareUptime = coursewareUptime;
    }

    public Byte getCoursewareType() {
        return coursewareType;
    }

    public void setCoursewareType(Byte coursewareType) {
        this.coursewareType = coursewareType;
    }

    public Byte getTARAudit() {
        return TARAudit;
    }

    public void setTARAudit(Byte TARAudit) {
        this.TARAudit = TARAudit;
    }

    public Byte getEDUAudit() {
        return EDUAudit;
    }

    public void setEDUAudit(Byte EDUAudit) {
        this.EDUAudit = EDUAudit;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditorsTARId() {
        return auditorsTARId;
    }

    public void setAuditorsTARId(String auditorsTARId) {
        this.auditorsTARId = auditorsTARId == null ? null : auditorsTARId.trim();
    }

    public String getAuditorsEDUId() {
        return auditorsEDUId;
    }

    public void setAuditorsEDUId(String auditorsEDUId) {
        this.auditorsEDUId = auditorsEDUId == null ? null : auditorsEDUId.trim();
    }

    public Float getAuditRecord() {
        return auditRecord;
    }

    public void setAuditRecord(Float auditRecord) {
        this.auditRecord = auditRecord;
    }

    public String getUpSchoolTerm() {
        return upSchoolTerm;
    }

    public void setUpSchoolTerm(String upSchoolTerm) {
        this.upSchoolTerm = upSchoolTerm == null ? null : upSchoolTerm.trim();
    }
}