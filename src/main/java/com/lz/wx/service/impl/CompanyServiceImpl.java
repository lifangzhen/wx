package com.lz.wx.service.impl;

import com.lz.wx.dao.CompanyDao;
import com.lz.wx.model.Company;
import com.lz.wx.service.CommunityService;
import com.lz.wx.service.CompanyService;
import com.lz.wx.utils.IDGenerator;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/9/7.
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired CompanyDao companyDao;

    @Override
    public void company(String name, int age, String hobby) {

        for (int i=1;i<=100;i++){
            Company company=new Company();
            company.setId(IDGenerator.nextId());
            company.setName(name+i);
            company.setAge(age);
            company.setHobby(hobby+i);
            companyDao.save(company);

        }
    }



}