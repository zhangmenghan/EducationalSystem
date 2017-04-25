package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherpayrollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherpayrollExample() {
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

        public Criteria andPayrollIdIsNull() {
            addCriterion("PayrollId is null");
            return (Criteria) this;
        }

        public Criteria andPayrollIdIsNotNull() {
            addCriterion("PayrollId is not null");
            return (Criteria) this;
        }

        public Criteria andPayrollIdEqualTo(Integer value) {
            addCriterion("PayrollId =", value, "payrollId");
            return (Criteria) this;
        }

        public Criteria andPayrollIdNotEqualTo(Integer value) {
            addCriterion("PayrollId <>", value, "payrollId");
            return (Criteria) this;
        }

        public Criteria andPayrollIdGreaterThan(Integer value) {
            addCriterion("PayrollId >", value, "payrollId");
            return (Criteria) this;
        }

        public Criteria andPayrollIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayrollId >=", value, "payrollId");
            return (Criteria) this;
        }

        public Criteria andPayrollIdLessThan(Integer value) {
            addCriterion("PayrollId <", value, "payrollId");
            return (Criteria) this;
        }

        public Criteria andPayrollIdLessThanOrEqualTo(Integer value) {
            addCriterion("PayrollId <=", value, "payrollId");
            return (Criteria) this;
        }

        public Criteria andPayrollIdIn(List<Integer> values) {
            addCriterion("PayrollId in", values, "payrollId");
            return (Criteria) this;
        }

        public Criteria andPayrollIdNotIn(List<Integer> values) {
            addCriterion("PayrollId not in", values, "payrollId");
            return (Criteria) this;
        }

        public Criteria andPayrollIdBetween(Integer value1, Integer value2) {
            addCriterion("PayrollId between", value1, value2, "payrollId");
            return (Criteria) this;
        }

        public Criteria andPayrollIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PayrollId not between", value1, value2, "payrollId");
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

        public Criteria andWageIsNull() {
            addCriterion("Wage is null");
            return (Criteria) this;
        }

        public Criteria andWageIsNotNull() {
            addCriterion("Wage is not null");
            return (Criteria) this;
        }

        public Criteria andWageEqualTo(Float value) {
            addCriterion("Wage =", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotEqualTo(Float value) {
            addCriterion("Wage <>", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageGreaterThan(Float value) {
            addCriterion("Wage >", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageGreaterThanOrEqualTo(Float value) {
            addCriterion("Wage >=", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLessThan(Float value) {
            addCriterion("Wage <", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLessThanOrEqualTo(Float value) {
            addCriterion("Wage <=", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageIn(List<Float> values) {
            addCriterion("Wage in", values, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotIn(List<Float> values) {
            addCriterion("Wage not in", values, "wage");
            return (Criteria) this;
        }

        public Criteria andWageBetween(Float value1, Float value2) {
            addCriterion("Wage between", value1, value2, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotBetween(Float value1, Float value2) {
            addCriterion("Wage not between", value1, value2, "wage");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeIsNull() {
            addCriterion("SystemPaytime is null");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeIsNotNull() {
            addCriterion("SystemPaytime is not null");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeEqualTo(Date value) {
            addCriterion("SystemPaytime =", value, "systemPaytime");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeNotEqualTo(Date value) {
            addCriterion("SystemPaytime <>", value, "systemPaytime");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeGreaterThan(Date value) {
            addCriterion("SystemPaytime >", value, "systemPaytime");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SystemPaytime >=", value, "systemPaytime");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeLessThan(Date value) {
            addCriterion("SystemPaytime <", value, "systemPaytime");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("SystemPaytime <=", value, "systemPaytime");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeIn(List<Date> values) {
            addCriterion("SystemPaytime in", values, "systemPaytime");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeNotIn(List<Date> values) {
            addCriterion("SystemPaytime not in", values, "systemPaytime");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeBetween(Date value1, Date value2) {
            addCriterion("SystemPaytime between", value1, value2, "systemPaytime");
            return (Criteria) this;
        }

        public Criteria andSystemPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("SystemPaytime not between", value1, value2, "systemPaytime");
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