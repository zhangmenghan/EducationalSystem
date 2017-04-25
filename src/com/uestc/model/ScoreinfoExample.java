package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoreinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreinfoExample() {
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

        public Criteria andScoreIdIsNull() {
            addCriterion("ScoreId is null");
            return (Criteria) this;
        }

        public Criteria andScoreIdIsNotNull() {
            addCriterion("ScoreId is not null");
            return (Criteria) this;
        }

        public Criteria andScoreIdEqualTo(String value) {
            addCriterion("ScoreId =", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotEqualTo(String value) {
            addCriterion("ScoreId <>", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdGreaterThan(String value) {
            addCriterion("ScoreId >", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("ScoreId >=", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLessThan(String value) {
            addCriterion("ScoreId <", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLessThanOrEqualTo(String value) {
            addCriterion("ScoreId <=", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLike(String value) {
            addCriterion("ScoreId like", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotLike(String value) {
            addCriterion("ScoreId not like", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdIn(List<String> values) {
            addCriterion("ScoreId in", values, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotIn(List<String> values) {
            addCriterion("ScoreId not in", values, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdBetween(String value1, String value2) {
            addCriterion("ScoreId between", value1, value2, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotBetween(String value1, String value2) {
            addCriterion("ScoreId not between", value1, value2, "scoreId");
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

        public Criteria andUsuallyGradeIsNull() {
            addCriterion("UsuallyGrade is null");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeIsNotNull() {
            addCriterion("UsuallyGrade is not null");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeEqualTo(Float value) {
            addCriterion("UsuallyGrade =", value, "usuallyGrade");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeNotEqualTo(Float value) {
            addCriterion("UsuallyGrade <>", value, "usuallyGrade");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeGreaterThan(Float value) {
            addCriterion("UsuallyGrade >", value, "usuallyGrade");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("UsuallyGrade >=", value, "usuallyGrade");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeLessThan(Float value) {
            addCriterion("UsuallyGrade <", value, "usuallyGrade");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeLessThanOrEqualTo(Float value) {
            addCriterion("UsuallyGrade <=", value, "usuallyGrade");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeIn(List<Float> values) {
            addCriterion("UsuallyGrade in", values, "usuallyGrade");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeNotIn(List<Float> values) {
            addCriterion("UsuallyGrade not in", values, "usuallyGrade");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeBetween(Float value1, Float value2) {
            addCriterion("UsuallyGrade between", value1, value2, "usuallyGrade");
            return (Criteria) this;
        }

        public Criteria andUsuallyGradeNotBetween(Float value1, Float value2) {
            addCriterion("UsuallyGrade not between", value1, value2, "usuallyGrade");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeIsNull() {
            addCriterion("PracticeGrade is null");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeIsNotNull() {
            addCriterion("PracticeGrade is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeEqualTo(Float value) {
            addCriterion("PracticeGrade =", value, "practiceGrade");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeNotEqualTo(Float value) {
            addCriterion("PracticeGrade <>", value, "practiceGrade");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeGreaterThan(Float value) {
            addCriterion("PracticeGrade >", value, "practiceGrade");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("PracticeGrade >=", value, "practiceGrade");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeLessThan(Float value) {
            addCriterion("PracticeGrade <", value, "practiceGrade");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeLessThanOrEqualTo(Float value) {
            addCriterion("PracticeGrade <=", value, "practiceGrade");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeIn(List<Float> values) {
            addCriterion("PracticeGrade in", values, "practiceGrade");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeNotIn(List<Float> values) {
            addCriterion("PracticeGrade not in", values, "practiceGrade");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeBetween(Float value1, Float value2) {
            addCriterion("PracticeGrade between", value1, value2, "practiceGrade");
            return (Criteria) this;
        }

        public Criteria andPracticeGradeNotBetween(Float value1, Float value2) {
            addCriterion("PracticeGrade not between", value1, value2, "practiceGrade");
            return (Criteria) this;
        }

        public Criteria andHalfGradeIsNull() {
            addCriterion("HalfGrade is null");
            return (Criteria) this;
        }

        public Criteria andHalfGradeIsNotNull() {
            addCriterion("HalfGrade is not null");
            return (Criteria) this;
        }

        public Criteria andHalfGradeEqualTo(Float value) {
            addCriterion("HalfGrade =", value, "halfGrade");
            return (Criteria) this;
        }

        public Criteria andHalfGradeNotEqualTo(Float value) {
            addCriterion("HalfGrade <>", value, "halfGrade");
            return (Criteria) this;
        }

        public Criteria andHalfGradeGreaterThan(Float value) {
            addCriterion("HalfGrade >", value, "halfGrade");
            return (Criteria) this;
        }

        public Criteria andHalfGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("HalfGrade >=", value, "halfGrade");
            return (Criteria) this;
        }

        public Criteria andHalfGradeLessThan(Float value) {
            addCriterion("HalfGrade <", value, "halfGrade");
            return (Criteria) this;
        }

        public Criteria andHalfGradeLessThanOrEqualTo(Float value) {
            addCriterion("HalfGrade <=", value, "halfGrade");
            return (Criteria) this;
        }

        public Criteria andHalfGradeIn(List<Float> values) {
            addCriterion("HalfGrade in", values, "halfGrade");
            return (Criteria) this;
        }

        public Criteria andHalfGradeNotIn(List<Float> values) {
            addCriterion("HalfGrade not in", values, "halfGrade");
            return (Criteria) this;
        }

        public Criteria andHalfGradeBetween(Float value1, Float value2) {
            addCriterion("HalfGrade between", value1, value2, "halfGrade");
            return (Criteria) this;
        }

        public Criteria andHalfGradeNotBetween(Float value1, Float value2) {
            addCriterion("HalfGrade not between", value1, value2, "halfGrade");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeIsNull() {
            addCriterion("FinalExamGrade is null");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeIsNotNull() {
            addCriterion("FinalExamGrade is not null");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeEqualTo(Float value) {
            addCriterion("FinalExamGrade =", value, "finalExamGrade");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeNotEqualTo(Float value) {
            addCriterion("FinalExamGrade <>", value, "finalExamGrade");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeGreaterThan(Float value) {
            addCriterion("FinalExamGrade >", value, "finalExamGrade");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("FinalExamGrade >=", value, "finalExamGrade");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeLessThan(Float value) {
            addCriterion("FinalExamGrade <", value, "finalExamGrade");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeLessThanOrEqualTo(Float value) {
            addCriterion("FinalExamGrade <=", value, "finalExamGrade");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeIn(List<Float> values) {
            addCriterion("FinalExamGrade in", values, "finalExamGrade");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeNotIn(List<Float> values) {
            addCriterion("FinalExamGrade not in", values, "finalExamGrade");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeBetween(Float value1, Float value2) {
            addCriterion("FinalExamGrade between", value1, value2, "finalExamGrade");
            return (Criteria) this;
        }

        public Criteria andFinalExamGradeNotBetween(Float value1, Float value2) {
            addCriterion("FinalExamGrade not between", value1, value2, "finalExamGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeIsNull() {
            addCriterion("FinalGrade is null");
            return (Criteria) this;
        }

        public Criteria andFinalGradeIsNotNull() {
            addCriterion("FinalGrade is not null");
            return (Criteria) this;
        }

        public Criteria andFinalGradeEqualTo(Float value) {
            addCriterion("FinalGrade =", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeNotEqualTo(Float value) {
            addCriterion("FinalGrade <>", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeGreaterThan(Float value) {
            addCriterion("FinalGrade >", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("FinalGrade >=", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeLessThan(Float value) {
            addCriterion("FinalGrade <", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeLessThanOrEqualTo(Float value) {
            addCriterion("FinalGrade <=", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeIn(List<Float> values) {
            addCriterion("FinalGrade in", values, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeNotIn(List<Float> values) {
            addCriterion("FinalGrade not in", values, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeBetween(Float value1, Float value2) {
            addCriterion("FinalGrade between", value1, value2, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeNotBetween(Float value1, Float value2) {
            addCriterion("FinalGrade not between", value1, value2, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andEndGradeIsNull() {
            addCriterion("EndGrade is null");
            return (Criteria) this;
        }

        public Criteria andEndGradeIsNotNull() {
            addCriterion("EndGrade is not null");
            return (Criteria) this;
        }

        public Criteria andEndGradeEqualTo(Float value) {
            addCriterion("EndGrade =", value, "endGrade");
            return (Criteria) this;
        }

        public Criteria andEndGradeNotEqualTo(Float value) {
            addCriterion("EndGrade <>", value, "endGrade");
            return (Criteria) this;
        }

        public Criteria andEndGradeGreaterThan(Float value) {
            addCriterion("EndGrade >", value, "endGrade");
            return (Criteria) this;
        }

        public Criteria andEndGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("EndGrade >=", value, "endGrade");
            return (Criteria) this;
        }

        public Criteria andEndGradeLessThan(Float value) {
            addCriterion("EndGrade <", value, "endGrade");
            return (Criteria) this;
        }

        public Criteria andEndGradeLessThanOrEqualTo(Float value) {
            addCriterion("EndGrade <=", value, "endGrade");
            return (Criteria) this;
        }

        public Criteria andEndGradeIn(List<Float> values) {
            addCriterion("EndGrade in", values, "endGrade");
            return (Criteria) this;
        }

        public Criteria andEndGradeNotIn(List<Float> values) {
            addCriterion("EndGrade not in", values, "endGrade");
            return (Criteria) this;
        }

        public Criteria andEndGradeBetween(Float value1, Float value2) {
            addCriterion("EndGrade between", value1, value2, "endGrade");
            return (Criteria) this;
        }

        public Criteria andEndGradeNotBetween(Float value1, Float value2) {
            addCriterion("EndGrade not between", value1, value2, "endGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeIsNull() {
            addCriterion("MakeupGrade is null");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeIsNotNull() {
            addCriterion("MakeupGrade is not null");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeEqualTo(Float value) {
            addCriterion("MakeupGrade =", value, "makeupGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeNotEqualTo(Float value) {
            addCriterion("MakeupGrade <>", value, "makeupGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeGreaterThan(Float value) {
            addCriterion("MakeupGrade >", value, "makeupGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("MakeupGrade >=", value, "makeupGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeLessThan(Float value) {
            addCriterion("MakeupGrade <", value, "makeupGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeLessThanOrEqualTo(Float value) {
            addCriterion("MakeupGrade <=", value, "makeupGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeIn(List<Float> values) {
            addCriterion("MakeupGrade in", values, "makeupGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeNotIn(List<Float> values) {
            addCriterion("MakeupGrade not in", values, "makeupGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeBetween(Float value1, Float value2) {
            addCriterion("MakeupGrade between", value1, value2, "makeupGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupGradeNotBetween(Float value1, Float value2) {
            addCriterion("MakeupGrade not between", value1, value2, "makeupGrade");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumIsNull() {
            addCriterion("MakeupExamNum is null");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumIsNotNull() {
            addCriterion("MakeupExamNum is not null");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumEqualTo(Byte value) {
            addCriterion("MakeupExamNum =", value, "makeupExamNum");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumNotEqualTo(Byte value) {
            addCriterion("MakeupExamNum <>", value, "makeupExamNum");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumGreaterThan(Byte value) {
            addCriterion("MakeupExamNum >", value, "makeupExamNum");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("MakeupExamNum >=", value, "makeupExamNum");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumLessThan(Byte value) {
            addCriterion("MakeupExamNum <", value, "makeupExamNum");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumLessThanOrEqualTo(Byte value) {
            addCriterion("MakeupExamNum <=", value, "makeupExamNum");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumIn(List<Byte> values) {
            addCriterion("MakeupExamNum in", values, "makeupExamNum");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumNotIn(List<Byte> values) {
            addCriterion("MakeupExamNum not in", values, "makeupExamNum");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumBetween(Byte value1, Byte value2) {
            addCriterion("MakeupExamNum between", value1, value2, "makeupExamNum");
            return (Criteria) this;
        }

        public Criteria andMakeupExamNumNotBetween(Byte value1, Byte value2) {
            addCriterion("MakeupExamNum not between", value1, value2, "makeupExamNum");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupIsNull() {
            addCriterion("ApplyMakeup is null");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupIsNotNull() {
            addCriterion("ApplyMakeup is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupEqualTo(Byte value) {
            addCriterion("ApplyMakeup =", value, "applyMakeup");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupNotEqualTo(Byte value) {
            addCriterion("ApplyMakeup <>", value, "applyMakeup");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupGreaterThan(Byte value) {
            addCriterion("ApplyMakeup >", value, "applyMakeup");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupGreaterThanOrEqualTo(Byte value) {
            addCriterion("ApplyMakeup >=", value, "applyMakeup");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupLessThan(Byte value) {
            addCriterion("ApplyMakeup <", value, "applyMakeup");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupLessThanOrEqualTo(Byte value) {
            addCriterion("ApplyMakeup <=", value, "applyMakeup");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupIn(List<Byte> values) {
            addCriterion("ApplyMakeup in", values, "applyMakeup");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupNotIn(List<Byte> values) {
            addCriterion("ApplyMakeup not in", values, "applyMakeup");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupBetween(Byte value1, Byte value2) {
            addCriterion("ApplyMakeup between", value1, value2, "applyMakeup");
            return (Criteria) this;
        }

        public Criteria andApplyMakeupNotBetween(Byte value1, Byte value2) {
            addCriterion("ApplyMakeup not between", value1, value2, "applyMakeup");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeIsNull() {
            addCriterion("MakeupApplyTime is null");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeIsNotNull() {
            addCriterion("MakeupApplyTime is not null");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeEqualTo(Date value) {
            addCriterion("MakeupApplyTime =", value, "makeupApplyTime");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeNotEqualTo(Date value) {
            addCriterion("MakeupApplyTime <>", value, "makeupApplyTime");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeGreaterThan(Date value) {
            addCriterion("MakeupApplyTime >", value, "makeupApplyTime");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MakeupApplyTime >=", value, "makeupApplyTime");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeLessThan(Date value) {
            addCriterion("MakeupApplyTime <", value, "makeupApplyTime");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MakeupApplyTime <=", value, "makeupApplyTime");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeIn(List<Date> values) {
            addCriterion("MakeupApplyTime in", values, "makeupApplyTime");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeNotIn(List<Date> values) {
            addCriterion("MakeupApplyTime not in", values, "makeupApplyTime");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeBetween(Date value1, Date value2) {
            addCriterion("MakeupApplyTime between", value1, value2, "makeupApplyTime");
            return (Criteria) this;
        }

        public Criteria andMakeupApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MakeupApplyTime not between", value1, value2, "makeupApplyTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
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