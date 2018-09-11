package com.lz.wx.controller;

import com.lz.wx.service.TransferService;
import com.lz.wx.service.impl.TransferServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/9/2.
 */
@Controller
public class TransferController {



    @Autowired TransferService transferService;

    @RequestMapping("/transfer")
    @ResponseBody
    public void transfer(String select, String connect, String send) {

        transferService.transfer(select,connect,send);
    }
}
