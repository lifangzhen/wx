package com.lz.wx.service;

import com.lz.wx.model.Grade;

/**
 * Created by 26949 on 2018/9/10.
 */
public interface GradeService {
    public Grade findGradeById(String id);

    public void grade(String name,int language,int mathematics,int English);
}
