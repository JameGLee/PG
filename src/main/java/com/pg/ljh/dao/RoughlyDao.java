package com.pg.ljh.dao;


import com.pg.ljh.entity.Book;
import com.pg.ljh.entity.Roughly;

import java.util.List;

public interface RoughlyDao {
    /*
    * 查询大致分类表
    * */
    List<Roughly> selRoughly();

    /**
     * 最新发布的小说作品
     * @return
     */
    List<Book> selBookByCreateTime();

    /**
     * 一周内点击量最多的书籍
     * @return
     */
    List<Book> selBookByWeekClick();

    /**
     *查询老舍先生的作品
     * @return
     */
    List<Book> selBookByLaoShe();
}
