package com.lz.wx.service.impl;

import com.lz.wx.service.RegistService;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/7/27.
 */
@Service
public class RegistServiceImpl implements RegistService {
    @Override
    public void regist(String mobile, String password) {
        System.out.println("注册的手机号是:"+mobile);
        System.out.println("注册密码是:"+password);
        System.out.println(mobile+"注册成功");
    }

    @Override
    public void login(String mobile, String password) {
        System.out.println(mobile+"登陆成功");
    }
}
