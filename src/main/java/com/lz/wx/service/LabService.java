package com.lz.wx.service;

import com.lz.wx.model.Lab;

/**
 * Created by 26949 on 2018/9/6.
 */
public interface LabService {

    public Lab findGradeById(String id);

    public void lab(String name,String sex,int age,String education,int workAge);
}
