package com.pms.dto;

import java.util.Date;

/** 学生 测试 课程 专业
 * Created by Ming on 2018/3/1.
 */
public class StuAndTestAndCourseAndMajor {

    private Integer testId;

    private Integer testScore;

    private String testDate;

    private String testComment;

    private Date testCreatetime;

    private Date testUpdatetime;

    private Integer stuId;

    private String stuNo;

    private String stuName;

    private String stuSex;

    private String stuPassword;

    private String stuLogintime;

    private String stuEmail;

    private Integer testFlag;

    private String stuComment;

    private Date stuCreatetime;

    private Date stuUpdatetime;

    private Integer courseId;

    private String courseName;

    private String courseComment;

    private Date courseCreatetime;

    private Date courseUpdatetime;

    private Integer majorId;

    private String majorName;

    private Integer collegeId;

    private String majorComment;

    private Date majorCreatetime;

    private Date majorUpdatetime;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
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

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public String getStuLogintime() {
        return stuLogintime;
    }

    public void setStuLogintime(String stuLogintime) {
        this.stuLogintime = stuLogintime;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public Integer getTestFlag() {
        return testFlag;
    }

    public void setTestFlag(Integer testFlag) {
        this.testFlag = testFlag;
    }

    public String getStuComment() {
        return stuComment;
    }

    public void setStuComment(String stuComment) {
        this.stuComment = stuComment;
    }

    public Date getStuCreatetime() {
        return stuCreatetime;
    }

    public void setStuCreatetime(Date stuCreatetime) {
        this.stuCreatetime = stuCreatetime;
    }

    public Date getStuUpdatetime() {
        return stuUpdatetime;
    }

    public void setStuUpdatetime(Date stuUpdatetime) {
        this.stuUpdatetime = stuUpdatetime;
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

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getCourseComment() {
        return courseComment;
    }

    public void setCourseComment(String courseComment) {
        this.courseComment = courseComment;
    }

    public Date getCourseCreatetime() {
        return courseCreatetime;
    }

    public void setCourseCreatetime(Date courseCreatetime) {
        this.courseCreatetime = courseCreatetime;
    }

    public Date getCourseUpdatetime() {
        return courseUpdatetime;
    }

    public void setCourseUpdatetime(Date courseUpdatetime) {
        this.courseUpdatetime = courseUpdatetime;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getMajorComment() {
        return majorComment;
    }

    public void setMajorComment(String majorComment) {
        this.majorComment = majorComment;
    }

    public Date getMajorCreatetime() {
        return majorCreatetime;
    }

    public void setMajorCreatetime(Date majorCreatetime) {
        this.majorCreatetime = majorCreatetime;
    }

    public Date getMajorUpdatetime() {
        return majorUpdatetime;
    }

    public void setMajorUpdatetime(Date majorUpdatetime) {
        this.majorUpdatetime = majorUpdatetime;
    }

    @Override
    public String toString() {
        return "StuAndTestAndCourseAndMajor{" +
                "testId=" + testId +
                ", testScore=" + testScore +
                ", testDate='" + testDate + '\'' +
                ", testComment='" + testComment + '\'' +
                ", testCreatetime=" + testCreatetime +
                ", testUpdatetime=" + testUpdatetime +
                ", stuId=" + stuId +
                ", stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuPassword='" + stuPassword + '\'' +
                ", stuLogintime='" + stuLogintime + '\'' +
                ", stuEmail='" + stuEmail + '\'' +
                ", testFlag=" + testFlag +
                ", stuComment='" + stuComment + '\'' +
                ", stuCreatetime=" + stuCreatetime +
                ", stuUpdatetime=" + stuUpdatetime +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseComment='" + courseComment + '\'' +
                ", courseCreatetime=" + courseCreatetime +
                ", courseUpdatetime=" + courseUpdatetime +
                ", majorId=" + majorId +
                ", majorName='" + majorName + '\'' +
                ", collegeId=" + collegeId +
                ", majorComment='" + majorComment + '\'' +
                ", majorCreatetime=" + majorCreatetime +
                ", majorUpdatetime=" + majorUpdatetime +
                '}';
    }


}
