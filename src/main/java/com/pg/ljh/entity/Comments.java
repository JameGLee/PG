package com.pg.ljh.entity;

import java.util.Date;

public class Comments {//评论表
    private long cid;
    private long bid; //"书籍id",
    private String ccommentstext;//"评论内容",
    private Date ccreateTime; // '创建时间',
    private Date cupdatetime;//'更新时间'

    public Comments(long cid, long bid, String ccommentstext, Date ccreateTime, Date cupdatetime) {
        this.cid = cid;
        this.bid = bid;
        this.ccommentstext = ccommentstext;
        this.ccreateTime = ccreateTime;
        this.cupdatetime = cupdatetime;
    }

    public Comments() {
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    public String getCcommentstext() {
        return ccommentstext;
    }

    public void setCcommentstext(String ccommentstext) {
        this.ccommentstext = ccommentstext;
    }

    public Date getCcreateTime() {
        return ccreateTime;
    }

    public void setCcreateTime(Date ccreateTime) {
        this.ccreateTime = ccreateTime;
    }

    public Date getCupdatetime() {
        return cupdatetime;
    }

    public void setCupdatetime(Date cupdatetime) {
        this.cupdatetime = cupdatetime;
    }
}
