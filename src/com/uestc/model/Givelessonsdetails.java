package com.uestc.model;

public class Givelessonsdetails {
    private String giveLessonsDetailsId;

    private String courseAssociationId;

    private String timeAndPlaceId;

    public String getGiveLessonsDetailsId() {
        return giveLessonsDetailsId;
    }

    public void setGiveLessonsDetailsId(String giveLessonsDetailsId) {
        this.giveLessonsDetailsId = giveLessonsDetailsId == null ? null : giveLessonsDetailsId.trim();
    }

    public String getCourseAssociationId() {
        return courseAssociationId;
    }

    public void setCourseAssociationId(String courseAssociationId) {
        this.courseAssociationId = courseAssociationId == null ? null : courseAssociationId.trim();
    }

    public String getTimeAndPlaceId() {
        return timeAndPlaceId;
    }

    public void setTimeAndPlaceId(String timeAndPlaceId) {
        this.timeAndPlaceId = timeAndPlaceId == null ? null : timeAndPlaceId.trim();
    }
}