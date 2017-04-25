package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class TargroupteacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TargroupteacherExample() {
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

        public Criteria andIsLeaderIsNull() {
            addCriterion("IsLeader is null");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIsNotNull() {
            addCriterion("IsLeader is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeaderEqualTo(Boolean value) {
            addCriterion("IsLeader =", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotEqualTo(Boolean value) {
            addCriterion("IsLeader <>", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderGreaterThan(Boolean value) {
            addCriterion("IsLeader >", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsLeader >=", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLessThan(Boolean value) {
            addCriterion("IsLeader <", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLessThanOrEqualTo(Boolean value) {
            addCriterion("IsLeader <=", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIn(List<Boolean> values) {
            addCriterion("IsLeader in", values, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotIn(List<Boolean> values) {
            addCriterion("IsLeader not in", values, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLeader between", value1, value2, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLeader not between", value1, value2, "isLeader");
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