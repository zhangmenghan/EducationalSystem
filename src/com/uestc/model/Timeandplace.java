package com.uestc.model;

public class Timeandplace {
    private String timeAndPlaceId;

    private String year;

    private Byte semester;

    private Byte week;

    private Byte weekdays;

    private Byte lessonNum;

    private Byte lessonNumber;

    private String classroomId;

    public String getTimeAndPlaceId() {
        return timeAndPlaceId;
    }

    public void setTimeAndPlaceId(String timeAndPlaceId) {
        this.timeAndPlaceId = timeAndPlaceId == null ? null : timeAndPlaceId.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Byte getSemester() {
        return semester;
    }

    public void setSemester(Byte semester) {
        this.semester = semester;
    }

    public Byte getWeek() {
        return week;
    }

    public void setWeek(Byte week) {
        this.week = week;
    }

    public Byte getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(Byte weekdays) {
        this.weekdays = weekdays;
    }

    public Byte getLessonNum() {
        return lessonNum;
    }

    public void setLessonNum(Byte lessonNum) {
        this.lessonNum = lessonNum;
    }

    public Byte getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(Byte lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId == null ? null : classroomId.trim();
    }
}