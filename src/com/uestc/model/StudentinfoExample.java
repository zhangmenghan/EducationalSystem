package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentinfoExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("StudentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("StudentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("StudentId =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("StudentId <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("StudentId >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("StudentId >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("StudentId <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("StudentId <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("StudentId like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("StudentId not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("StudentId in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("StudentId not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("StudentId between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("StudentId not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardIsNull() {
            addCriterion("StudentIDcard is null");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardIsNotNull() {
            addCriterion("StudentIDcard is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardEqualTo(String value) {
            addCriterion("StudentIDcard =", value, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardNotEqualTo(String value) {
            addCriterion("StudentIDcard <>", value, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardGreaterThan(String value) {
            addCriterion("StudentIDcard >", value, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardGreaterThanOrEqualTo(String value) {
            addCriterion("StudentIDcard >=", value, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardLessThan(String value) {
            addCriterion("StudentIDcard <", value, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardLessThanOrEqualTo(String value) {
            addCriterion("StudentIDcard <=", value, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardLike(String value) {
            addCriterion("StudentIDcard like", value, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardNotLike(String value) {
            addCriterion("StudentIDcard not like", value, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardIn(List<String> values) {
            addCriterion("StudentIDcard in", values, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardNotIn(List<String> values) {
            addCriterion("StudentIDcard not in", values, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardBetween(String value1, String value2) {
            addCriterion("StudentIDcard between", value1, value2, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentIDcardNotBetween(String value1, String value2) {
            addCriterion("StudentIDcard not between", value1, value2, "studentIDcard");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("StudentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("StudentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("StudentName =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("StudentName <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("StudentName >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("StudentName >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("StudentName <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("StudentName <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("StudentName like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("StudentName not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("StudentName in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("StudentName not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("StudentName between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("StudentName not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andFormerNameIsNull() {
            addCriterion("FormerName is null");
            return (Criteria) this;
        }

        public Criteria andFormerNameIsNotNull() {
            addCriterion("FormerName is not null");
            return (Criteria) this;
        }

        public Criteria andFormerNameEqualTo(String value) {
            addCriterion("FormerName =", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotEqualTo(String value) {
            addCriterion("FormerName <>", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameGreaterThan(String value) {
            addCriterion("FormerName >", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameGreaterThanOrEqualTo(String value) {
            addCriterion("FormerName >=", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLessThan(String value) {
            addCriterion("FormerName <", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLessThanOrEqualTo(String value) {
            addCriterion("FormerName <=", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLike(String value) {
            addCriterion("FormerName like", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotLike(String value) {
            addCriterion("FormerName not like", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameIn(List<String> values) {
            addCriterion("FormerName in", values, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotIn(List<String> values) {
            addCriterion("FormerName not in", values, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameBetween(String value1, String value2) {
            addCriterion("FormerName between", value1, value2, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotBetween(String value1, String value2) {
            addCriterion("FormerName not between", value1, value2, "formerName");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIsNull() {
            addCriterion("StudentGender is null");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIsNotNull() {
            addCriterion("StudentGender is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGenderEqualTo(Byte value) {
            addCriterion("StudentGender =", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotEqualTo(Byte value) {
            addCriterion("StudentGender <>", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderGreaterThan(Byte value) {
            addCriterion("StudentGender >", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("StudentGender >=", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderLessThan(Byte value) {
            addCriterion("StudentGender <", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderLessThanOrEqualTo(Byte value) {
            addCriterion("StudentGender <=", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIn(List<Byte> values) {
            addCriterion("StudentGender in", values, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotIn(List<Byte> values) {
            addCriterion("StudentGender not in", values, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderBetween(Byte value1, Byte value2) {
            addCriterion("StudentGender between", value1, value2, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("StudentGender not between", value1, value2, "studentGender");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIsNull() {
            addCriterion("CurrentState is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIsNotNull() {
            addCriterion("CurrentState is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStateEqualTo(Byte value) {
            addCriterion("CurrentState =", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotEqualTo(Byte value) {
            addCriterion("CurrentState <>", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThan(Byte value) {
            addCriterion("CurrentState >", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("CurrentState >=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThan(Byte value) {
            addCriterion("CurrentState <", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanOrEqualTo(Byte value) {
            addCriterion("CurrentState <=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIn(List<Byte> values) {
            addCriterion("CurrentState in", values, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotIn(List<Byte> values) {
            addCriterion("CurrentState not in", values, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateBetween(Byte value1, Byte value2) {
            addCriterion("CurrentState between", value1, value2, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotBetween(Byte value1, Byte value2) {
            addCriterion("CurrentState not between", value1, value2, "currentState");
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

        public Criteria andAdmissionDateIsNull() {
            addCriterion("AdmissionDate is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateIsNotNull() {
            addCriterion("AdmissionDate is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateEqualTo(Date value) {
            addCriterionForJDBCDate("AdmissionDate =", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("AdmissionDate <>", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("AdmissionDate >", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AdmissionDate >=", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateLessThan(Date value) {
            addCriterionForJDBCDate("AdmissionDate <", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AdmissionDate <=", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateIn(List<Date> values) {
            addCriterionForJDBCDate("AdmissionDate in", values, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("AdmissionDate not in", values, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AdmissionDate between", value1, value2, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AdmissionDate not between", value1, value2, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("MaritalStatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("MaritalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Byte value) {
            addCriterion("MaritalStatus =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Byte value) {
            addCriterion("MaritalStatus <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Byte value) {
            addCriterion("MaritalStatus >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("MaritalStatus >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Byte value) {
            addCriterion("MaritalStatus <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Byte value) {
            addCriterion("MaritalStatus <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Byte> values) {
            addCriterion("MaritalStatus in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Byte> values) {
            addCriterion("MaritalStatus not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Byte value1, Byte value2) {
            addCriterion("MaritalStatus between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("MaritalStatus not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("NativePlace is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("NativePlace is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("NativePlace =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("NativePlace <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("NativePlace >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("NativePlace >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("NativePlace <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("NativePlace <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("NativePlace like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("NativePlace not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("NativePlace in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("NativePlace not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("NativePlace between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("NativePlace not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeIsNull() {
            addCriterion("SchoolYearType is null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeIsNotNull() {
            addCriterion("SchoolYearType is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeEqualTo(Byte value) {
            addCriterion("SchoolYearType =", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeNotEqualTo(Byte value) {
            addCriterion("SchoolYearType <>", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeGreaterThan(Byte value) {
            addCriterion("SchoolYearType >", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("SchoolYearType >=", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeLessThan(Byte value) {
            addCriterion("SchoolYearType <", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeLessThanOrEqualTo(Byte value) {
            addCriterion("SchoolYearType <=", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeIn(List<Byte> values) {
            addCriterion("SchoolYearType in", values, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeNotIn(List<Byte> values) {
            addCriterion("SchoolYearType not in", values, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeBetween(Byte value1, Byte value2) {
            addCriterion("SchoolYearType between", value1, value2, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("SchoolYearType not between", value1, value2, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelIsNull() {
            addCriterion("SchoolLevel is null");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelIsNotNull() {
            addCriterion("SchoolLevel is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelEqualTo(Byte value) {
            addCriterion("SchoolLevel =", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelNotEqualTo(Byte value) {
            addCriterion("SchoolLevel <>", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelGreaterThan(Byte value) {
            addCriterion("SchoolLevel >", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("SchoolLevel >=", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelLessThan(Byte value) {
            addCriterion("SchoolLevel <", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelLessThanOrEqualTo(Byte value) {
            addCriterion("SchoolLevel <=", value, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelIn(List<Byte> values) {
            addCriterion("SchoolLevel in", values, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelNotIn(List<Byte> values) {
            addCriterion("SchoolLevel not in", values, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelBetween(Byte value1, Byte value2) {
            addCriterion("SchoolLevel between", value1, value2, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andSchoolLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("SchoolLevel not between", value1, value2, "schoolLevel");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresIsNull() {
            addCriterion("EntranceScores is null");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresIsNotNull() {
            addCriterion("EntranceScores is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresEqualTo(Float value) {
            addCriterion("EntranceScores =", value, "entranceScores");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresNotEqualTo(Float value) {
            addCriterion("EntranceScores <>", value, "entranceScores");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresGreaterThan(Float value) {
            addCriterion("EntranceScores >", value, "entranceScores");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresGreaterThanOrEqualTo(Float value) {
            addCriterion("EntranceScores >=", value, "entranceScores");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresLessThan(Float value) {
            addCriterion("EntranceScores <", value, "entranceScores");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresLessThanOrEqualTo(Float value) {
            addCriterion("EntranceScores <=", value, "entranceScores");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresIn(List<Float> values) {
            addCriterion("EntranceScores in", values, "entranceScores");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresNotIn(List<Float> values) {
            addCriterion("EntranceScores not in", values, "entranceScores");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresBetween(Float value1, Float value2) {
            addCriterion("EntranceScores between", value1, value2, "entranceScores");
            return (Criteria) this;
        }

        public Criteria andEntranceScoresNotBetween(Float value1, Float value2) {
            addCriterion("EntranceScores not between", value1, value2, "entranceScores");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdIsNull() {
            addCriterion("NCEERegistrationId is null");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdIsNotNull() {
            addCriterion("NCEERegistrationId is not null");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdEqualTo(String value) {
            addCriterion("NCEERegistrationId =", value, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdNotEqualTo(String value) {
            addCriterion("NCEERegistrationId <>", value, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdGreaterThan(String value) {
            addCriterion("NCEERegistrationId >", value, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdGreaterThanOrEqualTo(String value) {
            addCriterion("NCEERegistrationId >=", value, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdLessThan(String value) {
            addCriterion("NCEERegistrationId <", value, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdLessThanOrEqualTo(String value) {
            addCriterion("NCEERegistrationId <=", value, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdLike(String value) {
            addCriterion("NCEERegistrationId like", value, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdNotLike(String value) {
            addCriterion("NCEERegistrationId not like", value, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdIn(List<String> values) {
            addCriterion("NCEERegistrationId in", values, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdNotIn(List<String> values) {
            addCriterion("NCEERegistrationId not in", values, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdBetween(String value1, String value2) {
            addCriterion("NCEERegistrationId between", value1, value2, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andNCEERegistrationIdNotBetween(String value1, String value2) {
            addCriterion("NCEERegistrationId not between", value1, value2, "NCEERegistrationId");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentIsNull() {
            addCriterion("OriginOfStudent is null");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentIsNotNull() {
            addCriterion("OriginOfStudent is not null");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentEqualTo(String value) {
            addCriterion("OriginOfStudent =", value, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentNotEqualTo(String value) {
            addCriterion("OriginOfStudent <>", value, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentGreaterThan(String value) {
            addCriterion("OriginOfStudent >", value, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentGreaterThanOrEqualTo(String value) {
            addCriterion("OriginOfStudent >=", value, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentLessThan(String value) {
            addCriterion("OriginOfStudent <", value, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentLessThanOrEqualTo(String value) {
            addCriterion("OriginOfStudent <=", value, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentLike(String value) {
            addCriterion("OriginOfStudent like", value, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentNotLike(String value) {
            addCriterion("OriginOfStudent not like", value, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentIn(List<String> values) {
            addCriterion("OriginOfStudent in", values, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentNotIn(List<String> values) {
            addCriterion("OriginOfStudent not in", values, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentBetween(String value1, String value2) {
            addCriterion("OriginOfStudent between", value1, value2, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andOriginOfStudentNotBetween(String value1, String value2) {
            addCriterion("OriginOfStudent not between", value1, value2, "originOfStudent");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneIsNull() {
            addCriterion("HomeTelephone is null");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneIsNotNull() {
            addCriterion("HomeTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneEqualTo(String value) {
            addCriterion("HomeTelephone =", value, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneNotEqualTo(String value) {
            addCriterion("HomeTelephone <>", value, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneGreaterThan(String value) {
            addCriterion("HomeTelephone >", value, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("HomeTelephone >=", value, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneLessThan(String value) {
            addCriterion("HomeTelephone <", value, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneLessThanOrEqualTo(String value) {
            addCriterion("HomeTelephone <=", value, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneLike(String value) {
            addCriterion("HomeTelephone like", value, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneNotLike(String value) {
            addCriterion("HomeTelephone not like", value, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneIn(List<String> values) {
            addCriterion("HomeTelephone in", values, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneNotIn(List<String> values) {
            addCriterion("HomeTelephone not in", values, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneBetween(String value1, String value2) {
            addCriterion("HomeTelephone between", value1, value2, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHomeTelephoneNotBetween(String value1, String value2) {
            addCriterion("HomeTelephone not between", value1, value2, "homeTelephone");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNull() {
            addCriterion("HouseAddress is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNotNull() {
            addCriterion("HouseAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressEqualTo(String value) {
            addCriterion("HouseAddress =", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotEqualTo(String value) {
            addCriterion("HouseAddress <>", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThan(String value) {
            addCriterion("HouseAddress >", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("HouseAddress >=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThan(String value) {
            addCriterion("HouseAddress <", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("HouseAddress <=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLike(String value) {
            addCriterion("HouseAddress like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotLike(String value) {
            addCriterion("HouseAddress not like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIn(List<String> values) {
            addCriterion("HouseAddress in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotIn(List<String> values) {
            addCriterion("HouseAddress not in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressBetween(String value1, String value2) {
            addCriterion("HouseAddress between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotBetween(String value1, String value2) {
            addCriterion("HouseAddress not between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("Height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("Height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Short value) {
            addCriterion("Height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Short value) {
            addCriterion("Height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Short value) {
            addCriterion("Height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Short value) {
            addCriterion("Height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Short value) {
            addCriterion("Height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Short value) {
            addCriterion("Height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Short> values) {
            addCriterion("Height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Short> values) {
            addCriterion("Height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Short value1, Short value2) {
            addCriterion("Height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Short value1, Short value2) {
            addCriterion("Height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Short value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Short value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Short value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Short value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Short value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Short value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Short> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Short> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Short value1, Short value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Short value1, Short value2) {
            addCriterion("Weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andClassIDIsNull() {
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassIDIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassIDEqualTo(String value) {
            addCriterion("ClassID =", value, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDNotEqualTo(String value) {
            addCriterion("ClassID <>", value, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDGreaterThan(String value) {
            addCriterion("ClassID >", value, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDGreaterThanOrEqualTo(String value) {
            addCriterion("ClassID >=", value, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDLessThan(String value) {
            addCriterion("ClassID <", value, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDLessThanOrEqualTo(String value) {
            addCriterion("ClassID <=", value, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDLike(String value) {
            addCriterion("ClassID like", value, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDNotLike(String value) {
            addCriterion("ClassID not like", value, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDIn(List<String> values) {
            addCriterion("ClassID in", values, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDNotIn(List<String> values) {
            addCriterion("ClassID not in", values, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDBetween(String value1, String value2) {
            addCriterion("ClassID between", value1, value2, "classID");
            return (Criteria) this;
        }

        public Criteria andClassIDNotBetween(String value1, String value2) {
            addCriterion("ClassID not between", value1, value2, "classID");
            return (Criteria) this;
        }

        public Criteria andClassDutyIsNull() {
            addCriterion("ClassDuty is null");
            return (Criteria) this;
        }

        public Criteria andClassDutyIsNotNull() {
            addCriterion("ClassDuty is not null");
            return (Criteria) this;
        }

        public Criteria andClassDutyEqualTo(String value) {
            addCriterion("ClassDuty =", value, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyNotEqualTo(String value) {
            addCriterion("ClassDuty <>", value, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyGreaterThan(String value) {
            addCriterion("ClassDuty >", value, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyGreaterThanOrEqualTo(String value) {
            addCriterion("ClassDuty >=", value, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyLessThan(String value) {
            addCriterion("ClassDuty <", value, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyLessThanOrEqualTo(String value) {
            addCriterion("ClassDuty <=", value, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyLike(String value) {
            addCriterion("ClassDuty like", value, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyNotLike(String value) {
            addCriterion("ClassDuty not like", value, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyIn(List<String> values) {
            addCriterion("ClassDuty in", values, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyNotIn(List<String> values) {
            addCriterion("ClassDuty not in", values, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyBetween(String value1, String value2) {
            addCriterion("ClassDuty between", value1, value2, "classDuty");
            return (Criteria) this;
        }

        public Criteria andClassDutyNotBetween(String value1, String value2) {
            addCriterion("ClassDuty not between", value1, value2, "classDuty");
            return (Criteria) this;
        }

        public Criteria andEthnoIsNull() {
            addCriterion("Ethno is null");
            return (Criteria) this;
        }

        public Criteria andEthnoIsNotNull() {
            addCriterion("Ethno is not null");
            return (Criteria) this;
        }

        public Criteria andEthnoEqualTo(String value) {
            addCriterion("Ethno =", value, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoNotEqualTo(String value) {
            addCriterion("Ethno <>", value, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoGreaterThan(String value) {
            addCriterion("Ethno >", value, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoGreaterThanOrEqualTo(String value) {
            addCriterion("Ethno >=", value, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoLessThan(String value) {
            addCriterion("Ethno <", value, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoLessThanOrEqualTo(String value) {
            addCriterion("Ethno <=", value, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoLike(String value) {
            addCriterion("Ethno like", value, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoNotLike(String value) {
            addCriterion("Ethno not like", value, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoIn(List<String> values) {
            addCriterion("Ethno in", values, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoNotIn(List<String> values) {
            addCriterion("Ethno not in", values, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoBetween(String value1, String value2) {
            addCriterion("Ethno between", value1, value2, "ethno");
            return (Criteria) this;
        }

        public Criteria andEthnoNotBetween(String value1, String value2) {
            addCriterion("Ethno not between", value1, value2, "ethno");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNull() {
            addCriterion("PoliticalStatus is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNotNull() {
            addCriterion("PoliticalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusEqualTo(String value) {
            addCriterion("PoliticalStatus =", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotEqualTo(String value) {
            addCriterion("PoliticalStatus <>", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThan(String value) {
            addCriterion("PoliticalStatus >", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PoliticalStatus >=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThan(String value) {
            addCriterion("PoliticalStatus <", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThanOrEqualTo(String value) {
            addCriterion("PoliticalStatus <=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLike(String value) {
            addCriterion("PoliticalStatus like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotLike(String value) {
            addCriterion("PoliticalStatus not like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIn(List<String> values) {
            addCriterion("PoliticalStatus in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotIn(List<String> values) {
            addCriterion("PoliticalStatus not in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusBetween(String value1, String value2) {
            addCriterion("PoliticalStatus between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotBetween(String value1, String value2) {
            addCriterion("PoliticalStatus not between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsIsNull() {
            addCriterion("LiteracyLevels is null");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsIsNotNull() {
            addCriterion("LiteracyLevels is not null");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsEqualTo(String value) {
            addCriterion("LiteracyLevels =", value, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsNotEqualTo(String value) {
            addCriterion("LiteracyLevels <>", value, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsGreaterThan(String value) {
            addCriterion("LiteracyLevels >", value, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsGreaterThanOrEqualTo(String value) {
            addCriterion("LiteracyLevels >=", value, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsLessThan(String value) {
            addCriterion("LiteracyLevels <", value, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsLessThanOrEqualTo(String value) {
            addCriterion("LiteracyLevels <=", value, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsLike(String value) {
            addCriterion("LiteracyLevels like", value, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsNotLike(String value) {
            addCriterion("LiteracyLevels not like", value, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsIn(List<String> values) {
            addCriterion("LiteracyLevels in", values, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsNotIn(List<String> values) {
            addCriterion("LiteracyLevels not in", values, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsBetween(String value1, String value2) {
            addCriterion("LiteracyLevels between", value1, value2, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andLiteracyLevelsNotBetween(String value1, String value2) {
            addCriterion("LiteracyLevels not between", value1, value2, "literacyLevels");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNull() {
            addCriterion("GraduationTime is null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNotNull() {
            addCriterion("GraduationTime is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeEqualTo(Date value) {
            addCriterionForJDBCDate("GraduationTime =", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("GraduationTime <>", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("GraduationTime >", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GraduationTime >=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThan(Date value) {
            addCriterionForJDBCDate("GraduationTime <", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GraduationTime <=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIn(List<Date> values) {
            addCriterionForJDBCDate("GraduationTime in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("GraduationTime not in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GraduationTime between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GraduationTime not between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationNumIsNull() {
            addCriterion("GraduationNum is null");
            return (Criteria) this;
        }

        public Criteria andGraduationNumIsNotNull() {
            addCriterion("GraduationNum is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationNumEqualTo(String value) {
            addCriterion("GraduationNum =", value, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumNotEqualTo(String value) {
            addCriterion("GraduationNum <>", value, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumGreaterThan(String value) {
            addCriterion("GraduationNum >", value, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumGreaterThanOrEqualTo(String value) {
            addCriterion("GraduationNum >=", value, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumLessThan(String value) {
            addCriterion("GraduationNum <", value, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumLessThanOrEqualTo(String value) {
            addCriterion("GraduationNum <=", value, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumLike(String value) {
            addCriterion("GraduationNum like", value, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumNotLike(String value) {
            addCriterion("GraduationNum not like", value, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumIn(List<String> values) {
            addCriterion("GraduationNum in", values, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumNotIn(List<String> values) {
            addCriterion("GraduationNum not in", values, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumBetween(String value1, String value2) {
            addCriterion("GraduationNum between", value1, value2, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andGraduationNumNotBetween(String value1, String value2) {
            addCriterion("GraduationNum not between", value1, value2, "graduationNum");
            return (Criteria) this;
        }

        public Criteria andExamineeIdIsNull() {
            addCriterion("ExamineeId is null");
            return (Criteria) this;
        }

        public Criteria andExamineeIdIsNotNull() {
            addCriterion("ExamineeId is not null");
            return (Criteria) this;
        }

        public Criteria andExamineeIdEqualTo(String value) {
            addCriterion("ExamineeId =", value, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdNotEqualTo(String value) {
            addCriterion("ExamineeId <>", value, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdGreaterThan(String value) {
            addCriterion("ExamineeId >", value, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ExamineeId >=", value, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdLessThan(String value) {
            addCriterion("ExamineeId <", value, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdLessThanOrEqualTo(String value) {
            addCriterion("ExamineeId <=", value, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdLike(String value) {
            addCriterion("ExamineeId like", value, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdNotLike(String value) {
            addCriterion("ExamineeId not like", value, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdIn(List<String> values) {
            addCriterion("ExamineeId in", values, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdNotIn(List<String> values) {
            addCriterion("ExamineeId not in", values, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdBetween(String value1, String value2) {
            addCriterion("ExamineeId between", value1, value2, "examineeId");
            return (Criteria) this;
        }

        public Criteria andExamineeIdNotBetween(String value1, String value2) {
            addCriterion("ExamineeId not between", value1, value2, "examineeId");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoIsNull() {
            addCriterion("CredentialsPhoto is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoIsNotNull() {
            addCriterion("CredentialsPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoEqualTo(String value) {
            addCriterion("CredentialsPhoto =", value, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoNotEqualTo(String value) {
            addCriterion("CredentialsPhoto <>", value, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoGreaterThan(String value) {
            addCriterion("CredentialsPhoto >", value, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("CredentialsPhoto >=", value, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoLessThan(String value) {
            addCriterion("CredentialsPhoto <", value, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoLessThanOrEqualTo(String value) {
            addCriterion("CredentialsPhoto <=", value, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoLike(String value) {
            addCriterion("CredentialsPhoto like", value, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoNotLike(String value) {
            addCriterion("CredentialsPhoto not like", value, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoIn(List<String> values) {
            addCriterion("CredentialsPhoto in", values, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoNotIn(List<String> values) {
            addCriterion("CredentialsPhoto not in", values, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoBetween(String value1, String value2) {
            addCriterion("CredentialsPhoto between", value1, value2, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andCredentialsPhotoNotBetween(String value1, String value2) {
            addCriterion("CredentialsPhoto not between", value1, value2, "credentialsPhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoIsNull() {
            addCriterion("LivePhoto is null");
            return (Criteria) this;
        }

        public Criteria andLivePhotoIsNotNull() {
            addCriterion("LivePhoto is not null");
            return (Criteria) this;
        }

        public Criteria andLivePhotoEqualTo(String value) {
            addCriterion("LivePhoto =", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoNotEqualTo(String value) {
            addCriterion("LivePhoto <>", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoGreaterThan(String value) {
            addCriterion("LivePhoto >", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("LivePhoto >=", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoLessThan(String value) {
            addCriterion("LivePhoto <", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoLessThanOrEqualTo(String value) {
            addCriterion("LivePhoto <=", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoLike(String value) {
            addCriterion("LivePhoto like", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoNotLike(String value) {
            addCriterion("LivePhoto not like", value, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoIn(List<String> values) {
            addCriterion("LivePhoto in", values, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoNotIn(List<String> values) {
            addCriterion("LivePhoto not in", values, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoBetween(String value1, String value2) {
            addCriterion("LivePhoto between", value1, value2, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andLivePhotoNotBetween(String value1, String value2) {
            addCriterion("LivePhoto not between", value1, value2, "livePhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoIsNull() {
            addCriterion("IDcardPhoto is null");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoIsNotNull() {
            addCriterion("IDcardPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoEqualTo(String value) {
            addCriterion("IDcardPhoto =", value, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoNotEqualTo(String value) {
            addCriterion("IDcardPhoto <>", value, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoGreaterThan(String value) {
            addCriterion("IDcardPhoto >", value, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("IDcardPhoto >=", value, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoLessThan(String value) {
            addCriterion("IDcardPhoto <", value, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoLessThanOrEqualTo(String value) {
            addCriterion("IDcardPhoto <=", value, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoLike(String value) {
            addCriterion("IDcardPhoto like", value, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoNotLike(String value) {
            addCriterion("IDcardPhoto not like", value, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoIn(List<String> values) {
            addCriterion("IDcardPhoto in", values, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoNotIn(List<String> values) {
            addCriterion("IDcardPhoto not in", values, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoBetween(String value1, String value2) {
            addCriterion("IDcardPhoto between", value1, value2, "IDcardPhoto");
            return (Criteria) this;
        }

        public Criteria andIDcardPhotoNotBetween(String value1, String value2) {
            addCriterion("IDcardPhoto not between", value1, value2, "IDcardPhoto");
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