package com.lz.wx.service.impl;

import com.lz.wx.dao.SchoolDao;
import com.lz.wx.model.School;
import com.lz.wx.service.SchoolService;
import com.lz.wx.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/9/5.
 */
@Service
public class SchoolServiceImpl implements SchoolService{
    @Autowired private SchoolDao schoolDao;


    @Override
    public void school(String name, String location, String rector, String contacts, int number) {
        School school = new School();
        school.setId(IDGenerator.nextId());
        school.setName(name);
        school.setLocation(location);
        school.setRector(rector);
        school.setContacts(contacts);
        school.setNumber(number);
        schoolDao.save(school);
    }
}


