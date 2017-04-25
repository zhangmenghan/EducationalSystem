package com.uestc.model;

import java.util.Date;

public class Teacherpayroll {
    private Integer payrollId;

    private String courseAssociationId;

    private Float wage;

    private Date systemPaytime;

    public Integer getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(Integer payrollId) {
        this.payrollId = payrollId;
    }

    public String getCourseAssociationId() {
        return courseAssociationId;
    }

    public void setCourseAssociationId(String courseAssociationId) {
        this.courseAssociationId = courseAssociationId == null ? null : courseAssociationId.trim();
    }

    public Float getWage() {
        return wage;
    }

    public void setWage(Float wage) {
        this.wage = wage;
    }

    public Date getSystemPaytime() {
        return systemPaytime;
    }

    public void setSystemPaytime(Date systemPaytime) {
        this.systemPaytime = systemPaytime;
    }
}