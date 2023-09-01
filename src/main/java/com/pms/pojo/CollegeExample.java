package com.pms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollegeExample() {
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

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(Integer value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(Integer value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(Integer value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(Integer value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<Integer> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<Integer> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameEqualTo(String value) {
            addCriterion("college_name =", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThan(String value) {
            addCriterion("college_name >", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThan(String value) {
            addCriterion("college_name <", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLike(String value) {
            addCriterion("college_name like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotLike(String value) {
            addCriterion("college_name not like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIn(List<String> values) {
            addCriterion("college_name in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentIsNull() {
            addCriterion("college_comment is null");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentIsNotNull() {
            addCriterion("college_comment is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentEqualTo(String value) {
            addCriterion("college_comment =", value, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentNotEqualTo(String value) {
            addCriterion("college_comment <>", value, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentGreaterThan(String value) {
            addCriterion("college_comment >", value, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentGreaterThanOrEqualTo(String value) {
            addCriterion("college_comment >=", value, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentLessThan(String value) {
            addCriterion("college_comment <", value, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentLessThanOrEqualTo(String value) {
            addCriterion("college_comment <=", value, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentLike(String value) {
            addCriterion("college_comment like", value, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentNotLike(String value) {
            addCriterion("college_comment not like", value, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentIn(List<String> values) {
            addCriterion("college_comment in", values, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentNotIn(List<String> values) {
            addCriterion("college_comment not in", values, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentBetween(String value1, String value2) {
            addCriterion("college_comment between", value1, value2, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCommentNotBetween(String value1, String value2) {
            addCriterion("college_comment not between", value1, value2, "collegeComment");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeIsNull() {
            addCriterion("college_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeIsNotNull() {
            addCriterion("college_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeEqualTo(Date value) {
            addCriterion("college_createtime =", value, "collegeCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeNotEqualTo(Date value) {
            addCriterion("college_createtime <>", value, "collegeCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeGreaterThan(Date value) {
            addCriterion("college_createtime >", value, "collegeCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("college_createtime >=", value, "collegeCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeLessThan(Date value) {
            addCriterion("college_createtime <", value, "collegeCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("college_createtime <=", value, "collegeCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeIn(List<Date> values) {
            addCriterion("college_createtime in", values, "collegeCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeNotIn(List<Date> values) {
            addCriterion("college_createtime not in", values, "collegeCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeBetween(Date value1, Date value2) {
            addCriterion("college_createtime between", value1, value2, "collegeCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("college_createtime not between", value1, value2, "collegeCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeIsNull() {
            addCriterion("college_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeIsNotNull() {
            addCriterion("college_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeEqualTo(Date value) {
            addCriterion("college_updatetime =", value, "collegeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeNotEqualTo(Date value) {
            addCriterion("college_updatetime <>", value, "collegeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeGreaterThan(Date value) {
            addCriterion("college_updatetime >", value, "collegeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("college_updatetime >=", value, "collegeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeLessThan(Date value) {
            addCriterion("college_updatetime <", value, "collegeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("college_updatetime <=", value, "collegeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeIn(List<Date> values) {
            addCriterion("college_updatetime in", values, "collegeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeNotIn(List<Date> values) {
            addCriterion("college_updatetime not in", values, "collegeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("college_updatetime between", value1, value2, "collegeUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCollegeUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("college_updatetime not between", value1, value2, "collegeUpdatetime");
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