package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class TargroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TargroupExample() {
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

        public Criteria andTARGroupIdIsNull() {
            addCriterion("TARGroupId is null");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdIsNotNull() {
            addCriterion("TARGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdEqualTo(String value) {
            addCriterion("TARGroupId =", value, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdNotEqualTo(String value) {
            addCriterion("TARGroupId <>", value, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdGreaterThan(String value) {
            addCriterion("TARGroupId >", value, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("TARGroupId >=", value, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdLessThan(String value) {
            addCriterion("TARGroupId <", value, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdLessThanOrEqualTo(String value) {
            addCriterion("TARGroupId <=", value, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdLike(String value) {
            addCriterion("TARGroupId like", value, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdNotLike(String value) {
            addCriterion("TARGroupId not like", value, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdIn(List<String> values) {
            addCriterion("TARGroupId in", values, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdNotIn(List<String> values) {
            addCriterion("TARGroupId not in", values, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdBetween(String value1, String value2) {
            addCriterion("TARGroupId between", value1, value2, "TARGroupId");
            return (Criteria) this;
        }

        public Criteria andTARGroupIdNotBetween(String value1, String value2) {
            addCriterion("TARGroupId not between", value1, value2, "TARGroupId");
            return (Criteria) this;
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

        public Criteria andTARGroupNameIsNull() {
            addCriterion("TARGroupName is null");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameIsNotNull() {
            addCriterion("TARGroupName is not null");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameEqualTo(String value) {
            addCriterion("TARGroupName =", value, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameNotEqualTo(String value) {
            addCriterion("TARGroupName <>", value, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameGreaterThan(String value) {
            addCriterion("TARGroupName >", value, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("TARGroupName >=", value, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameLessThan(String value) {
            addCriterion("TARGroupName <", value, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameLessThanOrEqualTo(String value) {
            addCriterion("TARGroupName <=", value, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameLike(String value) {
            addCriterion("TARGroupName like", value, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameNotLike(String value) {
            addCriterion("TARGroupName not like", value, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameIn(List<String> values) {
            addCriterion("TARGroupName in", values, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameNotIn(List<String> values) {
            addCriterion("TARGroupName not in", values, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameBetween(String value1, String value2) {
            addCriterion("TARGroupName between", value1, value2, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupNameNotBetween(String value1, String value2) {
            addCriterion("TARGroupName not between", value1, value2, "TARGroupName");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoIsNull() {
            addCriterion("TARGroupInfo is null");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoIsNotNull() {
            addCriterion("TARGroupInfo is not null");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoEqualTo(String value) {
            addCriterion("TARGroupInfo =", value, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoNotEqualTo(String value) {
            addCriterion("TARGroupInfo <>", value, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoGreaterThan(String value) {
            addCriterion("TARGroupInfo >", value, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoGreaterThanOrEqualTo(String value) {
            addCriterion("TARGroupInfo >=", value, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoLessThan(String value) {
            addCriterion("TARGroupInfo <", value, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoLessThanOrEqualTo(String value) {
            addCriterion("TARGroupInfo <=", value, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoLike(String value) {
            addCriterion("TARGroupInfo like", value, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoNotLike(String value) {
            addCriterion("TARGroupInfo not like", value, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoIn(List<String> values) {
            addCriterion("TARGroupInfo in", values, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoNotIn(List<String> values) {
            addCriterion("TARGroupInfo not in", values, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoBetween(String value1, String value2) {
            addCriterion("TARGroupInfo between", value1, value2, "TARGroupInfo");
            return (Criteria) this;
        }

        public Criteria andTARGroupInfoNotBetween(String value1, String value2) {
            addCriterion("TARGroupInfo not between", value1, value2, "TARGroupInfo");
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