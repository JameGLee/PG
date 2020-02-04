package com.pg.ljh.entity;

import java.util.Date;

public class Click {
    private long cid;
    private long bid; //"书籍id",
    private long clicknum; //"总点击量",
    private long clicknumweek; //"一周点击量",
    private Date ccreateTime;//'创建时间',
    private Date cupdatetime; //'更新时间'

    public Click(long cid, long bid, long clicknum, long clicknumweek, Date ccreateTime, Date cupdatetime) {
        this.cid = cid;
        this.bid = bid;
        this.clicknum = clicknum;
        this.clicknumweek = clicknumweek;
        this.ccreateTime = ccreateTime;
        this.cupdatetime = cupdatetime;
    }

    public Click() {
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

    public long getClicknum() {
        return clicknum;
    }

    public void setClicknum(long clicknum) {
        this.clicknum = clicknum;
    }

    public long getClicknumweek() {
        return clicknumweek;
    }

    public void setClicknumweek(long clicknumweek) {
        this.clicknumweek = clicknumweek;
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
