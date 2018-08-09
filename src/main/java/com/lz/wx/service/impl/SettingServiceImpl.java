package com.lz.wx.service.impl;

import com.lz.wx.service.SettingService;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/8/6.
 */
@Service
public class SettingServiceImpl implements SettingService {
    @Override
    public void setting(String typeface, String colour) {
        System.out.println(typeface+"字体修改成功");
        System.out.println(colour+"颜色修改成功");

    }
}
