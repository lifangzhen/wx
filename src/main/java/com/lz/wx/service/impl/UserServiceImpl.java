package com.lz.wx.service.impl;

import com.lz.wx.dao.HuafuDao;
import com.lz.wx.dao.UserDao;
import com.lz.wx.model.Huafu;
import com.lz.wx.model.User;
import com.lz.wx.service.UserService;
import com.lz.wx.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by 26949 on 2018/7/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired private UserDao userDao;
    @Autowired private HuafuDao huafuDao;

    @Override
    public void regist(String name, String mobile, String passwd, Integer age, Integer sex) {

        User user = new User();
        user.setId(IDGenerator.nextId());
        user.setName(name);
        user.setMobile(mobile);
        user.setPasswd(passwd);
        user.setAge(age);
        user.setSex(sex);
        user.setDateCreated(new Date());
        userDao.save(user);
    }

    @Override
    public void insertHuafu(String name, String gender, int age) {
        Huafu huafu = new Huafu();
        huafu.setId(IDGenerator.nextId());
        huafu.setName(name);
        huafu.setGender(gender);
        huafu.setAge(age);
        huafuDao.save(huafu);
    }

    @Override
    public boolean login(String mobile, String password) {

        String sjh = "15901022746";
        String mima = "1234567";

        if (mobile.equals(sjh) && password.equals(mima)){
            return true;
        }else
            return false;
    }

    @Override
    public double getBalance(String mobile) {
        //查到该Mobile对应账户剩余的钱数
        double result = 10000.00;
        return result;
    }

    @Override
    public void printMessage(String msg) {
        System.out.println(msg);
        System.out.println(msg);
        System.out.println(msg);
    }

    @Override
    public String getName(String id) {
        String name = id+"jame";
        return name;
    }
}
