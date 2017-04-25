package com.uestc.model;

public class TargroupteacherKey {
    private String teacherId;

    private String TARGroupId;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTARGroupId() {
        return TARGroupId;
    }

    public void setTARGroupId(String TARGroupId) {
        this.TARGroupId = TARGroupId == null ? null : TARGroupId.trim();
    }
}