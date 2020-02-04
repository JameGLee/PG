package com.pg.ljh.entity;

import java.util.Date;

public class Roughly {
    private long rid;
    private String rname;
    private Date ccreateTime;
    private Date cupdatetime;

    public Roughly(long rid, String rname, Date ccreateTime, Date cupdatetime) {
        this.rid = rid;
        this.rname = rname;
        this.ccreateTime = ccreateTime;
        this.cupdatetime = cupdatetime;
    }

    public Roughly() {
    }

    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
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

    @Override
    public String toString() {
        return "Roughly{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", ccreateTime=" + ccreateTime +
                ", cupdatetime=" + cupdatetime +
                '}';
    }
}
