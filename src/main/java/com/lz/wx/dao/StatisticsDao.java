package com.lz.wx.dao;

import com.lz.wx.model.School;
import com.lz.wx.model.Statistics;
import com.lz.wx.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

/**
 * Created by 26949 on 2018/9/15.
 */
public interface StatisticsDao extends JpaRepository<Statistics, String> {
}
