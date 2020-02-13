package com.pg.ljh.dao;


import com.pg.ljh.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class AuthorDaoTest extends BaseTest {
    @Autowired
    private AuthorDao authorDao;
@Test
    public void testInsertAuthor(){
    int index = authorDao.insertAuthor("小玉", "张三", "../image/..", 32038219984186813L, "18862633560@163.com", "我很帅",
            18862633560L, 211300, "江苏省徐州市");
    if (index>0){
        System.out.println("success");
    }
}

}
