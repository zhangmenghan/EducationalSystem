package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class CourseassociationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseassociationExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("ClassId is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("ClassId is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("ClassId =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("ClassId <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("ClassId >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("ClassId >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("ClassId <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("ClassId <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("ClassId like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("ClassId not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("ClassId in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("ClassId not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("ClassId between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("ClassId not between", value1, value2, "classId");
            return (Criteria) this;
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

        public Criteria andCoursePlanIdIsNull() {
            addCriterion("CoursePlanId is null");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdIsNotNull() {
            addCriterion("CoursePlanId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdEqualTo(String value) {
            addCriterion("CoursePlanId =", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdNotEqualTo(String value) {
            addCriterion("CoursePlanId <>", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdGreaterThan(String value) {
            addCriterion("CoursePlanId >", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("CoursePlanId >=", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdLessThan(String value) {
            addCriterion("CoursePlanId <", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdLessThanOrEqualTo(String value) {
            addCriterion("CoursePlanId <=", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdLike(String value) {
            addCriterion("CoursePlanId like", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdNotLike(String value) {
            addCriterion("CoursePlanId not like", value, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdIn(List<String> values) {
            addCriterion("CoursePlanId in", values, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdNotIn(List<String> values) {
            addCriterion("CoursePlanId not in", values, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdBetween(String value1, String value2) {
            addCriterion("CoursePlanId between", value1, value2, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andCoursePlanIdNotBetween(String value1, String value2) {
            addCriterion("CoursePlanId not between", value1, value2, "coursePlanId");
            return (Criteria) this;
        }

        public Criteria andAssociationExecIsNull() {
            addCriterion("AssociationExec is null");
            return (Criteria) this;
        }

        public Criteria andAssociationExecIsNotNull() {
            addCriterion("AssociationExec is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationExecEqualTo(Byte value) {
            addCriterion("AssociationExec =", value, "associationExec");
            return (Criteria) this;
        }

        public Criteria andAssociationExecNotEqualTo(Byte value) {
            addCriterion("AssociationExec <>", value, "associationExec");
            return (Criteria) this;
        }

        public Criteria andAssociationExecGreaterThan(Byte value) {
            addCriterion("AssociationExec >", value, "associationExec");
            return (Criteria) this;
        }

        public Criteria andAssociationExecGreaterThanOrEqualTo(Byte value) {
            addCriterion("AssociationExec >=", value, "associationExec");
            return (Criteria) this;
        }

        public Criteria andAssociationExecLessThan(Byte value) {
            addCriterion("AssociationExec <", value, "associationExec");
            return (Criteria) this;
        }

        public Criteria andAssociationExecLessThanOrEqualTo(Byte value) {
            addCriterion("AssociationExec <=", value, "associationExec");
            return (Criteria) this;
        }

        public Criteria andAssociationExecIn(List<Byte> values) {
            addCriterion("AssociationExec in", values, "associationExec");
            return (Criteria) this;
        }

        public Criteria andAssociationExecNotIn(List<Byte> values) {
            addCriterion("AssociationExec not in", values, "associationExec");
            return (Criteria) this;
        }

        public Criteria andAssociationExecBetween(Byte value1, Byte value2) {
            addCriterion("AssociationExec between", value1, value2, "associationExec");
            return (Criteria) this;
        }

        public Criteria andAssociationExecNotBetween(Byte value1, Byte value2) {
            addCriterion("AssociationExec not between", value1, value2, "associationExec");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeIsNull() {
            addCriterion("CanModifyGrade is null");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeIsNotNull() {
            addCriterion("CanModifyGrade is not null");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeEqualTo(Boolean value) {
            addCriterion("CanModifyGrade =", value, "canModifyGrade");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeNotEqualTo(Boolean value) {
            addCriterion("CanModifyGrade <>", value, "canModifyGrade");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeGreaterThan(Boolean value) {
            addCriterion("CanModifyGrade >", value, "canModifyGrade");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CanModifyGrade >=", value, "canModifyGrade");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeLessThan(Boolean value) {
            addCriterion("CanModifyGrade <", value, "canModifyGrade");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeLessThanOrEqualTo(Boolean value) {
            addCriterion("CanModifyGrade <=", value, "canModifyGrade");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeIn(List<Boolean> values) {
            addCriterion("CanModifyGrade in", values, "canModifyGrade");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeNotIn(List<Boolean> values) {
            addCriterion("CanModifyGrade not in", values, "canModifyGrade");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeBetween(Boolean value1, Boolean value2) {
            addCriterion("CanModifyGrade between", value1, value2, "canModifyGrade");
            return (Criteria) this;
        }

        public Criteria andCanModifyGradeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CanModifyGrade not between", value1, value2, "canModifyGrade");
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