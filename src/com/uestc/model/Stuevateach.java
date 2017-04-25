package com.uestc.model;

public class Stuevateach extends StuevateachKey {
    private Byte record;

    private String textEva;

    public Byte getRecord() {
        return record;
    }

    public void setRecord(Byte record) {
        this.record = record;
    }

    public String getTextEva() {
        return textEva;
    }

    public void setTextEva(String textEva) {
        this.textEva = textEva == null ? null : textEva.trim();
    }
}