package com.pms.pojo;

import java.util.Date;

public class Test {
    private Integer testId;

    private Integer courseId;

    private Integer stuId;

    private Integer testScore;

    private String testDate;

    private String testComment;

    private Date testCreatetime;

    private Date testUpdatetime;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
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
        this.testDate = testDate == null ? null : testDate.trim();
    }

    public String getTestComment() {
        return testComment;
    }

    public void setTestComment(String testComment) {
        this.testComment = testComment == null ? null : testComment.trim();
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
}