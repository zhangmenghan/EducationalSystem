package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class TeachplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachplanExample() {
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

        public Criteria andTeachPlanIdIsNull() {
            addCriterion("TeachPlanId is null");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdIsNotNull() {
            addCriterion("TeachPlanId is not null");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdEqualTo(String value) {
            addCriterion("TeachPlanId =", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdNotEqualTo(String value) {
            addCriterion("TeachPlanId <>", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdGreaterThan(String value) {
            addCriterion("TeachPlanId >", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("TeachPlanId >=", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdLessThan(String value) {
            addCriterion("TeachPlanId <", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdLessThanOrEqualTo(String value) {
            addCriterion("TeachPlanId <=", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdLike(String value) {
            addCriterion("TeachPlanId like", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdNotLike(String value) {
            addCriterion("TeachPlanId not like", value, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdIn(List<String> values) {
            addCriterion("TeachPlanId in", values, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdNotIn(List<String> values) {
            addCriterion("TeachPlanId not in", values, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdBetween(String value1, String value2) {
            addCriterion("TeachPlanId between", value1, value2, "teachPlanId");
            return (Criteria) this;
        }

        public Criteria andTeachPlanIdNotBetween(String value1, String value2) {
            addCriterion("TeachPlanId not between", value1, value2, "teachPlanId");
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

        public Criteria andCourseTypeIdIsNull() {
            addCriterion("CourseTypeId is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdIsNotNull() {
            addCriterion("CourseTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdEqualTo(Byte value) {
            addCriterion("CourseTypeId =", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdNotEqualTo(Byte value) {
            addCriterion("CourseTypeId <>", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdGreaterThan(Byte value) {
            addCriterion("CourseTypeId >", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("CourseTypeId >=", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdLessThan(Byte value) {
            addCriterion("CourseTypeId <", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("CourseTypeId <=", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdIn(List<Byte> values) {
            addCriterion("CourseTypeId in", values, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdNotIn(List<Byte> values) {
            addCriterion("CourseTypeId not in", values, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("CourseTypeId between", value1, value2, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("CourseTypeId not between", value1, value2, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("GradeId is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("GradeId is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(String value) {
            addCriterion("GradeId =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(String value) {
            addCriterion("GradeId <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(String value) {
            addCriterion("GradeId >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("GradeId >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(String value) {
            addCriterion("GradeId <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(String value) {
            addCriterion("GradeId <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLike(String value) {
            addCriterion("GradeId like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotLike(String value) {
            addCriterion("GradeId not like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<String> values) {
            addCriterion("GradeId in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<String> values) {
            addCriterion("GradeId not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(String value1, String value2) {
            addCriterion("GradeId between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(String value1, String value2) {
            addCriterion("GradeId not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("CourseName is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("CourseName is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("CourseName =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("CourseName <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("CourseName >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("CourseName >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("CourseName <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("CourseName <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("CourseName like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("CourseName not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("CourseName in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("CourseName not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("CourseName between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("CourseName not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andTotalHoursIsNull() {
            addCriterion("TotalHours is null");
            return (Criteria) this;
        }

        public Criteria andTotalHoursIsNotNull() {
            addCriterion("TotalHours is not null");
            return (Criteria) this;
        }

        public Criteria andTotalHoursEqualTo(Short value) {
            addCriterion("TotalHours =", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursNotEqualTo(Short value) {
            addCriterion("TotalHours <>", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursGreaterThan(Short value) {
            addCriterion("TotalHours >", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursGreaterThanOrEqualTo(Short value) {
            addCriterion("TotalHours >=", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursLessThan(Short value) {
            addCriterion("TotalHours <", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursLessThanOrEqualTo(Short value) {
            addCriterion("TotalHours <=", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursIn(List<Short> values) {
            addCriterion("TotalHours in", values, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursNotIn(List<Short> values) {
            addCriterion("TotalHours not in", values, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursBetween(Short value1, Short value2) {
            addCriterion("TotalHours between", value1, value2, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursNotBetween(Short value1, Short value2) {
            addCriterion("TotalHours not between", value1, value2, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursIsNull() {
            addCriterion("TheoryHours is null");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursIsNotNull() {
            addCriterion("TheoryHours is not null");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursEqualTo(Short value) {
            addCriterion("TheoryHours =", value, "theoryHours");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursNotEqualTo(Short value) {
            addCriterion("TheoryHours <>", value, "theoryHours");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursGreaterThan(Short value) {
            addCriterion("TheoryHours >", value, "theoryHours");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursGreaterThanOrEqualTo(Short value) {
            addCriterion("TheoryHours >=", value, "theoryHours");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursLessThan(Short value) {
            addCriterion("TheoryHours <", value, "theoryHours");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursLessThanOrEqualTo(Short value) {
            addCriterion("TheoryHours <=", value, "theoryHours");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursIn(List<Short> values) {
            addCriterion("TheoryHours in", values, "theoryHours");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursNotIn(List<Short> values) {
            addCriterion("TheoryHours not in", values, "theoryHours");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursBetween(Short value1, Short value2) {
            addCriterion("TheoryHours between", value1, value2, "theoryHours");
            return (Criteria) this;
        }

        public Criteria andTheoryHoursNotBetween(Short value1, Short value2) {
            addCriterion("TheoryHours not between", value1, value2, "theoryHours");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursIsNull() {
            addCriterion("PracticeHours is null");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursIsNotNull() {
            addCriterion("PracticeHours is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursEqualTo(Short value) {
            addCriterion("PracticeHours =", value, "practiceHours");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursNotEqualTo(Short value) {
            addCriterion("PracticeHours <>", value, "practiceHours");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursGreaterThan(Short value) {
            addCriterion("PracticeHours >", value, "practiceHours");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursGreaterThanOrEqualTo(Short value) {
            addCriterion("PracticeHours >=", value, "practiceHours");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursLessThan(Short value) {
            addCriterion("PracticeHours <", value, "practiceHours");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursLessThanOrEqualTo(Short value) {
            addCriterion("PracticeHours <=", value, "practiceHours");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursIn(List<Short> values) {
            addCriterion("PracticeHours in", values, "practiceHours");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursNotIn(List<Short> values) {
            addCriterion("PracticeHours not in", values, "practiceHours");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursBetween(Short value1, Short value2) {
            addCriterion("PracticeHours between", value1, value2, "practiceHours");
            return (Criteria) this;
        }

        public Criteria andPracticeHoursNotBetween(Short value1, Short value2) {
            addCriterion("PracticeHours not between", value1, value2, "practiceHours");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeIsNull() {
            addCriterion("SchoolYearType is null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeIsNotNull() {
            addCriterion("SchoolYearType is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeEqualTo(Byte value) {
            addCriterion("SchoolYearType =", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeNotEqualTo(Byte value) {
            addCriterion("SchoolYearType <>", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeGreaterThan(Byte value) {
            addCriterion("SchoolYearType >", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("SchoolYearType >=", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeLessThan(Byte value) {
            addCriterion("SchoolYearType <", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeLessThanOrEqualTo(Byte value) {
            addCriterion("SchoolYearType <=", value, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeIn(List<Byte> values) {
            addCriterion("SchoolYearType in", values, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeNotIn(List<Byte> values) {
            addCriterion("SchoolYearType not in", values, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeBetween(Byte value1, Byte value2) {
            addCriterion("SchoolYearType between", value1, value2, "schoolYearType");
            return (Criteria) this;
        }

        public Criteria andSchoolYearTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("SchoolYearType not between", value1, value2, "schoolYearType");
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