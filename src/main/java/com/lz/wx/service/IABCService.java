package com.lz.wx.service;

/**
 * 封装农业银行标准功能的接口
 */
public interface IABCService extends IUnionPayService {
    /**
     * 接口继承 ，自动继承银联接口中的所有抽象方法
     * 子接口中只需要定义自己的方法即可
     */
    boolean payTelBill(String tel,double money);
    /**
     * 农行接口中新增的充话费功能
     * tel 电话号码
     * money 充值金额
     */
}
