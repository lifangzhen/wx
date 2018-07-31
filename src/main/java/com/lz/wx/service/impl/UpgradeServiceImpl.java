package com.lz.wx.service.impl;

import com.lz.wx.service.UpgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.UnaryOperator;

/**
 * Created by 26949 on 2018/7/29.
 */
@Service
public class UpgradeServiceImpl implements UpgradeService{

    @Override
    public void upgrande(String user, String password) {
        System.out.println("用户"+user+"升级成功");
        System.out.println("密码："+password);

    }
}
