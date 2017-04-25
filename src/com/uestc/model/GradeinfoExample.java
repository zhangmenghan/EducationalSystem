package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class GradeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeinfoExample() {
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

        public Criteria andGradeIdIsNull() {
            addCriterion("GradeId is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("GradeId is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(String value) {
            addCriterion("GradeId =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(String value) {
            addCriterion("GradeId <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(String value) {
            addCriterion("GradeId >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("GradeId >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(String value) {
            addCriterion("GradeId <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(String value) {
            addCriterion("GradeId <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLike(String value) {
            addCriterion("GradeId like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotLike(String value) {
            addCriterion("GradeId not like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<String> values) {
            addCriterion("GradeId in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<String> values) {
            addCriterion("GradeId not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(String value1, String value2) {
            addCriterion("GradeId between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(String value1, String value2) {
            addCriterion("GradeId not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIsNull() {
            addCriterion("GradeType is null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIsNotNull() {
            addCriterion("GradeType is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeEqualTo(Byte value) {
            addCriterion("GradeType =", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotEqualTo(Byte value) {
            addCriterion("GradeType <>", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThan(Byte value) {
            addCriterion("GradeType >", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("GradeType >=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThan(Byte value) {
            addCriterion("GradeType <", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThanOrEqualTo(Byte value) {
            addCriterion("GradeType <=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIn(List<Byte> values) {
            addCriterion("GradeType in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotIn(List<Byte> values) {
            addCriterion("GradeType not in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeBetween(Byte value1, Byte value2) {
            addCriterion("GradeType between", value1, value2, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("GradeType not between", value1, value2, "gradeType");
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