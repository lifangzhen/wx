package com.lz.wx.service.impl;

import com.lz.wx.model.Journal;
import com.lz.wx.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.rowset.Joinable;

/**
 * Created by 26949 on 2018/9/20.
 */
@Controller
public class JournalsServiceImpl {
    @Autowired
    JournalService journalService;

    @RequestMapping("/getjournalById")

    public ModelAndView getUserById(String id){
        Journal journal=journalService.fingGradeById(id);
        ModelAndView mav=new ModelAndView("journal");
        mav.addObject("name",journal.getName());
        mav.addObject("constellation",journal.getConstellation());
        mav.addObject("blood",journal.getBlood());
        mav.addObject("mood",journal.getMood());
        mav.addObject("grade",journal.getGrade());
         return mav;

    }

}
