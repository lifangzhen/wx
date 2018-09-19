package com.lz.wx.controller;

import com.lz.wx.model.Journal;
import com.lz.wx.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26949 on 2018/9/18.
 */
@Controller
public class JournalController {
    @Autowired JournalService journalService;

    @RequestMapping("/Journal")
    @ResponseBody
    public void journal(String name,String constellation,String blood,String mood ,int grade){
        journalService.ybl(name,constellation,blood,mood,grade);
    }
}
