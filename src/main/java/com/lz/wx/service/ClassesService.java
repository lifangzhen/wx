package com.lz.wx.service;

import com.lz.wx.model.Classes;

/**
 * Created by 26949 on 2018/9/17.
 */
public interface ClassesService {
    public Classes packaging(String id);
    public void classes(String name,int age,String hobby,String speciality);
}
