package com.uestc.model;

public class Jobtitle {
    private Integer jobId;

    private String jobName;

    private Float payPerCourse;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public Float getPayPerCourse() {
        return payPerCourse;
    }

    public void setPayPerCourse(Float payPerCourse) {
        this.payPerCourse = payPerCourse;
    }
}