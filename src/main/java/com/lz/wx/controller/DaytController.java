package com.lz.wx.controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 26949 on 2018/7/29.
 */
@Controller
public class DaytController {
   @RequestMapping("/LBA")
    public ModelAndView LBA(){
       ModelAndView mav=new ModelAndView("LBA");
       mav.addObject("sweep","打扫名单");
       mav.addObject("Lll","李龙令");
       mav.addObject("xf","徐飞");
       mav.addObject("gcy","郭存艳");
       mav.addObject("zsb","张省博");
       mav.addObject("qhj","瞿红军");
       return mav;
   }
   @RequestMapping("/SYSLBA")
   public ModelAndView modelAndView(String name,String birthdate){
       ModelAndView mav=new ModelAndView("sys");
       mav.addObject("name",name);
       mav.addObject("birthdate",birthdate);
       return mav;

   }
}
