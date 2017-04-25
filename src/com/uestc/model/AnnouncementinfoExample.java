package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnnouncementinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnouncementinfoExample() {
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

        public Criteria andAnnouncementIdIsNull() {
            addCriterion("AnnouncementId is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdIsNotNull() {
            addCriterion("AnnouncementId is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdEqualTo(Integer value) {
            addCriterion("AnnouncementId =", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotEqualTo(Integer value) {
            addCriterion("AnnouncementId <>", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdGreaterThan(Integer value) {
            addCriterion("AnnouncementId >", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AnnouncementId >=", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdLessThan(Integer value) {
            addCriterion("AnnouncementId <", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdLessThanOrEqualTo(Integer value) {
            addCriterion("AnnouncementId <=", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdIn(List<Integer> values) {
            addCriterion("AnnouncementId in", values, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotIn(List<Integer> values) {
            addCriterion("AnnouncementId not in", values, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdBetween(Integer value1, Integer value2) {
            addCriterion("AnnouncementId between", value1, value2, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AnnouncementId not between", value1, value2, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameIsNull() {
            addCriterion("AnnouncementName is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameIsNotNull() {
            addCriterion("AnnouncementName is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameEqualTo(String value) {
            addCriterion("AnnouncementName =", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameNotEqualTo(String value) {
            addCriterion("AnnouncementName <>", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameGreaterThan(String value) {
            addCriterion("AnnouncementName >", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameGreaterThanOrEqualTo(String value) {
            addCriterion("AnnouncementName >=", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameLessThan(String value) {
            addCriterion("AnnouncementName <", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameLessThanOrEqualTo(String value) {
            addCriterion("AnnouncementName <=", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameLike(String value) {
            addCriterion("AnnouncementName like", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameNotLike(String value) {
            addCriterion("AnnouncementName not like", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameIn(List<String> values) {
            addCriterion("AnnouncementName in", values, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameNotIn(List<String> values) {
            addCriterion("AnnouncementName not in", values, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameBetween(String value1, String value2) {
            addCriterion("AnnouncementName between", value1, value2, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameNotBetween(String value1, String value2) {
            addCriterion("AnnouncementName not between", value1, value2, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeIsNull() {
            addCriterion("AnnouncementTime is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeIsNotNull() {
            addCriterion("AnnouncementTime is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeEqualTo(Date value) {
            addCriterion("AnnouncementTime =", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotEqualTo(Date value) {
            addCriterion("AnnouncementTime <>", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeGreaterThan(Date value) {
            addCriterion("AnnouncementTime >", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AnnouncementTime >=", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeLessThan(Date value) {
            addCriterion("AnnouncementTime <", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeLessThanOrEqualTo(Date value) {
            addCriterion("AnnouncementTime <=", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeIn(List<Date> values) {
            addCriterion("AnnouncementTime in", values, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotIn(List<Date> values) {
            addCriterion("AnnouncementTime not in", values, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeBetween(Date value1, Date value2) {
            addCriterion("AnnouncementTime between", value1, value2, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotBetween(Date value1, Date value2) {
            addCriterion("AnnouncementTime not between", value1, value2, "announcementTime");
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