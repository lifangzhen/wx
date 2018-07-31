package com.lz.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/7/27.
 */
@Controller
public class ProductController {

    @RequestMapping("/product/info")
    @ResponseBody
    public void info(String id){

    }
}
