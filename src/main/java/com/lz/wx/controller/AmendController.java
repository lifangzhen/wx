package com.lz.wx.controller;

import com.lz.wx.service.AmendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/8/2.
 */
@Controller
public class AmendController {

    @Autowired AmendService amendService;

    @RequestMapping("/Amend")
   @ResponseBody
    public void Amend(String name,String signature){amendService.amend(name,signature);}
}
