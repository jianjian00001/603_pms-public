package com.pms.pojo;

import java.util.Date;

public class Preselection {
    private Integer preId;

    private Integer stuId;

    private Student student;

    private Integer teacherId;

    private Teacher teacher;

    private Integer preFlag;

    private Integer prePassFlag;

    private String rejectReason;

    private String preComment;

    private Date preCreatetime;

    private Date preUpdatetime;

    public Integer getPreId() {
        return preId;
    }

    public void setPreId(Integer preId) {
        this.preId = preId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getPreFlag() {
        return preFlag;
    }

    public void setPreFlag(Integer preFlag) {
        this.preFlag = preFlag;
    }

    public Integer getPrePassFlag() {
        return prePassFlag;
    }

    public void setPrePassFlag(Integer prePassFlag) {
        this.prePassFlag = prePassFlag;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public String getPreComment() {
        return preComment;
    }

    public void setPreComment(String preComment) {
        this.preComment = preComment == null ? null : preComment.trim();
    }

    public Date getPreCreatetime() {
        return preCreatetime;
    }

    public void setPreCreatetime(Date preCreatetime) {
        this.preCreatetime = preCreatetime;
    }

    public Date getPreUpdatetime() {
        return preUpdatetime;
    }

    public void setPreUpdatetime(Date preUpdatetime) {
        this.preUpdatetime = preUpdatetime;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Preselection{" +
                "preId=" + preId +
                ", stuId=" + stuId +
                ", student=" + student +
                ", teacherId=" + teacherId +
                ", teacher=" + teacher +
                ", preFlag=" + preFlag +
                ", prePassFlag=" + prePassFlag +
                ", rejectReason='" + rejectReason + '\'' +
                ", preComment='" + preComment + '\'' +
                ", preCreatetime=" + preCreatetime +
                ", preUpdatetime=" + preUpdatetime +
                '}';
    }
}