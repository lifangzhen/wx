package com.lz.wx.controller;

import com.lz.wx.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/9/6.
 */
@Controller
public class LabController {
    @Autowired LabService labService;
    @RequestMapping("/lab")
    @ResponseBody
    public void lab(String name,String sex,int age,String education,int workAge){
        labService.lab(name,sex,age,education,workAge);
    }
}
