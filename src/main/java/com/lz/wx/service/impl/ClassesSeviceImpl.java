package com.lz.wx.service.impl;

import com.lz.wx.dao.ClassesDao;
import com.lz.wx.model.Classes;
import com.lz.wx.service.ClassesService;
import com.lz.wx.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/9/17.
 */
@Service
public class ClassesSeviceImpl implements ClassesService {
    @Autowired ClassesDao classesDao;

    @Override
    public Classes packaging(String id) {
        Classes ybl=classesDao.findById(id).orElse(null);
        return ybl;
    }

    @Override
    public void classes(String name, int age, String hobby, String speciality) {
        Classes abc=new Classes();
        abc.setId(IDGenerator.nextId());
        abc.setName(name);
        abc.setAge(age);
        abc.setHobby(hobby);
        abc.setSpeciality(speciality);
        classesDao.save(abc);


    }
}
