package com.pms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PreselectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PreselectionExample() {
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

        public Criteria andPreIdIsNull() {
            addCriterion("pre_id is null");
            return (Criteria) this;
        }

        public Criteria andPreIdIsNotNull() {
            addCriterion("pre_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreIdEqualTo(Integer value) {
            addCriterion("pre_id =", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdNotEqualTo(Integer value) {
            addCriterion("pre_id <>", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdGreaterThan(Integer value) {
            addCriterion("pre_id >", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_id >=", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdLessThan(Integer value) {
            addCriterion("pre_id <", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdLessThanOrEqualTo(Integer value) {
            addCriterion("pre_id <=", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdIn(List<Integer> values) {
            addCriterion("pre_id in", values, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdNotIn(List<Integer> values) {
            addCriterion("pre_id not in", values, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdBetween(Integer value1, Integer value2) {
            addCriterion("pre_id between", value1, value2, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_id not between", value1, value2, "preId");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andPreFlagIsNull() {
            addCriterion("pre_flag is null");
            return (Criteria) this;
        }

        public Criteria andPreFlagIsNotNull() {
            addCriterion("pre_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPreFlagEqualTo(Integer value) {
            addCriterion("pre_flag =", value, "preFlag");
            return (Criteria) this;
        }

        public Criteria andPreFlagNotEqualTo(Integer value) {
            addCriterion("pre_flag <>", value, "preFlag");
            return (Criteria) this;
        }

        public Criteria andPreFlagGreaterThan(Integer value) {
            addCriterion("pre_flag >", value, "preFlag");
            return (Criteria) this;
        }

        public Criteria andPreFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_flag >=", value, "preFlag");
            return (Criteria) this;
        }

        public Criteria andPreFlagLessThan(Integer value) {
            addCriterion("pre_flag <", value, "preFlag");
            return (Criteria) this;
        }

        public Criteria andPreFlagLessThanOrEqualTo(Integer value) {
            addCriterion("pre_flag <=", value, "preFlag");
            return (Criteria) this;
        }

        public Criteria andPreFlagIn(List<Integer> values) {
            addCriterion("pre_flag in", values, "preFlag");
            return (Criteria) this;
        }

        public Criteria andPreFlagNotIn(List<Integer> values) {
            addCriterion("pre_flag not in", values, "preFlag");
            return (Criteria) this;
        }

        public Criteria andPreFlagBetween(Integer value1, Integer value2) {
            addCriterion("pre_flag between", value1, value2, "preFlag");
            return (Criteria) this;
        }

        public Criteria andPreFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_flag not between", value1, value2, "preFlag");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagIsNull() {
            addCriterion("pre_pass_flag is null");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagIsNotNull() {
            addCriterion("pre_pass_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagEqualTo(Integer value) {
            addCriterion("pre_pass_flag =", value, "prePassFlag");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagNotEqualTo(Integer value) {
            addCriterion("pre_pass_flag <>", value, "prePassFlag");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagGreaterThan(Integer value) {
            addCriterion("pre_pass_flag >", value, "prePassFlag");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_pass_flag >=", value, "prePassFlag");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagLessThan(Integer value) {
            addCriterion("pre_pass_flag <", value, "prePassFlag");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagLessThanOrEqualTo(Integer value) {
            addCriterion("pre_pass_flag <=", value, "prePassFlag");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagIn(List<Integer> values) {
            addCriterion("pre_pass_flag in", values, "prePassFlag");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagNotIn(List<Integer> values) {
            addCriterion("pre_pass_flag not in", values, "prePassFlag");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagBetween(Integer value1, Integer value2) {
            addCriterion("pre_pass_flag between", value1, value2, "prePassFlag");
            return (Criteria) this;
        }

        public Criteria andPrePassFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_pass_flag not between", value1, value2, "prePassFlag");
            return (Criteria) this;
        }

        public Criteria andRejectReasonIsNull() {
            addCriterion("reject_reason is null");
            return (Criteria) this;
        }

        public Criteria andRejectReasonIsNotNull() {
            addCriterion("reject_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRejectReasonEqualTo(String value) {
            addCriterion("reject_reason =", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotEqualTo(String value) {
            addCriterion("reject_reason <>", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonGreaterThan(String value) {
            addCriterion("reject_reason >", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reject_reason >=", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonLessThan(String value) {
            addCriterion("reject_reason <", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonLessThanOrEqualTo(String value) {
            addCriterion("reject_reason <=", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonLike(String value) {
            addCriterion("reject_reason like", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotLike(String value) {
            addCriterion("reject_reason not like", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonIn(List<String> values) {
            addCriterion("reject_reason in", values, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotIn(List<String> values) {
            addCriterion("reject_reason not in", values, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonBetween(String value1, String value2) {
            addCriterion("reject_reason between", value1, value2, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotBetween(String value1, String value2) {
            addCriterion("reject_reason not between", value1, value2, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andPreCommentIsNull() {
            addCriterion("pre_comment is null");
            return (Criteria) this;
        }

        public Criteria andPreCommentIsNotNull() {
            addCriterion("pre_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPreCommentEqualTo(String value) {
            addCriterion("pre_comment =", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentNotEqualTo(String value) {
            addCriterion("pre_comment <>", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentGreaterThan(String value) {
            addCriterion("pre_comment >", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentGreaterThanOrEqualTo(String value) {
            addCriterion("pre_comment >=", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentLessThan(String value) {
            addCriterion("pre_comment <", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentLessThanOrEqualTo(String value) {
            addCriterion("pre_comment <=", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentLike(String value) {
            addCriterion("pre_comment like", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentNotLike(String value) {
            addCriterion("pre_comment not like", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentIn(List<String> values) {
            addCriterion("pre_comment in", values, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentNotIn(List<String> values) {
            addCriterion("pre_comment not in", values, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentBetween(String value1, String value2) {
            addCriterion("pre_comment between", value1, value2, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentNotBetween(String value1, String value2) {
            addCriterion("pre_comment not between", value1, value2, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeIsNull() {
            addCriterion("pre_createtime is null");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeIsNotNull() {
            addCriterion("pre_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeEqualTo(Date value) {
            addCriterion("pre_createtime =", value, "preCreatetime");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeNotEqualTo(Date value) {
            addCriterion("pre_createtime <>", value, "preCreatetime");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeGreaterThan(Date value) {
            addCriterion("pre_createtime >", value, "preCreatetime");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pre_createtime >=", value, "preCreatetime");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeLessThan(Date value) {
            addCriterion("pre_createtime <", value, "preCreatetime");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("pre_createtime <=", value, "preCreatetime");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeIn(List<Date> values) {
            addCriterion("pre_createtime in", values, "preCreatetime");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeNotIn(List<Date> values) {
            addCriterion("pre_createtime not in", values, "preCreatetime");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeBetween(Date value1, Date value2) {
            addCriterion("pre_createtime between", value1, value2, "preCreatetime");
            return (Criteria) this;
        }

        public Criteria andPreCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("pre_createtime not between", value1, value2, "preCreatetime");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeIsNull() {
            addCriterion("pre_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeIsNotNull() {
            addCriterion("pre_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeEqualTo(Date value) {
            addCriterion("pre_updatetime =", value, "preUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeNotEqualTo(Date value) {
            addCriterion("pre_updatetime <>", value, "preUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeGreaterThan(Date value) {
            addCriterion("pre_updatetime >", value, "preUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pre_updatetime >=", value, "preUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeLessThan(Date value) {
            addCriterion("pre_updatetime <", value, "preUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("pre_updatetime <=", value, "preUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeIn(List<Date> values) {
            addCriterion("pre_updatetime in", values, "preUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeNotIn(List<Date> values) {
            addCriterion("pre_updatetime not in", values, "preUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("pre_updatetime between", value1, value2, "preUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPreUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("pre_updatetime not between", value1, value2, "preUpdatetime");
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