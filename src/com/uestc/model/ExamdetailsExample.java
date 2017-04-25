package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class ExamdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamdetailsExample() {
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

        public Criteria andExamDetailsIdIsNull() {
            addCriterion("ExamDetailsId is null");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdIsNotNull() {
            addCriterion("ExamDetailsId is not null");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdEqualTo(String value) {
            addCriterion("ExamDetailsId =", value, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdNotEqualTo(String value) {
            addCriterion("ExamDetailsId <>", value, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdGreaterThan(String value) {
            addCriterion("ExamDetailsId >", value, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ExamDetailsId >=", value, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdLessThan(String value) {
            addCriterion("ExamDetailsId <", value, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdLessThanOrEqualTo(String value) {
            addCriterion("ExamDetailsId <=", value, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdLike(String value) {
            addCriterion("ExamDetailsId like", value, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdNotLike(String value) {
            addCriterion("ExamDetailsId not like", value, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdIn(List<String> values) {
            addCriterion("ExamDetailsId in", values, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdNotIn(List<String> values) {
            addCriterion("ExamDetailsId not in", values, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdBetween(String value1, String value2) {
            addCriterion("ExamDetailsId between", value1, value2, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andExamDetailsIdNotBetween(String value1, String value2) {
            addCriterion("ExamDetailsId not between", value1, value2, "examDetailsId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdIsNull() {
            addCriterion("TimeAndPlaceId is null");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdIsNotNull() {
            addCriterion("TimeAndPlaceId is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdEqualTo(String value) {
            addCriterion("TimeAndPlaceId =", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdNotEqualTo(String value) {
            addCriterion("TimeAndPlaceId <>", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdGreaterThan(String value) {
            addCriterion("TimeAndPlaceId >", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("TimeAndPlaceId >=", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdLessThan(String value) {
            addCriterion("TimeAndPlaceId <", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdLessThanOrEqualTo(String value) {
            addCriterion("TimeAndPlaceId <=", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdLike(String value) {
            addCriterion("TimeAndPlaceId like", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdNotLike(String value) {
            addCriterion("TimeAndPlaceId not like", value, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdIn(List<String> values) {
            addCriterion("TimeAndPlaceId in", values, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdNotIn(List<String> values) {
            addCriterion("TimeAndPlaceId not in", values, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdBetween(String value1, String value2) {
            addCriterion("TimeAndPlaceId between", value1, value2, "timeAndPlaceId");
            return (Criteria) this;
        }

        public Criteria andTimeAndPlaceIdNotBetween(String value1, String value2) {
            addCriterion("TimeAndPlaceId not between", value1, value2, "timeAndPlaceId");
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

        public Criteria andInvigilatorFirIsNull() {
            addCriterion("InvigilatorFir is null");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirIsNotNull() {
            addCriterion("InvigilatorFir is not null");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirEqualTo(String value) {
            addCriterion("InvigilatorFir =", value, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirNotEqualTo(String value) {
            addCriterion("InvigilatorFir <>", value, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirGreaterThan(String value) {
            addCriterion("InvigilatorFir >", value, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirGreaterThanOrEqualTo(String value) {
            addCriterion("InvigilatorFir >=", value, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirLessThan(String value) {
            addCriterion("InvigilatorFir <", value, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirLessThanOrEqualTo(String value) {
            addCriterion("InvigilatorFir <=", value, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirLike(String value) {
            addCriterion("InvigilatorFir like", value, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirNotLike(String value) {
            addCriterion("InvigilatorFir not like", value, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirIn(List<String> values) {
            addCriterion("InvigilatorFir in", values, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirNotIn(List<String> values) {
            addCriterion("InvigilatorFir not in", values, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirBetween(String value1, String value2) {
            addCriterion("InvigilatorFir between", value1, value2, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorFirNotBetween(String value1, String value2) {
            addCriterion("InvigilatorFir not between", value1, value2, "invigilatorFir");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecIsNull() {
            addCriterion("InvigilatorSec is null");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecIsNotNull() {
            addCriterion("InvigilatorSec is not null");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecEqualTo(String value) {
            addCriterion("InvigilatorSec =", value, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecNotEqualTo(String value) {
            addCriterion("InvigilatorSec <>", value, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecGreaterThan(String value) {
            addCriterion("InvigilatorSec >", value, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecGreaterThanOrEqualTo(String value) {
            addCriterion("InvigilatorSec >=", value, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecLessThan(String value) {
            addCriterion("InvigilatorSec <", value, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecLessThanOrEqualTo(String value) {
            addCriterion("InvigilatorSec <=", value, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecLike(String value) {
            addCriterion("InvigilatorSec like", value, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecNotLike(String value) {
            addCriterion("InvigilatorSec not like", value, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecIn(List<String> values) {
            addCriterion("InvigilatorSec in", values, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecNotIn(List<String> values) {
            addCriterion("InvigilatorSec not in", values, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecBetween(String value1, String value2) {
            addCriterion("InvigilatorSec between", value1, value2, "invigilatorSec");
            return (Criteria) this;
        }

        public Criteria andInvigilatorSecNotBetween(String value1, String value2) {
            addCriterion("InvigilatorSec not between", value1, value2, "invigilatorSec");
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