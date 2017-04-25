package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class StuevateachExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuevateachExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("StudentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("StudentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("StudentId =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("StudentId <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("StudentId >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("StudentId >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("StudentId <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("StudentId <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("StudentId like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("StudentId not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("StudentId in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("StudentId not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("StudentId between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("StudentId not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdIsNull() {
            addCriterion("CourseAssociationId is null");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdIsNotNull() {
            addCriterion("CourseAssociationId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdEqualTo(String value) {
            addCriterion("CourseAssociationId =", value, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdNotEqualTo(String value) {
            addCriterion("CourseAssociationId <>", value, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdGreaterThan(String value) {
            addCriterion("CourseAssociationId >", value, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdGreaterThanOrEqualTo(String value) {
            addCriterion("CourseAssociationId >=", value, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdLessThan(String value) {
            addCriterion("CourseAssociationId <", value, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdLessThanOrEqualTo(String value) {
            addCriterion("CourseAssociationId <=", value, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdLike(String value) {
            addCriterion("CourseAssociationId like", value, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdNotLike(String value) {
            addCriterion("CourseAssociationId not like", value, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdIn(List<String> values) {
            addCriterion("CourseAssociationId in", values, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdNotIn(List<String> values) {
            addCriterion("CourseAssociationId not in", values, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdBetween(String value1, String value2) {
            addCriterion("CourseAssociationId between", value1, value2, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andCourseAssociationIdNotBetween(String value1, String value2) {
            addCriterion("CourseAssociationId not between", value1, value2, "courseAssociationId");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("Record is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("Record is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(Byte value) {
            addCriterion("Record =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(Byte value) {
            addCriterion("Record <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(Byte value) {
            addCriterion("Record >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(Byte value) {
            addCriterion("Record >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(Byte value) {
            addCriterion("Record <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(Byte value) {
            addCriterion("Record <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<Byte> values) {
            addCriterion("Record in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<Byte> values) {
            addCriterion("Record not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(Byte value1, Byte value2) {
            addCriterion("Record between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(Byte value1, Byte value2) {
            addCriterion("Record not between", value1, value2, "record");
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