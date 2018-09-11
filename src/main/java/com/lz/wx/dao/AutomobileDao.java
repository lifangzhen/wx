package com.lz.wx.dao;

import com.lz.wx.model.Automobile;
import com.lz.wx.model.Community;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 26949 on 2018/9/8.
 */
public interface AutomobileDao extends JpaRepository<Automobile, String> {

}
