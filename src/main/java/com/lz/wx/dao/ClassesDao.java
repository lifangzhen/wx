package com.lz.wx.dao;

import com.lz.wx.model.Classes;
import com.lz.wx.model.Community;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 26949 on 2018/9/17.
 */
public interface ClassesDao extends JpaRepository<Classes, String> {
}
