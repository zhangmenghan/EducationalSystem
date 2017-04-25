package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SchooltimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchooltimeExample() {
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

        public Criteria andStartYearIsNull() {
            addCriterion("StartYear is null");
            return (Criteria) this;
        }

        public Criteria andStartYearIsNotNull() {
            addCriterion("StartYear is not null");
            return (Criteria) this;
        }

        public Criteria andStartYearEqualTo(String value) {
            addCriterion("StartYear =", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotEqualTo(String value) {
            addCriterion("StartYear <>", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearGreaterThan(String value) {
            addCriterion("StartYear >", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearGreaterThanOrEqualTo(String value) {
            addCriterion("StartYear >=", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearLessThan(String value) {
            addCriterion("StartYear <", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearLessThanOrEqualTo(String value) {
            addCriterion("StartYear <=", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearLike(String value) {
            addCriterion("StartYear like", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotLike(String value) {
            addCriterion("StartYear not like", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearIn(List<String> values) {
            addCriterion("StartYear in", values, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotIn(List<String> values) {
            addCriterion("StartYear not in", values, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearBetween(String value1, String value2) {
            addCriterion("StartYear between", value1, value2, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotBetween(String value1, String value2) {
            addCriterion("StartYear not between", value1, value2, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartSemesterIsNull() {
            addCriterion("StartSemester is null");
            return (Criteria) this;
        }

        public Criteria andStartSemesterIsNotNull() {
            addCriterion("StartSemester is not null");
            return (Criteria) this;
        }

        public Criteria andStartSemesterEqualTo(Byte value) {
            addCriterion("StartSemester =", value, "startSemester");
            return (Criteria) this;
        }

        public Criteria andStartSemesterNotEqualTo(Byte value) {
            addCriterion("StartSemester <>", value, "startSemester");
            return (Criteria) this;
        }

        public Criteria andStartSemesterGreaterThan(Byte value) {
            addCriterion("StartSemester >", value, "startSemester");
            return (Criteria) this;
        }

        public Criteria andStartSemesterGreaterThanOrEqualTo(Byte value) {
            addCriterion("StartSemester >=", value, "startSemester");
            return (Criteria) this;
        }

        public Criteria andStartSemesterLessThan(Byte value) {
            addCriterion("StartSemester <", value, "startSemester");
            return (Criteria) this;
        }

        public Criteria andStartSemesterLessThanOrEqualTo(Byte value) {
            addCriterion("StartSemester <=", value, "startSemester");
            return (Criteria) this;
        }

        public Criteria andStartSemesterIn(List<Byte> values) {
            addCriterion("StartSemester in", values, "startSemester");
            return (Criteria) this;
        }

        public Criteria andStartSemesterNotIn(List<Byte> values) {
            addCriterion("StartSemester not in", values, "startSemester");
            return (Criteria) this;
        }

        public Criteria andStartSemesterBetween(Byte value1, Byte value2) {
            addCriterion("StartSemester between", value1, value2, "startSemester");
            return (Criteria) this;
        }

        public Criteria andStartSemesterNotBetween(Byte value1, Byte value2) {
            addCriterion("StartSemester not between", value1, value2, "startSemester");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("StartTime =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("StartTime <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("StartTime >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StartTime >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("StartTime <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StartTime <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("StartTime in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("StartTime not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StartTime between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StartTime not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeIsNull() {
            addCriterion("StartEvaTeachTime is null");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeIsNotNull() {
            addCriterion("StartEvaTeachTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeEqualTo(Date value) {
            addCriterionForJDBCDate("StartEvaTeachTime =", value, "startEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("StartEvaTeachTime <>", value, "startEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("StartEvaTeachTime >", value, "startEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StartEvaTeachTime >=", value, "startEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeLessThan(Date value) {
            addCriterionForJDBCDate("StartEvaTeachTime <", value, "startEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StartEvaTeachTime <=", value, "startEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeIn(List<Date> values) {
            addCriterionForJDBCDate("StartEvaTeachTime in", values, "startEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("StartEvaTeachTime not in", values, "startEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StartEvaTeachTime between", value1, value2, "startEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andStartEvaTeachTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StartEvaTeachTime not between", value1, value2, "startEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeIsNull() {
            addCriterion("EndEvaTeachTime is null");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeIsNotNull() {
            addCriterion("EndEvaTeachTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeEqualTo(Date value) {
            addCriterionForJDBCDate("EndEvaTeachTime =", value, "endEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EndEvaTeachTime <>", value, "endEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EndEvaTeachTime >", value, "endEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EndEvaTeachTime >=", value, "endEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeLessThan(Date value) {
            addCriterionForJDBCDate("EndEvaTeachTime <", value, "endEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EndEvaTeachTime <=", value, "endEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeIn(List<Date> values) {
            addCriterionForJDBCDate("EndEvaTeachTime in", values, "endEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EndEvaTeachTime not in", values, "endEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EndEvaTeachTime between", value1, value2, "endEvaTeachTime");
            return (Criteria) this;
        }

        public Criteria andEndEvaTeachTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EndEvaTeachTime not between", value1, value2, "endEvaTeachTime");
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