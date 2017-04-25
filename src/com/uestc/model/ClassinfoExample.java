package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class ClassinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassinfoExample() {
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

        public Criteria andClassTeacherIdIsNull() {
            addCriterion("ClassTeacherId is null");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdIsNotNull() {
            addCriterion("ClassTeacherId is not null");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdEqualTo(String value) {
            addCriterion("ClassTeacherId =", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotEqualTo(String value) {
            addCriterion("ClassTeacherId <>", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdGreaterThan(String value) {
            addCriterion("ClassTeacherId >", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("ClassTeacherId >=", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdLessThan(String value) {
            addCriterion("ClassTeacherId <", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("ClassTeacherId <=", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdLike(String value) {
            addCriterion("ClassTeacherId like", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotLike(String value) {
            addCriterion("ClassTeacherId not like", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdIn(List<String> values) {
            addCriterion("ClassTeacherId in", values, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotIn(List<String> values) {
            addCriterion("ClassTeacherId not in", values, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdBetween(String value1, String value2) {
            addCriterion("ClassTeacherId between", value1, value2, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotBetween(String value1, String value2) {
            addCriterion("ClassTeacherId not between", value1, value2, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andStudyModeIsNull() {
            addCriterion("StudyMode is null");
            return (Criteria) this;
        }

        public Criteria andStudyModeIsNotNull() {
            addCriterion("StudyMode is not null");
            return (Criteria) this;
        }

        public Criteria andStudyModeEqualTo(String value) {
            addCriterion("StudyMode =", value, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeNotEqualTo(String value) {
            addCriterion("StudyMode <>", value, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeGreaterThan(String value) {
            addCriterion("StudyMode >", value, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeGreaterThanOrEqualTo(String value) {
            addCriterion("StudyMode >=", value, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeLessThan(String value) {
            addCriterion("StudyMode <", value, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeLessThanOrEqualTo(String value) {
            addCriterion("StudyMode <=", value, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeLike(String value) {
            addCriterion("StudyMode like", value, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeNotLike(String value) {
            addCriterion("StudyMode not like", value, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeIn(List<String> values) {
            addCriterion("StudyMode in", values, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeNotIn(List<String> values) {
            addCriterion("StudyMode not in", values, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeBetween(String value1, String value2) {
            addCriterion("StudyMode between", value1, value2, "studyMode");
            return (Criteria) this;
        }

        public Criteria andStudyModeNotBetween(String value1, String value2) {
            addCriterion("StudyMode not between", value1, value2, "studyMode");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("ClassName is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("ClassName is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("ClassName =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("ClassName <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("ClassName >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("ClassName >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("ClassName <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("ClassName <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("ClassName like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("ClassName not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("ClassName in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("ClassName not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("ClassName between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("ClassName not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassSizeIsNull() {
            addCriterion("ClassSize is null");
            return (Criteria) this;
        }

        public Criteria andClassSizeIsNotNull() {
            addCriterion("ClassSize is not null");
            return (Criteria) this;
        }

        public Criteria andClassSizeEqualTo(Byte value) {
            addCriterion("ClassSize =", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeNotEqualTo(Byte value) {
            addCriterion("ClassSize <>", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeGreaterThan(Byte value) {
            addCriterion("ClassSize >", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ClassSize >=", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeLessThan(Byte value) {
            addCriterion("ClassSize <", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeLessThanOrEqualTo(Byte value) {
            addCriterion("ClassSize <=", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeIn(List<Byte> values) {
            addCriterion("ClassSize in", values, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeNotIn(List<Byte> values) {
            addCriterion("ClassSize not in", values, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeBetween(Byte value1, Byte value2) {
            addCriterion("ClassSize between", value1, value2, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeNotBetween(Byte value1, Byte value2) {
            addCriterion("ClassSize not between", value1, value2, "classSize");
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