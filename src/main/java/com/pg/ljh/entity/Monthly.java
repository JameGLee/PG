package com.pg.ljh.entity;

import java.util.Date;

public class Monthly {
    private long mid;
    private long uid; //"用户id",
    private long mpass;//"用户拥有的月票数",
    private Date bcreateTime ; //'创建时间',
    private Date bupdatetime ; //'更新时间'

    public Monthly(long mid, long uid, long mpass, Date bcreateTime, Date bupdatetime) {
        this.mid = mid;
        this.uid = uid;
        this.mpass = mpass;
        this.bcreateTime = bcreateTime;
        this.bupdatetime = bupdatetime;
    }

    public Monthly() {
    }

    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getMpass() {
        return mpass;
    }

    public void setMpass(long mpass) {
        this.mpass = mpass;
    }

    public Date getBcreateTime() {
        return bcreateTime;
    }

    public void setBcreateTime(Date bcreateTime) {
        this.bcreateTime = bcreateTime;
    }

    public Date getBupdatetime() {
        return bupdatetime;
    }

    public void setBupdatetime(Date bupdatetime) {
        this.bupdatetime = bupdatetime;
    }
}

