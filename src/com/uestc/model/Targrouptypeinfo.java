package com.uestc.model;

public class Targrouptypeinfo {
    private Integer TARGroupTypeId;

    private String TARGroupTypeName;

    public Integer getTARGroupTypeId() {
        return TARGroupTypeId;
    }

    public void setTARGroupTypeId(Integer TARGroupTypeId) {
        this.TARGroupTypeId = TARGroupTypeId;
    }

    public String getTARGroupTypeName() {
        return TARGroupTypeName;
    }

    public void setTARGroupTypeName(String TARGroupTypeName) {
        this.TARGroupTypeName = TARGroupTypeName == null ? null : TARGroupTypeName.trim();
    }
}