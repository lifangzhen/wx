package com.lz.wx.dao;

import com.lz.wx.model.Journal;
import com.lz.wx.model.Lab;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 26949 on 2018/9/18.
 */
public interface JournalDao extends JpaRepository<Journal, String> {
}
