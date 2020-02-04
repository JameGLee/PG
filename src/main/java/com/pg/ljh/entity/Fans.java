package com.pg.ljh.entity;

import java.util.Date;

public class Fans {
    private long fid ;
    private long uid ;//"用户id",
    private long aid ;//"作者id",
    private long bid ;//"书籍id",
    private Date fcreateTime;//'创建时间',
    private Date fupdatetime;//'更新时间'

    public Fans(long fid, long uid, long aid, long bid, Date fcreateTime, Date fupdatetime) {
        this.fid = fid;
        this.uid = uid;
        this.aid = aid;
        this.bid = bid;
        this.fcreateTime = fcreateTime;
        this.fupdatetime = fupdatetime;
    }

    public Fans() {
    }

    public long getFid() {
        return fid;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    public Date getFcreateTime() {
        return fcreateTime;
    }

    public void setFcreateTime(Date fcreateTime) {
        this.fcreateTime = fcreateTime;
    }

    public Date getFupdatetime() {
        return fupdatetime;
    }

    public void setFupdatetime(Date fupdatetime) {
        this.fupdatetime = fupdatetime;
    }
}
