package com.uestc.model;

public class Coursetypeinfo {
    private Byte courseTypeId;

    private String courseTypeName;

    public Byte getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(Byte courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName == null ? null : courseTypeName.trim();
    }
}