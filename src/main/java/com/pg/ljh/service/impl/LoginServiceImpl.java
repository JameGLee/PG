package com.pg.ljh.service.impl;

import com.pg.ljh.dao.LoginDao;
import com.pg.ljh.entity.User;
import com.pg.ljh.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
    public User selSingleUser(String userName,String password){
        return loginDao.selSingleUser(userName,password);
    }
}
