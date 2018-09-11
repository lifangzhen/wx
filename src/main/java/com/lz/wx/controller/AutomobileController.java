package com.lz.wx.controller;

import com.lz.wx.service.AutomobileService;
import com.lz.wx.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/9/8.
 */
@Controller
public class AutomobileController  {
    @Autowired
    AutomobileService automobileService;

    @RequestMapping("/automobile")
    @ResponseBody
    public void automobile(String name,String type,int seat,int cc,int drive,float kilometers){
        automobileService.automobile(name,type,seat,cc,drive,kilometers);
    }
}
