package com.lz.wx.service.impl;

import com.lz.wx.dao.JournalDao;
import com.lz.wx.model.Journal;
import com.lz.wx.service.JournalService;
import com.lz.wx.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/9/18.
 */
@Service
public class JournalServiceImpl implements JournalService{
    @Autowired JournalDao XBL;


    @Override
    public Journal fingGradeById(String id) {
        Journal journal=XBL.findById(id).orElse(null);
        return journal;
    }

    @Override
    public void ybl(String name, String constellation, String blood, String mood, int grade) {
        Journal ybl=new Journal();
        ybl.setId(IDGenerator.nextId());
        ybl.setName(name);
        ybl.setConstellation(constellation);
        ybl.setBlood(blood);
        ybl.setMood(mood);
        ybl.setGrade(grade);
        XBL.save(ybl);
    }
}
