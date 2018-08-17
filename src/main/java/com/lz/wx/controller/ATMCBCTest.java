package com.lz.wx.controller;

import com.lz.wx.service.impl.ATMCBCServiceImpl;
import com.lz.wx.service.impl.IUnionCardServiceImpl;
import org.omg.PortableServer.ID_UNIQUENESS_POLICY_ID;

import java.util.Scanner;

/**
 * Created by 26949 on 2018/8/16.
 */
public class ATMCBCTest {
    public static void main(String[] args) {
        //实例化银行卡
        ATMCBCServiceImpl atm=new ATMCBCServiceImpl();
        //实例化一张银行卡
       IUnionCardServiceImpl card=new IUnionCardServiceImpl("CBC","123456",5000);
       //将银行卡放入取款机11
       atm.setCard(card);
        //提示用户输入密码
        System.out.println("欢迎使用建设银行ATM取款机");
        System.out.println("用户李龙龙");
        System.out.println("请输入密码");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        if (atm.checkPwd(input)){
            System.out.println("请输入取款金额");
            double money=sc.nextDouble();
            if (atm.drawMoney(money)){
                System.out.println("取款成功！余额"+atm.getBalance());
            }else {
                System.out.println("余额不足，取款失败！");
            }

        }else {
            System.out.println("输入的密码不正确！");
        }


    }
}
