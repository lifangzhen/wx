package com.lz.wx.controller;

/**
 * Created by 26949 on 2018/9/2.
 */
public class Teacher {
    public String name;
    public String major;
    public String giveCourse;
    public int teacingAge;

    public void show(){
        System.out.println("大家好我是"+name+"我的专业是"+major+"所教授的课程是"+giveCourse+"教龄是"+teacingAge);
    }
}
