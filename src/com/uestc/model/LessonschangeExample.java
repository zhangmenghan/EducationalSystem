package com.uestc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LessonschangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LessonschangeExample() {
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

        public Criteria andLessonsChangeIdIsNull() {
            addCriterion("LessonsChangeId is null");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdIsNotNull() {
            addCriterion("LessonsChangeId is not null");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdEqualTo(String value) {
            addCriterion("LessonsChangeId =", value, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdNotEqualTo(String value) {
            addCriterion("LessonsChangeId <>", value, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdGreaterThan(String value) {
            addCriterion("LessonsChangeId >", value, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("LessonsChangeId >=", value, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdLessThan(String value) {
            addCriterion("LessonsChangeId <", value, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdLessThanOrEqualTo(String value) {
            addCriterion("LessonsChangeId <=", value, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdLike(String value) {
            addCriterion("LessonsChangeId like", value, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdNotLike(String value) {
            addCriterion("LessonsChangeId not like", value, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdIn(List<String> values) {
            addCriterion("LessonsChangeId in", values, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdNotIn(List<String> values) {
            addCriterion("LessonsChangeId not in", values, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdBetween(String value1, String value2) {
            addCriterion("LessonsChangeId between", value1, value2, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeIdNotBetween(String value1, String value2) {
            addCriterion("LessonsChangeId not between", value1, value2, "lessonsChangeId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdIsNull() {
            addCriterion("GiveLessonsDetailsId is null");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdIsNotNull() {
            addCriterion("GiveLessonsDetailsId is not null");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdEqualTo(String value) {
            addCriterion("GiveLessonsDetailsId =", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdNotEqualTo(String value) {
            addCriterion("GiveLessonsDetailsId <>", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdGreaterThan(String value) {
            addCriterion("GiveLessonsDetailsId >", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("GiveLessonsDetailsId >=", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdLessThan(String value) {
            addCriterion("GiveLessonsDetailsId <", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdLessThanOrEqualTo(String value) {
            addCriterion("GiveLessonsDetailsId <=", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdLike(String value) {
            addCriterion("GiveLessonsDetailsId like", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdNotLike(String value) {
            addCriterion("GiveLessonsDetailsId not like", value, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdIn(List<String> values) {
            addCriterion("GiveLessonsDetailsId in", values, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdNotIn(List<String> values) {
            addCriterion("GiveLessonsDetailsId not in", values, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdBetween(String value1, String value2) {
            addCriterion("GiveLessonsDetailsId between", value1, value2, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andGiveLessonsDetailsIdNotBetween(String value1, String value2) {
            addCriterion("GiveLessonsDetailsId not between", value1, value2, "giveLessonsDetailsId");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("ChangeType is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("ChangeType is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(Byte value) {
            addCriterion("ChangeType =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(Byte value) {
            addCriterion("ChangeType <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(Byte value) {
            addCriterion("ChangeType >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ChangeType >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(Byte value) {
            addCriterion("ChangeType <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(Byte value) {
            addCriterion("ChangeType <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<Byte> values) {
            addCriterion("ChangeType in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<Byte> values) {
            addCriterion("ChangeType not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(Byte value1, Byte value2) {
            addCriterion("ChangeType between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ChangeType not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNull() {
            addCriterion("ApplicationTime is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNotNull() {
            addCriterion("ApplicationTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeEqualTo(Date value) {
            addCriterion("ApplicationTime =", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotEqualTo(Date value) {
            addCriterion("ApplicationTime <>", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThan(Date value) {
            addCriterion("ApplicationTime >", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ApplicationTime >=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThan(Date value) {
            addCriterion("ApplicationTime <", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThanOrEqualTo(Date value) {
            addCriterion("ApplicationTime <=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIn(List<Date> values) {
            addCriterion("ApplicationTime in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotIn(List<Date> values) {
            addCriterion("ApplicationTime not in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeBetween(Date value1, Date value2) {
            addCriterion("ApplicationTime between", value1, value2, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotBetween(Date value1, Date value2) {
            addCriterion("ApplicationTime not between", value1, value2, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andMediatorIsNull() {
            addCriterion("Mediator is null");
            return (Criteria) this;
        }

        public Criteria andMediatorIsNotNull() {
            addCriterion("Mediator is not null");
            return (Criteria) this;
        }

        public Criteria andMediatorEqualTo(String value) {
            addCriterion("Mediator =", value, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorNotEqualTo(String value) {
            addCriterion("Mediator <>", value, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorGreaterThan(String value) {
            addCriterion("Mediator >", value, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorGreaterThanOrEqualTo(String value) {
            addCriterion("Mediator >=", value, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorLessThan(String value) {
            addCriterion("Mediator <", value, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorLessThanOrEqualTo(String value) {
            addCriterion("Mediator <=", value, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorLike(String value) {
            addCriterion("Mediator like", value, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorNotLike(String value) {
            addCriterion("Mediator not like", value, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorIn(List<String> values) {
            addCriterion("Mediator in", values, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorNotIn(List<String> values) {
            addCriterion("Mediator not in", values, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorBetween(String value1, String value2) {
            addCriterion("Mediator between", value1, value2, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediatorNotBetween(String value1, String value2) {
            addCriterion("Mediator not between", value1, value2, "mediator");
            return (Criteria) this;
        }

        public Criteria andMediationReasonIsNull() {
            addCriterion("MediationReason is null");
            return (Criteria) this;
        }

        public Criteria andMediationReasonIsNotNull() {
            addCriterion("MediationReason is not null");
            return (Criteria) this;
        }

        public Criteria andMediationReasonEqualTo(String value) {
            addCriterion("MediationReason =", value, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonNotEqualTo(String value) {
            addCriterion("MediationReason <>", value, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonGreaterThan(String value) {
            addCriterion("MediationReason >", value, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonGreaterThanOrEqualTo(String value) {
            addCriterion("MediationReason >=", value, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonLessThan(String value) {
            addCriterion("MediationReason <", value, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonLessThanOrEqualTo(String value) {
            addCriterion("MediationReason <=", value, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonLike(String value) {
            addCriterion("MediationReason like", value, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonNotLike(String value) {
            addCriterion("MediationReason not like", value, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonIn(List<String> values) {
            addCriterion("MediationReason in", values, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonNotIn(List<String> values) {
            addCriterion("MediationReason not in", values, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonBetween(String value1, String value2) {
            addCriterion("MediationReason between", value1, value2, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andMediationReasonNotBetween(String value1, String value2) {
            addCriterion("MediationReason not between", value1, value2, "mediationReason");
            return (Criteria) this;
        }

        public Criteria andConfirmorIsNull() {
            addCriterion("Confirmor is null");
            return (Criteria) this;
        }

        public Criteria andConfirmorIsNotNull() {
            addCriterion("Confirmor is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmorEqualTo(String value) {
            addCriterion("Confirmor =", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorNotEqualTo(String value) {
            addCriterion("Confirmor <>", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorGreaterThan(String value) {
            addCriterion("Confirmor >", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorGreaterThanOrEqualTo(String value) {
            addCriterion("Confirmor >=", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorLessThan(String value) {
            addCriterion("Confirmor <", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorLessThanOrEqualTo(String value) {
            addCriterion("Confirmor <=", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorLike(String value) {
            addCriterion("Confirmor like", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorNotLike(String value) {
            addCriterion("Confirmor not like", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorIn(List<String> values) {
            addCriterion("Confirmor in", values, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorNotIn(List<String> values) {
            addCriterion("Confirmor not in", values, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorBetween(String value1, String value2) {
            addCriterion("Confirmor between", value1, value2, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorNotBetween(String value1, String value2) {
            addCriterion("Confirmor not between", value1, value2, "confirmor");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNull() {
            addCriterion("AuditType is null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNotNull() {
            addCriterion("AuditType is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeEqualTo(Byte value) {
            addCriterion("AuditType =", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotEqualTo(Byte value) {
            addCriterion("AuditType <>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThan(Byte value) {
            addCriterion("AuditType >", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("AuditType >=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThan(Byte value) {
            addCriterion("AuditType <", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThanOrEqualTo(Byte value) {
            addCriterion("AuditType <=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIn(List<Byte> values) {
            addCriterion("AuditType in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotIn(List<Byte> values) {
            addCriterion("AuditType not in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeBetween(Byte value1, Byte value2) {
            addCriterion("AuditType between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("AuditType not between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andExecWeekIsNull() {
            addCriterion("ExecWeek is null");
            return (Criteria) this;
        }

        public Criteria andExecWeekIsNotNull() {
            addCriterion("ExecWeek is not null");
            return (Criteria) this;
        }

        public Criteria andExecWeekEqualTo(Byte value) {
            addCriterion("ExecWeek =", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekNotEqualTo(Byte value) {
            addCriterion("ExecWeek <>", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekGreaterThan(Byte value) {
            addCriterion("ExecWeek >", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekGreaterThanOrEqualTo(Byte value) {
            addCriterion("ExecWeek >=", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekLessThan(Byte value) {
            addCriterion("ExecWeek <", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekLessThanOrEqualTo(Byte value) {
            addCriterion("ExecWeek <=", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekIn(List<Byte> values) {
            addCriterion("ExecWeek in", values, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekNotIn(List<Byte> values) {
            addCriterion("ExecWeek not in", values, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekBetween(Byte value1, Byte value2) {
            addCriterion("ExecWeek between", value1, value2, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekNotBetween(Byte value1, Byte value2) {
            addCriterion("ExecWeek not between", value1, value2, "execWeek");
            return (Criteria) this;
        }

        public Criteria andUseClassroomIsNull() {
            addCriterion("UseClassroom is null");
            return (Criteria) this;
        }

        public Criteria andUseClassroomIsNotNull() {
            addCriterion("UseClassroom is not null");
            return (Criteria) this;
        }

        public Criteria andUseClassroomEqualTo(String value) {
            addCriterion("UseClassroom =", value, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomNotEqualTo(String value) {
            addCriterion("UseClassroom <>", value, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomGreaterThan(String value) {
            addCriterion("UseClassroom >", value, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomGreaterThanOrEqualTo(String value) {
            addCriterion("UseClassroom >=", value, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomLessThan(String value) {
            addCriterion("UseClassroom <", value, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomLessThanOrEqualTo(String value) {
            addCriterion("UseClassroom <=", value, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomLike(String value) {
            addCriterion("UseClassroom like", value, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomNotLike(String value) {
            addCriterion("UseClassroom not like", value, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomIn(List<String> values) {
            addCriterion("UseClassroom in", values, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomNotIn(List<String> values) {
            addCriterion("UseClassroom not in", values, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomBetween(String value1, String value2) {
            addCriterion("UseClassroom between", value1, value2, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andUseClassroomNotBetween(String value1, String value2) {
            addCriterion("UseClassroom not between", value1, value2, "useClassroom");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoIsNull() {
            addCriterion("LessonsChangeInfo is null");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoIsNotNull() {
            addCriterion("LessonsChangeInfo is not null");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoEqualTo(String value) {
            addCriterion("LessonsChangeInfo =", value, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoNotEqualTo(String value) {
            addCriterion("LessonsChangeInfo <>", value, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoGreaterThan(String value) {
            addCriterion("LessonsChangeInfo >", value, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("LessonsChangeInfo >=", value, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoLessThan(String value) {
            addCriterion("LessonsChangeInfo <", value, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoLessThanOrEqualTo(String value) {
            addCriterion("LessonsChangeInfo <=", value, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoLike(String value) {
            addCriterion("LessonsChangeInfo like", value, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoNotLike(String value) {
            addCriterion("LessonsChangeInfo not like", value, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoIn(List<String> values) {
            addCriterion("LessonsChangeInfo in", values, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoNotIn(List<String> values) {
            addCriterion("LessonsChangeInfo not in", values, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoBetween(String value1, String value2) {
            addCriterion("LessonsChangeInfo between", value1, value2, "lessonsChangeInfo");
            return (Criteria) this;
        }

        public Criteria andLessonsChangeInfoNotBetween(String value1, String value2) {
            addCriterion("LessonsChangeInfo not between", value1, value2, "lessonsChangeInfo");
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