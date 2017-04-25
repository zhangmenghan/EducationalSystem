package com.uestc.model;

public class Classroom {
    private String classroomId;

    private String matchedClassId;

    private Byte classType;

    private Integer classroomSize;

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId == null ? null : classroomId.trim();
    }

    public String getMatchedClassId() {
        return matchedClassId;
    }

    public void setMatchedClassId(String matchedClassId) {
        this.matchedClassId = matchedClassId == null ? null : matchedClassId.trim();
    }

    public Byte getClassType() {
        return classType;
    }

    public void setClassType(Byte classType) {
        this.classType = classType;
    }

    public Integer getClassroomSize() {
        return classroomSize;
    }

    public void setClassroomSize(Integer classroomSize) {
        this.classroomSize = classroomSize;
    }
}