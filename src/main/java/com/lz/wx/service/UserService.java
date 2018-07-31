package com.lz.wx.service;

/**
 * Created by 26949 on 2018/7/27.
 */
public interface UserService {

    public boolean login(String mobile, String password);

    public double getBalance(String mobile);

    public void printMessage(String msg);

    public String getName(String id);
}
