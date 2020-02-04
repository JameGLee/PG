package com.pg.ljh.entity;

import java.util.Date;

public class ReadNum {
    private long rid;
    private long bid;//"书籍id",
    private long readnum;//"总阅读量",
    private long readnumweek;//"一周总阅读量",
    private Date rcreateTime;//'创建时间',
    private Date rupdatetime;//'更新时间'

    public ReadNum(long rid, long bid, long readnum, long readnumweek, Date rcreateTime, Date rupdatetime) {
        this.rid = rid;
        this.bid = bid;
        this.readnum = readnum;
        this.readnumweek = readnumweek;
        this.rcreateTime = rcreateTime;
        this.rupdatetime = rupdatetime;
    }

    public ReadNum() {
    }

    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    public long getReadnum() {
        return readnum;
    }

    public void setReadnum(long readnum) {
        this.readnum = readnum;
    }

    public long getReadnumweek() {
        return readnumweek;
    }

    public void setReadnumweek(long readnumweek) {
        this.readnumweek = readnumweek;
    }

    public Date getRcreateTime() {
        return rcreateTime;
    }

    public void setRcreateTime(Date rcreateTime) {
        this.rcreateTime = rcreateTime;
    }

    public Date getRupdatetime() {
        return rupdatetime;
    }

    public void setRupdatetime(Date rupdatetime) {
        this.rupdatetime = rupdatetime;
    }
}
