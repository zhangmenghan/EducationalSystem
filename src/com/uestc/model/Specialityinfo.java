package com.uestc.model;

public class Specialityinfo {
    private String specialityId;

    private String specialityName;

    private String specialityIntro;

    public String getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId == null ? null : specialityId.trim();
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName == null ? null : specialityName.trim();
    }

    public String getSpecialityIntro() {
        return specialityIntro;
    }

    public void setSpecialityIntro(String specialityIntro) {
        this.specialityIntro = specialityIntro == null ? null : specialityIntro.trim();
    }
}