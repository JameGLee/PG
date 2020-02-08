package com.pg.ljh.entity;

public class Register {
    private long rid;
    private String rusername;
    private String rpassword;
     private long rphone;
    private String remail;

    public Register(long rid, String rusername, String rpassword, long rphone, String remail) {
        this.rid = rid;
        this.rusername = rusername;
        this.rpassword = rpassword;
        this.rphone = rphone;
        this.remail = remail;
    }

    public Register() {
    }

    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public String getRusername() {
        return rusername;
    }

    public void setRusername(String rusername) {
        this.rusername = rusername;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    public long getRphone() {
        return rphone;
    }

    public void setRphone(long rphone) {
        this.rphone = rphone;
    }

    public String getRemail() {
        return remail;
    }

    public void setRemail(String remail) {
        this.remail = remail;
    }
}
