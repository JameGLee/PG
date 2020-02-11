package com.pg.ljh.service.impl;

import com.pg.ljh.dao.RegisterDao;
import com.pg.ljh.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterDao registerDao;
    public int registerUser(String name,String password,long phone,String eamil) {
        return registerDao.registerUser(name,password,phone,eamil);
    }

}
