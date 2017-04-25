package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class TeachjournalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachjournalExample() {
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

        public Criteria andTeachJournalIdIsNull() {
            addCriterion("TeachJournalId is null");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdIsNotNull() {
            addCriterion("TeachJournalId is not null");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdEqualTo(String value) {
            addCriterion("TeachJournalId =", value, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdNotEqualTo(String value) {
            addCriterion("TeachJournalId <>", value, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdGreaterThan(String value) {
            addCriterion("TeachJournalId >", value, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdGreaterThanOrEqualTo(String value) {
            addCriterion("TeachJournalId >=", value, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdLessThan(String value) {
            addCriterion("TeachJournalId <", value, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdLessThanOrEqualTo(String value) {
            addCriterion("TeachJournalId <=", value, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdLike(String value) {
            addCriterion("TeachJournalId like", value, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdNotLike(String value) {
            addCriterion("TeachJournalId not like", value, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdIn(List<String> values) {
            addCriterion("TeachJournalId in", values, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdNotIn(List<String> values) {
            addCriterion("TeachJournalId not in", values, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdBetween(String value1, String value2) {
            addCriterion("TeachJournalId between", value1, value2, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andTeachJournalIdNotBetween(String value1, String value2) {
            addCriterion("TeachJournalId not between", value1, value2, "teachJournalId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdIsNull() {
            addCriterion("GiveLessonsDetailsId is null");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdIsNotNull() {
            addCriterion("GiveLessonsDetailsId is not null");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdEqualTo(String value) {
            addCriterion("GiveLessonsDetailsId =", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdNotEqualTo(String value) {
            addCriterion("GiveLessonsDetailsId <>", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdGreaterThan(String value) {
            addCriterion("GiveLessonsDetailsId >", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("GiveLessonsDetailsId >=", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdLessThan(String value) {
            addCriterion("GiveLessonsDetailsId <", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdLessThanOrEqualTo(String value) {
            addCriterion("GiveLessonsDetailsId <=", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdLike(String value) {
            addCriterion("GiveLessonsDetailsId like", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdNotLike(String value) {
            addCriterion("GiveLessonsDetailsId not like", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdIn(List<String> values) {
            addCriterion("GiveLessonsDetailsId in", values, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdNotIn(List<String> values) {
            addCriterion("GiveLessonsDetailsId not in", values, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdBetween(String value1, String value2) {
            addCriterion("GiveLessonsDetailsId between", value1, value2, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdNotBetween(String value1, String value2) {
            addCriterion("GiveLessonsDetailsId not between", value1, value2, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmIsNull() {
            addCriterion("TeacherConfirm is null");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmIsNotNull() {
            addCriterion("TeacherConfirm is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmEqualTo(Boolean value) {
            addCriterion("TeacherConfirm =", value, "teacherConfirm");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmNotEqualTo(Boolean value) {
            addCriterion("TeacherConfirm <>", value, "teacherConfirm");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmGreaterThan(Boolean value) {
            addCriterion("TeacherConfirm >", value, "teacherConfirm");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TeacherConfirm >=", value, "teacherConfirm");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmLessThan(Boolean value) {
            addCriterion("TeacherConfirm <", value, "teacherConfirm");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmLessThanOrEqualTo(Boolean value) {
            addCriterion("TeacherConfirm <=", value, "teacherConfirm");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmIn(List<Boolean> values) {
            addCriterion("TeacherConfirm in", values, "teacherConfirm");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmNotIn(List<Boolean> values) {
            addCriterion("TeacherConfirm not in", values, "teacherConfirm");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmBetween(Boolean value1, Boolean value2) {
            addCriterion("TeacherConfirm between", value1, value2, "teacherConfirm");
            return (Criteria) this;
        }

        public Criteria andTeacherConfirmNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TeacherConfirm not between", value1, value2, "teacherConfirm");
            return (Criteria) this;
        }

        public Criteria andExecWeekIsNull() {
            addCriterion("ExecWeek is null");
            return (Criteria) this;
        }

        public Criteria andExecWeekIsNotNull() {
            addCriterion("ExecWeek is not null");
            return (Criteria) this;
        }

        public Criteria andExecWeekEqualTo(Byte value) {
            addCriterion("ExecWeek =", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekNotEqualTo(Byte value) {
            addCriterion("ExecWeek <>", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekGreaterThan(Byte value) {
            addCriterion("ExecWeek >", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekGreaterThanOrEqualTo(Byte value) {
            addCriterion("ExecWeek >=", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekLessThan(Byte value) {
            addCriterion("ExecWeek <", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekLessThanOrEqualTo(Byte value) {
            addCriterion("ExecWeek <=", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekIn(List<Byte> values) {
            addCriterion("ExecWeek in", values, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekNotIn(List<Byte> values) {
            addCriterion("ExecWeek not in", values, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekBetween(Byte value1, Byte value2) {
            addCriterion("ExecWeek between", value1, value2, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekNotBetween(Byte value1, Byte value2) {
            addCriterion("ExecWeek not between", value1, value2, "execWeek");
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