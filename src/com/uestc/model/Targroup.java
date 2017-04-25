package com.uestc.model;

public class Targroup {
    private String TARGroupId;

    private Integer TARGroupTypeId;

    private String TARGroupName;

    private String TARGroupInfo;

    public String getTARGroupId() {
        return TARGroupId;
    }

    public void setTARGroupId(String TARGroupId) {
        this.TARGroupId = TARGroupId == null ? null : TARGroupId.trim();
    }

    public Integer getTARGroupTypeId() {
        return TARGroupTypeId;
    }

    public void setTARGroupTypeId(Integer TARGroupTypeId) {
        this.TARGroupTypeId = TARGroupTypeId;
    }

    public String getTARGroupName() {
        return TARGroupName;
    }

    public void setTARGroupName(String TARGroupName) {
        this.TARGroupName = TARGroupName == null ? null : TARGroupName.trim();
    }

    public String getTARGroupInfo() {
        return TARGroupInfo;
    }

    public void setTARGroupInfo(String TARGroupInfo) {
        this.TARGroupInfo = TARGroupInfo == null ? null : TARGroupInfo.trim();
    }
}