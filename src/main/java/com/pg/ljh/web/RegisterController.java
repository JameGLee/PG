package com.pg.ljh.web;

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
     *
     * @param name  注册用户名
     * @return
     * @throws IOException
     */
    @RequestMapping("judge")
    @ResponseBody
    public  SmsResult register(@RequestParam("name") String name) throws IOException {
//        String uname = request.getParameter("uname");
        //是否填谢用户名

        User user = userService.selAllUserByUserName(name);
//        异步判断注册信息已经被注册
        if (user!=null) {
            return new SmsResult(AppointStateEnum.USER_EXIST);
        }
//        else  if (name==null){
//            return new SmsResult(AppointStateEnum.NOT_USERNAME);
//        }
        return new SmsResult(AppointStateEnum.USER_NOT_EXIST);
    }

//    判断手机号是否被注册
    @RequestMapping("phone")
    @ResponseBody
    public SmsResult registerPhone(@RequestParam("phone") Long phone){
        User user = userService.selAllUserByPhone(phone);
        if (user!=null){
            return new SmsResult(AppointStateEnum.USER_PHONE_EXIST);
        }
        return new SmsResult((AppointStateEnum.USER_PHONE_NOT_EXIST));
    }

    @RequestMapping("required")
    @ResponseBody
    public SmsResult requiredPwd(@RequestParam("pwd") String pwd,@RequestParam("requiredPwd") String requiredPwd){
        if (!pwd.equals(requiredPwd)){
            return new SmsResult((AppointStateEnum.PASSWORD_NOT_TRUE));
        }
        return new SmsResult(AppointStateEnum.PASSWORD_TRUE);
    }
    /**
     * 开始注册
     * @param request
     * @return
     */
    @RequestMapping("startRegister")
    public String startRegister(HttpServletRequest request){
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        String uaffirmpwd = request.getParameter("uaffirmpwd");
        String uphone = request.getParameter("uphone");

        if (upwd.equals(uaffirmpwd)){
            int index = registerService.registerUser(uname, upwd, Long.parseLong(uphone));
            if (index<0){
                return "registerError";
            }
        }

        return "registerSuccess";
    }
}
