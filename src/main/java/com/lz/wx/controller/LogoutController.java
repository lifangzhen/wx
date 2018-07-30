package com.lz.wx.controller;

import com.lz.wx.service.LogoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/7/28.
 */
@Controller
public class LogoutController {


   @Autowired LogoutService logoutService;

   @RequestMapping("/logout")
   @ResponseBody
    public void logout(String mobile,String password){logoutService.logout(mobile,password);
   }
}





