package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class TimeandplaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeandplaceExample() {
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

        public Criteria andTimeAndPlaceIdIsNull() {
            addCriterion("TimeAndPlaceId is null");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdIsNotNull() {
            addCriterion("TimeAndPlaceId is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdEqualTo(String value) {
            addCriterion("TimeAndPlaceId =", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdNotEqualTo(String value) {
            addCriterion("TimeAndPlaceId <>", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdGreaterThan(String value) {
            addCriterion("TimeAndPlaceId >", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("TimeAndPlaceId >=", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdLessThan(String value) {
            addCriterion("TimeAndPlaceId <", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdLessThanOrEqualTo(String value) {
            addCriterion("TimeAndPlaceId <=", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdLike(String value) {
            addCriterion("TimeAndPlaceId like", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdNotLike(String value) {
            addCriterion("TimeAndPlaceId not like", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdIn(List<String> values) {
            addCriterion("TimeAndPlaceId in", values, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdNotIn(List<String> values) {
            addCriterion("TimeAndPlaceId not in", values, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdBetween(String value1, String value2) {
            addCriterion("TimeAndPlaceId between", value1, value2, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdNotBetween(String value1, String value2) {
            addCriterion("TimeAndPlaceId not between", value1, value2, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("Year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("Year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("Year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("Year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("Year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("Year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("Year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("Year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("Year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("Year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("Year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("Year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("Year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andSemesterIsNull() {
            addCriterion("Semester is null");
            return (Criteria) this;
        }

        public Criteria andSemesterIsNotNull() {
            addCriterion("Semester is not null");
            return (Criteria) this;
        }

        public Criteria andSemesterEqualTo(Byte value) {
            addCriterion("Semester =", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotEqualTo(Byte value) {
            addCriterion("Semester <>", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThan(Byte value) {
            addCriterion("Semester >", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThanOrEqualTo(Byte value) {
            addCriterion("Semester >=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThan(Byte value) {
            addCriterion("Semester <", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThanOrEqualTo(Byte value) {
            addCriterion("Semester <=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterIn(List<Byte> values) {
            addCriterion("Semester in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotIn(List<Byte> values) {
            addCriterion("Semester not in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterBetween(Byte value1, Byte value2) {
            addCriterion("Semester between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotBetween(Byte value1, Byte value2) {
            addCriterion("Semester not between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("Week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("Week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(Byte value) {
            addCriterion("Week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(Byte value) {
            addCriterion("Week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(Byte value) {
            addCriterion("Week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(Byte value) {
            addCriterion("Week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(Byte value) {
            addCriterion("Week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(Byte value) {
            addCriterion("Week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<Byte> values) {
            addCriterion("Week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<Byte> values) {
            addCriterion("Week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(Byte value1, Byte value2) {
            addCriterion("Week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(Byte value1, Byte value2) {
            addCriterion("Week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekdaysIsNull() {
            addCriterion("Weekdays is null");
            return (Criteria) this;
        }

        public Criteria andWeekdaysIsNotNull() {
            addCriterion("Weekdays is not null");
            return (Criteria) this;
        }

        public Criteria andWeekdaysEqualTo(Byte value) {
            addCriterion("Weekdays =", value, "weekdays");
            return (Criteria) this;
        }

        public Criteria andWeekdaysNotEqualTo(Byte value) {
            addCriterion("Weekdays <>", value, "weekdays");
            return (Criteria) this;
        }

        public Criteria andWeekdaysGreaterThan(Byte value) {
            addCriterion("Weekdays >", value, "weekdays");
            return (Criteria) this;
        }

        public Criteria andWeekdaysGreaterThanOrEqualTo(Byte value) {
            addCriterion("Weekdays >=", value, "weekdays");
            return (Criteria) this;
        }

        public Criteria andWeekdaysLessThan(Byte value) {
            addCriterion("Weekdays <", value, "weekdays");
            return (Criteria) this;
        }

        public Criteria andWeekdaysLessThanOrEqualTo(Byte value) {
            addCriterion("Weekdays <=", value, "weekdays");
            return (Criteria) this;
        }

        public Criteria andWeekdaysIn(List<Byte> values) {
            addCriterion("Weekdays in", values, "weekdays");
            return (Criteria) this;
        }

        public Criteria andWeekdaysNotIn(List<Byte> values) {
            addCriterion("Weekdays not in", values, "weekdays");
            return (Criteria) this;
        }

        public Criteria andWeekdaysBetween(Byte value1, Byte value2) {
            addCriterion("Weekdays between", value1, value2, "weekdays");
            return (Criteria) this;
        }

        public Criteria andWeekdaysNotBetween(Byte value1, Byte value2) {
            addCriterion("Weekdays not between", value1, value2, "weekdays");
            return (Criteria) this;
        }

        public Criteria andLessonNumIsNull() {
            addCriterion("LessonNum is null");
            return (Criteria) this;
        }

        public Criteria andLessonNumIsNotNull() {
            addCriterion("LessonNum is not null");
            return (Criteria) this;
        }

        public Criteria andLessonNumEqualTo(Byte value) {
            addCriterion("LessonNum =", value, "lessonNum");
            return (Criteria) this;
        }

        public Criteria andLessonNumNotEqualTo(Byte value) {
            addCriterion("LessonNum <>", value, "lessonNum");
            return (Criteria) this;
        }

        public Criteria andLessonNumGreaterThan(Byte value) {
            addCriterion("LessonNum >", value, "lessonNum");
            return (Criteria) this;
        }

        public Criteria andLessonNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("LessonNum >=", value, "lessonNum");
            return (Criteria) this;
        }

        public Criteria andLessonNumLessThan(Byte value) {
            addCriterion("LessonNum <", value, "lessonNum");
            return (Criteria) this;
        }

        public Criteria andLessonNumLessThanOrEqualTo(Byte value) {
            addCriterion("LessonNum <=", value, "lessonNum");
            return (Criteria) this;
        }

        public Criteria andLessonNumIn(List<Byte> values) {
            addCriterion("LessonNum in", values, "lessonNum");
            return (Criteria) this;
        }

        public Criteria andLessonNumNotIn(List<Byte> values) {
            addCriterion("LessonNum not in", values, "lessonNum");
            return (Criteria) this;
        }

        public Criteria andLessonNumBetween(Byte value1, Byte value2) {
            addCriterion("LessonNum between", value1, value2, "lessonNum");
            return (Criteria) this;
        }

        public Criteria andLessonNumNotBetween(Byte value1, Byte value2) {
            addCriterion("LessonNum not between", value1, value2, "lessonNum");
            return (Criteria) this;
        }

        public Criteria andLessonNumberIsNull() {
            addCriterion("LessonNumber is null");
            return (Criteria) this;
        }

        public Criteria andLessonNumberIsNotNull() {
            addCriterion("LessonNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLessonNumberEqualTo(Byte value) {
            addCriterion("LessonNumber =", value, "lessonNumber");
            return (Criteria) this;
        }

        public Criteria andLessonNumberNotEqualTo(Byte value) {
            addCriterion("LessonNumber <>", value, "lessonNumber");
            return (Criteria) this;
        }

        public Criteria andLessonNumberGreaterThan(Byte value) {
            addCriterion("LessonNumber >", value, "lessonNumber");
            return (Criteria) this;
        }

        public Criteria andLessonNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("LessonNumber >=", value, "lessonNumber");
            return (Criteria) this;
        }

        public Criteria andLessonNumberLessThan(Byte value) {
            addCriterion("LessonNumber <", value, "lessonNumber");
            return (Criteria) this;
        }

        public Criteria andLessonNumberLessThanOrEqualTo(Byte value) {
            addCriterion("LessonNumber <=", value, "lessonNumber");
            return (Criteria) this;
        }

        public Criteria andLessonNumberIn(List<Byte> values) {
            addCriterion("LessonNumber in", values, "lessonNumber");
            return (Criteria) this;
        }

        public Criteria andLessonNumberNotIn(List<Byte> values) {
            addCriterion("LessonNumber not in", values, "lessonNumber");
            return (Criteria) this;
        }

        public Criteria andLessonNumberBetween(Byte value1, Byte value2) {
            addCriterion("LessonNumber between", value1, value2, "lessonNumber");
            return (Criteria) this;
        }

        public Criteria andLessonNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("LessonNumber not between", value1, value2, "lessonNumber");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNull() {
            addCriterion("ClassroomId is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("ClassroomId is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(String value) {
            addCriterion("ClassroomId =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(String value) {
            addCriterion("ClassroomId <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(String value) {
            addCriterion("ClassroomId >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(String value) {
            addCriterion("ClassroomId >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(String value) {
            addCriterion("ClassroomId <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(String value) {
            addCriterion("ClassroomId <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLike(String value) {
            addCriterion("ClassroomId like", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotLike(String value) {
            addCriterion("ClassroomId not like", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<String> values) {
            addCriterion("ClassroomId in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<String> values) {
            addCriterion("ClassroomId not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(String value1, String value2) {
            addCriterion("ClassroomId between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(String value1, String value2) {
            addCriterion("ClassroomId not between", value1, value2, "classroomId");
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