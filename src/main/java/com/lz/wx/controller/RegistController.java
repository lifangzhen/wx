package com.lz.wx.controller;

import com.lz.wx.service.RegistService;
import com.lz.wx.service.UserService;
import com.lz.wx.service.impl.RegistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/7/27.
 */
@Controller
public class RegistController {

    @Autowired RegistService registService;
    @Autowired UserService userService;

    @RequestMapping("/regist")
    @ResponseBody
    public void regist(String mobile, String password){
        registService.regist(mobile,password);
    }


}
