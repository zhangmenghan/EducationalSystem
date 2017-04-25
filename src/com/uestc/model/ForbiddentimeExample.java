package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForbiddentimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForbiddentimeExample() {
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

        public Criteria andForbiddenTimeIdIsNull() {
            addCriterion("ForbiddenTimeId is null");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdIsNotNull() {
            addCriterion("ForbiddenTimeId is not null");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdEqualTo(Integer value) {
            addCriterion("ForbiddenTimeId =", value, "forbiddenTimeId");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdNotEqualTo(Integer value) {
            addCriterion("ForbiddenTimeId <>", value, "forbiddenTimeId");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdGreaterThan(Integer value) {
            addCriterion("ForbiddenTimeId >", value, "forbiddenTimeId");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ForbiddenTimeId >=", value, "forbiddenTimeId");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdLessThan(Integer value) {
            addCriterion("ForbiddenTimeId <", value, "forbiddenTimeId");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ForbiddenTimeId <=", value, "forbiddenTimeId");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdIn(List<Integer> values) {
            addCriterion("ForbiddenTimeId in", values, "forbiddenTimeId");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdNotIn(List<Integer> values) {
            addCriterion("ForbiddenTimeId not in", values, "forbiddenTimeId");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("ForbiddenTimeId between", value1, value2, "forbiddenTimeId");
            return (Criteria) this;
        }

        public Criteria andForbiddenTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ForbiddenTimeId not between", value1, value2, "forbiddenTimeId");
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

        public Criteria andApplicationTermIsNull() {
            addCriterion("ApplicationTerm is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTermIsNotNull() {
            addCriterion("ApplicationTerm is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTermEqualTo(String value) {
            addCriterion("ApplicationTerm =", value, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermNotEqualTo(String value) {
            addCriterion("ApplicationTerm <>", value, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermGreaterThan(String value) {
            addCriterion("ApplicationTerm >", value, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermGreaterThanOrEqualTo(String value) {
            addCriterion("ApplicationTerm >=", value, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermLessThan(String value) {
            addCriterion("ApplicationTerm <", value, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermLessThanOrEqualTo(String value) {
            addCriterion("ApplicationTerm <=", value, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermLike(String value) {
            addCriterion("ApplicationTerm like", value, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermNotLike(String value) {
            addCriterion("ApplicationTerm not like", value, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermIn(List<String> values) {
            addCriterion("ApplicationTerm in", values, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermNotIn(List<String> values) {
            addCriterion("ApplicationTerm not in", values, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermBetween(String value1, String value2) {
            addCriterion("ApplicationTerm between", value1, value2, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationTermNotBetween(String value1, String value2) {
            addCriterion("ApplicationTerm not between", value1, value2, "applicationTerm");
            return (Criteria) this;
        }

        public Criteria andApplicationDayIsNull() {
            addCriterion("ApplicationDay is null");
            return (Criteria) this;
        }

        public Criteria andApplicationDayIsNotNull() {
            addCriterion("ApplicationDay is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationDayEqualTo(Byte value) {
            addCriterion("ApplicationDay =", value, "applicationDay");
            return (Criteria) this;
        }

        public Criteria andApplicationDayNotEqualTo(Byte value) {
            addCriterion("ApplicationDay <>", value, "applicationDay");
            return (Criteria) this;
        }

        public Criteria andApplicationDayGreaterThan(Byte value) {
            addCriterion("ApplicationDay >", value, "applicationDay");
            return (Criteria) this;
        }

        public Criteria andApplicationDayGreaterThanOrEqualTo(Byte value) {
            addCriterion("ApplicationDay >=", value, "applicationDay");
            return (Criteria) this;
        }

        public Criteria andApplicationDayLessThan(Byte value) {
            addCriterion("ApplicationDay <", value, "applicationDay");
            return (Criteria) this;
        }

        public Criteria andApplicationDayLessThanOrEqualTo(Byte value) {
            addCriterion("ApplicationDay <=", value, "applicationDay");
            return (Criteria) this;
        }

        public Criteria andApplicationDayIn(List<Byte> values) {
            addCriterion("ApplicationDay in", values, "applicationDay");
            return (Criteria) this;
        }

        public Criteria andApplicationDayNotIn(List<Byte> values) {
            addCriterion("ApplicationDay not in", values, "applicationDay");
            return (Criteria) this;
        }

        public Criteria andApplicationDayBetween(Byte value1, Byte value2) {
            addCriterion("ApplicationDay between", value1, value2, "applicationDay");
            return (Criteria) this;
        }

        public Criteria andApplicationDayNotBetween(Byte value1, Byte value2) {
            addCriterion("ApplicationDay not between", value1, value2, "applicationDay");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNull() {
            addCriterion("AuditType is null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNotNull() {
            addCriterion("AuditType is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeEqualTo(Byte value) {
            addCriterion("AuditType =", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotEqualTo(Byte value) {
            addCriterion("AuditType <>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThan(Byte value) {
            addCriterion("AuditType >", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("AuditType >=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThan(Byte value) {
            addCriterion("AuditType <", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThanOrEqualTo(Byte value) {
            addCriterion("AuditType <=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIn(List<Byte> values) {
            addCriterion("AuditType in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotIn(List<Byte> values) {
            addCriterion("AuditType not in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeBetween(Byte value1, Byte value2) {
            addCriterion("AuditType between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("AuditType not between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNull() {
            addCriterion("ApplicationTime is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNotNull() {
            addCriterion("ApplicationTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeEqualTo(Date value) {
            addCriterion("ApplicationTime =", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotEqualTo(Date value) {
            addCriterion("ApplicationTime <>", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThan(Date value) {
            addCriterion("ApplicationTime >", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ApplicationTime >=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThan(Date value) {
            addCriterion("ApplicationTime <", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThanOrEqualTo(Date value) {
            addCriterion("ApplicationTime <=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIn(List<Date> values) {
            addCriterion("ApplicationTime in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotIn(List<Date> values) {
            addCriterion("ApplicationTime not in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeBetween(Date value1, Date value2) {
            addCriterion("ApplicationTime between", value1, value2, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotBetween(Date value1, Date value2) {
            addCriterion("ApplicationTime not between", value1, value2, "applicationTime");
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