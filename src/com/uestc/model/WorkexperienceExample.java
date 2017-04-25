package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WorkexperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkexperienceExample() {
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

        public Criteria andWorkExperienceIdIsNull() {
            addCriterion("WorkExperienceId is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdIsNotNull() {
            addCriterion("WorkExperienceId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdEqualTo(Integer value) {
            addCriterion("WorkExperienceId =", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdNotEqualTo(Integer value) {
            addCriterion("WorkExperienceId <>", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdGreaterThan(Integer value) {
            addCriterion("WorkExperienceId >", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WorkExperienceId >=", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdLessThan(Integer value) {
            addCriterion("WorkExperienceId <", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdLessThanOrEqualTo(Integer value) {
            addCriterion("WorkExperienceId <=", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdIn(List<Integer> values) {
            addCriterion("WorkExperienceId in", values, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdNotIn(List<Integer> values) {
            addCriterion("WorkExperienceId not in", values, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdBetween(Integer value1, Integer value2) {
            addCriterion("WorkExperienceId between", value1, value2, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WorkExperienceId not between", value1, value2, "workExperienceId");
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

        public Criteria andClinicWorkUnitIsNull() {
            addCriterion("ClinicWorkUnit is null");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitIsNotNull() {
            addCriterion("ClinicWorkUnit is not null");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitEqualTo(String value) {
            addCriterion("ClinicWorkUnit =", value, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitNotEqualTo(String value) {
            addCriterion("ClinicWorkUnit <>", value, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitGreaterThan(String value) {
            addCriterion("ClinicWorkUnit >", value, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ClinicWorkUnit >=", value, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitLessThan(String value) {
            addCriterion("ClinicWorkUnit <", value, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitLessThanOrEqualTo(String value) {
            addCriterion("ClinicWorkUnit <=", value, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitLike(String value) {
            addCriterion("ClinicWorkUnit like", value, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitNotLike(String value) {
            addCriterion("ClinicWorkUnit not like", value, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitIn(List<String> values) {
            addCriterion("ClinicWorkUnit in", values, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitNotIn(List<String> values) {
            addCriterion("ClinicWorkUnit not in", values, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitBetween(String value1, String value2) {
            addCriterion("ClinicWorkUnit between", value1, value2, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andClinicWorkUnitNotBetween(String value1, String value2) {
            addCriterion("ClinicWorkUnit not between", value1, value2, "clinicWorkUnit");
            return (Criteria) this;
        }

        public Criteria andWorkPostIsNull() {
            addCriterion("WorkPost is null");
            return (Criteria) this;
        }

        public Criteria andWorkPostIsNotNull() {
            addCriterion("WorkPost is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPostEqualTo(String value) {
            addCriterion("WorkPost =", value, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostNotEqualTo(String value) {
            addCriterion("WorkPost <>", value, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostGreaterThan(String value) {
            addCriterion("WorkPost >", value, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostGreaterThanOrEqualTo(String value) {
            addCriterion("WorkPost >=", value, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostLessThan(String value) {
            addCriterion("WorkPost <", value, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostLessThanOrEqualTo(String value) {
            addCriterion("WorkPost <=", value, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostLike(String value) {
            addCriterion("WorkPost like", value, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostNotLike(String value) {
            addCriterion("WorkPost not like", value, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostIn(List<String> values) {
            addCriterion("WorkPost in", values, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostNotIn(List<String> values) {
            addCriterion("WorkPost not in", values, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostBetween(String value1, String value2) {
            addCriterion("WorkPost between", value1, value2, "workPost");
            return (Criteria) this;
        }

        public Criteria andWorkPostNotBetween(String value1, String value2) {
            addCriterion("WorkPost not between", value1, value2, "workPost");
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

        public Criteria andEndTimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("EndTime =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EndTime <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EndTime >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EndTime >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("EndTime <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EndTime <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("EndTime in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EndTime not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EndTime between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EndTime not between", value1, value2, "endTime");
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