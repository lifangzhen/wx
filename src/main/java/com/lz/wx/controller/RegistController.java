package com.lz.wx.controller;

import com.lz.wx.service.RegistService;
import com.lz.wx.service.SchoolService;
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
    @Autowired SchoolService schoolService;

    @RequestMapping("/regist")
    @ResponseBody
    public void regist(String name, String mobile, String password ,Integer age, Integer sex){
        userService.regist(name,mobile, password, age, sex);
    }

    @RequestMapping("/addHuafu")
    @ResponseBody
    public void addHuafu(String name, String gener,int age){
        userService.insertHuafu(name, gener, age);
    }
    @RequestMapping("/School")
    @ResponseBody
    public void School(String name, String location, String rector, String contacts, int number){
        schoolService.school(name,location,rector,contacts,number);
    }

}
