package com.uestc.model;

public class Teachplan {
    private String teachPlanId;

    private String courseId;

    private Byte courseTypeId;

    private String gradeId;

    private String courseName;

    private Short totalHours;

    private Short theoryHours;

    private Short practiceHours;

    private Byte schoolYearType;

    public String getTeachPlanId() {
        return teachPlanId;
    }

    public void setTeachPlanId(String teachPlanId) {
        this.teachPlanId = teachPlanId == null ? null : teachPlanId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public Byte getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(Byte courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId == null ? null : gradeId.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Short getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Short totalHours) {
        this.totalHours = totalHours;
    }

    public Short getTheoryHours() {
        return theoryHours;
    }

    public void setTheoryHours(Short theoryHours) {
        this.theoryHours = theoryHours;
    }

    public Short getPracticeHours() {
        return practiceHours;
    }

    public void setPracticeHours(Short practiceHours) {
        this.practiceHours = practiceHours;
    }

    public Byte getSchoolYearType() {
        return schoolYearType;
    }

    public void setSchoolYearType(Byte schoolYearType) {
        this.schoolYearType = schoolYearType;
    }
}