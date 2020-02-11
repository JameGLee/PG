package com.pg.ljh.dao;


import com.pg.ljh.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
//   根据用户名查找用户
   User selAllUser(@Param("uname") String uname);
}
