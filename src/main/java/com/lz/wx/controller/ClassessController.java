package com.lz.wx.controller;

import com.lz.wx.model.Classes;
import com.lz.wx.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 26949 on 2018/9/17.
 */
@Controller
public class ClassessController {
    @Autowired ClassesService classesService;

   @RequestMapping("/statclasses")
    public ModelAndView passId(String id){
       Classes ybl= classesService.packaging(id);
       ModelAndView mav=new ModelAndView("/classes");
       mav.addObject("name",ybl.getName());
       mav.addObject("age",ybl.getAge());
       mav.addObject("hobby",ybl.getHobby());
       mav.addObject("Speciality",ybl.getSpeciality());
       return mav;
    }
}
