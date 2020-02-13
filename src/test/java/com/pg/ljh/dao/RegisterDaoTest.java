package com.pg.ljh.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class RegisterDaoTest {
    @Autowired
    private RegisterDao registerDao;
    @Test
    public void registerUserTest(){
        String phone = "18862633560";
        long phone1 = Long.parseLong(phone);
        int index = registerDao.registerUser("王五","wangwu123",18862633560L);
        if (index>0){
            System.out.println("添加成功");
        }
    }
}
