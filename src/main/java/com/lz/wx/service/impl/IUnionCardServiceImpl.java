package com.lz.wx.service.impl;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 封装银行卡属性
 */
public class IUnionCardServiceImpl {
    public String bank;//发卡行
    public String pwd;//密码
    public double bal;//余额

    /**
     * 定义带参构造方法
     */
    public IUnionCardServiceImpl(String bank, String pwd, double bal) {
        this.bank = bank;
        this.pwd = pwd;
        this.bal = bal;
    }
}
