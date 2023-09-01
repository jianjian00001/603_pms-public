package com.pms.pojo;

import java.util.Date;

public class Question {
    private Integer queId;

    private Integer courseId;

    private Course course;

    private String queName;

    private String queA;

    private String queB;

    private String queC;

    private String queD;

    private String queAnswer;

    private Integer queScore;

    private String queComment;

    private Date queCreatetime;

    private Date queUpdatetime;

    public Integer getQueId() {
        return queId;
    }

    public void setQueId(Integer queId) {
        this.queId = queId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getQueName() {
        return queName;
    }

    public void setQueName(String queName) {
        this.queName = queName == null ? null : queName.trim();
    }

    public String getQueA() {
        return queA;
    }

    public void setQueA(String queA) {
        this.queA = queA == null ? null : queA.trim();
    }

    public String getQueB() {
        return queB;
    }

    public void setQueB(String queB) {
        this.queB = queB == null ? null : queB.trim();
    }

    public String getQueC() {
        return queC;
    }

    public void setQueC(String queC) {
        this.queC = queC == null ? null : queC.trim();
    }

    public String getQueD() {
        return queD;
    }

    public void setQueD(String queD) {
        this.queD = queD == null ? null : queD.trim();
    }

    public String getQueAnswer() {
        return queAnswer;
    }

    public void setQueAnswer(String queAnswer) {
        this.queAnswer = queAnswer == null ? null : queAnswer.trim();
    }

    public Integer getQueScore() {
        return queScore;
    }

    public void setQueScore(Integer queScore) {
        this.queScore = queScore;
    }

    public String getQueComment() {
        return queComment;
    }

    public void setQueComment(String queComment) {
        this.queComment = queComment == null ? null : queComment.trim();
    }

    public Date getQueCreatetime() {
        return queCreatetime;
    }

    public void setQueCreatetime(Date queCreatetime) {
        this.queCreatetime = queCreatetime;
    }

    public Date getQueUpdatetime() {
        return queUpdatetime;
    }

    public void setQueUpdatetime(Date queUpdatetime) {
        this.queUpdatetime = queUpdatetime;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}