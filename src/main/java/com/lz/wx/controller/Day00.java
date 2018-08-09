package com.lz.wx.controller;

/**
 * Created by 26949 on 2018/7/21.
 */
        /*三目运算*/

public class Day00 {
    public static void main(String[] args) {
       char ts='人';
       char bgj='妖';
        char ry='变';
        char Who=ts;
        char r=Who;
       Who=ts;
        r=Who=='人'?'留': Who=='妖'?'杀':'泰';
       System.out.println(r);


        int student1=98;
        int student2=89;
        int performance=student1>student2?student1:student2;
        System.out.println(performance);


    }
}