package com.uestc.model;

import java.util.Date;

public class Certificatemanage {
    private Integer certificateId;

    private String teacherId;

    private Byte certificateType;

    private String certificateNum;

    private String certificateName;

    private Byte certificateLevel;

    private String reviewIstitution;

    private Date reviewTime;

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public Byte getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Byte certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum == null ? null : certificateNum.trim();
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName == null ? null : certificateName.trim();
    }

    public Byte getCertificateLevel() {
        return certificateLevel;
    }

    public void setCertificateLevel(Byte certificateLevel) {
        this.certificateLevel = certificateLevel;
    }

    public String getReviewIstitution() {
        return reviewIstitution;
    }

    public void setReviewIstitution(String reviewIstitution) {
        this.reviewIstitution = reviewIstitution == null ? null : reviewIstitution.trim();
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }
}