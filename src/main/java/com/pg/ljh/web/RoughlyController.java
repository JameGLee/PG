package com.pg.ljh.web;

import com.pg.ljh.entity.Book;
import com.pg.ljh.entity.Roughly;
import com.pg.ljh.service.RoughlyService;
import com.pg.ljh.service.impl.RoughlyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class RoughlyController {
    @Autowired
    private RoughlyService roughlyService = new RoughlyServiceImpl();
    @RequestMapping(value = "list")
    public String selRoughly(Model model){
//        小說類型
        List<Roughly> roughlyList = roughlyService.selAllRname();
        model.addAttribute("roughlyNameList",roughlyList);
//        書籍封面、書名
        List<Book> bookNameCover = roughlyService.selBookByCreateTime();
        model.addAttribute("bookList",bookNameCover);
//         一周内点击量最多的书籍
        List<Book> bookClick = roughlyService.selBookByWeekClick();
        model.addAttribute("bookClick",bookClick);
//        老舍先生的书籍
        List<Book> LSBook = roughlyService.selBookByLaoShe();
        model.addAttribute("LSBook",LSBook);
        return "index";
    }
    //用户登录
    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }
}
