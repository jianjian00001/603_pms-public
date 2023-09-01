package com.pms.pojo;

import java.util.Date;

public class College {
    private Integer collegeId;

    private String collegeName;

    private String collegeComment;

    private Date collegeCreatetime;

    private Date collegeUpdatetime;

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getCollegeComment() {
        return collegeComment;
    }

    public void setCollegeComment(String collegeComment) {
        this.collegeComment = collegeComment == null ? null : collegeComment.trim();
    }

    public Date getCollegeCreatetime() {
        return collegeCreatetime;
    }

    public void setCollegeCreatetime(Date collegeCreatetime) {
        this.collegeCreatetime = collegeCreatetime;
    }

    public Date getCollegeUpdatetime() {
        return collegeUpdatetime;
    }

    public void setCollegeUpdatetime(Date collegeUpdatetime) {
        this.collegeUpdatetime = collegeUpdatetime;
    }
}