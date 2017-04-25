package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class SuperviseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperviseinfoExample() {
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

        public Criteria andSuperviseIdIsNull() {
            addCriterion("SuperviseId is null");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdIsNotNull() {
            addCriterion("SuperviseId is not null");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdEqualTo(String value) {
            addCriterion("SuperviseId =", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdNotEqualTo(String value) {
            addCriterion("SuperviseId <>", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdGreaterThan(String value) {
            addCriterion("SuperviseId >", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdGreaterThanOrEqualTo(String value) {
            addCriterion("SuperviseId >=", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdLessThan(String value) {
            addCriterion("SuperviseId <", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdLessThanOrEqualTo(String value) {
            addCriterion("SuperviseId <=", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdLike(String value) {
            addCriterion("SuperviseId like", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdNotLike(String value) {
            addCriterion("SuperviseId not like", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdIn(List<String> values) {
            addCriterion("SuperviseId in", values, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdNotIn(List<String> values) {
            addCriterion("SuperviseId not in", values, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdBetween(String value1, String value2) {
            addCriterion("SuperviseId between", value1, value2, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdNotBetween(String value1, String value2) {
            addCriterion("SuperviseId not between", value1, value2, "superviseId");
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

        public Criteria andSupervisorIdIsNull() {
            addCriterion("SupervisorId is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdIsNotNull() {
            addCriterion("SupervisorId is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdEqualTo(String value) {
            addCriterion("SupervisorId =", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotEqualTo(String value) {
            addCriterion("SupervisorId <>", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdGreaterThan(String value) {
            addCriterion("SupervisorId >", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdGreaterThanOrEqualTo(String value) {
            addCriterion("SupervisorId >=", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdLessThan(String value) {
            addCriterion("SupervisorId <", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdLessThanOrEqualTo(String value) {
            addCriterion("SupervisorId <=", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdLike(String value) {
            addCriterion("SupervisorId like", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotLike(String value) {
            addCriterion("SupervisorId not like", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdIn(List<String> values) {
            addCriterion("SupervisorId in", values, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotIn(List<String> values) {
            addCriterion("SupervisorId not in", values, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdBetween(String value1, String value2) {
            addCriterion("SupervisorId between", value1, value2, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotBetween(String value1, String value2) {
            addCriterion("SupervisorId not between", value1, value2, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeIsNull() {
            addCriterion("SuperviseTime is null");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeIsNotNull() {
            addCriterion("SuperviseTime is not null");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeEqualTo(String value) {
            addCriterion("SuperviseTime =", value, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeNotEqualTo(String value) {
            addCriterion("SuperviseTime <>", value, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeGreaterThan(String value) {
            addCriterion("SuperviseTime >", value, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SuperviseTime >=", value, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeLessThan(String value) {
            addCriterion("SuperviseTime <", value, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeLessThanOrEqualTo(String value) {
            addCriterion("SuperviseTime <=", value, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeLike(String value) {
            addCriterion("SuperviseTime like", value, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeNotLike(String value) {
            addCriterion("SuperviseTime not like", value, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeIn(List<String> values) {
            addCriterion("SuperviseTime in", values, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeNotIn(List<String> values) {
            addCriterion("SuperviseTime not in", values, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeBetween(String value1, String value2) {
            addCriterion("SuperviseTime between", value1, value2, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andSuperviseTimeNotBetween(String value1, String value2) {
            addCriterion("SuperviseTime not between", value1, value2, "superviseTime");
            return (Criteria) this;
        }

        public Criteria andTeachContentIsNull() {
            addCriterion("TeachContent is null");
            return (Criteria) this;
        }

        public Criteria andTeachContentIsNotNull() {
            addCriterion("TeachContent is not null");
            return (Criteria) this;
        }

        public Criteria andTeachContentEqualTo(String value) {
            addCriterion("TeachContent =", value, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentNotEqualTo(String value) {
            addCriterion("TeachContent <>", value, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentGreaterThan(String value) {
            addCriterion("TeachContent >", value, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentGreaterThanOrEqualTo(String value) {
            addCriterion("TeachContent >=", value, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentLessThan(String value) {
            addCriterion("TeachContent <", value, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentLessThanOrEqualTo(String value) {
            addCriterion("TeachContent <=", value, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentLike(String value) {
            addCriterion("TeachContent like", value, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentNotLike(String value) {
            addCriterion("TeachContent not like", value, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentIn(List<String> values) {
            addCriterion("TeachContent in", values, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentNotIn(List<String> values) {
            addCriterion("TeachContent not in", values, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentBetween(String value1, String value2) {
            addCriterion("TeachContent between", value1, value2, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeachContentNotBetween(String value1, String value2) {
            addCriterion("TeachContent not between", value1, value2, "teachContent");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredIsNull() {
            addCriterion("TeacherQualityScored is null");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredIsNotNull() {
            addCriterion("TeacherQualityScored is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredEqualTo(Float value) {
            addCriterion("TeacherQualityScored =", value, "teacherQualityScored");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredNotEqualTo(Float value) {
            addCriterion("TeacherQualityScored <>", value, "teacherQualityScored");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredGreaterThan(Float value) {
            addCriterion("TeacherQualityScored >", value, "teacherQualityScored");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredGreaterThanOrEqualTo(Float value) {
            addCriterion("TeacherQualityScored >=", value, "teacherQualityScored");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredLessThan(Float value) {
            addCriterion("TeacherQualityScored <", value, "teacherQualityScored");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredLessThanOrEqualTo(Float value) {
            addCriterion("TeacherQualityScored <=", value, "teacherQualityScored");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredIn(List<Float> values) {
            addCriterion("TeacherQualityScored in", values, "teacherQualityScored");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredNotIn(List<Float> values) {
            addCriterion("TeacherQualityScored not in", values, "teacherQualityScored");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredBetween(Float value1, Float value2) {
            addCriterion("TeacherQualityScored between", value1, value2, "teacherQualityScored");
            return (Criteria) this;
        }

        public Criteria andTeacherQualityScoredNotBetween(Float value1, Float value2) {
            addCriterion("TeacherQualityScored not between", value1, value2, "teacherQualityScored");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredIsNull() {
            addCriterion("TeachGoalsScored is null");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredIsNotNull() {
            addCriterion("TeachGoalsScored is not null");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredEqualTo(Float value) {
            addCriterion("TeachGoalsScored =", value, "teachGoalsScored");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredNotEqualTo(Float value) {
            addCriterion("TeachGoalsScored <>", value, "teachGoalsScored");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredGreaterThan(Float value) {
            addCriterion("TeachGoalsScored >", value, "teachGoalsScored");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredGreaterThanOrEqualTo(Float value) {
            addCriterion("TeachGoalsScored >=", value, "teachGoalsScored");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredLessThan(Float value) {
            addCriterion("TeachGoalsScored <", value, "teachGoalsScored");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredLessThanOrEqualTo(Float value) {
            addCriterion("TeachGoalsScored <=", value, "teachGoalsScored");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredIn(List<Float> values) {
            addCriterion("TeachGoalsScored in", values, "teachGoalsScored");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredNotIn(List<Float> values) {
            addCriterion("TeachGoalsScored not in", values, "teachGoalsScored");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredBetween(Float value1, Float value2) {
            addCriterion("TeachGoalsScored between", value1, value2, "teachGoalsScored");
            return (Criteria) this;
        }

        public Criteria andTeachGoalsScoredNotBetween(Float value1, Float value2) {
            addCriterion("TeachGoalsScored not between", value1, value2, "teachGoalsScored");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredIsNull() {
            addCriterion("TeachContentScored is null");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredIsNotNull() {
            addCriterion("TeachContentScored is not null");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredEqualTo(Float value) {
            addCriterion("TeachContentScored =", value, "teachContentScored");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredNotEqualTo(Float value) {
            addCriterion("TeachContentScored <>", value, "teachContentScored");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredGreaterThan(Float value) {
            addCriterion("TeachContentScored >", value, "teachContentScored");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredGreaterThanOrEqualTo(Float value) {
            addCriterion("TeachContentScored >=", value, "teachContentScored");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredLessThan(Float value) {
            addCriterion("TeachContentScored <", value, "teachContentScored");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredLessThanOrEqualTo(Float value) {
            addCriterion("TeachContentScored <=", value, "teachContentScored");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredIn(List<Float> values) {
            addCriterion("TeachContentScored in", values, "teachContentScored");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredNotIn(List<Float> values) {
            addCriterion("TeachContentScored not in", values, "teachContentScored");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredBetween(Float value1, Float value2) {
            addCriterion("TeachContentScored between", value1, value2, "teachContentScored");
            return (Criteria) this;
        }

        public Criteria andTeachContentScoredNotBetween(Float value1, Float value2) {
            addCriterion("TeachContentScored not between", value1, value2, "teachContentScored");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredIsNull() {
            addCriterion("TeachMethodsScored is null");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredIsNotNull() {
            addCriterion("TeachMethodsScored is not null");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredEqualTo(Float value) {
            addCriterion("TeachMethodsScored =", value, "teachMethodsScored");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredNotEqualTo(Float value) {
            addCriterion("TeachMethodsScored <>", value, "teachMethodsScored");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredGreaterThan(Float value) {
            addCriterion("TeachMethodsScored >", value, "teachMethodsScored");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredGreaterThanOrEqualTo(Float value) {
            addCriterion("TeachMethodsScored >=", value, "teachMethodsScored");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredLessThan(Float value) {
            addCriterion("TeachMethodsScored <", value, "teachMethodsScored");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredLessThanOrEqualTo(Float value) {
            addCriterion("TeachMethodsScored <=", value, "teachMethodsScored");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredIn(List<Float> values) {
            addCriterion("TeachMethodsScored in", values, "teachMethodsScored");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredNotIn(List<Float> values) {
            addCriterion("TeachMethodsScored not in", values, "teachMethodsScored");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredBetween(Float value1, Float value2) {
            addCriterion("TeachMethodsScored between", value1, value2, "teachMethodsScored");
            return (Criteria) this;
        }

        public Criteria andTeachMethodsScoredNotBetween(Float value1, Float value2) {
            addCriterion("TeachMethodsScored not between", value1, value2, "teachMethodsScored");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredIsNull() {
            addCriterion("TeachRoutineScored is null");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredIsNotNull() {
            addCriterion("TeachRoutineScored is not null");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredEqualTo(Float value) {
            addCriterion("TeachRoutineScored =", value, "teachRoutineScored");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredNotEqualTo(Float value) {
            addCriterion("TeachRoutineScored <>", value, "teachRoutineScored");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredGreaterThan(Float value) {
            addCriterion("TeachRoutineScored >", value, "teachRoutineScored");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredGreaterThanOrEqualTo(Float value) {
            addCriterion("TeachRoutineScored >=", value, "teachRoutineScored");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredLessThan(Float value) {
            addCriterion("TeachRoutineScored <", value, "teachRoutineScored");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredLessThanOrEqualTo(Float value) {
            addCriterion("TeachRoutineScored <=", value, "teachRoutineScored");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredIn(List<Float> values) {
            addCriterion("TeachRoutineScored in", values, "teachRoutineScored");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredNotIn(List<Float> values) {
            addCriterion("TeachRoutineScored not in", values, "teachRoutineScored");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredBetween(Float value1, Float value2) {
            addCriterion("TeachRoutineScored between", value1, value2, "teachRoutineScored");
            return (Criteria) this;
        }

        public Criteria andTeachRoutineScoredNotBetween(Float value1, Float value2) {
            addCriterion("TeachRoutineScored not between", value1, value2, "teachRoutineScored");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredIsNull() {
            addCriterion("TeachEffectScored is null");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredIsNotNull() {
            addCriterion("TeachEffectScored is not null");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredEqualTo(Float value) {
            addCriterion("TeachEffectScored =", value, "teachEffectScored");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredNotEqualTo(Float value) {
            addCriterion("TeachEffectScored <>", value, "teachEffectScored");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredGreaterThan(Float value) {
            addCriterion("TeachEffectScored >", value, "teachEffectScored");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredGreaterThanOrEqualTo(Float value) {
            addCriterion("TeachEffectScored >=", value, "teachEffectScored");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredLessThan(Float value) {
            addCriterion("TeachEffectScored <", value, "teachEffectScored");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredLessThanOrEqualTo(Float value) {
            addCriterion("TeachEffectScored <=", value, "teachEffectScored");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredIn(List<Float> values) {
            addCriterion("TeachEffectScored in", values, "teachEffectScored");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredNotIn(List<Float> values) {
            addCriterion("TeachEffectScored not in", values, "teachEffectScored");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredBetween(Float value1, Float value2) {
            addCriterion("TeachEffectScored between", value1, value2, "teachEffectScored");
            return (Criteria) this;
        }

        public Criteria andTeachEffectScoredNotBetween(Float value1, Float value2) {
            addCriterion("TeachEffectScored not between", value1, value2, "teachEffectScored");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("Status not between", value1, value2, "status");
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