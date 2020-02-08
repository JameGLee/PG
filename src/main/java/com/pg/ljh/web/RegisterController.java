package com.pg.ljh.web;

import com.pg.ljh.entity.User;
import com.pg.ljh.service.RegisterService;
import com.pg.ljh.service.UserService;
import com.pg.ljh.service.impl.RegisterServiceImpl;
import com.pg.ljh.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RegisterController {
    @Autowired
    private RegisterService registerService = new RegisterServiceImpl();
    @Autowired
    private UserService userService = new UserServiceImpl();

    @RequestMapping("userregister")
    public String register(HttpServletRequest request, HttpServletResponse response){
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        String uaffirmpwd = request.getParameter("uaffirmpwd");
        String uphone = request.getParameter("uphone");
        String uemail = request.getParameter("uemail");
        long phone = Long.parseLong(uphone);

        User user = userService.selAllUser(uname, Long.parseLong(uphone), uemail);
        if (user.getUname()!=null){
//            request.setAttribute("");
        }
        if (upwd.equals(uaffirmpwd)){
            registerService.registerUser(uname, upwd, phone, uemail);
            return "login";
        }else{
            return "error";
        }
    }
}
