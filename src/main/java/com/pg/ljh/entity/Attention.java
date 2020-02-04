package com.pg.ljh.entity;

import java.util.Date;

public class Attention {
    private long aid ;
    private long uid;//"关注的用户id",
    private long authorid ;//"关注的作家id",
    private Date acreateTime;// '创建时间',
    private Date aupdatetime; //'更新时间'

    public Attention(long aid, long uid, long authorid, Date acreateTime, Date aupdatetime) {
        this.aid = aid;
        this.uid = uid;
        this.authorid = authorid;
        this.acreateTime = acreateTime;
        this.aupdatetime = aupdatetime;
    }

    public Attention() {
    }

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getAuthorid() {
        return authorid;
    }

    public void setAuthorid(long authorid) {
        this.authorid = authorid;
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
