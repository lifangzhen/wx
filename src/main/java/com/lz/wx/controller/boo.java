package com.lz.wx.controller;

/**
 * Created by 26949 on 2018/7/21.
 */
        /*三目运算*/
public class boo {
    public static void main(String[] args) {
       char ts='人';
       char bgj='妖';
        char ry='变';
        char Who=ts;
        char r=Who;
       Who=bgj;
        r=Who=='人'?'留': Who=='妖'?'杀':'泰';
       System.out.println(r);




    }
}
