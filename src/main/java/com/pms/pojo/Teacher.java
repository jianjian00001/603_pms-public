package com.pms.pojo;

import java.util.Date;

public class Teacher {
    private Integer teacherId;

    private String teacherNo;

    private String teacherPassword;

    private Integer courseId;

    private Course course;

    private String teacherName;

    private String teacherSex;

    private Integer limitCount;

    private String teacherEmail;

    private String teacherLogintime;

    private String teacherComment;

    private Date teacherCreatetime;

    private Date teacherUpdatetime;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo == null ? null : teacherNo.trim();
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword == null ? null : teacherPassword.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex == null ? null : teacherSex.trim();
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
        this.teacherEmail = teacherEmail == null ? null : teacherEmail.trim();
    }

    public String getTeacherLogintime() {
        return teacherLogintime;
    }

    public void setTeacherLogintime(String teacherLogintime) {
        this.teacherLogintime = teacherLogintime == null ? null : teacherLogintime.trim();
    }

    public String getTeacherComment() {
        return teacherComment;
    }

    public void setTeacherComment(String teacherComment) {
        this.teacherComment = teacherComment == null ? null : teacherComment.trim();
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherNo='" + teacherNo + '\'' +
                ", teacherPassword='" + teacherPassword + '\'' +
                ", courseId=" + courseId +
                ", course=" + course +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSex='" + teacherSex + '\'' +
                ", limitCount=" + limitCount +
                ", teacherEmail='" + teacherEmail + '\'' +
                ", teacherLogintime='" + teacherLogintime + '\'' +
                ", teacherComment='" + teacherComment + '\'' +
                ", teacherCreatetime=" + teacherCreatetime +
                ", teacherUpdatetime=" + teacherUpdatetime +
                '}';
    }
}