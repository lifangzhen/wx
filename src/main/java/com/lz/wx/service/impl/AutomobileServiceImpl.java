package com.lz.wx.service.impl;

import com.lz.wx.dao.AutomobileDao;
import com.lz.wx.model.Automobile;
import com.lz.wx.service.AutomobileService;
import com.lz.wx.utils.IDGenerator;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/9/8.
 */
@Service
public class AutomobileServiceImpl implements AutomobileService {
    @Autowired private AutomobileDao automobileDao;
    @Override
    public void automobile(String name, String type, int seat, int cc, int drive, float kilometers) {
        System.out.println("name:"+name);
        cc = cc + 1;
        kilometers = kilometers + 2f;
        type = null;
        Automobile automobile=new Automobile();
        automobile.setId(IDGenerator.nextId());
        automobile.setName(name);
        automobile.setType(type);
        automobile.setSeat(seat);
        automobile.setCc(cc);
        automobile.setDrive(drive);
        automobile.setKilometers(kilometers);
        automobileDao.save(automobile);
    }
}
