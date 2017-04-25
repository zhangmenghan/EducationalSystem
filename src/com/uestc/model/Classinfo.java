package com.uestc.model;

public class Classinfo {
    private String classId;

    private String specialityId;

    private String gradeId;

    private String classTeacherId;

    private String studyMode;

    private String className;

    private Byte classSize;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId == null ? null : specialityId.trim();
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId == null ? null : gradeId.trim();
    }

    public String getClassTeacherId() {
        return classTeacherId;
    }

    public void setClassTeacherId(String classTeacherId) {
        this.classTeacherId = classTeacherId == null ? null : classTeacherId.trim();
    }

    public String getStudyMode() {
        return studyMode;
    }

    public void setStudyMode(String studyMode) {
        this.studyMode = studyMode == null ? null : studyMode.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Byte getClassSize() {
        return classSize;
    }

    public void setClassSize(Byte classSize) {
        this.classSize = classSize;
    }
}