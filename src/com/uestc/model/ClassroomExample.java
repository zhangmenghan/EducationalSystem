package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class ClassroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassroomExample() {
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

        public Criteria andMatchedClassIdIsNull() {
            addCriterion("MatchedClassId is null");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdIsNotNull() {
            addCriterion("MatchedClassId is not null");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdEqualTo(String value) {
            addCriterion("MatchedClassId =", value, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdNotEqualTo(String value) {
            addCriterion("MatchedClassId <>", value, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdGreaterThan(String value) {
            addCriterion("MatchedClassId >", value, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("MatchedClassId >=", value, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdLessThan(String value) {
            addCriterion("MatchedClassId <", value, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdLessThanOrEqualTo(String value) {
            addCriterion("MatchedClassId <=", value, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdLike(String value) {
            addCriterion("MatchedClassId like", value, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdNotLike(String value) {
            addCriterion("MatchedClassId not like", value, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdIn(List<String> values) {
            addCriterion("MatchedClassId in", values, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdNotIn(List<String> values) {
            addCriterion("MatchedClassId not in", values, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdBetween(String value1, String value2) {
            addCriterion("MatchedClassId between", value1, value2, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andMatchedClassIdNotBetween(String value1, String value2) {
            addCriterion("MatchedClassId not between", value1, value2, "matchedClassId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNull() {
            addCriterion("ClassType is null");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNotNull() {
            addCriterion("ClassType is not null");
            return (Criteria) this;
        }

        public Criteria andClassTypeEqualTo(Byte value) {
            addCriterion("ClassType =", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotEqualTo(Byte value) {
            addCriterion("ClassType <>", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThan(Byte value) {
            addCriterion("ClassType >", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ClassType >=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThan(Byte value) {
            addCriterion("ClassType <", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThanOrEqualTo(Byte value) {
            addCriterion("ClassType <=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeIn(List<Byte> values) {
            addCriterion("ClassType in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotIn(List<Byte> values) {
            addCriterion("ClassType not in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeBetween(Byte value1, Byte value2) {
            addCriterion("ClassType between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ClassType not between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeIsNull() {
            addCriterion("ClassroomSize is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeIsNotNull() {
            addCriterion("ClassroomSize is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeEqualTo(Integer value) {
            addCriterion("ClassroomSize =", value, "classroomSize");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeNotEqualTo(Integer value) {
            addCriterion("ClassroomSize <>", value, "classroomSize");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeGreaterThan(Integer value) {
            addCriterion("ClassroomSize >", value, "classroomSize");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassroomSize >=", value, "classroomSize");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeLessThan(Integer value) {
            addCriterion("ClassroomSize <", value, "classroomSize");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeLessThanOrEqualTo(Integer value) {
            addCriterion("ClassroomSize <=", value, "classroomSize");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeIn(List<Integer> values) {
            addCriterion("ClassroomSize in", values, "classroomSize");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeNotIn(List<Integer> values) {
            addCriterion("ClassroomSize not in", values, "classroomSize");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeBetween(Integer value1, Integer value2) {
            addCriterion("ClassroomSize between", value1, value2, "classroomSize");
            return (Criteria) this;
        }

        public Criteria andClassroomSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassroomSize not between", value1, value2, "classroomSize");
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