package com.pg.ljh.dao;

import com.pg.ljh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void testSelAllUser(){
       User user = userDao.selAllUser("Jame");
        System.out.println(user.toString());
    }
}
