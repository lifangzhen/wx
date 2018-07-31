package com.lz.wx.controller;

import com.lz.wx.service.UpgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/7/29.
 */
@Controller
public class UpgradeController {
    @Autowired UpgradeService upgradeService;

    @RequestMapping("/upgrade")
    @ResponseBody
    public void upgrade(String user,String password){
        upgradeService.upgrande(user,password);

    }


}
