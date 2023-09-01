package com.pms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperExample() {
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

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
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

        public Criteria andStudentPathIsNull() {
            addCriterion("student_path is null");
            return (Criteria) this;
        }

        public Criteria andStudentPathIsNotNull() {
            addCriterion("student_path is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPathEqualTo(String value) {
            addCriterion("student_path =", value, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathNotEqualTo(String value) {
            addCriterion("student_path <>", value, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathGreaterThan(String value) {
            addCriterion("student_path >", value, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathGreaterThanOrEqualTo(String value) {
            addCriterion("student_path >=", value, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathLessThan(String value) {
            addCriterion("student_path <", value, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathLessThanOrEqualTo(String value) {
            addCriterion("student_path <=", value, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathLike(String value) {
            addCriterion("student_path like", value, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathNotLike(String value) {
            addCriterion("student_path not like", value, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathIn(List<String> values) {
            addCriterion("student_path in", values, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathNotIn(List<String> values) {
            addCriterion("student_path not in", values, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathBetween(String value1, String value2) {
            addCriterion("student_path between", value1, value2, "studentPath");
            return (Criteria) this;
        }

        public Criteria andStudentPathNotBetween(String value1, String value2) {
            addCriterion("student_path not between", value1, value2, "studentPath");
            return (Criteria) this;
        }

        public Criteria andPaperFlagIsNull() {
            addCriterion("paper_flag is null");
            return (Criteria) this;
        }

        public Criteria andPaperFlagIsNotNull() {
            addCriterion("paper_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPaperFlagEqualTo(Integer value) {
            addCriterion("paper_flag =", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagNotEqualTo(Integer value) {
            addCriterion("paper_flag <>", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagGreaterThan(Integer value) {
            addCriterion("paper_flag >", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_flag >=", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagLessThan(Integer value) {
            addCriterion("paper_flag <", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagLessThanOrEqualTo(Integer value) {
            addCriterion("paper_flag <=", value, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagIn(List<Integer> values) {
            addCriterion("paper_flag in", values, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagNotIn(List<Integer> values) {
            addCriterion("paper_flag not in", values, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagBetween(Integer value1, Integer value2) {
            addCriterion("paper_flag between", value1, value2, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andPaperFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_flag not between", value1, value2, "paperFlag");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeIsNull() {
            addCriterion("student_uploadtime is null");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeIsNotNull() {
            addCriterion("student_uploadtime is not null");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeEqualTo(String value) {
            addCriterion("student_uploadtime =", value, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeNotEqualTo(String value) {
            addCriterion("student_uploadtime <>", value, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeGreaterThan(String value) {
            addCriterion("student_uploadtime >", value, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeGreaterThanOrEqualTo(String value) {
            addCriterion("student_uploadtime >=", value, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeLessThan(String value) {
            addCriterion("student_uploadtime <", value, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeLessThanOrEqualTo(String value) {
            addCriterion("student_uploadtime <=", value, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeLike(String value) {
            addCriterion("student_uploadtime like", value, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeNotLike(String value) {
            addCriterion("student_uploadtime not like", value, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeIn(List<String> values) {
            addCriterion("student_uploadtime in", values, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeNotIn(List<String> values) {
            addCriterion("student_uploadtime not in", values, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeBetween(String value1, String value2) {
            addCriterion("student_uploadtime between", value1, value2, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andStudentUploadtimeNotBetween(String value1, String value2) {
            addCriterion("student_uploadtime not between", value1, value2, "studentUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeIsNull() {
            addCriterion("teacher_uploadtime is null");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeIsNotNull() {
            addCriterion("teacher_uploadtime is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeEqualTo(String value) {
            addCriterion("teacher_uploadtime =", value, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeNotEqualTo(String value) {
            addCriterion("teacher_uploadtime <>", value, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeGreaterThan(String value) {
            addCriterion("teacher_uploadtime >", value, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_uploadtime >=", value, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeLessThan(String value) {
            addCriterion("teacher_uploadtime <", value, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeLessThanOrEqualTo(String value) {
            addCriterion("teacher_uploadtime <=", value, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeLike(String value) {
            addCriterion("teacher_uploadtime like", value, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeNotLike(String value) {
            addCriterion("teacher_uploadtime not like", value, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeIn(List<String> values) {
            addCriterion("teacher_uploadtime in", values, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeNotIn(List<String> values) {
            addCriterion("teacher_uploadtime not in", values, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeBetween(String value1, String value2) {
            addCriterion("teacher_uploadtime between", value1, value2, "teacherUploadtime");
            return (Criteria) this;
        }

        public Criteria andTeacherUploadtimeNotBetween(String value1, String value2) {
            addCriterion("teacher_uploadtime not between", value1, value2, "teacherUploadtime");
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

        public Criteria andTeacherPathIsNull() {
            addCriterion("teacher_path is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPathIsNotNull() {
            addCriterion("teacher_path is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPathEqualTo(String value) {
            addCriterion("teacher_path =", value, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathNotEqualTo(String value) {
            addCriterion("teacher_path <>", value, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathGreaterThan(String value) {
            addCriterion("teacher_path >", value, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_path >=", value, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathLessThan(String value) {
            addCriterion("teacher_path <", value, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathLessThanOrEqualTo(String value) {
            addCriterion("teacher_path <=", value, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathLike(String value) {
            addCriterion("teacher_path like", value, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathNotLike(String value) {
            addCriterion("teacher_path not like", value, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathIn(List<String> values) {
            addCriterion("teacher_path in", values, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathNotIn(List<String> values) {
            addCriterion("teacher_path not in", values, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathBetween(String value1, String value2) {
            addCriterion("teacher_path between", value1, value2, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andTeacherPathNotBetween(String value1, String value2) {
            addCriterion("teacher_path not between", value1, value2, "teacherPath");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIsNull() {
            addCriterion("paper_comment is null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIsNotNull() {
            addCriterion("paper_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentEqualTo(String value) {
            addCriterion("paper_comment =", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentNotEqualTo(String value) {
            addCriterion("paper_comment <>", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentGreaterThan(String value) {
            addCriterion("paper_comment >", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentGreaterThanOrEqualTo(String value) {
            addCriterion("paper_comment >=", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentLessThan(String value) {
            addCriterion("paper_comment <", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentLessThanOrEqualTo(String value) {
            addCriterion("paper_comment <=", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentLike(String value) {
            addCriterion("paper_comment like", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentNotLike(String value) {
            addCriterion("paper_comment not like", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIn(List<String> values) {
            addCriterion("paper_comment in", values, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentNotIn(List<String> values) {
            addCriterion("paper_comment not in", values, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentBetween(String value1, String value2) {
            addCriterion("paper_comment between", value1, value2, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentNotBetween(String value1, String value2) {
            addCriterion("paper_comment not between", value1, value2, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeIsNull() {
            addCriterion("paper_createtime is null");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeIsNotNull() {
            addCriterion("paper_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeEqualTo(Date value) {
            addCriterion("paper_createtime =", value, "paperCreatetime");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeNotEqualTo(Date value) {
            addCriterion("paper_createtime <>", value, "paperCreatetime");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeGreaterThan(Date value) {
            addCriterion("paper_createtime >", value, "paperCreatetime");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paper_createtime >=", value, "paperCreatetime");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeLessThan(Date value) {
            addCriterion("paper_createtime <", value, "paperCreatetime");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("paper_createtime <=", value, "paperCreatetime");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeIn(List<Date> values) {
            addCriterion("paper_createtime in", values, "paperCreatetime");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeNotIn(List<Date> values) {
            addCriterion("paper_createtime not in", values, "paperCreatetime");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeBetween(Date value1, Date value2) {
            addCriterion("paper_createtime between", value1, value2, "paperCreatetime");
            return (Criteria) this;
        }

        public Criteria andPaperCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("paper_createtime not between", value1, value2, "paperCreatetime");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeIsNull() {
            addCriterion("paper_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeIsNotNull() {
            addCriterion("paper_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeEqualTo(Date value) {
            addCriterion("paper_updatetime =", value, "paperUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeNotEqualTo(Date value) {
            addCriterion("paper_updatetime <>", value, "paperUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeGreaterThan(Date value) {
            addCriterion("paper_updatetime >", value, "paperUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paper_updatetime >=", value, "paperUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeLessThan(Date value) {
            addCriterion("paper_updatetime <", value, "paperUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("paper_updatetime <=", value, "paperUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeIn(List<Date> values) {
            addCriterion("paper_updatetime in", values, "paperUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeNotIn(List<Date> values) {
            addCriterion("paper_updatetime not in", values, "paperUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("paper_updatetime between", value1, value2, "paperUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPaperUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("paper_updatetime not between", value1, value2, "paperUpdatetime");
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