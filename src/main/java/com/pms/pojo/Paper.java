package com.pms.pojo;

import java.util.Date;

public class Paper {
    private Integer paperId;

    private Integer projectId;

    private String projectName;

    private Integer stuId;

    private Student student;

    private String studentPath;

    private Integer paperFlag;

    private String studentUploadtime;

    private String teacherUploadtime;

    private Integer teacherId;

    private Teacher teacher;

    private String teacherPath;

    private String paperComment;

    private Date paperCreatetime;

    private Date paperUpdatetime;

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

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

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStudentPath() {
        return studentPath;
    }

    public void setStudentPath(String studentPath) {
        this.studentPath = studentPath == null ? null : studentPath.trim();
    }

    public Integer getPaperFlag() {
        return paperFlag;
    }

    public void setPaperFlag(Integer paperFlag) {
        this.paperFlag = paperFlag;
    }

    public String getStudentUploadtime() {
        return studentUploadtime;
    }

    public void setStudentUploadtime(String studentUploadtime) {
        this.studentUploadtime = studentUploadtime == null ? null : studentUploadtime.trim();
    }

    public String getTeacherUploadtime() {
        return teacherUploadtime;
    }

    public void setTeacherUploadtime(String teacherUploadtime) {
        this.teacherUploadtime = teacherUploadtime == null ? null : teacherUploadtime.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherPath() {
        return teacherPath;
    }

    public void setTeacherPath(String teacherPath) {
        this.teacherPath = teacherPath == null ? null : teacherPath.trim();
    }

    public String getPaperComment() {
        return paperComment;
    }

    public void setPaperComment(String paperComment) {
        this.paperComment = paperComment == null ? null : paperComment.trim();
    }

    public Date getPaperCreatetime() {
        return paperCreatetime;
    }

    public void setPaperCreatetime(Date paperCreatetime) {
        this.paperCreatetime = paperCreatetime;
    }

    public Date getPaperUpdatetime() {
        return paperUpdatetime;
    }

    public void setPaperUpdatetime(Date paperUpdatetime) {
        this.paperUpdatetime = paperUpdatetime;
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
        return "Paper{" +
                "paperId=" + paperId +
                ", projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", stuId=" + stuId +
                ", student=" + student +
                ", studentPath='" + studentPath + '\'' +
                ", paperFlag=" + paperFlag +
                ", studentUploadtime='" + studentUploadtime + '\'' +
                ", teacherUploadtime='" + teacherUploadtime + '\'' +
                ", teacherId=" + teacherId +
                ", teacher=" + teacher +
                ", teacherPath='" + teacherPath + '\'' +
                ", paperComment='" + paperComment + '\'' +
                ", paperCreatetime=" + paperCreatetime +
                ", paperUpdatetime=" + paperUpdatetime +
                '}';
    }
}