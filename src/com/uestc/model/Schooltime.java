package com.uestc.model;

import java.util.Date;

public class Schooltime {
    private String startYear;

    private Byte startSemester;

    private Date startTime;

    private Date startEvaTeachTime;

    private Date endEvaTeachTime;

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear == null ? null : startYear.trim();
    }

    public Byte getStartSemester() {
        return startSemester;
    }

    public void setStartSemester(Byte startSemester) {
        this.startSemester = startSemester;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartEvaTeachTime() {
        return startEvaTeachTime;
    }

    public void setStartEvaTeachTime(Date startEvaTeachTime) {
        this.startEvaTeachTime = startEvaTeachTime;
    }

    public Date getEndEvaTeachTime() {
        return endEvaTeachTime;
    }

    public void setEndEvaTeachTime(Date endEvaTeachTime) {
        this.endEvaTeachTime = endEvaTeachTime;
    }
}