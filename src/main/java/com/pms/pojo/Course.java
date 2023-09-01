package com.pms.pojo;

import java.util.Date;

public class Course {
    private Integer courseId;

    private String courseName;

    private Integer majorId;

    private Major major;

    private String courseComment;

    private Date courseCreatetime;

    private Date courseUpdatetime;

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
        this.courseName = courseName == null ? null : courseName.trim();
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
        this.courseComment = courseComment == null ? null : courseComment.trim();
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

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", majorId=" + majorId +
                ", major=" + major +
                ", courseComment='" + courseComment + '\'' +
                ", courseCreatetime=" + courseCreatetime +
                ", courseUpdatetime=" + courseUpdatetime +
                '}';
    }
}