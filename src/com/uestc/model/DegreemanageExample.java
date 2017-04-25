package com.uestc.model;

import java.util.ArrayList;
import java.util.List;

public class DegreemanageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DegreemanageExample() {
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

        public Criteria andGraduateSchoolIsNull() {
            addCriterion("GraduateSchool is null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNotNull() {
            addCriterion("GraduateSchool is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolEqualTo(String value) {
            addCriterion("GraduateSchool =", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotEqualTo(String value) {
            addCriterion("GraduateSchool <>", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThan(String value) {
            addCriterion("GraduateSchool >", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("GraduateSchool >=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThan(String value) {
            addCriterion("GraduateSchool <", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("GraduateSchool <=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLike(String value) {
            addCriterion("GraduateSchool like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotLike(String value) {
            addCriterion("GraduateSchool not like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIn(List<String> values) {
            addCriterion("GraduateSchool in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotIn(List<String> values) {
            addCriterion("GraduateSchool not in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolBetween(String value1, String value2) {
            addCriterion("GraduateSchool between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("GraduateSchool not between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andSecialtyIsNull() {
            addCriterion("Secialty is null");
            return (Criteria) this;
        }

        public Criteria andSecialtyIsNotNull() {
            addCriterion("Secialty is not null");
            return (Criteria) this;
        }

        public Criteria andSecialtyEqualTo(String value) {
            addCriterion("Secialty =", value, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyNotEqualTo(String value) {
            addCriterion("Secialty <>", value, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyGreaterThan(String value) {
            addCriterion("Secialty >", value, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("Secialty >=", value, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyLessThan(String value) {
            addCriterion("Secialty <", value, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyLessThanOrEqualTo(String value) {
            addCriterion("Secialty <=", value, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyLike(String value) {
            addCriterion("Secialty like", value, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyNotLike(String value) {
            addCriterion("Secialty not like", value, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyIn(List<String> values) {
            addCriterion("Secialty in", values, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyNotIn(List<String> values) {
            addCriterion("Secialty not in", values, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyBetween(String value1, String value2) {
            addCriterion("Secialty between", value1, value2, "secialty");
            return (Criteria) this;
        }

        public Criteria andSecialtyNotBetween(String value1, String value2) {
            addCriterion("Secialty not between", value1, value2, "secialty");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemIsNull() {
            addCriterion("SchoolSystem is null");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemIsNotNull() {
            addCriterion("SchoolSystem is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemEqualTo(Byte value) {
            addCriterion("SchoolSystem =", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemNotEqualTo(Byte value) {
            addCriterion("SchoolSystem <>", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemGreaterThan(Byte value) {
            addCriterion("SchoolSystem >", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemGreaterThanOrEqualTo(Byte value) {
            addCriterion("SchoolSystem >=", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemLessThan(Byte value) {
            addCriterion("SchoolSystem <", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemLessThanOrEqualTo(Byte value) {
            addCriterion("SchoolSystem <=", value, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemIn(List<Byte> values) {
            addCriterion("SchoolSystem in", values, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemNotIn(List<Byte> values) {
            addCriterion("SchoolSystem not in", values, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemBetween(Byte value1, Byte value2) {
            addCriterion("SchoolSystem between", value1, value2, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andSchoolSystemNotBetween(Byte value1, Byte value2) {
            addCriterion("SchoolSystem not between", value1, value2, "schoolSystem");
            return (Criteria) this;
        }

        public Criteria andHighestEDUIsNull() {
            addCriterion("HighestEDU is null");
            return (Criteria) this;
        }

        public Criteria andHighestEDUIsNotNull() {
            addCriterion("HighestEDU is not null");
            return (Criteria) this;
        }

        public Criteria andHighestEDUEqualTo(String value) {
            addCriterion("HighestEDU =", value, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDUNotEqualTo(String value) {
            addCriterion("HighestEDU <>", value, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDUGreaterThan(String value) {
            addCriterion("HighestEDU >", value, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDUGreaterThanOrEqualTo(String value) {
            addCriterion("HighestEDU >=", value, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDULessThan(String value) {
            addCriterion("HighestEDU <", value, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDULessThanOrEqualTo(String value) {
            addCriterion("HighestEDU <=", value, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDULike(String value) {
            addCriterion("HighestEDU like", value, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDUNotLike(String value) {
            addCriterion("HighestEDU not like", value, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDUIn(List<String> values) {
            addCriterion("HighestEDU in", values, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDUNotIn(List<String> values) {
            addCriterion("HighestEDU not in", values, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDUBetween(String value1, String value2) {
            addCriterion("HighestEDU between", value1, value2, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestEDUNotBetween(String value1, String value2) {
            addCriterion("HighestEDU not between", value1, value2, "highestEDU");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeIsNull() {
            addCriterion("HighestDegree is null");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeIsNotNull() {
            addCriterion("HighestDegree is not null");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeEqualTo(String value) {
            addCriterion("HighestDegree =", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeNotEqualTo(String value) {
            addCriterion("HighestDegree <>", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeGreaterThan(String value) {
            addCriterion("HighestDegree >", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("HighestDegree >=", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLessThan(String value) {
            addCriterion("HighestDegree <", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLessThanOrEqualTo(String value) {
            addCriterion("HighestDegree <=", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeLike(String value) {
            addCriterion("HighestDegree like", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeNotLike(String value) {
            addCriterion("HighestDegree not like", value, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeIn(List<String> values) {
            addCriterion("HighestDegree in", values, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeNotIn(List<String> values) {
            addCriterion("HighestDegree not in", values, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeBetween(String value1, String value2) {
            addCriterion("HighestDegree between", value1, value2, "highestDegree");
            return (Criteria) this;
        }

        public Criteria andHighestDegreeNotBetween(String value1, String value2) {
            addCriterion("HighestDegree not between", value1, value2, "highestDegree");
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