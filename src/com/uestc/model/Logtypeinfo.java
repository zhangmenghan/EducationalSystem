package com.uestc.model;

public class Logtypeinfo {
    private Integer logTypeId;

    private String logTypeName;

    public Integer getLogTypeId() {
        return logTypeId;
    }

    public void setLogTypeId(Integer logTypeId) {
        this.logTypeId = logTypeId;
    }

    public String getLogTypeName() {
        return logTypeName;
    }

    public void setLogTypeName(String logTypeName) {
        this.logTypeName = logTypeName == null ? null : logTypeName.trim();
    }
}