package com.pms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(Integer value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(Integer value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(Integer value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(Integer value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(Integer value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<Integer> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<Integer> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(Integer value1, Integer value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andCourseCommentIsNull() {
            addCriterion("course_comment is null");
            return (Criteria) this;
        }

        public Criteria andCourseCommentIsNotNull() {
            addCriterion("course_comment is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCommentEqualTo(String value) {
            addCriterion("course_comment =", value, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentNotEqualTo(String value) {
            addCriterion("course_comment <>", value, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentGreaterThan(String value) {
            addCriterion("course_comment >", value, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentGreaterThanOrEqualTo(String value) {
            addCriterion("course_comment >=", value, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentLessThan(String value) {
            addCriterion("course_comment <", value, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentLessThanOrEqualTo(String value) {
            addCriterion("course_comment <=", value, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentLike(String value) {
            addCriterion("course_comment like", value, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentNotLike(String value) {
            addCriterion("course_comment not like", value, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentIn(List<String> values) {
            addCriterion("course_comment in", values, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentNotIn(List<String> values) {
            addCriterion("course_comment not in", values, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentBetween(String value1, String value2) {
            addCriterion("course_comment between", value1, value2, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCommentNotBetween(String value1, String value2) {
            addCriterion("course_comment not between", value1, value2, "courseComment");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeIsNull() {
            addCriterion("course_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeIsNotNull() {
            addCriterion("course_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeEqualTo(Date value) {
            addCriterion("course_createtime =", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeNotEqualTo(Date value) {
            addCriterion("course_createtime <>", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeGreaterThan(Date value) {
            addCriterion("course_createtime >", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_createtime >=", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeLessThan(Date value) {
            addCriterion("course_createtime <", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("course_createtime <=", value, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeIn(List<Date> values) {
            addCriterion("course_createtime in", values, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeNotIn(List<Date> values) {
            addCriterion("course_createtime not in", values, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeBetween(Date value1, Date value2) {
            addCriterion("course_createtime between", value1, value2, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("course_createtime not between", value1, value2, "courseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeIsNull() {
            addCriterion("course_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeIsNotNull() {
            addCriterion("course_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeEqualTo(Date value) {
            addCriterion("course_updatetime =", value, "courseUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeNotEqualTo(Date value) {
            addCriterion("course_updatetime <>", value, "courseUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeGreaterThan(Date value) {
            addCriterion("course_updatetime >", value, "courseUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_updatetime >=", value, "courseUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeLessThan(Date value) {
            addCriterion("course_updatetime <", value, "courseUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("course_updatetime <=", value, "courseUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeIn(List<Date> values) {
            addCriterion("course_updatetime in", values, "courseUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeNotIn(List<Date> values) {
            addCriterion("course_updatetime not in", values, "courseUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("course_updatetime between", value1, value2, "courseUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("course_updatetime not between", value1, value2, "courseUpdatetime");
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