package com.lz.wx.controller;

import com.lz.wx.model.Company;
import com.lz.wx.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 26949 on 2018/9/16.
 */
@Controller
public class CompanyController {
    @Autowired CompanyService companyService;

    @RequestMapping("/getCompanyById")
    public ModelAndView getUserId(String id){
        Company company=companyService.findGradeById(id);
        ModelAndView mav=new ModelAndView("/company");
        mav.addObject("name",company.getName());
        mav.addObject("age",company.getHobby());
        mav.addObject("hobby",company.getHobby());
        return mav;

    }

}
