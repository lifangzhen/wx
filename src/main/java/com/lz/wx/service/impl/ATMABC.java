package com.lz.wx.service.impl;

import com.lz.wx.service.IABCService;

/**
 * Created by 26949 on 2018/8/19.
 */
public class ATMABC extends ATMCBCServiceImpl implements IABCService{

    @Override
    public boolean payTelBill(String tel, double money) {
        //如果号码长度是11位，则可以充值
        //调用当前取款方法，取出指定话费
        //如果取款成功，则返回true，否则返回false
        if (tel.length()==11){
            if (drawMoney(money)){
                System.out.println("为"+tel+"充值成功"+money);
                return true;
            }else {
                return false;
            }
        }else {
            System.out.println("输入的号码错误");
            return false;
        }
    }
}
