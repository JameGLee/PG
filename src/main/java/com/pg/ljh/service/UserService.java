package com.pg.ljh.service;

import com.pg.ljh.entity.User;

public interface UserService {
    User selAllUserByUserName(String name);
    User selAllUserByPhone(Long phone);
}
