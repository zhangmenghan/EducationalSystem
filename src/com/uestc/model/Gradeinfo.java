package com.uestc.model;

public class Gradeinfo {
    private String gradeId;

    private Byte gradeType;

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId == null ? null : gradeId.trim();
    }

    public Byte getGradeType() {
        return gradeType;
    }

    public void setGradeType(Byte gradeType) {
        this.gradeType = gradeType;
    }
}