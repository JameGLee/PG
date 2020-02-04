package com.pg.ljh.service;

import com.pg.ljh.entity.Book;
import com.pg.ljh.entity.Roughly;

import java.util.List;

public interface RoughlyService {
    /**
     * 类型名称
     * @return
     */
    List<Roughly> selAllRname();

    /**
     * 最新发布的书籍
     * @return
     */
    List<Book> selBookByCreateTime();

    /**
     * 查询一周内点击量最多的书籍
     */
    List<Book> selBookByWeekClick();

    /**
     * 老舍先生的作品
     */
    List<Book> selBookByLaoShe();
}
