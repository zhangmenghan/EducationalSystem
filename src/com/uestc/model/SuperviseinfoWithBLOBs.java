package com.uestc.model;

public class SuperviseinfoWithBLOBs extends Superviseinfo {
    private String attendanceInfo;

    private String commentsInfo;

    private String forwardInfo;

    private String feedbackInfo;

    public String getAttendanceInfo() {
        return attendanceInfo;
    }

    public void setAttendanceInfo(String attendanceInfo) {
        this.attendanceInfo = attendanceInfo == null ? null : attendanceInfo.trim();
    }

    public String getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(String commentsInfo) {
        this.commentsInfo = commentsInfo == null ? null : commentsInfo.trim();
    }

    public String getForwardInfo() {
        return forwardInfo;
    }

    public void setForwardInfo(String forwardInfo) {
        this.forwardInfo = forwardInfo == null ? null : forwardInfo.trim();
    }

    public String getFeedbackInfo() {
        return feedbackInfo;
    }

    public void setFeedbackInfo(String feedbackInfo) {
        this.feedbackInfo = feedbackInfo == null ? null : feedbackInfo.trim();
    }
}