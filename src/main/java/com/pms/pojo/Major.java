package com.pms.pojo;

import java.util.Date;

public class Major {
    private Integer majorId;

    private String majorName;

    private Integer collegeId;

    private College college;

    private String majorComment;

    private Date majorCreatetime;

    private Date majorUpdatetime;

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
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
        this.majorComment = majorComment == null ? null : majorComment.trim();
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

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
}