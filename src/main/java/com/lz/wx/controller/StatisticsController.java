package com.lz.wx.controller;

import com.lz.wx.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/9/15.
 */
@Controller
public class StatisticsController {
    @Autowired StatisticsService statisticsService;

    @RequestMapping("/statistics")
    @ResponseBody
    public void statistics(String name,int age,int overtime,String department){
        statisticsService.statistics(name,age,overtime,department);
    }
}
