package com.pms.dto;

import com.pms.pojo.Teacher;

import java.util.Date;

/**测试 老师 课题
 * Created by Ming on 2018/3/1.
 */
public class TestAndTeacherAndProject {
    private Integer testId;

    private Integer stuId;

    private Integer testScore;

    private String testDate;

    private String testComment;

    private Date testCreatetime;

    private Date testUpdatetime;

    private String teacherNo;

    private String teacherPassword;

    private String teacherName;

    private String teacherSex;

    private Integer limitCount;

    private String teacherEmail;

    private String teacherLogintime;

    private String teacherComment;

    private Date teacherCreatetime;

    private Date teacherUpdatetime;

    private Integer projectId;

    private String projectName;

    private String info;

    private String suggest;

    private Integer teacherId;

    private Teacher teacher;

    private Integer courseId;

    private String courseName;

    private String projectComment;

    private Date projectCreatetime;

    private Date projectUpdatetime;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getTestScore() {
        return testScore;
    }

    public void setTestScore(Integer testScore) {
        this.testScore = testScore;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getTestComment() {
        return testComment;
    }

    public void setTestComment(String testComment) {
        this.testComment = testComment;
    }

    public Date getTestCreatetime() {
        return testCreatetime;
    }

    public void setTestCreatetime(Date testCreatetime) {
        this.testCreatetime = testCreatetime;
    }

    public Date getTestUpdatetime() {
        return testUpdatetime;
    }

    public void setTestUpdatetime(Date testUpdatetime) {
        this.testUpdatetime = testUpdatetime;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getTeacherLogintime() {
        return teacherLogintime;
    }

    public void setTeacherLogintime(String teacherLogintime) {
        this.teacherLogintime = teacherLogintime;
    }

    public String getTeacherComment() {
        return teacherComment;
    }

    public void setTeacherComment(String teacherComment) {
        this.teacherComment = teacherComment;
    }

    public Date getTeacherCreatetime() {
        return teacherCreatetime;
    }

    public void setTeacherCreatetime(Date teacherCreatetime) {
        this.teacherCreatetime = teacherCreatetime;
    }

    public Date getTeacherUpdatetime() {
        return teacherUpdatetime;
    }

    public void setTeacherUpdatetime(Date teacherUpdatetime) {
        this.teacherUpdatetime = teacherUpdatetime;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProjectComment() {
        return projectComment;
    }

    public void setProjectComment(String projectComment) {
        this.projectComment = projectComment;
    }

    public Date getProjectCreatetime() {
        return projectCreatetime;
    }

    public void setProjectCreatetime(Date projectCreatetime) {
        this.projectCreatetime = projectCreatetime;
    }

    public Date getProjectUpdatetime() {
        return projectUpdatetime;
    }

    public void setProjectUpdatetime(Date projectUpdatetime) {
        this.projectUpdatetime = projectUpdatetime;
    }

    @Override
    public String toString() {
        return "TestAndTeacherAndProject{" +
                "testId=" + testId +
                ", stuId=" + stuId +
                ", testScore=" + testScore +
                ", testDate='" + testDate + '\'' +
                ", testComment='" + testComment + '\'' +
                ", testCreatetime=" + testCreatetime +
                ", testUpdatetime=" + testUpdatetime +
                ", teacherNo='" + teacherNo + '\'' +
                ", teacherPassword='" + teacherPassword + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSex='" + teacherSex + '\'' +
                ", limitCount=" + limitCount +
                ", teacherEmail='" + teacherEmail + '\'' +
                ", teacherLogintime='" + teacherLogintime + '\'' +
                ", teacherComment='" + teacherComment + '\'' +
                ", teacherCreatetime=" + teacherCreatetime +
                ", teacherUpdatetime=" + teacherUpdatetime +
                ", projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", info='" + info + '\'' +
                ", suggest='" + suggest + '\'' +
                ", teacherId=" + teacherId +
                ", teacher=" + teacher +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", projectComment='" + projectComment + '\'' +
                ", projectCreatetime=" + projectCreatetime +
                ", projectUpdatetime=" + projectUpdatetime +
                '}';
    }
}
