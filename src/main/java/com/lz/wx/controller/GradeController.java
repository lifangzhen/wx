package com.lz.wx.controller;

import com.lz.wx.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/9/10.
 */
@Controller
public class GradeController {
    @Autowired
    GradeService gradeService;

    @RequestMapping("/grade")
    @ResponseBody
    public void grade(String name,int language,int mathematics,int English){
        gradeService.grade(name,language,mathematics,English);
    }

}


