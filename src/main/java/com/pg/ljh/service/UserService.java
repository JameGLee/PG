package com.pg.ljh.service;

import com.pg.ljh.entity.User;

public interface UserService {
    User selAllUser(String name,Long phone,String email);
}
