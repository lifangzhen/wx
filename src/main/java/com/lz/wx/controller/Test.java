package com.lz.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 71426 on 2018/7/19.
 */
@Controller
public class Test {
    @RequestMapping("/index.htm")
    public ModelAndView index() {  
        ModelAndView mav = new ModelAndView("/templates/index.ftl");
        return mav;
    }
}
