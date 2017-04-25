package com.uestc.model;

public class Courseassociation {
    private String courseAssociationId;

    private String classId;

    private String teacherId;

    private String coursePlanId;

    private Byte associationExec;

    private Boolean canModifyGrade;

    public String getCourseAssociationId() {
        return courseAssociationId;
    }

    public void setCourseAssociationId(String courseAssociationId) {
        this.courseAssociationId = courseAssociationId == null ? null : courseAssociationId.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getCoursePlanId() {
        return coursePlanId;
    }

    public void setCoursePlanId(String coursePlanId) {
        this.coursePlanId = coursePlanId == null ? null : coursePlanId.trim();
    }

    public Byte getAssociationExec() {
        return associationExec;
    }

    public void setAssociationExec(Byte associationExec) {
        this.associationExec = associationExec;
    }

    public Boolean getCanModifyGrade() {
        return canModifyGrade;
    }

    public void setCanModifyGrade(Boolean canModifyGrade) {
        this.canModifyGrade = canModifyGrade;
    }
}