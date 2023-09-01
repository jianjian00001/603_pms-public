package com.pms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MajorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajorExample() {
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

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
            return (Criteria) this;
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

        public Criteria andMajorCommentIsNull() {
            addCriterion("major_comment is null");
            return (Criteria) this;
        }

        public Criteria andMajorCommentIsNotNull() {
            addCriterion("major_comment is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCommentEqualTo(String value) {
            addCriterion("major_comment =", value, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentNotEqualTo(String value) {
            addCriterion("major_comment <>", value, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentGreaterThan(String value) {
            addCriterion("major_comment >", value, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentGreaterThanOrEqualTo(String value) {
            addCriterion("major_comment >=", value, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentLessThan(String value) {
            addCriterion("major_comment <", value, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentLessThanOrEqualTo(String value) {
            addCriterion("major_comment <=", value, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentLike(String value) {
            addCriterion("major_comment like", value, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentNotLike(String value) {
            addCriterion("major_comment not like", value, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentIn(List<String> values) {
            addCriterion("major_comment in", values, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentNotIn(List<String> values) {
            addCriterion("major_comment not in", values, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentBetween(String value1, String value2) {
            addCriterion("major_comment between", value1, value2, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCommentNotBetween(String value1, String value2) {
            addCriterion("major_comment not between", value1, value2, "majorComment");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeIsNull() {
            addCriterion("major_createtime is null");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeIsNotNull() {
            addCriterion("major_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeEqualTo(Date value) {
            addCriterion("major_createtime =", value, "majorCreatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeNotEqualTo(Date value) {
            addCriterion("major_createtime <>", value, "majorCreatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeGreaterThan(Date value) {
            addCriterion("major_createtime >", value, "majorCreatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("major_createtime >=", value, "majorCreatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeLessThan(Date value) {
            addCriterion("major_createtime <", value, "majorCreatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("major_createtime <=", value, "majorCreatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeIn(List<Date> values) {
            addCriterion("major_createtime in", values, "majorCreatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeNotIn(List<Date> values) {
            addCriterion("major_createtime not in", values, "majorCreatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeBetween(Date value1, Date value2) {
            addCriterion("major_createtime between", value1, value2, "majorCreatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("major_createtime not between", value1, value2, "majorCreatetime");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeIsNull() {
            addCriterion("major_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeIsNotNull() {
            addCriterion("major_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeEqualTo(Date value) {
            addCriterion("major_updatetime =", value, "majorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeNotEqualTo(Date value) {
            addCriterion("major_updatetime <>", value, "majorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeGreaterThan(Date value) {
            addCriterion("major_updatetime >", value, "majorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("major_updatetime >=", value, "majorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeLessThan(Date value) {
            addCriterion("major_updatetime <", value, "majorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("major_updatetime <=", value, "majorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeIn(List<Date> values) {
            addCriterion("major_updatetime in", values, "majorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeNotIn(List<Date> values) {
            addCriterion("major_updatetime not in", values, "majorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("major_updatetime between", value1, value2, "majorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMajorUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("major_updatetime not between", value1, value2, "majorUpdatetime");
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