package com.pg.ljh.dao;

import com.pg.ljh.entity.User;
import org.apache.ibatis.annotations.Param;


public interface LoginDao {
    User selSingleUser(@Param("uname") String uname, @Param("upassword") String upassword);
}
