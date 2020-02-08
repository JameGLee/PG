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
    public User selAllUser(String name, Long phone, String email){
        return userDao.selAllUser(name,phone,email);
    }
}
