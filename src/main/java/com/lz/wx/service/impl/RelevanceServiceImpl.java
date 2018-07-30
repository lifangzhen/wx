package com.lz.wx.service.impl;

import com.lz.wx.service.RegistService;
import com.lz.wx.service.RelevanceService;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/7/30.
 */
@Service
public class RelevanceServiceImpl implements RelevanceService {
    @Override
    public void relevance(String number, String passwold) {
        System.out.println("您注册的号码"+number);
        System.out.println("请输入密码"+passwold);
    }
}
