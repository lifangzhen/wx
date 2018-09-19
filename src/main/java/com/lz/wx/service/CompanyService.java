package com.lz.wx.service;

import com.lz.wx.model.Company;

/**
 * Created by 26949 on 2018/9/7.
 */
public interface CompanyService {
    public Company findGradeById(String id);

    public void company(String name,int age,String hobby);
}
