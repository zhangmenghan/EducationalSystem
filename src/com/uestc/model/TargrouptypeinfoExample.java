package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class TargrouptypeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TargrouptypeinfoExample() {
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

        public Criteria andTARGroupTypeIdIsNull() {
            addCriterion("TARGroupTypeId is null");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdIsNotNull() {
            addCriterion("TARGroupTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdEqualTo(Integer value) {
            addCriterion("TARGroupTypeId =", value, "TARGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdNotEqualTo(Integer value) {
            addCriterion("TARGroupTypeId <>", value, "TARGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdGreaterThan(Integer value) {
            addCriterion("TARGroupTypeId >", value, "TARGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TARGroupTypeId >=", value, "TARGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdLessThan(Integer value) {
            addCriterion("TARGroupTypeId <", value, "TARGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TARGroupTypeId <=", value, "TARGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdIn(List<Integer> values) {
            addCriterion("TARGroupTypeId in", values, "TARGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdNotIn(List<Integer> values) {
            addCriterion("TARGroupTypeId not in", values, "TARGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("TARGroupTypeId between", value1, value2, "TARGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TARGroupTypeId not between", value1, value2, "TARGroupTypeId");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameIsNull() {
            addCriterion("TARGroupTypeName is null");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameIsNotNull() {
            addCriterion("TARGroupTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameEqualTo(String value) {
            addCriterion("TARGroupTypeName =", value, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameNotEqualTo(String value) {
            addCriterion("TARGroupTypeName <>", value, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameGreaterThan(String value) {
            addCriterion("TARGroupTypeName >", value, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TARGroupTypeName >=", value, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameLessThan(String value) {
            addCriterion("TARGroupTypeName <", value, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameLessThanOrEqualTo(String value) {
            addCriterion("TARGroupTypeName <=", value, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameLike(String value) {
            addCriterion("TARGroupTypeName like", value, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameNotLike(String value) {
            addCriterion("TARGroupTypeName not like", value, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameIn(List<String> values) {
            addCriterion("TARGroupTypeName in", values, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameNotIn(List<String> values) {
            addCriterion("TARGroupTypeName not in", values, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameBetween(String value1, String value2) {
            addCriterion("TARGroupTypeName between", value1, value2, "TARGroupTypeName");
            return (Criteria) this;
        }

        public Criteria andTARGroupTypeNameNotBetween(String value1, String value2) {
            addCriterion("TARGroupTypeName not between", value1, value2, "TARGroupTypeName");
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