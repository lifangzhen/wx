package com.lz.wx.service.impl;

import com.lz.wx.service.TransferService;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/9/2.
 */
@Service
public class TransferServiceImpl implements TransferService {

    @Override
    public void transfer(String select, String connect, String send) {
        System.out.println("文件"+select+"选择完成");
        System.out.println(connect+"连接成功");
        System.out.println(send+"已发送");
    }
}
