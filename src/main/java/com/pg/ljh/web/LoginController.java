package com.pg.ljh.web;

import com.pg.ljh.entity.User;
import com.pg.ljh.service.LoginService;
import com.pg.ljh.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class LoginController{
    @Autowired
    private LoginService loginService = new LoginServiceImpl();

    //登录
    @RequestMapping(value = "/userlogin", method = RequestMethod.POST)
    public String selUser(HttpServletRequest req, HttpServletResponse resp){
        String loginName = req.getParameter("loginname");
        String loginPassword = req.getParameter("loginpassword");
        User user = loginService.selSingleUser(loginName, loginPassword);
        if (user==null){
            return "error";
        }else{
            return "index";
        }
    }

}
