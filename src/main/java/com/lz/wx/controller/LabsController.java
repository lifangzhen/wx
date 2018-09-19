package com.lz.wx.controller;

import com.lz.wx.model.Lab;
import com.lz.wx.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 26949 on 2018/9/13.
 */
@Controller
public class LabsController {
    @Autowired LabService labService;

    @RequestMapping("/getlabById")
    public ModelAndView getUserById(String id) {
        Lab lab = labService.findGradeById(id);
        ModelAndView mav = new ModelAndView("/lab");
        mav.addObject("name",lab.getName());
        mav.addObject("sex",lab.getSex());
        mav.addObject("age",lab.getAge());
        mav.addObject("education",lab.getEducation());
        mav.addObject("work_age",lab.getWorkAge());
        return mav;

    }
}
