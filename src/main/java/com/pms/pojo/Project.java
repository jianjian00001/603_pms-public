package com.pms.pojo;

import java.util.Date;

public class Project {
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
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest == null ? null : suggest.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getProjectComment() {
        return projectComment;
    }

    public void setProjectComment(String projectComment) {
        this.projectComment = projectComment == null ? null : projectComment.trim();
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
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