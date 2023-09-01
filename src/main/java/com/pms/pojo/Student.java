package com.pms.pojo;

import java.util.Date;

public class Student {
    private Integer stuId;

    private String stuNo;

    private String stuName;

    private String stuSex;

    private String stuPassword;

    private String stuLogintime;

    private Integer majorId;

    private Major major;

    private String stuEmail;

    private Integer testFlag;

    private String stuComment;

    private Date stuCreatetime;

    private Date stuUpdatetime;

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
        this.stuNo = stuNo == null ? null : stuNo.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword == null ? null : stuPassword.trim();
    }

    public String getStuLogintime() {
        return stuLogintime;
    }

    public void setStuLogintime(String stuLogintime) {
        this.stuLogintime = stuLogintime == null ? null : stuLogintime.trim();
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail == null ? null : stuEmail.trim();
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
        this.stuComment = stuComment == null ? null : stuComment.trim();
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

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuPassword='" + stuPassword + '\'' +
                ", stuLogintime='" + stuLogintime + '\'' +
                ", majorId=" + majorId +
                ", major=" + major +
                ", stuEmail='" + stuEmail + '\'' +
                ", testFlag=" + testFlag +
                ", stuComment='" + stuComment + '\'' +
                ", stuCreatetime=" + stuCreatetime +
                ", stuUpdatetime=" + stuUpdatetime +
                '}';
    }
}