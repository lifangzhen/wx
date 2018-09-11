package com.lz.wx.dao;

import com.lz.wx.model.Company;
import com.lz.wx.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 26949 on 2018/9/10.
 */
public interface GradeDao extends JpaRepository<Grade, String> {
}
