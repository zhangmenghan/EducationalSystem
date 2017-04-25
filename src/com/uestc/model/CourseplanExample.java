package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class CourseplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseplanExample() {
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

        public Criteria andCoursePlanIdIsNull() {
            addCriterion("CoursePlanId is null");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdIsNotNull() {
            addCriterion("CoursePlanId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdEqualTo(String value) {
            addCriterion("CoursePlanId =", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdNotEqualTo(String value) {
            addCriterion("CoursePlanId <>", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdGreaterThan(String value) {
            addCriterion("CoursePlanId >", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("CoursePlanId >=", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdLessThan(String value) {
            addCriterion("CoursePlanId <", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdLessThanOrEqualTo(String value) {
            addCriterion("CoursePlanId <=", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdLike(String value) {
            addCriterion("CoursePlanId like", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdNotLike(String value) {
            addCriterion("CoursePlanId not like", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdIn(List<String> values) {
            addCriterion("CoursePlanId in", values, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdNotIn(List<String> values) {
            addCriterion("CoursePlanId not in", values, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdBetween(String value1, String value2) {
            addCriterion("CoursePlanId between", value1, value2, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdNotBetween(String value1, String value2) {
            addCriterion("CoursePlanId not between", value1, value2, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdIsNull() {
            addCriterion("TeachPlanId is null");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdIsNotNull() {
            addCriterion("TeachPlanId is not null");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdEqualTo(String value) {
            addCriterion("TeachPlanId =", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdNotEqualTo(String value) {
            addCriterion("TeachPlanId <>", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdGreaterThan(String value) {
            addCriterion("TeachPlanId >", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("TeachPlanId >=", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdLessThan(String value) {
            addCriterion("TeachPlanId <", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdLessThanOrEqualTo(String value) {
            addCriterion("TeachPlanId <=", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdLike(String value) {
            addCriterion("TeachPlanId like", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdNotLike(String value) {
            addCriterion("TeachPlanId not like", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdIn(List<String> values) {
            addCriterion("TeachPlanId in", values, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdNotIn(List<String> values) {
            addCriterion("TeachPlanId not in", values, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdBetween(String value1, String value2) {
            addCriterion("TeachPlanId between", value1, value2, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdNotBetween(String value1, String value2) {
            addCriterion("TeachPlanId not between", value1, value2, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andExecSemsterIsNull() {
            addCriterion("ExecSemster is null");
            return (Criteria) this;
        }

        public Criteria andExecSemsterIsNotNull() {
            addCriterion("ExecSemster is not null");
            return (Criteria) this;
        }

        public Criteria andExecSemsterEqualTo(Byte value) {
            addCriterion("ExecSemster =", value, "execSemster");
            return (Criteria) this;
        }

        public Criteria andExecSemsterNotEqualTo(Byte value) {
            addCriterion("ExecSemster <>", value, "execSemster");
            return (Criteria) this;
        }

        public Criteria andExecSemsterGreaterThan(Byte value) {
            addCriterion("ExecSemster >", value, "execSemster");
            return (Criteria) this;
        }

        public Criteria andExecSemsterGreaterThanOrEqualTo(Byte value) {
            addCriterion("ExecSemster >=", value, "execSemster");
            return (Criteria) this;
        }

        public Criteria andExecSemsterLessThan(Byte value) {
            addCriterion("ExecSemster <", value, "execSemster");
            return (Criteria) this;
        }

        public Criteria andExecSemsterLessThanOrEqualTo(Byte value) {
            addCriterion("ExecSemster <=", value, "execSemster");
            return (Criteria) this;
        }

        public Criteria andExecSemsterIn(List<Byte> values) {
            addCriterion("ExecSemster in", values, "execSemster");
            return (Criteria) this;
        }

        public Criteria andExecSemsterNotIn(List<Byte> values) {
            addCriterion("ExecSemster not in", values, "execSemster");
            return (Criteria) this;
        }

        public Criteria andExecSemsterBetween(Byte value1, Byte value2) {
            addCriterion("ExecSemster between", value1, value2, "execSemster");
            return (Criteria) this;
        }

        public Criteria andExecSemsterNotBetween(Byte value1, Byte value2) {
            addCriterion("ExecSemster not between", value1, value2, "execSemster");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodIsNull() {
            addCriterion("ExecWeekPeriod is null");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodIsNotNull() {
            addCriterion("ExecWeekPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodEqualTo(Byte value) {
            addCriterion("ExecWeekPeriod =", value, "execWeekPeriod");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodNotEqualTo(Byte value) {
            addCriterion("ExecWeekPeriod <>", value, "execWeekPeriod");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodGreaterThan(Byte value) {
            addCriterion("ExecWeekPeriod >", value, "execWeekPeriod");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodGreaterThanOrEqualTo(Byte value) {
            addCriterion("ExecWeekPeriod >=", value, "execWeekPeriod");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodLessThan(Byte value) {
            addCriterion("ExecWeekPeriod <", value, "execWeekPeriod");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodLessThanOrEqualTo(Byte value) {
            addCriterion("ExecWeekPeriod <=", value, "execWeekPeriod");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodIn(List<Byte> values) {
            addCriterion("ExecWeekPeriod in", values, "execWeekPeriod");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodNotIn(List<Byte> values) {
            addCriterion("ExecWeekPeriod not in", values, "execWeekPeriod");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodBetween(Byte value1, Byte value2) {
            addCriterion("ExecWeekPeriod between", value1, value2, "execWeekPeriod");
            return (Criteria) this;
        }

        public Criteria andExecWeekPeriodNotBetween(Byte value1, Byte value2) {
            addCriterion("ExecWeekPeriod not between", value1, value2, "execWeekPeriod");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumIsNull() {
            addCriterion("StartWeekNum is null");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumIsNotNull() {
            addCriterion("StartWeekNum is not null");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumEqualTo(Byte value) {
            addCriterion("StartWeekNum =", value, "startWeekNum");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumNotEqualTo(Byte value) {
            addCriterion("StartWeekNum <>", value, "startWeekNum");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumGreaterThan(Byte value) {
            addCriterion("StartWeekNum >", value, "startWeekNum");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("StartWeekNum >=", value, "startWeekNum");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumLessThan(Byte value) {
            addCriterion("StartWeekNum <", value, "startWeekNum");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumLessThanOrEqualTo(Byte value) {
            addCriterion("StartWeekNum <=", value, "startWeekNum");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumIn(List<Byte> values) {
            addCriterion("StartWeekNum in", values, "startWeekNum");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumNotIn(List<Byte> values) {
            addCriterion("StartWeekNum not in", values, "startWeekNum");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumBetween(Byte value1, Byte value2) {
            addCriterion("StartWeekNum between", value1, value2, "startWeekNum");
            return (Criteria) this;
        }

        public Criteria andStartWeekNumNotBetween(Byte value1, Byte value2) {
            addCriterion("StartWeekNum not between", value1, value2, "startWeekNum");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumIsNull() {
            addCriterion("PersistWeekNum is null");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumIsNotNull() {
            addCriterion("PersistWeekNum is not null");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumEqualTo(Byte value) {
            addCriterion("PersistWeekNum =", value, "persistWeekNum");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumNotEqualTo(Byte value) {
            addCriterion("PersistWeekNum <>", value, "persistWeekNum");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumGreaterThan(Byte value) {
            addCriterion("PersistWeekNum >", value, "persistWeekNum");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("PersistWeekNum >=", value, "persistWeekNum");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumLessThan(Byte value) {
            addCriterion("PersistWeekNum <", value, "persistWeekNum");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumLessThanOrEqualTo(Byte value) {
            addCriterion("PersistWeekNum <=", value, "persistWeekNum");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumIn(List<Byte> values) {
            addCriterion("PersistWeekNum in", values, "persistWeekNum");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumNotIn(List<Byte> values) {
            addCriterion("PersistWeekNum not in", values, "persistWeekNum");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumBetween(Byte value1, Byte value2) {
            addCriterion("PersistWeekNum between", value1, value2, "persistWeekNum");
            return (Criteria) this;
        }

        public Criteria andPersistWeekNumNotBetween(Byte value1, Byte value2) {
            addCriterion("PersistWeekNum not between", value1, value2, "persistWeekNum");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeIsNull() {
            addCriterion("AssessmentType is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeIsNotNull() {
            addCriterion("AssessmentType is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeEqualTo(Byte value) {
            addCriterion("AssessmentType =", value, "assessmentType");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeNotEqualTo(Byte value) {
            addCriterion("AssessmentType <>", value, "assessmentType");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeGreaterThan(Byte value) {
            addCriterion("AssessmentType >", value, "assessmentType");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("AssessmentType >=", value, "assessmentType");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeLessThan(Byte value) {
            addCriterion("AssessmentType <", value, "assessmentType");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeLessThanOrEqualTo(Byte value) {
            addCriterion("AssessmentType <=", value, "assessmentType");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeIn(List<Byte> values) {
            addCriterion("AssessmentType in", values, "assessmentType");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeNotIn(List<Byte> values) {
            addCriterion("AssessmentType not in", values, "assessmentType");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeBetween(Byte value1, Byte value2) {
            addCriterion("AssessmentType between", value1, value2, "assessmentType");
            return (Criteria) this;
        }

        public Criteria andAssessmentTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("AssessmentType not between", value1, value2, "assessmentType");
            return (Criteria) this;
        }

        public Criteria andIsExecuteIsNull() {
            addCriterion("IsExecute is null");
            return (Criteria) this;
        }

        public Criteria andIsExecuteIsNotNull() {
            addCriterion("IsExecute is not null");
            return (Criteria) this;
        }

        public Criteria andIsExecuteEqualTo(Byte value) {
            addCriterion("IsExecute =", value, "isExecute");
            return (Criteria) this;
        }

        public Criteria andIsExecuteNotEqualTo(Byte value) {
            addCriterion("IsExecute <>", value, "isExecute");
            return (Criteria) this;
        }

        public Criteria andIsExecuteGreaterThan(Byte value) {
            addCriterion("IsExecute >", value, "isExecute");
            return (Criteria) this;
        }

        public Criteria andIsExecuteGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsExecute >=", value, "isExecute");
            return (Criteria) this;
        }

        public Criteria andIsExecuteLessThan(Byte value) {
            addCriterion("IsExecute <", value, "isExecute");
            return (Criteria) this;
        }

        public Criteria andIsExecuteLessThanOrEqualTo(Byte value) {
            addCriterion("IsExecute <=", value, "isExecute");
            return (Criteria) this;
        }

        public Criteria andIsExecuteIn(List<Byte> values) {
            addCriterion("IsExecute in", values, "isExecute");
            return (Criteria) this;
        }

        public Criteria andIsExecuteNotIn(List<Byte> values) {
            addCriterion("IsExecute not in", values, "isExecute");
            return (Criteria) this;
        }

        public Criteria andIsExecuteBetween(Byte value1, Byte value2) {
            addCriterion("IsExecute between", value1, value2, "isExecute");
            return (Criteria) this;
        }

        public Criteria andIsExecuteNotBetween(Byte value1, Byte value2) {
            addCriterion("IsExecute not between", value1, value2, "isExecute");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeIsNull() {
            addCriterion("CourseArrangeType is null");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeIsNotNull() {
            addCriterion("CourseArrangeType is not null");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeEqualTo(Byte value) {
            addCriterion("CourseArrangeType =", value, "courseArrangeType");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeNotEqualTo(Byte value) {
            addCriterion("CourseArrangeType <>", value, "courseArrangeType");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeGreaterThan(Byte value) {
            addCriterion("CourseArrangeType >", value, "courseArrangeType");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("CourseArrangeType >=", value, "courseArrangeType");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeLessThan(Byte value) {
            addCriterion("CourseArrangeType <", value, "courseArrangeType");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeLessThanOrEqualTo(Byte value) {
            addCriterion("CourseArrangeType <=", value, "courseArrangeType");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeIn(List<Byte> values) {
            addCriterion("CourseArrangeType in", values, "courseArrangeType");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeNotIn(List<Byte> values) {
            addCriterion("CourseArrangeType not in", values, "courseArrangeType");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeBetween(Byte value1, Byte value2) {
            addCriterion("CourseArrangeType between", value1, value2, "courseArrangeType");
            return (Criteria) this;
        }

        public Criteria andCourseArrangeTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("CourseArrangeType not between", value1, value2, "courseArrangeType");
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