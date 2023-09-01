package com.pms.pojo;

import java.util.Date;

public class Admin {
    private Integer adminId;

    private String adminName;

    private String adminAccount;

    private String adminPassword;

    private String adminComment;

    private Date adminCreatetime;

    private Date adminUpdatetime;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminComment() {
        return adminComment;
    }

    public void setAdminComment(String adminComment) {
        this.adminComment = adminComment == null ? null : adminComment.trim();
    }

    public Date getAdminCreatetime() {
        return adminCreatetime;
    }

    public void setAdminCreatetime(Date adminCreatetime) {
        this.adminCreatetime = adminCreatetime;
    }

    public Date getAdminUpdatetime() {
        return adminUpdatetime;
    }

    public void setAdminUpdatetime(Date adminUpdatetime) {
        this.adminUpdatetime = adminUpdatetime;
    }
}