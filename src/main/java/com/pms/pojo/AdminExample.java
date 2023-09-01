package com.pms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNull() {
            addCriterion("admin_account is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNotNull() {
            addCriterion("admin_account is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountEqualTo(String value) {
            addCriterion("admin_account =", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotEqualTo(String value) {
            addCriterion("admin_account <>", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThan(String value) {
            addCriterion("admin_account >", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("admin_account >=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThan(String value) {
            addCriterion("admin_account <", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("admin_account <=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLike(String value) {
            addCriterion("admin_account like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotLike(String value) {
            addCriterion("admin_account not like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIn(List<String> values) {
            addCriterion("admin_account in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotIn(List<String> values) {
            addCriterion("admin_account not in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountBetween(String value1, String value2) {
            addCriterion("admin_account between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotBetween(String value1, String value2) {
            addCriterion("admin_account not between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminCommentIsNull() {
            addCriterion("admin_comment is null");
            return (Criteria) this;
        }

        public Criteria andAdminCommentIsNotNull() {
            addCriterion("admin_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCommentEqualTo(String value) {
            addCriterion("admin_comment =", value, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentNotEqualTo(String value) {
            addCriterion("admin_comment <>", value, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentGreaterThan(String value) {
            addCriterion("admin_comment >", value, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentGreaterThanOrEqualTo(String value) {
            addCriterion("admin_comment >=", value, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentLessThan(String value) {
            addCriterion("admin_comment <", value, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentLessThanOrEqualTo(String value) {
            addCriterion("admin_comment <=", value, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentLike(String value) {
            addCriterion("admin_comment like", value, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentNotLike(String value) {
            addCriterion("admin_comment not like", value, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentIn(List<String> values) {
            addCriterion("admin_comment in", values, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentNotIn(List<String> values) {
            addCriterion("admin_comment not in", values, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentBetween(String value1, String value2) {
            addCriterion("admin_comment between", value1, value2, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCommentNotBetween(String value1, String value2) {
            addCriterion("admin_comment not between", value1, value2, "adminComment");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeIsNull() {
            addCriterion("admin_createtime is null");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeIsNotNull() {
            addCriterion("admin_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeEqualTo(Date value) {
            addCriterion("admin_createtime =", value, "adminCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeNotEqualTo(Date value) {
            addCriterion("admin_createtime <>", value, "adminCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeGreaterThan(Date value) {
            addCriterion("admin_createtime >", value, "adminCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_createtime >=", value, "adminCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeLessThan(Date value) {
            addCriterion("admin_createtime <", value, "adminCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_createtime <=", value, "adminCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeIn(List<Date> values) {
            addCriterion("admin_createtime in", values, "adminCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeNotIn(List<Date> values) {
            addCriterion("admin_createtime not in", values, "adminCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeBetween(Date value1, Date value2) {
            addCriterion("admin_createtime between", value1, value2, "adminCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_createtime not between", value1, value2, "adminCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeIsNull() {
            addCriterion("admin_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeIsNotNull() {
            addCriterion("admin_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeEqualTo(Date value) {
            addCriterion("admin_updatetime =", value, "adminUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeNotEqualTo(Date value) {
            addCriterion("admin_updatetime <>", value, "adminUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeGreaterThan(Date value) {
            addCriterion("admin_updatetime >", value, "adminUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_updatetime >=", value, "adminUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeLessThan(Date value) {
            addCriterion("admin_updatetime <", value, "adminUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_updatetime <=", value, "adminUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeIn(List<Date> values) {
            addCriterion("admin_updatetime in", values, "adminUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeNotIn(List<Date> values) {
            addCriterion("admin_updatetime not in", values, "adminUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("admin_updatetime between", value1, value2, "adminUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_updatetime not between", value1, value2, "adminUpdatetime");
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