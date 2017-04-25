package com.uestc.model;

public class Teachjournal {
    private String teachJournalId;

    private String giveLessonsDetailsId;

    private Boolean teacherConfirm;

    private Byte execWeek;

    private String teachJournalInFo;

    public String getTeachJournalId() {
        return teachJournalId;
    }

    public void setTeachJournalId(String teachJournalId) {
        this.teachJournalId = teachJournalId == null ? null : teachJournalId.trim();
    }

    public String getGiveLessonsDetailsId() {
        return giveLessonsDetailsId;
    }

    public void setGiveLessonsDetailsId(String giveLessonsDetailsId) {
        this.giveLessonsDetailsId = giveLessonsDetailsId == null ? null : giveLessonsDetailsId.trim();
    }

    public Boolean getTeacherConfirm() {
        return teacherConfirm;
    }

    public void setTeacherConfirm(Boolean teacherConfirm) {
        this.teacherConfirm = teacherConfirm;
    }

    public Byte getExecWeek() {
        return execWeek;
    }

    public void setExecWeek(Byte execWeek) {
        this.execWeek = execWeek;
    }

    public String getTeachJournalInFo() {
        return teachJournalInFo;
    }

    public void setTeachJournalInFo(String teachJournalInFo) {
        this.teachJournalInFo = teachJournalInFo == null ? null : teachJournalInFo.trim();
    }
}