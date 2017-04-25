package com.uestc.model;

public class Degreemanage {
    private String teacherId;

    private String graduateSchool;

    private String secialty;

    private Byte schoolSystem;

    private String highestEDU;

    private String highestDegree;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool == null ? null : graduateSchool.trim();
    }

    public String getSecialty() {
        return secialty;
    }

    public void setSecialty(String secialty) {
        this.secialty = secialty == null ? null : secialty.trim();
    }

    public Byte getSchoolSystem() {
        return schoolSystem;
    }

    public void setSchoolSystem(Byte schoolSystem) {
        this.schoolSystem = schoolSystem;
    }

    public String getHighestEDU() {
        return highestEDU;
    }

    public void setHighestEDU(String highestEDU) {
        this.highestEDU = highestEDU == null ? null : highestEDU.trim();
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree == null ? null : highestDegree.trim();
    }
}