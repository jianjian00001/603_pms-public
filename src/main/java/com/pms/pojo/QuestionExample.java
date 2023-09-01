package com.pms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQueIdIsNull() {
            addCriterion("que_id is null");
            return (Criteria) this;
        }

        public Criteria andQueIdIsNotNull() {
            addCriterion("que_id is not null");
            return (Criteria) this;
        }

        public Criteria andQueIdEqualTo(Integer value) {
            addCriterion("que_id =", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotEqualTo(Integer value) {
            addCriterion("que_id <>", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThan(Integer value) {
            addCriterion("que_id >", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_id >=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThan(Integer value) {
            addCriterion("que_id <", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThanOrEqualTo(Integer value) {
            addCriterion("que_id <=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdIn(List<Integer> values) {
            addCriterion("que_id in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotIn(List<Integer> values) {
            addCriterion("que_id not in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdBetween(Integer value1, Integer value2) {
            addCriterion("que_id between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("que_id not between", value1, value2, "queId");
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

        public Criteria andQueNameIsNull() {
            addCriterion("que_name is null");
            return (Criteria) this;
        }

        public Criteria andQueNameIsNotNull() {
            addCriterion("que_name is not null");
            return (Criteria) this;
        }

        public Criteria andQueNameEqualTo(String value) {
            addCriterion("que_name =", value, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameNotEqualTo(String value) {
            addCriterion("que_name <>", value, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameGreaterThan(String value) {
            addCriterion("que_name >", value, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameGreaterThanOrEqualTo(String value) {
            addCriterion("que_name >=", value, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameLessThan(String value) {
            addCriterion("que_name <", value, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameLessThanOrEqualTo(String value) {
            addCriterion("que_name <=", value, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameLike(String value) {
            addCriterion("que_name like", value, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameNotLike(String value) {
            addCriterion("que_name not like", value, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameIn(List<String> values) {
            addCriterion("que_name in", values, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameNotIn(List<String> values) {
            addCriterion("que_name not in", values, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameBetween(String value1, String value2) {
            addCriterion("que_name between", value1, value2, "queName");
            return (Criteria) this;
        }

        public Criteria andQueNameNotBetween(String value1, String value2) {
            addCriterion("que_name not between", value1, value2, "queName");
            return (Criteria) this;
        }

        public Criteria andQueAIsNull() {
            addCriterion("que_a is null");
            return (Criteria) this;
        }

        public Criteria andQueAIsNotNull() {
            addCriterion("que_a is not null");
            return (Criteria) this;
        }

        public Criteria andQueAEqualTo(String value) {
            addCriterion("que_a =", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueANotEqualTo(String value) {
            addCriterion("que_a <>", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueAGreaterThan(String value) {
            addCriterion("que_a >", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueAGreaterThanOrEqualTo(String value) {
            addCriterion("que_a >=", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueALessThan(String value) {
            addCriterion("que_a <", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueALessThanOrEqualTo(String value) {
            addCriterion("que_a <=", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueALike(String value) {
            addCriterion("que_a like", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueANotLike(String value) {
            addCriterion("que_a not like", value, "queA");
            return (Criteria) this;
        }

        public Criteria andQueAIn(List<String> values) {
            addCriterion("que_a in", values, "queA");
            return (Criteria) this;
        }

        public Criteria andQueANotIn(List<String> values) {
            addCriterion("que_a not in", values, "queA");
            return (Criteria) this;
        }

        public Criteria andQueABetween(String value1, String value2) {
            addCriterion("que_a between", value1, value2, "queA");
            return (Criteria) this;
        }

        public Criteria andQueANotBetween(String value1, String value2) {
            addCriterion("que_a not between", value1, value2, "queA");
            return (Criteria) this;
        }

        public Criteria andQueBIsNull() {
            addCriterion("que_b is null");
            return (Criteria) this;
        }

        public Criteria andQueBIsNotNull() {
            addCriterion("que_b is not null");
            return (Criteria) this;
        }

        public Criteria andQueBEqualTo(String value) {
            addCriterion("que_b =", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBNotEqualTo(String value) {
            addCriterion("que_b <>", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBGreaterThan(String value) {
            addCriterion("que_b >", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBGreaterThanOrEqualTo(String value) {
            addCriterion("que_b >=", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBLessThan(String value) {
            addCriterion("que_b <", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBLessThanOrEqualTo(String value) {
            addCriterion("que_b <=", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBLike(String value) {
            addCriterion("que_b like", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBNotLike(String value) {
            addCriterion("que_b not like", value, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBIn(List<String> values) {
            addCriterion("que_b in", values, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBNotIn(List<String> values) {
            addCriterion("que_b not in", values, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBBetween(String value1, String value2) {
            addCriterion("que_b between", value1, value2, "queB");
            return (Criteria) this;
        }

        public Criteria andQueBNotBetween(String value1, String value2) {
            addCriterion("que_b not between", value1, value2, "queB");
            return (Criteria) this;
        }

        public Criteria andQueCIsNull() {
            addCriterion("que_c is null");
            return (Criteria) this;
        }

        public Criteria andQueCIsNotNull() {
            addCriterion("que_c is not null");
            return (Criteria) this;
        }

        public Criteria andQueCEqualTo(String value) {
            addCriterion("que_c =", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCNotEqualTo(String value) {
            addCriterion("que_c <>", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCGreaterThan(String value) {
            addCriterion("que_c >", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCGreaterThanOrEqualTo(String value) {
            addCriterion("que_c >=", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCLessThan(String value) {
            addCriterion("que_c <", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCLessThanOrEqualTo(String value) {
            addCriterion("que_c <=", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCLike(String value) {
            addCriterion("que_c like", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCNotLike(String value) {
            addCriterion("que_c not like", value, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCIn(List<String> values) {
            addCriterion("que_c in", values, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCNotIn(List<String> values) {
            addCriterion("que_c not in", values, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCBetween(String value1, String value2) {
            addCriterion("que_c between", value1, value2, "queC");
            return (Criteria) this;
        }

        public Criteria andQueCNotBetween(String value1, String value2) {
            addCriterion("que_c not between", value1, value2, "queC");
            return (Criteria) this;
        }

        public Criteria andQueDIsNull() {
            addCriterion("que_d is null");
            return (Criteria) this;
        }

        public Criteria andQueDIsNotNull() {
            addCriterion("que_d is not null");
            return (Criteria) this;
        }

        public Criteria andQueDEqualTo(String value) {
            addCriterion("que_d =", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDNotEqualTo(String value) {
            addCriterion("que_d <>", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDGreaterThan(String value) {
            addCriterion("que_d >", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDGreaterThanOrEqualTo(String value) {
            addCriterion("que_d >=", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDLessThan(String value) {
            addCriterion("que_d <", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDLessThanOrEqualTo(String value) {
            addCriterion("que_d <=", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDLike(String value) {
            addCriterion("que_d like", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDNotLike(String value) {
            addCriterion("que_d not like", value, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDIn(List<String> values) {
            addCriterion("que_d in", values, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDNotIn(List<String> values) {
            addCriterion("que_d not in", values, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDBetween(String value1, String value2) {
            addCriterion("que_d between", value1, value2, "queD");
            return (Criteria) this;
        }

        public Criteria andQueDNotBetween(String value1, String value2) {
            addCriterion("que_d not between", value1, value2, "queD");
            return (Criteria) this;
        }

        public Criteria andQueAnswerIsNull() {
            addCriterion("que_answer is null");
            return (Criteria) this;
        }

        public Criteria andQueAnswerIsNotNull() {
            addCriterion("que_answer is not null");
            return (Criteria) this;
        }

        public Criteria andQueAnswerEqualTo(String value) {
            addCriterion("que_answer =", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerNotEqualTo(String value) {
            addCriterion("que_answer <>", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerGreaterThan(String value) {
            addCriterion("que_answer >", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("que_answer >=", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerLessThan(String value) {
            addCriterion("que_answer <", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerLessThanOrEqualTo(String value) {
            addCriterion("que_answer <=", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerLike(String value) {
            addCriterion("que_answer like", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerNotLike(String value) {
            addCriterion("que_answer not like", value, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerIn(List<String> values) {
            addCriterion("que_answer in", values, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerNotIn(List<String> values) {
            addCriterion("que_answer not in", values, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerBetween(String value1, String value2) {
            addCriterion("que_answer between", value1, value2, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueAnswerNotBetween(String value1, String value2) {
            addCriterion("que_answer not between", value1, value2, "queAnswer");
            return (Criteria) this;
        }

        public Criteria andQueScoreIsNull() {
            addCriterion("que_score is null");
            return (Criteria) this;
        }

        public Criteria andQueScoreIsNotNull() {
            addCriterion("que_score is not null");
            return (Criteria) this;
        }

        public Criteria andQueScoreEqualTo(Integer value) {
            addCriterion("que_score =", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreNotEqualTo(Integer value) {
            addCriterion("que_score <>", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreGreaterThan(Integer value) {
            addCriterion("que_score >", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_score >=", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreLessThan(Integer value) {
            addCriterion("que_score <", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreLessThanOrEqualTo(Integer value) {
            addCriterion("que_score <=", value, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreIn(List<Integer> values) {
            addCriterion("que_score in", values, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreNotIn(List<Integer> values) {
            addCriterion("que_score not in", values, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreBetween(Integer value1, Integer value2) {
            addCriterion("que_score between", value1, value2, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("que_score not between", value1, value2, "queScore");
            return (Criteria) this;
        }

        public Criteria andQueCommentIsNull() {
            addCriterion("que_comment is null");
            return (Criteria) this;
        }

        public Criteria andQueCommentIsNotNull() {
            addCriterion("que_comment is not null");
            return (Criteria) this;
        }

        public Criteria andQueCommentEqualTo(String value) {
            addCriterion("que_comment =", value, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentNotEqualTo(String value) {
            addCriterion("que_comment <>", value, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentGreaterThan(String value) {
            addCriterion("que_comment >", value, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentGreaterThanOrEqualTo(String value) {
            addCriterion("que_comment >=", value, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentLessThan(String value) {
            addCriterion("que_comment <", value, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentLessThanOrEqualTo(String value) {
            addCriterion("que_comment <=", value, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentLike(String value) {
            addCriterion("que_comment like", value, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentNotLike(String value) {
            addCriterion("que_comment not like", value, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentIn(List<String> values) {
            addCriterion("que_comment in", values, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentNotIn(List<String> values) {
            addCriterion("que_comment not in", values, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentBetween(String value1, String value2) {
            addCriterion("que_comment between", value1, value2, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCommentNotBetween(String value1, String value2) {
            addCriterion("que_comment not between", value1, value2, "queComment");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeIsNull() {
            addCriterion("que_createtime is null");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeIsNotNull() {
            addCriterion("que_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeEqualTo(Date value) {
            addCriterion("que_createtime =", value, "queCreatetime");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeNotEqualTo(Date value) {
            addCriterion("que_createtime <>", value, "queCreatetime");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeGreaterThan(Date value) {
            addCriterion("que_createtime >", value, "queCreatetime");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("que_createtime >=", value, "queCreatetime");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeLessThan(Date value) {
            addCriterion("que_createtime <", value, "queCreatetime");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("que_createtime <=", value, "queCreatetime");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeIn(List<Date> values) {
            addCriterion("que_createtime in", values, "queCreatetime");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeNotIn(List<Date> values) {
            addCriterion("que_createtime not in", values, "queCreatetime");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeBetween(Date value1, Date value2) {
            addCriterion("que_createtime between", value1, value2, "queCreatetime");
            return (Criteria) this;
        }

        public Criteria andQueCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("que_createtime not between", value1, value2, "queCreatetime");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeIsNull() {
            addCriterion("que_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeIsNotNull() {
            addCriterion("que_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeEqualTo(Date value) {
            addCriterion("que_updatetime =", value, "queUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeNotEqualTo(Date value) {
            addCriterion("que_updatetime <>", value, "queUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeGreaterThan(Date value) {
            addCriterion("que_updatetime >", value, "queUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("que_updatetime >=", value, "queUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeLessThan(Date value) {
            addCriterion("que_updatetime <", value, "queUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("que_updatetime <=", value, "queUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeIn(List<Date> values) {
            addCriterion("que_updatetime in", values, "queUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeNotIn(List<Date> values) {
            addCriterion("que_updatetime not in", values, "queUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("que_updatetime between", value1, value2, "queUpdatetime");
            return (Criteria) this;
        }

        public Criteria andQueUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("que_updatetime not between", value1, value2, "queUpdatetime");
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