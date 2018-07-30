package com.lz.wx.service.impl;

import com.lz.wx.service.LogoutService;
import org.springframework.stereotype.Service;

import java.security.KeyStore;

/**
 * Created by 26949 on 2018/7/28.
 */
@Service
public class LogoutServiceImpl implements LogoutService{
    @Override
    public void logout(String moblie, String password) {
        System.out.println("您的账号"+moblie+password+"注销成功");
    }
}
