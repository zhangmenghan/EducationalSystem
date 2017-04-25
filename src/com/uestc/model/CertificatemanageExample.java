package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CertificatemanageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificatemanageExample() {
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

        public Criteria andCertificateIdIsNull() {
            addCriterion("CertificateId is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIdIsNotNull() {
            addCriterion("CertificateId is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateIdEqualTo(Integer value) {
            addCriterion("CertificateId =", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotEqualTo(Integer value) {
            addCriterion("CertificateId <>", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdGreaterThan(Integer value) {
            addCriterion("CertificateId >", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CertificateId >=", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdLessThan(Integer value) {
            addCriterion("CertificateId <", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdLessThanOrEqualTo(Integer value) {
            addCriterion("CertificateId <=", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdIn(List<Integer> values) {
            addCriterion("CertificateId in", values, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotIn(List<Integer> values) {
            addCriterion("CertificateId not in", values, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdBetween(Integer value1, Integer value2) {
            addCriterion("CertificateId between", value1, value2, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CertificateId not between", value1, value2, "certificateId");
            return (Criteria) this;
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

        public Criteria andCertificateTypeIsNull() {
            addCriterion("CertificateType is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("CertificateType is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(Byte value) {
            addCriterion("CertificateType =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(Byte value) {
            addCriterion("CertificateType <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(Byte value) {
            addCriterion("CertificateType >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("CertificateType >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(Byte value) {
            addCriterion("CertificateType <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("CertificateType <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<Byte> values) {
            addCriterion("CertificateType in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<Byte> values) {
            addCriterion("CertificateType not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(Byte value1, Byte value2) {
            addCriterion("CertificateType between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("CertificateType not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIsNull() {
            addCriterion("CertificateNum is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIsNotNull() {
            addCriterion("CertificateNum is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumEqualTo(String value) {
            addCriterion("CertificateNum =", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotEqualTo(String value) {
            addCriterion("CertificateNum <>", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumGreaterThan(String value) {
            addCriterion("CertificateNum >", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateNum >=", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLessThan(String value) {
            addCriterion("CertificateNum <", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLessThanOrEqualTo(String value) {
            addCriterion("CertificateNum <=", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLike(String value) {
            addCriterion("CertificateNum like", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotLike(String value) {
            addCriterion("CertificateNum not like", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIn(List<String> values) {
            addCriterion("CertificateNum in", values, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotIn(List<String> values) {
            addCriterion("CertificateNum not in", values, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumBetween(String value1, String value2) {
            addCriterion("CertificateNum between", value1, value2, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotBetween(String value1, String value2) {
            addCriterion("CertificateNum not between", value1, value2, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIsNull() {
            addCriterion("CertificateName is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIsNotNull() {
            addCriterion("CertificateName is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameEqualTo(String value) {
            addCriterion("CertificateName =", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotEqualTo(String value) {
            addCriterion("CertificateName <>", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThan(String value) {
            addCriterion("CertificateName >", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateName >=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThan(String value) {
            addCriterion("CertificateName <", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThanOrEqualTo(String value) {
            addCriterion("CertificateName <=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLike(String value) {
            addCriterion("CertificateName like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotLike(String value) {
            addCriterion("CertificateName not like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIn(List<String> values) {
            addCriterion("CertificateName in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotIn(List<String> values) {
            addCriterion("CertificateName not in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameBetween(String value1, String value2) {
            addCriterion("CertificateName between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotBetween(String value1, String value2) {
            addCriterion("CertificateName not between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelIsNull() {
            addCriterion("CertificateLevel is null");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelIsNotNull() {
            addCriterion("CertificateLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelEqualTo(Byte value) {
            addCriterion("CertificateLevel =", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelNotEqualTo(Byte value) {
            addCriterion("CertificateLevel <>", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelGreaterThan(Byte value) {
            addCriterion("CertificateLevel >", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("CertificateLevel >=", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelLessThan(Byte value) {
            addCriterion("CertificateLevel <", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelLessThanOrEqualTo(Byte value) {
            addCriterion("CertificateLevel <=", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelIn(List<Byte> values) {
            addCriterion("CertificateLevel in", values, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelNotIn(List<Byte> values) {
            addCriterion("CertificateLevel not in", values, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelBetween(Byte value1, Byte value2) {
            addCriterion("CertificateLevel between", value1, value2, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("CertificateLevel not between", value1, value2, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionIsNull() {
            addCriterion("ReviewIstitution is null");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionIsNotNull() {
            addCriterion("ReviewIstitution is not null");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionEqualTo(String value) {
            addCriterion("ReviewIstitution =", value, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionNotEqualTo(String value) {
            addCriterion("ReviewIstitution <>", value, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionGreaterThan(String value) {
            addCriterion("ReviewIstitution >", value, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("ReviewIstitution >=", value, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionLessThan(String value) {
            addCriterion("ReviewIstitution <", value, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionLessThanOrEqualTo(String value) {
            addCriterion("ReviewIstitution <=", value, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionLike(String value) {
            addCriterion("ReviewIstitution like", value, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionNotLike(String value) {
            addCriterion("ReviewIstitution not like", value, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionIn(List<String> values) {
            addCriterion("ReviewIstitution in", values, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionNotIn(List<String> values) {
            addCriterion("ReviewIstitution not in", values, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionBetween(String value1, String value2) {
            addCriterion("ReviewIstitution between", value1, value2, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewIstitutionNotBetween(String value1, String value2) {
            addCriterion("ReviewIstitution not between", value1, value2, "reviewIstitution");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNull() {
            addCriterion("ReviewTime is null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNotNull() {
            addCriterion("ReviewTime is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ReviewTime =", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ReviewTime <>", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ReviewTime >", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ReviewTime >=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThan(Date value) {
            addCriterionForJDBCDate("ReviewTime <", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ReviewTime <=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ReviewTime in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ReviewTime not in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ReviewTime between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ReviewTime not between", value1, value2, "reviewTime");
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