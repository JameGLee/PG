package com.pg.ljh.dao;


import com.pg.ljh.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
   User selAllUser(@Param("uname") String uname, @Param("uphone") Long uphone, @Param("uemail") String uemail);
}
