package com.lz.wx.service.impl;

import com.lz.wx.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/7/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String mobile, String password) {

        String sjh = "15901022746";
        String mima = "1234567";

        if (mobile.equals(sjh) && password.equals(mima)){
            return true;
        }

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
