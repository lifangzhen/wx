package com.lz.wx.service;

import com.lz.wx.model.Community;
import com.lz.wx.model.Lab;

/**
 * Created by 26949 on 2018/9/6.
 */
public interface CommunityService {
    public Community findGradeById(String id);

    public void community(String name,int age,String hobby,String sex);
}
