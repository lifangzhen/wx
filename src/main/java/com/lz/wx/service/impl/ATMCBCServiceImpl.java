package com.lz.wx.service.impl;

import com.lz.wx.service.IUnionPayService;
import com.lz.wx.service.impl.IUnionCardServiceImpl;

/**
 *封装建设银行ATM机功能的类
 * 所有ATM机类都必须遵守银联的标准接口
 * 所有ATM机都必须实现银联标准接口中的所有抽象方法的定义
 */
public class ATMCBCServiceImpl implements IUnionPayService {
    //实现类中，除了实现接口的方法外，还可以定义自己专有的成员变量和方法
    public IUnionCardServiceImpl card;
    public void setCard(IUnionCardServiceImpl card){
        this.card=card;
    }
    /**
     * 验证方法的标准定义
     *
     * @param input 用户输入的密码
     * @return 是否验证成功
     */
    @Override
    public boolean checkPwd(String input) {
        //先判断用户输入的input和card中的pwd是否相同
        //相同返回 true
        //字符串比较不能使用==必须使用equals方法
        if (input.equals(card.pwd)){
            return true;
        }else {
            return false;}
    }

    /**
     * 取款方法的标准定义
     *
     * @param money 取款金额
     * @return 是否取款成功
     */
    @Override
    public boolean drawMoney(double money) {
        //先检查card对象中bal是否>=取款金额mony
        //如果>=就正常取款返回ture
        if (card.bal >= money) {
            card.bal -= money;
            return true;
        } else {
            return false;
        }
    }
        /**
         * 查询余额的方法
         */
        @Override
public double getBalance(){
        return card.bal;
        }
}