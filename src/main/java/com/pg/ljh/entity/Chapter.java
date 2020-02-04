package com.pg.ljh.entity;

import java.util.Date;

public class Chapter {
    private long cid;
    private String bname; //"书籍名",
    private long cchapterid; //"章节号",
    private String cchaptertext; //"章节内容",
    private boolean cisvip;  // "是否为vip章节",
    private Date ccreateTime; // '创建时间',
    private Date cupdatetime; // '更新时间'

    public Chapter(long cid, String bname, long cchapterid, String cchaptertext, boolean cisvip, Date ccreateTime, Date cupdatetime) {
        this.cid = cid;
        this.bname = bname;
        this.cchapterid = cchapterid;
        this.cchaptertext = cchaptertext;
        this.cisvip = cisvip;
        this.ccreateTime = ccreateTime;
        this.cupdatetime = cupdatetime;
    }

    public Chapter() {
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public long getCchapterid() {
        return cchapterid;
    }

    public void setCchapterid(long cchapterid) {
        this.cchapterid = cchapterid;
    }

    public String getCchaptertext() {
        return cchaptertext;
    }

    public void setCchaptertext(String cchaptertext) {
        this.cchaptertext = cchaptertext;
    }

    public boolean isCisvip() {
        return cisvip;
    }

    public void setCisvip(boolean cisvip) {
        this.cisvip = cisvip;
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
