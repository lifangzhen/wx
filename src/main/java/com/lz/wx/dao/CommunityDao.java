package com.lz.wx.dao;

import com.lz.wx.model.Community;
import com.lz.wx.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 26949 on 2018/9/6.
 */
public interface CommunityDao extends JpaRepository<Community, String> {
}
