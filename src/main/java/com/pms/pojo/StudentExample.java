package com.pms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuNoIsNull() {
            addCriterion("stu_no is null");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNotNull() {
            addCriterion("stu_no is not null");
            return (Criteria) this;
        }

        public Criteria andStuNoEqualTo(String value) {
            addCriterion("stu_no =", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotEqualTo(String value) {
            addCriterion("stu_no <>", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThan(String value) {
            addCriterion("stu_no >", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThanOrEqualTo(String value) {
            addCriterion("stu_no >=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThan(String value) {
            addCriterion("stu_no <", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThanOrEqualTo(String value) {
            addCriterion("stu_no <=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLike(String value) {
            addCriterion("stu_no like", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotLike(String value) {
            addCriterion("stu_no not like", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoIn(List<String> values) {
            addCriterion("stu_no in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotIn(List<String> values) {
            addCriterion("stu_no not in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoBetween(String value1, String value2) {
            addCriterion("stu_no between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotBetween(String value1, String value2) {
            addCriterion("stu_no not between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNull() {
            addCriterion("stu_password is null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNotNull() {
            addCriterion("stu_password is not null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordEqualTo(String value) {
            addCriterion("stu_password =", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotEqualTo(String value) {
            addCriterion("stu_password <>", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThan(String value) {
            addCriterion("stu_password >", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("stu_password >=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThan(String value) {
            addCriterion("stu_password <", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThanOrEqualTo(String value) {
            addCriterion("stu_password <=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLike(String value) {
            addCriterion("stu_password like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotLike(String value) {
            addCriterion("stu_password not like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIn(List<String> values) {
            addCriterion("stu_password in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotIn(List<String> values) {
            addCriterion("stu_password not in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordBetween(String value1, String value2) {
            addCriterion("stu_password between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotBetween(String value1, String value2) {
            addCriterion("stu_password not between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeIsNull() {
            addCriterion("stu_logintime is null");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeIsNotNull() {
            addCriterion("stu_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeEqualTo(String value) {
            addCriterion("stu_logintime =", value, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeNotEqualTo(String value) {
            addCriterion("stu_logintime <>", value, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeGreaterThan(String value) {
            addCriterion("stu_logintime >", value, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_logintime >=", value, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeLessThan(String value) {
            addCriterion("stu_logintime <", value, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeLessThanOrEqualTo(String value) {
            addCriterion("stu_logintime <=", value, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeLike(String value) {
            addCriterion("stu_logintime like", value, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeNotLike(String value) {
            addCriterion("stu_logintime not like", value, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeIn(List<String> values) {
            addCriterion("stu_logintime in", values, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeNotIn(List<String> values) {
            addCriterion("stu_logintime not in", values, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeBetween(String value1, String value2) {
            addCriterion("stu_logintime between", value1, value2, "stuLogintime");
            return (Criteria) this;
        }

        public Criteria andStuLogintimeNotBetween(String value1, String value2) {
            addCriterion("stu_logintime not between", value1, value2, "stuLogintime");
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

        public Criteria andStuEmailIsNull() {
            addCriterion("stu_email is null");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNotNull() {
            addCriterion("stu_email is not null");
            return (Criteria) this;
        }

        public Criteria andStuEmailEqualTo(String value) {
            addCriterion("stu_email =", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotEqualTo(String value) {
            addCriterion("stu_email <>", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThan(String value) {
            addCriterion("stu_email >", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("stu_email >=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThan(String value) {
            addCriterion("stu_email <", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThanOrEqualTo(String value) {
            addCriterion("stu_email <=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLike(String value) {
            addCriterion("stu_email like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotLike(String value) {
            addCriterion("stu_email not like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailIn(List<String> values) {
            addCriterion("stu_email in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotIn(List<String> values) {
            addCriterion("stu_email not in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailBetween(String value1, String value2) {
            addCriterion("stu_email between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotBetween(String value1, String value2) {
            addCriterion("stu_email not between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andTestFlagIsNull() {
            addCriterion("test_flag is null");
            return (Criteria) this;
        }

        public Criteria andTestFlagIsNotNull() {
            addCriterion("test_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTestFlagEqualTo(Integer value) {
            addCriterion("test_flag =", value, "testFlag");
            return (Criteria) this;
        }

        public Criteria andTestFlagNotEqualTo(Integer value) {
            addCriterion("test_flag <>", value, "testFlag");
            return (Criteria) this;
        }

        public Criteria andTestFlagGreaterThan(Integer value) {
            addCriterion("test_flag >", value, "testFlag");
            return (Criteria) this;
        }

        public Criteria andTestFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_flag >=", value, "testFlag");
            return (Criteria) this;
        }

        public Criteria andTestFlagLessThan(Integer value) {
            addCriterion("test_flag <", value, "testFlag");
            return (Criteria) this;
        }

        public Criteria andTestFlagLessThanOrEqualTo(Integer value) {
            addCriterion("test_flag <=", value, "testFlag");
            return (Criteria) this;
        }

        public Criteria andTestFlagIn(List<Integer> values) {
            addCriterion("test_flag in", values, "testFlag");
            return (Criteria) this;
        }

        public Criteria andTestFlagNotIn(List<Integer> values) {
            addCriterion("test_flag not in", values, "testFlag");
            return (Criteria) this;
        }

        public Criteria andTestFlagBetween(Integer value1, Integer value2) {
            addCriterion("test_flag between", value1, value2, "testFlag");
            return (Criteria) this;
        }

        public Criteria andTestFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("test_flag not between", value1, value2, "testFlag");
            return (Criteria) this;
        }

        public Criteria andStuCommentIsNull() {
            addCriterion("stu_comment is null");
            return (Criteria) this;
        }

        public Criteria andStuCommentIsNotNull() {
            addCriterion("stu_comment is not null");
            return (Criteria) this;
        }

        public Criteria andStuCommentEqualTo(String value) {
            addCriterion("stu_comment =", value, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentNotEqualTo(String value) {
            addCriterion("stu_comment <>", value, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentGreaterThan(String value) {
            addCriterion("stu_comment >", value, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentGreaterThanOrEqualTo(String value) {
            addCriterion("stu_comment >=", value, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentLessThan(String value) {
            addCriterion("stu_comment <", value, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentLessThanOrEqualTo(String value) {
            addCriterion("stu_comment <=", value, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentLike(String value) {
            addCriterion("stu_comment like", value, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentNotLike(String value) {
            addCriterion("stu_comment not like", value, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentIn(List<String> values) {
            addCriterion("stu_comment in", values, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentNotIn(List<String> values) {
            addCriterion("stu_comment not in", values, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentBetween(String value1, String value2) {
            addCriterion("stu_comment between", value1, value2, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCommentNotBetween(String value1, String value2) {
            addCriterion("stu_comment not between", value1, value2, "stuComment");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeIsNull() {
            addCriterion("stu_createtime is null");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeIsNotNull() {
            addCriterion("stu_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeEqualTo(Date value) {
            addCriterion("stu_createtime =", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeNotEqualTo(Date value) {
            addCriterion("stu_createtime <>", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeGreaterThan(Date value) {
            addCriterion("stu_createtime >", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_createtime >=", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeLessThan(Date value) {
            addCriterion("stu_createtime <", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_createtime <=", value, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeIn(List<Date> values) {
            addCriterion("stu_createtime in", values, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeNotIn(List<Date> values) {
            addCriterion("stu_createtime not in", values, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeBetween(Date value1, Date value2) {
            addCriterion("stu_createtime between", value1, value2, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_createtime not between", value1, value2, "stuCreatetime");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeIsNull() {
            addCriterion("stu_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeIsNotNull() {
            addCriterion("stu_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeEqualTo(Date value) {
            addCriterion("stu_updatetime =", value, "stuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeNotEqualTo(Date value) {
            addCriterion("stu_updatetime <>", value, "stuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeGreaterThan(Date value) {
            addCriterion("stu_updatetime >", value, "stuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_updatetime >=", value, "stuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeLessThan(Date value) {
            addCriterion("stu_updatetime <", value, "stuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_updatetime <=", value, "stuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeIn(List<Date> values) {
            addCriterion("stu_updatetime in", values, "stuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeNotIn(List<Date> values) {
            addCriterion("stu_updatetime not in", values, "stuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("stu_updatetime between", value1, value2, "stuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andStuUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_updatetime not between", value1, value2, "stuUpdatetime");
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