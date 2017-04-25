package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoursewareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursewareExample() {
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

        public Criteria andCoursewareIdIsNull() {
            addCriterion("CoursewareId is null");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdIsNotNull() {
            addCriterion("CoursewareId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdEqualTo(Integer value) {
            addCriterion("CoursewareId =", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdNotEqualTo(Integer value) {
            addCriterion("CoursewareId <>", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdGreaterThan(Integer value) {
            addCriterion("CoursewareId >", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CoursewareId >=", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdLessThan(Integer value) {
            addCriterion("CoursewareId <", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdLessThanOrEqualTo(Integer value) {
            addCriterion("CoursewareId <=", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdIn(List<Integer> values) {
            addCriterion("CoursewareId in", values, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdNotIn(List<Integer> values) {
            addCriterion("CoursewareId not in", values, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdBetween(Integer value1, Integer value2) {
            addCriterion("CoursewareId between", value1, value2, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CoursewareId not between", value1, value2, "coursewareId");
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

        public Criteria andCoursewareUriIsNull() {
            addCriterion("CoursewareUri is null");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriIsNotNull() {
            addCriterion("CoursewareUri is not null");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriEqualTo(String value) {
            addCriterion("CoursewareUri =", value, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriNotEqualTo(String value) {
            addCriterion("CoursewareUri <>", value, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriGreaterThan(String value) {
            addCriterion("CoursewareUri >", value, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriGreaterThanOrEqualTo(String value) {
            addCriterion("CoursewareUri >=", value, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriLessThan(String value) {
            addCriterion("CoursewareUri <", value, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriLessThanOrEqualTo(String value) {
            addCriterion("CoursewareUri <=", value, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriLike(String value) {
            addCriterion("CoursewareUri like", value, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriNotLike(String value) {
            addCriterion("CoursewareUri not like", value, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriIn(List<String> values) {
            addCriterion("CoursewareUri in", values, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriNotIn(List<String> values) {
            addCriterion("CoursewareUri not in", values, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriBetween(String value1, String value2) {
            addCriterion("CoursewareUri between", value1, value2, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUriNotBetween(String value1, String value2) {
            addCriterion("CoursewareUri not between", value1, value2, "coursewareUri");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeIsNull() {
            addCriterion("CoursewareUptime is null");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeIsNotNull() {
            addCriterion("CoursewareUptime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeEqualTo(Date value) {
            addCriterion("CoursewareUptime =", value, "coursewareUptime");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeNotEqualTo(Date value) {
            addCriterion("CoursewareUptime <>", value, "coursewareUptime");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeGreaterThan(Date value) {
            addCriterion("CoursewareUptime >", value, "coursewareUptime");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CoursewareUptime >=", value, "coursewareUptime");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeLessThan(Date value) {
            addCriterion("CoursewareUptime <", value, "coursewareUptime");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeLessThanOrEqualTo(Date value) {
            addCriterion("CoursewareUptime <=", value, "coursewareUptime");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeIn(List<Date> values) {
            addCriterion("CoursewareUptime in", values, "coursewareUptime");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeNotIn(List<Date> values) {
            addCriterion("CoursewareUptime not in", values, "coursewareUptime");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeBetween(Date value1, Date value2) {
            addCriterion("CoursewareUptime between", value1, value2, "coursewareUptime");
            return (Criteria) this;
        }

        public Criteria andCoursewareUptimeNotBetween(Date value1, Date value2) {
            addCriterion("CoursewareUptime not between", value1, value2, "coursewareUptime");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeIsNull() {
            addCriterion("CoursewareType is null");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeIsNotNull() {
            addCriterion("CoursewareType is not null");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeEqualTo(Byte value) {
            addCriterion("CoursewareType =", value, "coursewareType");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeNotEqualTo(Byte value) {
            addCriterion("CoursewareType <>", value, "coursewareType");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeGreaterThan(Byte value) {
            addCriterion("CoursewareType >", value, "coursewareType");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("CoursewareType >=", value, "coursewareType");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeLessThan(Byte value) {
            addCriterion("CoursewareType <", value, "coursewareType");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeLessThanOrEqualTo(Byte value) {
            addCriterion("CoursewareType <=", value, "coursewareType");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeIn(List<Byte> values) {
            addCriterion("CoursewareType in", values, "coursewareType");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeNotIn(List<Byte> values) {
            addCriterion("CoursewareType not in", values, "coursewareType");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeBetween(Byte value1, Byte value2) {
            addCriterion("CoursewareType between", value1, value2, "coursewareType");
            return (Criteria) this;
        }

        public Criteria andCoursewareTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("CoursewareType not between", value1, value2, "coursewareType");
            return (Criteria) this;
        }

        public Criteria andTARAuditIsNull() {
            addCriterion("TARAudit is null");
            return (Criteria) this;
        }

        public Criteria andTARAuditIsNotNull() {
            addCriterion("TARAudit is not null");
            return (Criteria) this;
        }

        public Criteria andTARAuditEqualTo(Byte value) {
            addCriterion("TARAudit =", value, "TARAudit");
            return (Criteria) this;
        }

        public Criteria andTARAuditNotEqualTo(Byte value) {
            addCriterion("TARAudit <>", value, "TARAudit");
            return (Criteria) this;
        }

        public Criteria andTARAuditGreaterThan(Byte value) {
            addCriterion("TARAudit >", value, "TARAudit");
            return (Criteria) this;
        }

        public Criteria andTARAuditGreaterThanOrEqualTo(Byte value) {
            addCriterion("TARAudit >=", value, "TARAudit");
            return (Criteria) this;
        }

        public Criteria andTARAuditLessThan(Byte value) {
            addCriterion("TARAudit <", value, "TARAudit");
            return (Criteria) this;
        }

        public Criteria andTARAuditLessThanOrEqualTo(Byte value) {
            addCriterion("TARAudit <=", value, "TARAudit");
            return (Criteria) this;
        }

        public Criteria andTARAuditIn(List<Byte> values) {
            addCriterion("TARAudit in", values, "TARAudit");
            return (Criteria) this;
        }

        public Criteria andTARAuditNotIn(List<Byte> values) {
            addCriterion("TARAudit not in", values, "TARAudit");
            return (Criteria) this;
        }

        public Criteria andTARAuditBetween(Byte value1, Byte value2) {
            addCriterion("TARAudit between", value1, value2, "TARAudit");
            return (Criteria) this;
        }

        public Criteria andTARAuditNotBetween(Byte value1, Byte value2) {
            addCriterion("TARAudit not between", value1, value2, "TARAudit");
            return (Criteria) this;
        }

        public Criteria andEDUAuditIsNull() {
            addCriterion("EDUAudit is null");
            return (Criteria) this;
        }

        public Criteria andEDUAuditIsNotNull() {
            addCriterion("EDUAudit is not null");
            return (Criteria) this;
        }

        public Criteria andEDUAuditEqualTo(Byte value) {
            addCriterion("EDUAudit =", value, "EDUAudit");
            return (Criteria) this;
        }

        public Criteria andEDUAuditNotEqualTo(Byte value) {
            addCriterion("EDUAudit <>", value, "EDUAudit");
            return (Criteria) this;
        }

        public Criteria andEDUAuditGreaterThan(Byte value) {
            addCriterion("EDUAudit >", value, "EDUAudit");
            return (Criteria) this;
        }

        public Criteria andEDUAuditGreaterThanOrEqualTo(Byte value) {
            addCriterion("EDUAudit >=", value, "EDUAudit");
            return (Criteria) this;
        }

        public Criteria andEDUAuditLessThan(Byte value) {
            addCriterion("EDUAudit <", value, "EDUAudit");
            return (Criteria) this;
        }

        public Criteria andEDUAuditLessThanOrEqualTo(Byte value) {
            addCriterion("EDUAudit <=", value, "EDUAudit");
            return (Criteria) this;
        }

        public Criteria andEDUAuditIn(List<Byte> values) {
            addCriterion("EDUAudit in", values, "EDUAudit");
            return (Criteria) this;
        }

        public Criteria andEDUAuditNotIn(List<Byte> values) {
            addCriterion("EDUAudit not in", values, "EDUAudit");
            return (Criteria) this;
        }

        public Criteria andEDUAuditBetween(Byte value1, Byte value2) {
            addCriterion("EDUAudit between", value1, value2, "EDUAudit");
            return (Criteria) this;
        }

        public Criteria andEDUAuditNotBetween(Byte value1, Byte value2) {
            addCriterion("EDUAudit not between", value1, value2, "EDUAudit");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("AuditTime is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("AuditTime is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("AuditTime =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("AuditTime <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("AuditTime >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AuditTime >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("AuditTime <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("AuditTime <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("AuditTime in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("AuditTime not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("AuditTime between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("AuditTime not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdIsNull() {
            addCriterion("AuditorsTARId is null");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdIsNotNull() {
            addCriterion("AuditorsTARId is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdEqualTo(String value) {
            addCriterion("AuditorsTARId =", value, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdNotEqualTo(String value) {
            addCriterion("AuditorsTARId <>", value, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdGreaterThan(String value) {
            addCriterion("AuditorsTARId >", value, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdGreaterThanOrEqualTo(String value) {
            addCriterion("AuditorsTARId >=", value, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdLessThan(String value) {
            addCriterion("AuditorsTARId <", value, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdLessThanOrEqualTo(String value) {
            addCriterion("AuditorsTARId <=", value, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdLike(String value) {
            addCriterion("AuditorsTARId like", value, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdNotLike(String value) {
            addCriterion("AuditorsTARId not like", value, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdIn(List<String> values) {
            addCriterion("AuditorsTARId in", values, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdNotIn(List<String> values) {
            addCriterion("AuditorsTARId not in", values, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdBetween(String value1, String value2) {
            addCriterion("AuditorsTARId between", value1, value2, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsTARIdNotBetween(String value1, String value2) {
            addCriterion("AuditorsTARId not between", value1, value2, "auditorsTARId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdIsNull() {
            addCriterion("AuditorsEDUId is null");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdIsNotNull() {
            addCriterion("AuditorsEDUId is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdEqualTo(String value) {
            addCriterion("AuditorsEDUId =", value, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdNotEqualTo(String value) {
            addCriterion("AuditorsEDUId <>", value, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdGreaterThan(String value) {
            addCriterion("AuditorsEDUId >", value, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdGreaterThanOrEqualTo(String value) {
            addCriterion("AuditorsEDUId >=", value, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdLessThan(String value) {
            addCriterion("AuditorsEDUId <", value, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdLessThanOrEqualTo(String value) {
            addCriterion("AuditorsEDUId <=", value, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdLike(String value) {
            addCriterion("AuditorsEDUId like", value, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdNotLike(String value) {
            addCriterion("AuditorsEDUId not like", value, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdIn(List<String> values) {
            addCriterion("AuditorsEDUId in", values, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdNotIn(List<String> values) {
            addCriterion("AuditorsEDUId not in", values, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdBetween(String value1, String value2) {
            addCriterion("AuditorsEDUId between", value1, value2, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditorsEDUIdNotBetween(String value1, String value2) {
            addCriterion("AuditorsEDUId not between", value1, value2, "auditorsEDUId");
            return (Criteria) this;
        }

        public Criteria andAuditRecordIsNull() {
            addCriterion("AuditRecord is null");
            return (Criteria) this;
        }

        public Criteria andAuditRecordIsNotNull() {
            addCriterion("AuditRecord is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRecordEqualTo(Float value) {
            addCriterion("AuditRecord =", value, "auditRecord");
            return (Criteria) this;
        }

        public Criteria andAuditRecordNotEqualTo(Float value) {
            addCriterion("AuditRecord <>", value, "auditRecord");
            return (Criteria) this;
        }

        public Criteria andAuditRecordGreaterThan(Float value) {
            addCriterion("AuditRecord >", value, "auditRecord");
            return (Criteria) this;
        }

        public Criteria andAuditRecordGreaterThanOrEqualTo(Float value) {
            addCriterion("AuditRecord >=", value, "auditRecord");
            return (Criteria) this;
        }

        public Criteria andAuditRecordLessThan(Float value) {
            addCriterion("AuditRecord <", value, "auditRecord");
            return (Criteria) this;
        }

        public Criteria andAuditRecordLessThanOrEqualTo(Float value) {
            addCriterion("AuditRecord <=", value, "auditRecord");
            return (Criteria) this;
        }

        public Criteria andAuditRecordIn(List<Float> values) {
            addCriterion("AuditRecord in", values, "auditRecord");
            return (Criteria) this;
        }

        public Criteria andAuditRecordNotIn(List<Float> values) {
            addCriterion("AuditRecord not in", values, "auditRecord");
            return (Criteria) this;
        }

        public Criteria andAuditRecordBetween(Float value1, Float value2) {
            addCriterion("AuditRecord between", value1, value2, "auditRecord");
            return (Criteria) this;
        }

        public Criteria andAuditRecordNotBetween(Float value1, Float value2) {
            addCriterion("AuditRecord not between", value1, value2, "auditRecord");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermIsNull() {
            addCriterion("UpSchoolTerm is null");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermIsNotNull() {
            addCriterion("UpSchoolTerm is not null");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermEqualTo(String value) {
            addCriterion("UpSchoolTerm =", value, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermNotEqualTo(String value) {
            addCriterion("UpSchoolTerm <>", value, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermGreaterThan(String value) {
            addCriterion("UpSchoolTerm >", value, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermGreaterThanOrEqualTo(String value) {
            addCriterion("UpSchoolTerm >=", value, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermLessThan(String value) {
            addCriterion("UpSchoolTerm <", value, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermLessThanOrEqualTo(String value) {
            addCriterion("UpSchoolTerm <=", value, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermLike(String value) {
            addCriterion("UpSchoolTerm like", value, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermNotLike(String value) {
            addCriterion("UpSchoolTerm not like", value, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermIn(List<String> values) {
            addCriterion("UpSchoolTerm in", values, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermNotIn(List<String> values) {
            addCriterion("UpSchoolTerm not in", values, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermBetween(String value1, String value2) {
            addCriterion("UpSchoolTerm between", value1, value2, "upSchoolTerm");
            return (Criteria) this;
        }

        public Criteria andUpSchoolTermNotBetween(String value1, String value2) {
            addCriterion("UpSchoolTerm not between", value1, value2, "upSchoolTerm");
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