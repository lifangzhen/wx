package com.lz.wx.controller;

import com.lz.wx.service.UserService;
import com.lz.wx.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/7/27.
 */
@Controller
public class LoginController {

    @Autowired UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public void login(String mobile, String password){
        boolean boo = userService.login(mobile, password);
        System.out.println("登陆结果是:"+boo);
    }

    @RequestMapping("/getBalance")
    @ResponseBody
    public void getBalance(String mobile, String password){
        boolean result = userService.login(mobile, password);
        if (result){
            //去查询余额是多少
            double balance =  userService.getBalance(mobile);
            System.out.println("手机号为:"+mobile+"的账户余额为:"+balance+"元");
        }else{
            System.out.println("你没有权限查"+mobile+"的余额");
        }
    }

}
