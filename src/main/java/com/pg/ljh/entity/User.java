package com.pg.ljh.entity;

import java.util.Date;

public class User {
    private long uid;
    private String uname;
    private String uPassword;
    private boolean ustatus;//是否为vip用户
    private long uphone;//电话
    private String uemail;//用户邮箱
    private long aid;//关注人的id
    private Date ucreateTime;
    private Date uupdatetime;

    public User(long uid, String uname, String uPassword, boolean ustatus, long uphone, String uemail, long aid, Date ucreateTime, Date uupdatetime) {
        this.uid = uid;
        this.uname = uname;
        this.uPassword = uPassword;
        this.ustatus = ustatus;
        this.uphone = uphone;
        this.uemail = uemail;
        this.aid = aid;
        this.ucreateTime = ucreateTime;
        this.uupdatetime = uupdatetime;
    }

    public User() {
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public boolean isUstatus() {
        return ustatus;
    }

    public void setUstatus(boolean ustatus) {
        this.ustatus = ustatus;
    }

    public long getUphone() {
        return uphone;
    }

    public void setUphone(long uphone) {
        this.uphone = uphone;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

    public Date getUcreateTime() {
        return ucreateTime;
    }

    public void setUcreateTime(Date ucreateTime) {
        this.ucreateTime = ucreateTime;
    }

    public Date getUupdatetime() {
        return uupdatetime;
    }

    public void setUupdatetime(Date uupdatetime) {
        this.uupdatetime = uupdatetime;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", ustatus=" + ustatus +
                ", uphone=" + uphone +
                ", uemail='" + uemail + '\'' +
                ", aid=" + aid +
                ", ucreateTime=" + ucreateTime +
                ", uupdatetime=" + uupdatetime +
                '}';
    }
}
