package com.pg.ljh.dao;

import com.pg.ljh.BaseTest;
import com.pg.ljh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class LoginDaoTest extends BaseTest {
    @Autowired
    private LoginDao loginDao;

    @Test
    public void testSelSinglrUser(){
        User users = loginDao.selSingleUser("Jame",null);
        System.out.println(users.toString());
    }
}
