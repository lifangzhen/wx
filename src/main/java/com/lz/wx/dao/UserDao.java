package com.lz.wx.dao;

import com.lz.wx.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 26949 on 2018/8/20.
 */
public interface UserDao extends JpaRepository<User, String> {

}
