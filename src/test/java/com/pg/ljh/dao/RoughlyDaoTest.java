    package com.pg.ljh.dao;

    import com.pg.ljh.BaseTest;
    import com.pg.ljh.entity.Book;
    import com.pg.ljh.entity.Roughly;
    import com.pg.ljh.service.RoughlyService;
    import com.pg.ljh.service.impl.RoughlyServiceImpl;
    import org.junit.Test;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.junit.runner.RunWith;
    import org.springframework.test.context.ContextConfiguration;
    import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

    import java.util.List;

    /**
     * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
     */
    @RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
    @ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
    public class RoughlyDaoTest extends BaseTest {
        @Autowired
        private RoughlyDao roughlyDao;
        @Autowired
        private RoughlyService roughlyService = new RoughlyServiceImpl();
        @Test
        public void selAllRname()throws Exception{
            // Caused by: org.apache.ibatis.exceptions.TooManyResultsException: Expected one result (or null) to be returned by selectOne(), but found: 34
            List<Roughly> roughlyList = roughlyDao.selRoughly();
            for (Roughly roughly:
                 roughlyList) {
                System.out.println(roughly.getRname());
            }
        }
        @Test
        public void testSelBookByClick(){
            List<Book> books = roughlyDao.selBookByCreateTime();
            for (Book book:
                    books) {
                System.out.println(book.getBname());
            }
        }

        /**
         * 测试  一周内点击量最多的书籍
         */
        @Test
        public void testSelBookByWeekClick(){
            List<Book> bookList = roughlyDao.selBookByWeekClick();
            for (Book book:
                 bookList) {
                System.out.println(book.getBname());
            }
        }

        /**
         * 测试  查询老舍的作品
         */
        @Test
        public void testSelBookByLaoShe(){
            List<Book> LSBooks = roughlyDao.selBookByLaoShe();
            for (Book book :
                    LSBooks) {
                System.out.println(book.toString());
            }
        }
    }
