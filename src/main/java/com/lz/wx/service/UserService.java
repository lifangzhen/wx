package com.lz.wx.service;

/**
 * Created by 26949 on 2018/7/27.
 */
public interface UserService {

    public void regist(String name, String mobile, String passwd, Integer age, Integer sex);

    public void insertHuafu(String name, String gender, int age);

    public boolean login(String mobile, String password);

    public double getBalance(String mobile);

    public void printMessage(String msg);

    public String getName(String id);
}
