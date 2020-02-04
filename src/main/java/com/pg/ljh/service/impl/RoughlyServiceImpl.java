package com.pg.ljh.service.impl;

import com.pg.ljh.dao.RoughlyDao;
import com.pg.ljh.entity.Book;
import com.pg.ljh.entity.Roughly;
import com.pg.ljh.service.RoughlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoughlyServiceImpl implements RoughlyService {
    @Autowired
    private RoughlyDao roughlyDao;
    public List<Roughly> selAllRname() {
        return roughlyDao.selRoughly();
    }

    /**
     * 查询最新的小说
     * @return
     */
    public List<Book> selBookByCreateTime() {
        return roughlyDao.selBookByCreateTime();
    }

    /**
     * 查询一周内点击量最多的书籍
     * @return
     */
    public List<Book> selBookByWeekClick() {
        return roughlyDao.selBookByWeekClick();
    }

    /**
     * 查询老舍的作品
     * @return
     */
    public List<Book> selBookByLaoShe() {
        return roughlyDao.selBookByLaoShe();
    }

}
