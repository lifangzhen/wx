package com.lz.wx.service;

import com.lz.wx.model.Statistics;

/**
 * Created by 26949 on 2018/9/15.
 */
public interface StatisticsService {
    public Statistics findGradeById(String id);

    public void statistics(String name,int age,int overtime,String department);
}
