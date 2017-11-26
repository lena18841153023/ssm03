package com.company.action;

import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/11/21.
 */
@Controller
@RequestMapping("user")
public class UserAction {
    @Autowired
    private UserService userService;
    //登录
    @RequestMapping(value = "login", method= RequestMethod.POST)
    @ResponseBody
    public String login(User user){
        System.out.println(user);
        boolean flag=userService.login(user);
        return flag?"success":"failed";
    }
    //注册
    @RequestMapping(value = "regist", method= RequestMethod.POST)
    @ResponseBody
    public String regist( User user){
        System.out.println(user);
        return userService.regist(user)?"success":"failed";
    }

}
