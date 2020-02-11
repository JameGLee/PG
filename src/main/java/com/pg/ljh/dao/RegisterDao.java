package com.pg.ljh.dao;

import org.apache.ibatis.annotations.Param;

public interface RegisterDao {
//    注册用户
    int registerUser(@Param("uname") String uname,@Param("upassword") String upassword,@Param("uphone") long uphone,@Param("uemail") String uemail);
}
