package com.lz.wx.controller;

import com.lz.wx.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/9/17.
 */
@Controller
public class ClassesController {
    @Autowired ClassesService abc;


    @RequestMapping("/classes")
    @ResponseBody
    public void classes(String name,int age,String hobby,String speciality){
        abc.classes(name,age,hobby,speciality);
    }
}
