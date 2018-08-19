package com.lz.wx.controller;

import com.lz.wx.service.impl.ATMABC;
import com.lz.wx.service.impl.ATMCBCServiceImpl;
import com.lz.wx.service.impl.IUnionCardServiceImpl;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by 26949 on 2018/8/19.
 */
public class ATMABCTest {
    public static void main(String[] args) {
        //实例化银行卡
        ATMABC atm=new ATMABC();
        //实例化一张银行卡
        IUnionCardServiceImpl card=new IUnionCardServiceImpl("ABC","123456",5000);
        //将银行卡放入取款机11
        atm.setCard(card);
        //提示用户输入密码
        System.out.println("请输入密码");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        if (atm.checkPwd(input)){
            System.out.println("请输入手机号");
            String tel=sc.next();
            System.out.println("请输入充值金额");
            double money=sc.nextDouble();
            if (atm.payTelBill(tel,money)){
                System.out.println("充值成功！余额"+atm.getBalance());
            }else {
                System.out.println("余额不足，充值失败！");
            }

        }else {
            System.out.println("输入的密码不正确！");
        }


    }
}
