package com.lz.wx.controller;

import com.lz.wx.model.Community;
import com.lz.wx.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 26949 on 2018/9/14.
 */
@Controller
public class CommunitysController {
    @Autowired
    CommunityService communityService;

    @RequestMapping("/getCommunityById")
    public ModelAndView getUserById(String id){
        Community community=communityService.findGradeById(id);
        ModelAndView mav=new ModelAndView("/community");
        mav.addObject("name",community.getName());
        mav.addObject("age",community.getAge());
        mav.addObject("hobby",community.getHobby());
        mav.addObject("sex",community.getSex());
        return mav;
    }


}
