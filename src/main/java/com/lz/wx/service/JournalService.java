package com.lz.wx.service;

import com.lz.wx.model.Journal;

/**
 * Created by 26949 on 2018/9/18.
 */
public interface JournalService {
    public Journal fingGradeById(String id);

    public void ybl(String name,String constellation,String blood,String mood ,int grade);
}
