package com.lz.wx.controller;

import com.lz.wx.model.Statistics;
import com.lz.wx.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 26949 on 2018/9/16.
 */
@Controller
public class StatisticseController {
    @Autowired StatisticsService statisticsService;


    @RequestMapping("/statisticse")
   public ModelAndView getUserById(String id) {
        Statistics statistics=statisticsService.findGradeById(id);
        ModelAndView mav=new ModelAndView("/statisticse");
        mav.addObject("name",statistics.getName());
        mav.addObject("age",statistics.getAge());
        mav.addObject("overtime",statistics.getOvertime());
        mav.addObject("department",statistics.getDepartment());
        return mav;


    }
}

