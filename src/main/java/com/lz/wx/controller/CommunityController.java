package com.lz.wx.controller;

import com.lz.wx.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/9/6.
 */
@Controller
public class CommunityController {
    @Autowired CommunityService communityService;

    @RequestMapping("/community")
    @ResponseBody
    public void community(String name,int age,String hobby,String sex){
        communityService.community(name,age,hobby,sex);}
}
