package com.lz.wx.dao;

import com.lz.wx.model.Company;
import com.lz.wx.model.Huafu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 26949 on 2018/9/7.
 */
public interface CompanyDao extends JpaRepository<Company, String> {
}
