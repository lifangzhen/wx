package com.lz.wx.service.impl;

import com.lz.wx.dao.CommunityDao;
import com.lz.wx.model.Community;
import com.lz.wx.service.CommunityService;
import com.lz.wx.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/9/6.
 */
@Service
public class CommunityServiceImpl implements CommunityService{
    @Autowired private CommunityDao communityDao;


    @Override
    public Community findGradeById(String id) {
        Community community=communityDao.findById(id).orElse(null);
        return community;
    }

    @Override
    public void community(String name, int age, String hobby, String sex) {
        Community community=new Community();
        community.setId(IDGenerator.nextId());
        community.setName(name);
        community.setAge(age);
        community.setHobby(hobby);
        community.setSex(sex);
        communityDao.save(community);
    }
}
