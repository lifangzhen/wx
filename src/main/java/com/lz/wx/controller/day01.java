package com.lz.wx.controller;

import java.util.Scanner;

/**
 * Created by 26949 on 2018/7/24.
 */
public class day01 {
    public static void main(String[] args) {
        //step1定义输入变量：单价，数量，收款金额。
        double price,amount,money;
        //step2定义输出变量；总价，找零，
        double total,change;
        Scanner sc=new Scanner(System.in);
        //step3提示用户三个值，并保存到对应变量中。
        System.out.println("请输入商品单价：");
        //使用变量sc获得数据
        price=sc.nextDouble();
        //程序运行到此会暂停，等待用户输入
        //如果用户在控制台输入了数据，就按回车
        //当用户按了回车sc的nextDouble()方法就会用户输入的数据保存到price程序继续运行；
        System.out.println("请输入购买数量:");
        amount=sc.nextDouble();
        System.out.println("请输入收款金额：");
        money=sc.nextDouble();
        /*阶段测试*/
       // System.out.println(price+","+amount+","+money);
        //打桩：测试阶段程序运行是否正常
        /*到此，三个输入变量中都得到用户输入发数据*/
        //step4使用变量price*amount=总价，保存到total中
        total=price*amount;
        //step5判断变量total是否超过500
        //     如果超过，则返回total*0.8;
        //                否则返回total;
        //       无论判断结果是什么，都要保存到变量total中
        total=total>500?total*0.8:total;
        //step6:使用变量money-toutal=找零，保存到change中
        change=money-total;
        //step7；按照用户要求，输出结果。
        System.out.println("应收金额："+String.format("%.2f",total));
        //System.out.println("因收金额："+total);
        System.out.println("找零："+String.format("%.2f",change));
        //System.out.println("找零："+change);
    }
    }
