package com.lz.wx.service.impl;

import com.lz.wx.dao.LabDao;
import com.lz.wx.model.Lab;
import com.lz.wx.service.LabService;
import com.lz.wx.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/9/6.
 */
@Service
public class LabServiceImpl implements LabService {
    @Autowired private LabDao labDao;

    @Override
    public void lab(String name, String sex, int age, String education, int workAge) {
        Lab lab=new Lab();
        lab.setId(IDGenerator.nextId());
        lab.setName(name);
        lab.setSex(sex);
        lab.setAge(age);
        lab.setEducation(education);
        lab.setWorkAge(workAge);
        labDao.save(lab);

    }
}
