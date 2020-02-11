package com.pg.ljh.web;

import com.pg.ljh.entity.Appointment;
import com.pg.ljh.entity.SmsResult;
import com.pg.ljh.entity.User;
import com.pg.ljh.enums.AppointStateEnum;
import com.pg.ljh.service.RegisterService;
import com.pg.ljh.service.UserService;
import com.pg.ljh.service.impl.RegisterServiceImpl;
import com.pg.ljh.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class RegisterController {
    @Autowired
    private RegisterService registerService = new RegisterServiceImpl();
    @Autowired
    private UserService userService = new UserServiceImpl();

    /**
     * @param request
     * @param response
     * @param name     ajax上传的用户名
     * @return
     * @throws IOException
     */
    /*@RequestMapping("judge")
    public String register(HttpServletRequest request, HttpServletResponse response, String name) throws IOException {
        String uname = request.getParameter("uname");
        User user = userService.selAllUser(uname);
//        异步判断注册信息已经被注册
        if (name.equals(user.getUname())) {
            response.getWriter().write("用户名已被注册");
        }


//        if (upwd.equals(uaffirmpwd)){
//            registerService.registerUser(uname, upwd, phone, uemail);
//            return "login";
//        }else{
//            return "error";
//        }
        return null;
    }*/
    @RequestMapping("judge")
    @ResponseBody
    public  SmsResult register(@RequestParam("name") String name) throws IOException {
//        String uname = request.getParameter("uname");
        User user = userService.selAllUser(name);
//        异步判断注册信息已经被注册
        if (user!=null) {
            return new SmsResult(AppointStateEnum.USER_EXIST);
        }
        return new SmsResult(AppointStateEnum.USER_NOT_EXIST);
    }

}
