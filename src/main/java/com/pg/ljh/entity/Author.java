package com.pg.ljh.entity;

import java.util.Date;

public class Author {
    private long aid;
    private String apenname; //"作者笔名",
    private String aname; //"作者姓名",
    private String ahead; //"作者头像",
    private String aidentitycard; //"身份证号",
    private String aemail; //"作者邮箱",
    private long aphone; //"作者电话",
    private double asalary; //"作者获得薪水",
    private int apostcode;//"居住地邮编",
    private boolean astatus;//"是否签约",
    private String aresidential;//"居住地",
    private Date acreateTime; // '创建时间',
    private Date aupdatetime; //'更新时间'
    private String aintroduce;//作者简介

    public Author(long aid, String apenname, String aname, String ahead, String aidentitycard, String aemail, long aphone, double asalary, int apostcode, boolean astatus, String aresidential, Date acreateTime, Date aupdatetime, String aintroduce) {
        this.aid = aid;
        this.apenname = apenname;
        this.aname = aname;
        this.ahead = ahead;
        this.aidentitycard = aidentitycard;
        this.aemail = aemail;
        this.aphone = aphone;
        this.asalary = asalary;
        this.apostcode = apostcode;
        this.astatus = astatus;
        this.aresidential = aresidential;
        this.acreateTime = acreateTime;
        this.aupdatetime = aupdatetime;
        this.aintroduce = aintroduce;
    }

    public String getAintroduce() {
        return aintroduce;
    }

    public void setAintroduce(String aintroduce) {
        this.aintroduce = aintroduce;
    }

    public int getApostcode() {
        return apostcode;
    }

    public void setApostcode(int apostcode) {
        this.apostcode = apostcode;
    }

    public boolean isAstatus() {
        return astatus;
    }

    public void setAstatus(boolean astatus) {
        this.astatus = astatus;
    }

    public String getAresidential() {
        return aresidential;
    }

    public void setAresidential(String aresidential) {
        this.aresidential = aresidential;
    }

    public Author() {
    }

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

    public String getApenname() {
        return apenname;
    }

    public void setApenname(String apenname) {
        this.apenname = apenname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAhead() {
        return ahead;
    }

    public void setAhead(String ahead) {
        this.ahead = ahead;
    }

    public String getAidentitycard() {
        return aidentitycard;
    }

    public void setAidentitycard(String aidentitycard) {
        this.aidentitycard = aidentitycard;
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    public long getAphone() {
        return aphone;
    }

    public void setAphone(long aphone) {
        this.aphone = aphone;
    }

    public double getAsalary() {
        return asalary;
    }

    public void setAsalary(double asalary) {
        this.asalary = asalary;
    }

    public Date getAcreateTime() {
        return acreateTime;
    }

    public void setAcreateTime(Date acreateTime) {
        this.acreateTime = acreateTime;
    }

    public Date getAupdatetime() {
        return aupdatetime;
    }

    public void setAupdatetime(Date aupdatetime) {
        this.aupdatetime = aupdatetime;
    }
}
