package com.lz.wx.controller;

/**
 * Created by 26949 on 2018/9/2.
 */
public class Test01 {
    public static void main(String[] args) {
        //创建学生对象
        Student student=new Student();
        student.name="王以太";
        student.age=18;
        student.course="java";
        student.hobby="唱歌";
        student.show();
        System.out.println("test");


        Teacher teacher=new Teacher();
        teacher.name="王硕";
        teacher.major="java";
        teacher.giveCourse="java后端开发";
        teacher.teacingAge=10;
        teacher.show();
    }
}
