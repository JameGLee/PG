package com.pg.ljh.dao;


import com.pg.ljh.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
//   根据用户名查找用户
   User selAllUserByUserName(@Param("uname") String uname);

//   根据号码查找用户
   User selAllUserByPhone(@Param("uphone") Long uphone);
}
