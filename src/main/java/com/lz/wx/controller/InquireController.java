package com.lz.wx.controller;

import com.lz.wx.model.Grade;
import com.lz.wx.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 26949 on 2018/9/12.
 */
@Controller
public class InquireController {
    @Autowired GradeService gradeService;

    @RequestMapping("/getUserById")
    public ModelAndView getUserById(String id) {
        Grade grade = gradeService.findGradeById(id);
        ModelAndView mav = new ModelAndView("/grade");
        mav.addObject("name",grade.getName());
        mav.addObject("language",grade.getLanguage());
        mav.addObject("mathematics",grade.getMathematics());
        mav.addObject("English",grade.getEnglish());
        return mav;
    }
}
