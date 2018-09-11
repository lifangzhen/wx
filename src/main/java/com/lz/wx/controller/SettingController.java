package com.lz.wx.controller;

import com.lz.wx.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/8/6.
 */
@Controller
public class SettingController {
    @Autowired SettingService settingService;


    @RequestMapping("setTing")
    @ResponseBody
    public void setting(String typeface,String colour){
        settingService.setting(typeface,colour);
    }
}
