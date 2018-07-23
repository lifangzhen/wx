package com.lz.wx.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 26949 on 2018/7/21.
 */
@Controller
public class UserController {

    @RequestMapping("/userInfo")
    public ModelAndView getUserInfo(String name, String age, String score){
        ModelAndView mav = new ModelAndView("/user");
        mav.addObject("name", name);
        mav.addObject("age", age);
        mav.addObject("score", score);
        return mav;
    }


    @RequestMapping("/school")
    public ModelAndView  getschool(String classroom,String name,String score){
        ModelAndView modelAndView = new ModelAndView("/school");
        modelAndView.addObject("classroom",classroom);
        modelAndView.addObject("name", name);
        modelAndView.addObject("score",score);
        return  modelAndView;
    }

    @RequestMapping("/dorm")
    public ModelAndView dorm(){
        ModelAndView mav = new ModelAndView("/dorm");
        mav.addObject("bedone","闫柏龙");
        mav.addObject("bedtwo","闫蓬蓬");
        mav.addObject("bedthree","白文凯");
        mav.addObject("bedfour","老头");
        return mav;
    }
    public  ModelAndView 
}

