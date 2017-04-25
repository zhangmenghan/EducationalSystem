package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("TeacherId is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("TeacherId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("TeacherId =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("TeacherId <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("TeacherId >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherId >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("TeacherId <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("TeacherId <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("TeacherId like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("TeacherId not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("TeacherId in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("TeacherId not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("TeacherId between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("TeacherId not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("TeacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("TeacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("TeacherName =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("TeacherName <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("TeacherName >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherName >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("TeacherName <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("TeacherName <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("TeacherName like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("TeacherName not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("TeacherName in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("TeacherName not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("TeacherName between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("TeacherName not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardIsNull() {
            addCriterion("TeacherIDcard is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardIsNotNull() {
            addCriterion("TeacherIDcard is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardEqualTo(String value) {
            addCriterion("TeacherIDcard =", value, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardNotEqualTo(String value) {
            addCriterion("TeacherIDcard <>", value, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardGreaterThan(String value) {
            addCriterion("TeacherIDcard >", value, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherIDcard >=", value, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardLessThan(String value) {
            addCriterion("TeacherIDcard <", value, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardLessThanOrEqualTo(String value) {
            addCriterion("TeacherIDcard <=", value, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardLike(String value) {
            addCriterion("TeacherIDcard like", value, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardNotLike(String value) {
            addCriterion("TeacherIDcard not like", value, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardIn(List<String> values) {
            addCriterion("TeacherIDcard in", values, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardNotIn(List<String> values) {
            addCriterion("TeacherIDcard not in", values, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardBetween(String value1, String value2) {
            addCriterion("TeacherIDcard between", value1, value2, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherIDcardNotBetween(String value1, String value2) {
            addCriterion("TeacherIDcard not between", value1, value2, "teacherIDcard");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIsNull() {
            addCriterion("TeacherGender is null");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIsNotNull() {
            addCriterion("TeacherGender is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderEqualTo(Byte value) {
            addCriterion("TeacherGender =", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotEqualTo(Byte value) {
            addCriterion("TeacherGender <>", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderGreaterThan(Byte value) {
            addCriterion("TeacherGender >", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("TeacherGender >=", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLessThan(Byte value) {
            addCriterion("TeacherGender <", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLessThanOrEqualTo(Byte value) {
            addCriterion("TeacherGender <=", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIn(List<Byte> values) {
            addCriterion("TeacherGender in", values, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotIn(List<Byte> values) {
            addCriterion("TeacherGender not in", values, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderBetween(Byte value1, Byte value2) {
            addCriterion("TeacherGender between", value1, value2, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("TeacherGender not between", value1, value2, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoIsNull() {
            addCriterion("TeacherPhoto is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoIsNotNull() {
            addCriterion("TeacherPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoEqualTo(String value) {
            addCriterion("TeacherPhoto =", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoNotEqualTo(String value) {
            addCriterion("TeacherPhoto <>", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoGreaterThan(String value) {
            addCriterion("TeacherPhoto >", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherPhoto >=", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoLessThan(String value) {
            addCriterion("TeacherPhoto <", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoLessThanOrEqualTo(String value) {
            addCriterion("TeacherPhoto <=", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoLike(String value) {
            addCriterion("TeacherPhoto like", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoNotLike(String value) {
            addCriterion("TeacherPhoto not like", value, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoIn(List<String> values) {
            addCriterion("TeacherPhoto in", values, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoNotIn(List<String> values) {
            addCriterion("TeacherPhoto not in", values, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoBetween(String value1, String value2) {
            addCriterion("TeacherPhoto between", value1, value2, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andTeacherPhotoNotBetween(String value1, String value2) {
            addCriterion("TeacherPhoto not between", value1, value2, "teacherPhoto");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("Birthdate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("Birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("Birthdate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Birthdate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("Birthdate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birthdate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("Birthdate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birthdate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("Birthdate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Birthdate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birthdate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birthdate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("Worktime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("Worktime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Date value) {
            addCriterionForJDBCDate("Worktime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Worktime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Worktime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Worktime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Date value) {
            addCriterionForJDBCDate("Worktime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Worktime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Date> values) {
            addCriterionForJDBCDate("Worktime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Worktime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Worktime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Worktime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearIsNull() {
            addCriterion("ClinicWorkYear is null");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearIsNotNull() {
            addCriterion("ClinicWorkYear is not null");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearEqualTo(Byte value) {
            addCriterion("ClinicWorkYear =", value, "clinicWorkYear");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearNotEqualTo(Byte value) {
            addCriterion("ClinicWorkYear <>", value, "clinicWorkYear");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearGreaterThan(Byte value) {
            addCriterion("ClinicWorkYear >", value, "clinicWorkYear");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearGreaterThanOrEqualTo(Byte value) {
            addCriterion("ClinicWorkYear >=", value, "clinicWorkYear");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearLessThan(Byte value) {
            addCriterion("ClinicWorkYear <", value, "clinicWorkYear");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearLessThanOrEqualTo(Byte value) {
            addCriterion("ClinicWorkYear <=", value, "clinicWorkYear");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearIn(List<Byte> values) {
            addCriterion("ClinicWorkYear in", values, "clinicWorkYear");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearNotIn(List<Byte> values) {
            addCriterion("ClinicWorkYear not in", values, "clinicWorkYear");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearBetween(Byte value1, Byte value2) {
            addCriterion("ClinicWorkYear between", value1, value2, "clinicWorkYear");
            return (Criteria) this;
        }

        public Criteria andClinicWorkYearNotBetween(Byte value1, Byte value2) {
            addCriterion("ClinicWorkYear not between", value1, value2, "clinicWorkYear");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitIsNull() {
            addCriterion("CurrentWorkUnit is null");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitIsNotNull() {
            addCriterion("CurrentWorkUnit is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitEqualTo(String value) {
            addCriterion("CurrentWorkUnit =", value, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitNotEqualTo(String value) {
            addCriterion("CurrentWorkUnit <>", value, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitGreaterThan(String value) {
            addCriterion("CurrentWorkUnit >", value, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitGreaterThanOrEqualTo(String value) {
            addCriterion("CurrentWorkUnit >=", value, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitLessThan(String value) {
            addCriterion("CurrentWorkUnit <", value, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitLessThanOrEqualTo(String value) {
            addCriterion("CurrentWorkUnit <=", value, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitLike(String value) {
            addCriterion("CurrentWorkUnit like", value, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitNotLike(String value) {
            addCriterion("CurrentWorkUnit not like", value, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitIn(List<String> values) {
            addCriterion("CurrentWorkUnit in", values, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitNotIn(List<String> values) {
            addCriterion("CurrentWorkUnit not in", values, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitBetween(String value1, String value2) {
            addCriterion("CurrentWorkUnit between", value1, value2, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkUnitNotBetween(String value1, String value2) {
            addCriterion("CurrentWorkUnit not between", value1, value2, "currentWorkUnit");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleIsNull() {
            addCriterion("CurrentWorkTitle is null");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleIsNotNull() {
            addCriterion("CurrentWorkTitle is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleEqualTo(String value) {
            addCriterion("CurrentWorkTitle =", value, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleNotEqualTo(String value) {
            addCriterion("CurrentWorkTitle <>", value, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleGreaterThan(String value) {
            addCriterion("CurrentWorkTitle >", value, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CurrentWorkTitle >=", value, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleLessThan(String value) {
            addCriterion("CurrentWorkTitle <", value, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleLessThanOrEqualTo(String value) {
            addCriterion("CurrentWorkTitle <=", value, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleLike(String value) {
            addCriterion("CurrentWorkTitle like", value, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleNotLike(String value) {
            addCriterion("CurrentWorkTitle not like", value, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleIn(List<String> values) {
            addCriterion("CurrentWorkTitle in", values, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleNotIn(List<String> values) {
            addCriterion("CurrentWorkTitle not in", values, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleBetween(String value1, String value2) {
            addCriterion("CurrentWorkTitle between", value1, value2, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkTitleNotBetween(String value1, String value2) {
            addCriterion("CurrentWorkTitle not between", value1, value2, "currentWorkTitle");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyIsNull() {
            addCriterion("CurrentWorkDuty is null");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyIsNotNull() {
            addCriterion("CurrentWorkDuty is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyEqualTo(String value) {
            addCriterion("CurrentWorkDuty =", value, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyNotEqualTo(String value) {
            addCriterion("CurrentWorkDuty <>", value, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyGreaterThan(String value) {
            addCriterion("CurrentWorkDuty >", value, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyGreaterThanOrEqualTo(String value) {
            addCriterion("CurrentWorkDuty >=", value, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyLessThan(String value) {
            addCriterion("CurrentWorkDuty <", value, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyLessThanOrEqualTo(String value) {
            addCriterion("CurrentWorkDuty <=", value, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyLike(String value) {
            addCriterion("CurrentWorkDuty like", value, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyNotLike(String value) {
            addCriterion("CurrentWorkDuty not like", value, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyIn(List<String> values) {
            addCriterion("CurrentWorkDuty in", values, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyNotIn(List<String> values) {
            addCriterion("CurrentWorkDuty not in", values, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyBetween(String value1, String value2) {
            addCriterion("CurrentWorkDuty between", value1, value2, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andCurrentWorkDutyNotBetween(String value1, String value2) {
            addCriterion("CurrentWorkDuty not between", value1, value2, "currentWorkDuty");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherIsNull() {
            addCriterion("IsDoubleTeacher is null");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherIsNotNull() {
            addCriterion("IsDoubleTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherEqualTo(Boolean value) {
            addCriterion("IsDoubleTeacher =", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherNotEqualTo(Boolean value) {
            addCriterion("IsDoubleTeacher <>", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherGreaterThan(Boolean value) {
            addCriterion("IsDoubleTeacher >", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDoubleTeacher >=", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherLessThan(Boolean value) {
            addCriterion("IsDoubleTeacher <", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDoubleTeacher <=", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherIn(List<Boolean> values) {
            addCriterion("IsDoubleTeacher in", values, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherNotIn(List<Boolean> values) {
            addCriterion("IsDoubleTeacher not in", values, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDoubleTeacher between", value1, value2, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDoubleTeacher not between", value1, value2, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andHireCampusIsNull() {
            addCriterion("HireCampus is null");
            return (Criteria) this;
        }

        public Criteria andHireCampusIsNotNull() {
            addCriterion("HireCampus is not null");
            return (Criteria) this;
        }

        public Criteria andHireCampusEqualTo(String value) {
            addCriterion("HireCampus =", value, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusNotEqualTo(String value) {
            addCriterion("HireCampus <>", value, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusGreaterThan(String value) {
            addCriterion("HireCampus >", value, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusGreaterThanOrEqualTo(String value) {
            addCriterion("HireCampus >=", value, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusLessThan(String value) {
            addCriterion("HireCampus <", value, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusLessThanOrEqualTo(String value) {
            addCriterion("HireCampus <=", value, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusLike(String value) {
            addCriterion("HireCampus like", value, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusNotLike(String value) {
            addCriterion("HireCampus not like", value, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusIn(List<String> values) {
            addCriterion("HireCampus in", values, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusNotIn(List<String> values) {
            addCriterion("HireCampus not in", values, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusBetween(String value1, String value2) {
            addCriterion("HireCampus between", value1, value2, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andHireCampusNotBetween(String value1, String value2) {
            addCriterion("HireCampus not between", value1, value2, "hireCampus");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNull() {
            addCriterion("ContactNumber is null");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNotNull() {
            addCriterion("ContactNumber is not null");
            return (Criteria) this;
        }

        public Criteria andContactNumberEqualTo(String value) {
            addCriterion("ContactNumber =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(String value) {
            addCriterion("ContactNumber <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(String value) {
            addCriterion("ContactNumber >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ContactNumber >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(String value) {
            addCriterion("ContactNumber <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(String value) {
            addCriterion("ContactNumber <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLike(String value) {
            addCriterion("ContactNumber like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotLike(String value) {
            addCriterion("ContactNumber not like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<String> values) {
            addCriterion("ContactNumber in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<String> values) {
            addCriterion("ContactNumber not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(String value1, String value2) {
            addCriterion("ContactNumber between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(String value1, String value2) {
            addCriterion("ContactNumber not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andQQNumberIsNull() {
            addCriterion("QQNumber is null");
            return (Criteria) this;
        }

        public Criteria andQQNumberIsNotNull() {
            addCriterion("QQNumber is not null");
            return (Criteria) this;
        }

        public Criteria andQQNumberEqualTo(Long value) {
            addCriterion("QQNumber =", value, "QQNumber");
            return (Criteria) this;
        }

        public Criteria andQQNumberNotEqualTo(Long value) {
            addCriterion("QQNumber <>", value, "QQNumber");
            return (Criteria) this;
        }

        public Criteria andQQNumberGreaterThan(Long value) {
            addCriterion("QQNumber >", value, "QQNumber");
            return (Criteria) this;
        }

        public Criteria andQQNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("QQNumber >=", value, "QQNumber");
            return (Criteria) this;
        }

        public Criteria andQQNumberLessThan(Long value) {
            addCriterion("QQNumber <", value, "QQNumber");
            return (Criteria) this;
        }

        public Criteria andQQNumberLessThanOrEqualTo(Long value) {
            addCriterion("QQNumber <=", value, "QQNumber");
            return (Criteria) this;
        }

        public Criteria andQQNumberIn(List<Long> values) {
            addCriterion("QQNumber in", values, "QQNumber");
            return (Criteria) this;
        }

        public Criteria andQQNumberNotIn(List<Long> values) {
            addCriterion("QQNumber not in", values, "QQNumber");
            return (Criteria) this;
        }

        public Criteria andQQNumberBetween(Long value1, Long value2) {
            addCriterion("QQNumber between", value1, value2, "QQNumber");
            return (Criteria) this;
        }

        public Criteria andQQNumberNotBetween(Long value1, Long value2) {
            addCriterion("QQNumber not between", value1, value2, "QQNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIsNull() {
            addCriterion("TeacherType is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIsNotNull() {
            addCriterion("TeacherType is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeEqualTo(Byte value) {
            addCriterion("TeacherType =", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeNotEqualTo(Byte value) {
            addCriterion("TeacherType <>", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeGreaterThan(Byte value) {
            addCriterion("TeacherType >", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("TeacherType >=", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeLessThan(Byte value) {
            addCriterion("TeacherType <", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeLessThanOrEqualTo(Byte value) {
            addCriterion("TeacherType <=", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIn(List<Byte> values) {
            addCriterion("TeacherType in", values, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeNotIn(List<Byte> values) {
            addCriterion("TeacherType not in", values, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeBetween(Byte value1, Byte value2) {
            addCriterion("TeacherType between", value1, value2, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("TeacherType not between", value1, value2, "teacherType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}