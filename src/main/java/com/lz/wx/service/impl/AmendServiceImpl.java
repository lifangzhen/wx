package com.lz.wx.service.impl;

import com.lz.wx.service.AmendService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 26949 on 2018/8/2.
 */
@Service
public class AmendServiceImpl implements AmendService{
    @Override
    public void amend(String name, String signature) {
        System.out.println(name+"姓名修改中");
        System.out.println(signature+"签名修改中");
    }

    @Override
    public void succeed(String name, String signature) {
        System.out.println("新用户名："+name+"修改成功");
        System.out.println("签名："+signature+"修改成功");
    }

}
