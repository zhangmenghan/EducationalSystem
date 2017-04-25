package com.uestc.model;

import java.util.Date;

public class Lessonschange {
    private String lessonsChangeId;

    private String giveLessonsDetailsId;

    private Byte changeType;

    private Date applicationTime;

    private String mediator;

    private String mediationReason;

    private String confirmor;

    private Byte auditType;

    private Byte execWeek;

    private String useClassroom;

    private String lessonsChangeInfo;

    public String getLessonsChangeId() {
        return lessonsChangeId;
    }

    public void setLessonsChangeId(String lessonsChangeId) {
        this.lessonsChangeId = lessonsChangeId == null ? null : lessonsChangeId.trim();
    }

    public String getGiveLessonsDetailsId() {
        return giveLessonsDetailsId;
    }

    public void setGiveLessonsDetailsId(String giveLessonsDetailsId) {
        this.giveLessonsDetailsId = giveLessonsDetailsId == null ? null : giveLessonsDetailsId.trim();
    }

    public Byte getChangeType() {
        return changeType;
    }

    public void setChangeType(Byte changeType) {
        this.changeType = changeType;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    public String getMediator() {
        return mediator;
    }

    public void setMediator(String mediator) {
        this.mediator = mediator == null ? null : mediator.trim();
    }

    public String getMediationReason() {
        return mediationReason;
    }

    public void setMediationReason(String mediationReason) {
        this.mediationReason = mediationReason == null ? null : mediationReason.trim();
    }

    public String getConfirmor() {
        return confirmor;
    }

    public void setConfirmor(String confirmor) {
        this.confirmor = confirmor == null ? null : confirmor.trim();
    }

    public Byte getAuditType() {
        return auditType;
    }

    public void setAuditType(Byte auditType) {
        this.auditType = auditType;
    }

    public Byte getExecWeek() {
        return execWeek;
    }

    public void setExecWeek(Byte execWeek) {
        this.execWeek = execWeek;
    }

    public String getUseClassroom() {
        return useClassroom;
    }

    public void setUseClassroom(String useClassroom) {
        this.useClassroom = useClassroom == null ? null : useClassroom.trim();
    }

    public String getLessonsChangeInfo() {
        return lessonsChangeInfo;
    }

    public void setLessonsChangeInfo(String lessonsChangeInfo) {
        this.lessonsChangeInfo = lessonsChangeInfo == null ? null : lessonsChangeInfo.trim();
    }
}