package com.lz.wx.controller;

import com.lz.wx.service.RelevanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/7/30.
 */

@Controller
public class RelevanceController {
    @Autowired RelevanceService relevanceService;

    @RequestMapping("/Relevance")
    @ResponseBody
    public void setRelevanceService(String number,String password){
                      relevanceService.relevance(number,password);
    }
}
