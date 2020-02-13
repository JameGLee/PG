package com.pg.ljh.service.impl;

import com.pg.ljh.dao.UserDao;
import com.pg.ljh.entity.User;
import com.pg.ljh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User selAllUserByUserName(String name){
        return userDao.selAllUserByUserName(name);
    }

    public User selAllUserByPhone(Long phone) {
        return userDao.selAllUserByPhone(phone);
    }
}
