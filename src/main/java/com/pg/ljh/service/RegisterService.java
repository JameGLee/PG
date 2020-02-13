package com.pg.ljh.service;

import org.springframework.stereotype.Service;

public interface RegisterService {
    int registerUser(String name,String password,long phone);
}
