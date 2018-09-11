package com.lz.wx.service.impl;

import com.lz.wx.dao.GradeDao;
import com.lz.wx.model.Grade;
import com.lz.wx.service.GradeService;
import com.lz.wx.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 26949 on 2018/9/10.
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired GradeDao gradeDao;

    @Override
    public void grade(String name, int language, int mathematics, int English) {
            Grade grade=new Grade();
            grade.setId(IDGenerator.nextId());
            grade.setName(name);
            grade.setLanguage(language);
            grade.setMathematics(mathematics);
            grade.setEnglish(English);
            gradeDao.save(grade);

    }
}
