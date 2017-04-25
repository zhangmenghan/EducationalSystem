package com.uestc.model;

public class Examdetails {
    private String examDetailsId;

    private String timeAndPlaceId;

    private String courseAssociationId;

    private String invigilatorFir;

    private String invigilatorSec;

    public String getExamDetailsId() {
        return examDetailsId;
    }

    public void setExamDetailsId(String examDetailsId) {
        this.examDetailsId = examDetailsId == null ? null : examDetailsId.trim();
    }

    public String getTimeAndPlaceId() {
        return timeAndPlaceId;
    }

    public void setTimeAndPlaceId(String timeAndPlaceId) {
        this.timeAndPlaceId = timeAndPlaceId == null ? null : timeAndPlaceId.trim();
    }

    public String getCourseAssociationId() {
        return courseAssociationId;
    }

    public void setCourseAssociationId(String courseAssociationId) {
        this.courseAssociationId = courseAssociationId == null ? null : courseAssociationId.trim();
    }

    public String getInvigilatorFir() {
        return invigilatorFir;
    }

    public void setInvigilatorFir(String invigilatorFir) {
        this.invigilatorFir = invigilatorFir == null ? null : invigilatorFir.trim();
    }

    public String getInvigilatorSec() {
        return invigilatorSec;
    }

    public void setInvigilatorSec(String invigilatorSec) {
        this.invigilatorSec = invigilatorSec == null ? null : invigilatorSec.trim();
    }
}