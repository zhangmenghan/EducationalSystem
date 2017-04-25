package com.uestc.model;

import java.util.Date;

public class Studentinfo {
    private String studentId;

    private String studentIDcard;

    private String studentName;

    private String formerName;

    private Byte studentGender;

    private Byte currentState;

    private Date birthdate;

    private Date admissionDate;

    private Byte maritalStatus;

    private String nativePlace;

    private Byte schoolYearType;

    private Byte schoolLevel;

    private Float entranceScores;

    private String NCEERegistrationId;

    private String originOfStudent;

    private String homeTelephone;

    private String houseAddress;

    private Short height;

    private Short weight;

    private String classID;

    private String classDuty;

    private String ethno;

    private String politicalStatus;

    private String literacyLevels;

    private Date graduationTime;

    private String graduationNum;

    private String examineeId;

    private String credentialsPhoto;

    private String livePhoto;

    private String IDcardPhoto;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentIDcard() {
        return studentIDcard;
    }

    public void setStudentIDcard(String studentIDcard) {
        this.studentIDcard = studentIDcard == null ? null : studentIDcard.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName == null ? null : formerName.trim();
    }

    public Byte getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(Byte studentGender) {
        this.studentGender = studentGender;
    }

    public Byte getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Byte currentState) {
        this.currentState = currentState;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Byte getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Byte maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public Byte getSchoolYearType() {
        return schoolYearType;
    }

    public void setSchoolYearType(Byte schoolYearType) {
        this.schoolYearType = schoolYearType;
    }

    public Byte getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(Byte schoolLevel) {
        this.schoolLevel = schoolLevel;
    }

    public Float getEntranceScores() {
        return entranceScores;
    }

    public void setEntranceScores(Float entranceScores) {
        this.entranceScores = entranceScores;
    }

    public String getNCEERegistrationId() {
        return NCEERegistrationId;
    }

    public void setNCEERegistrationId(String NCEERegistrationId) {
        this.NCEERegistrationId = NCEERegistrationId == null ? null : NCEERegistrationId.trim();
    }

    public String getOriginOfStudent() {
        return originOfStudent;
    }

    public void setOriginOfStudent(String originOfStudent) {
        this.originOfStudent = originOfStudent == null ? null : originOfStudent.trim();
    }

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public void setHomeTelephone(String homeTelephone) {
        this.homeTelephone = homeTelephone == null ? null : homeTelephone.trim();
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID == null ? null : classID.trim();
    }

    public String getClassDuty() {
        return classDuty;
    }

    public void setClassDuty(String classDuty) {
        this.classDuty = classDuty == null ? null : classDuty.trim();
    }

    public String getEthno() {
        return ethno;
    }

    public void setEthno(String ethno) {
        this.ethno = ethno == null ? null : ethno.trim();
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    public String getLiteracyLevels() {
        return literacyLevels;
    }

    public void setLiteracyLevels(String literacyLevels) {
        this.literacyLevels = literacyLevels == null ? null : literacyLevels.trim();
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getGraduationNum() {
        return graduationNum;
    }

    public void setGraduationNum(String graduationNum) {
        this.graduationNum = graduationNum == null ? null : graduationNum.trim();
    }

    public String getExamineeId() {
        return examineeId;
    }

    public void setExamineeId(String examineeId) {
        this.examineeId = examineeId == null ? null : examineeId.trim();
    }

    public String getCredentialsPhoto() {
        return credentialsPhoto;
    }

    public void setCredentialsPhoto(String credentialsPhoto) {
        this.credentialsPhoto = credentialsPhoto == null ? null : credentialsPhoto.trim();
    }

    public String getLivePhoto() {
        return livePhoto;
    }

    public void setLivePhoto(String livePhoto) {
        this.livePhoto = livePhoto == null ? null : livePhoto.trim();
    }

    public String getIDcardPhoto() {
        return IDcardPhoto;
    }

    public void setIDcardPhoto(String IDcardPhoto) {
        this.IDcardPhoto = IDcardPhoto == null ? null : IDcardPhoto.trim();
    }
}