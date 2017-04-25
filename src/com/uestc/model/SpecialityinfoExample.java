package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class SpecialityinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecialityinfoExample() {
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

        public Criteria andSpecialityIdIsNull() {
            addCriterion("SpecialityId is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdIsNotNull() {
            addCriterion("SpecialityId is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdEqualTo(String value) {
            addCriterion("SpecialityId =", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdNotEqualTo(String value) {
            addCriterion("SpecialityId <>", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdGreaterThan(String value) {
            addCriterion("SpecialityId >", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdGreaterThanOrEqualTo(String value) {
            addCriterion("SpecialityId >=", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdLessThan(String value) {
            addCriterion("SpecialityId <", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdLessThanOrEqualTo(String value) {
            addCriterion("SpecialityId <=", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdLike(String value) {
            addCriterion("SpecialityId like", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdNotLike(String value) {
            addCriterion("SpecialityId not like", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdIn(List<String> values) {
            addCriterion("SpecialityId in", values, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdNotIn(List<String> values) {
            addCriterion("SpecialityId not in", values, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdBetween(String value1, String value2) {
            addCriterion("SpecialityId between", value1, value2, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdNotBetween(String value1, String value2) {
            addCriterion("SpecialityId not between", value1, value2, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameIsNull() {
            addCriterion("SpecialityName is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameIsNotNull() {
            addCriterion("SpecialityName is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameEqualTo(String value) {
            addCriterion("SpecialityName =", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotEqualTo(String value) {
            addCriterion("SpecialityName <>", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameGreaterThan(String value) {
            addCriterion("SpecialityName >", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameGreaterThanOrEqualTo(String value) {
            addCriterion("SpecialityName >=", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameLessThan(String value) {
            addCriterion("SpecialityName <", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameLessThanOrEqualTo(String value) {
            addCriterion("SpecialityName <=", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameLike(String value) {
            addCriterion("SpecialityName like", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotLike(String value) {
            addCriterion("SpecialityName not like", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameIn(List<String> values) {
            addCriterion("SpecialityName in", values, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotIn(List<String> values) {
            addCriterion("SpecialityName not in", values, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameBetween(String value1, String value2) {
            addCriterion("SpecialityName between", value1, value2, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotBetween(String value1, String value2) {
            addCriterion("SpecialityName not between", value1, value2, "specialityName");
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