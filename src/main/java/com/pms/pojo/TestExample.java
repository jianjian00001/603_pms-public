package com.pms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
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

        public Criteria andTestIdIsNull() {
            addCriterion("test_id is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("test_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(Integer value) {
            addCriterion("test_id =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(Integer value) {
            addCriterion("test_id <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(Integer value) {
            addCriterion("test_id >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_id >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(Integer value) {
            addCriterion("test_id <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_id <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<Integer> values) {
            addCriterion("test_id in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<Integer> values) {
            addCriterion("test_id not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(Integer value1, Integer value2) {
            addCriterion("test_id between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_id not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
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

        public Criteria andTestScoreIsNull() {
            addCriterion("test_score is null");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNotNull() {
            addCriterion("test_score is not null");
            return (Criteria) this;
        }

        public Criteria andTestScoreEqualTo(Integer value) {
            addCriterion("test_score =", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotEqualTo(Integer value) {
            addCriterion("test_score <>", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThan(Integer value) {
            addCriterion("test_score >", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_score >=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThan(Integer value) {
            addCriterion("test_score <", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThanOrEqualTo(Integer value) {
            addCriterion("test_score <=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreIn(List<Integer> values) {
            addCriterion("test_score in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotIn(List<Integer> values) {
            addCriterion("test_score not in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreBetween(Integer value1, Integer value2) {
            addCriterion("test_score between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("test_score not between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNull() {
            addCriterion("test_date is null");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNotNull() {
            addCriterion("test_date is not null");
            return (Criteria) this;
        }

        public Criteria andTestDateEqualTo(String value) {
            addCriterion("test_date =", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotEqualTo(String value) {
            addCriterion("test_date <>", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThan(String value) {
            addCriterion("test_date >", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThanOrEqualTo(String value) {
            addCriterion("test_date >=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThan(String value) {
            addCriterion("test_date <", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThanOrEqualTo(String value) {
            addCriterion("test_date <=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLike(String value) {
            addCriterion("test_date like", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotLike(String value) {
            addCriterion("test_date not like", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateIn(List<String> values) {
            addCriterion("test_date in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotIn(List<String> values) {
            addCriterion("test_date not in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateBetween(String value1, String value2) {
            addCriterion("test_date between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotBetween(String value1, String value2) {
            addCriterion("test_date not between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestCommentIsNull() {
            addCriterion("test_comment is null");
            return (Criteria) this;
        }

        public Criteria andTestCommentIsNotNull() {
            addCriterion("test_comment is not null");
            return (Criteria) this;
        }

        public Criteria andTestCommentEqualTo(String value) {
            addCriterion("test_comment =", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentNotEqualTo(String value) {
            addCriterion("test_comment <>", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentGreaterThan(String value) {
            addCriterion("test_comment >", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentGreaterThanOrEqualTo(String value) {
            addCriterion("test_comment >=", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentLessThan(String value) {
            addCriterion("test_comment <", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentLessThanOrEqualTo(String value) {
            addCriterion("test_comment <=", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentLike(String value) {
            addCriterion("test_comment like", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentNotLike(String value) {
            addCriterion("test_comment not like", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentIn(List<String> values) {
            addCriterion("test_comment in", values, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentNotIn(List<String> values) {
            addCriterion("test_comment not in", values, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentBetween(String value1, String value2) {
            addCriterion("test_comment between", value1, value2, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentNotBetween(String value1, String value2) {
            addCriterion("test_comment not between", value1, value2, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeIsNull() {
            addCriterion("test_createtime is null");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeIsNotNull() {
            addCriterion("test_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeEqualTo(Date value) {
            addCriterion("test_createtime =", value, "testCreatetime");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeNotEqualTo(Date value) {
            addCriterion("test_createtime <>", value, "testCreatetime");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeGreaterThan(Date value) {
            addCriterion("test_createtime >", value, "testCreatetime");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("test_createtime >=", value, "testCreatetime");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeLessThan(Date value) {
            addCriterion("test_createtime <", value, "testCreatetime");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("test_createtime <=", value, "testCreatetime");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeIn(List<Date> values) {
            addCriterion("test_createtime in", values, "testCreatetime");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeNotIn(List<Date> values) {
            addCriterion("test_createtime not in", values, "testCreatetime");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeBetween(Date value1, Date value2) {
            addCriterion("test_createtime between", value1, value2, "testCreatetime");
            return (Criteria) this;
        }

        public Criteria andTestCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("test_createtime not between", value1, value2, "testCreatetime");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeIsNull() {
            addCriterion("test_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeIsNotNull() {
            addCriterion("test_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeEqualTo(Date value) {
            addCriterion("test_updatetime =", value, "testUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeNotEqualTo(Date value) {
            addCriterion("test_updatetime <>", value, "testUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeGreaterThan(Date value) {
            addCriterion("test_updatetime >", value, "testUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("test_updatetime >=", value, "testUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeLessThan(Date value) {
            addCriterion("test_updatetime <", value, "testUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("test_updatetime <=", value, "testUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeIn(List<Date> values) {
            addCriterion("test_updatetime in", values, "testUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeNotIn(List<Date> values) {
            addCriterion("test_updatetime not in", values, "testUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("test_updatetime between", value1, value2, "testUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTestUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("test_updatetime not between", value1, value2, "testUpdatetime");
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