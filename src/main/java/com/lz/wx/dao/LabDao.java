package com.lz.wx.dao;

import com.lz.wx.model.Huafu;
import com.lz.wx.model.Lab;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 26949 on 2018/9/6.
 */
public interface LabDao extends JpaRepository<Lab , String> {
}
