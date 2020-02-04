package com.pg.ljh.entity;

import java.util.Date;

public class Lable {
    private long lid;
    private String lcontent;//"标签内容",
    private Date lcreateTime;//'创建时间',
    private Date lupdatetime;//'更新时间'

    public Lable(long lid, String lcontent, Date lcreateTime, Date lupdatetime) {
        this.lid = lid;
        this.lcontent = lcontent;
        this.lcreateTime = lcreateTime;
        this.lupdatetime = lupdatetime;
    }

    public Lable() {
    }

    public long getLid() {
        return lid;
    }

    public void setLid(long lid) {
        this.lid = lid;
    }

    public String getLcontent() {
        return lcontent;
    }

    public void setLcontent(String lcontent) {
        this.lcontent = lcontent;
    }

    public Date getLcreateTime() {
        return lcreateTime;
    }

    public void setLcreateTime(Date lcreateTime) {
        this.lcreateTime = lcreateTime;
    }

    public Date getLupdatetime() {
        return lupdatetime;
    }

    public void setLupdatetime(Date lupdatetime) {
        this.lupdatetime = lupdatetime;
    }
}
