package com.pg.ljh.entity;

import java.util.Date;

public class Types {
    private long id;
    private String type; //"书籍类型",
    private Date tcreateTime;// '创建时间',
    private Date tupdatetime; //'更新时间'

    public Types(long id, String type, Date tcreateTime, Date tupdatetime) {
        this.id = id;
        this.type = type;
        this.tcreateTime = tcreateTime;
        this.tupdatetime = tupdatetime;
    }

    public Types() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTcreateTime() {
        return tcreateTime;
    }

    public void setTcreateTime(Date tcreateTime) {
        this.tcreateTime = tcreateTime;
    }

    public Date getTupdatetime() {
        return tupdatetime;
    }

    public void setTupdatetime(Date tupdatetime) {
        this.tupdatetime = tupdatetime;
    }
}
