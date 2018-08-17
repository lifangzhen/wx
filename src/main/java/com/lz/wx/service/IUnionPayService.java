package com.lz.wx.service;

/**
 *封装银联标准功能定义的接口
 */
public interface IUnionPayService {
    /**
     * 验证方法的标准定义
     * @param input 用户输入的密码
     * @return 是否验证成功
     */
    boolean checkPwd(String input);

    /**
     * 取款方法的标准定义
     * @param money 取款金额
     * @return 是否取款成功
     */
    boolean drawMoney(double money);

    /**
     * 查询余额的方法
     */
    double getBalance();
}
