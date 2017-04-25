package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TextbookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TextbookExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andISBNIsNull() {
            addCriterion("ISBN is null");
            return (Criteria) this;
        }

        public Criteria andISBNIsNotNull() {
            addCriterion("ISBN is not null");
            return (Criteria) this;
        }

        public Criteria andISBNEqualTo(String value) {
            addCriterion("ISBN =", value, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNNotEqualTo(String value) {
            addCriterion("ISBN <>", value, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNGreaterThan(String value) {
            addCriterion("ISBN >", value, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNGreaterThanOrEqualTo(String value) {
            addCriterion("ISBN >=", value, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNLessThan(String value) {
            addCriterion("ISBN <", value, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNLessThanOrEqualTo(String value) {
            addCriterion("ISBN <=", value, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNLike(String value) {
            addCriterion("ISBN like", value, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNNotLike(String value) {
            addCriterion("ISBN not like", value, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNIn(List<String> values) {
            addCriterion("ISBN in", values, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNNotIn(List<String> values) {
            addCriterion("ISBN not in", values, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNBetween(String value1, String value2) {
            addCriterion("ISBN between", value1, value2, "ISBN");
            return (Criteria) this;
        }

        public Criteria andISBNNotBetween(String value1, String value2) {
            addCriterion("ISBN not between", value1, value2, "ISBN");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("CourseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("CourseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("CourseId =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("CourseId <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("CourseId >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("CourseId >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("CourseId <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("CourseId <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("CourseId like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("CourseId not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("CourseId in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("CourseId not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("CourseId between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("CourseId not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andTextbookNameIsNull() {
            addCriterion("TextbookName is null");
            return (Criteria) this;
        }

        public Criteria andTextbookNameIsNotNull() {
            addCriterion("TextbookName is not null");
            return (Criteria) this;
        }

        public Criteria andTextbookNameEqualTo(String value) {
            addCriterion("TextbookName =", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameNotEqualTo(String value) {
            addCriterion("TextbookName <>", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameGreaterThan(String value) {
            addCriterion("TextbookName >", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameGreaterThanOrEqualTo(String value) {
            addCriterion("TextbookName >=", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameLessThan(String value) {
            addCriterion("TextbookName <", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameLessThanOrEqualTo(String value) {
            addCriterion("TextbookName <=", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameLike(String value) {
            addCriterion("TextbookName like", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameNotLike(String value) {
            addCriterion("TextbookName not like", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameIn(List<String> values) {
            addCriterion("TextbookName in", values, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameNotIn(List<String> values) {
            addCriterion("TextbookName not in", values, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameBetween(String value1, String value2) {
            addCriterion("TextbookName between", value1, value2, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameNotBetween(String value1, String value2) {
            addCriterion("TextbookName not between", value1, value2, "textbookName");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("Publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("Publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("Publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("Publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("Publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("Publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("Publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("Publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("Publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("Publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("Publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("Publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("Publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("Publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPubtimeIsNull() {
            addCriterion("Pubtime is null");
            return (Criteria) this;
        }

        public Criteria andPubtimeIsNotNull() {
            addCriterion("Pubtime is not null");
            return (Criteria) this;
        }

        public Criteria andPubtimeEqualTo(Date value) {
            addCriterionForJDBCDate("Pubtime =", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Pubtime <>", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Pubtime >", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pubtime >=", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeLessThan(Date value) {
            addCriterionForJDBCDate("Pubtime <", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pubtime <=", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeIn(List<Date> values) {
            addCriterionForJDBCDate("Pubtime in", values, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Pubtime not in", values, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pubtime between", value1, value2, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pubtime not between", value1, value2, "pubtime");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("Author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("Author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("Author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("Author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("Author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("Author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("Author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("Author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("Author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("Author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("Author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("Author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("Author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("Author not between", value1, value2, "author");
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