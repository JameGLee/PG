package com.pg.ljh.service;

import com.pg.ljh.entity.User;

import java.util.List;

public interface LoginService {
    User selSingleUser(String userName,String password);
}
