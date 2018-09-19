package com.lz.wx.service.impl;

import com.lz.wx.dao.StatisticsDao;
import com.lz.wx.model.Statistics;
import com.lz.wx.service.StatisticsService;
import com.lz.wx.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/9/15.
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Autowired StatisticsDao statisticsDao;

    @Override
    public Statistics findGradeById(String id ) {
        Statistics statistics=statisticsDao.findById(id).orElse(null);
        return statistics;
    }

    @Override
    public void statistics(String name, int age, int overtime, String department) {
        Statistics statistics=new Statistics();
        statistics.setId((IDGenerator.nextId()));
        statistics.setName(name);
        statistics.setAge(age);
        statistics.setOvertime(overtime);
        statistics.setDepartment(department);
        statisticsDao.save(statistics);
    }
}
