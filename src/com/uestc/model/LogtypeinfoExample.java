package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class LogtypeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogtypeinfoExample() {
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

        public Criteria andLogTypeIdIsNull() {
            addCriterion("LogTypeId is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdIsNotNull() {
            addCriterion("LogTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdEqualTo(Integer value) {
            addCriterion("LogTypeId =", value, "logTypeId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdNotEqualTo(Integer value) {
            addCriterion("LogTypeId <>", value, "logTypeId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdGreaterThan(Integer value) {
            addCriterion("LogTypeId >", value, "logTypeId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LogTypeId >=", value, "logTypeId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdLessThan(Integer value) {
            addCriterion("LogTypeId <", value, "logTypeId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("LogTypeId <=", value, "logTypeId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdIn(List<Integer> values) {
            addCriterion("LogTypeId in", values, "logTypeId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdNotIn(List<Integer> values) {
            addCriterion("LogTypeId not in", values, "logTypeId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("LogTypeId between", value1, value2, "logTypeId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LogTypeId not between", value1, value2, "logTypeId");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameIsNull() {
            addCriterion("LogTypeName is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameIsNotNull() {
            addCriterion("LogTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameEqualTo(String value) {
            addCriterion("LogTypeName =", value, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameNotEqualTo(String value) {
            addCriterion("LogTypeName <>", value, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameGreaterThan(String value) {
            addCriterion("LogTypeName >", value, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("LogTypeName >=", value, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameLessThan(String value) {
            addCriterion("LogTypeName <", value, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameLessThanOrEqualTo(String value) {
            addCriterion("LogTypeName <=", value, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameLike(String value) {
            addCriterion("LogTypeName like", value, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameNotLike(String value) {
            addCriterion("LogTypeName not like", value, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameIn(List<String> values) {
            addCriterion("LogTypeName in", values, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameNotIn(List<String> values) {
            addCriterion("LogTypeName not in", values, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameBetween(String value1, String value2) {
            addCriterion("LogTypeName between", value1, value2, "logTypeName");
            return (Criteria) this;
        }

        public Criteria andLogTypeNameNotBetween(String value1, String value2) {
            addCriterion("LogTypeName not between", value1, value2, "logTypeName");
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