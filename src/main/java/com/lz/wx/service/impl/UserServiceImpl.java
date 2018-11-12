package com.lz.wx.service.impl;

import com.lz.wx.dao.UserDao;
import com.lz.wx.model.User;
import com.lz.wx.service.UserService;
import com.lz.wx.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by yjingjing on 2018/11/12.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired private UserDao userDao;

    @Override
    public void addUser(String name, String sex, Integer age) {
        User user = new User();
        user.setId(IDGenerator.nextId());
        user.setName(name);
        user.setSex(sex);
        user.setAge(age);
        user.setCreate_time(new Date());
        userDao.save(user);
    }

    @Override
    public void updateUserById(String id, String name, String sex, Integer age) {
        User user = userDao.findById(id).orElse(null);
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        userDao.save(user);
    }

    @Override
    public User getUserById(String id) {
        User user = userDao.findById(id).orElse(null);
        return user;
    }

    @Override
    public void deleteUserById(String id) {
        userDao.deleteById(id);
    }
}
