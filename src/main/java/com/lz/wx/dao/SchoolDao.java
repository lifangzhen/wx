package com.lz.wx.dao;

import com.lz.wx.model.Huafu;
import com.lz.wx.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 26949 on 2018/9/5.
 */
public interface SchoolDao extends JpaRepository<School, String> {
}
