package com.lz.wx.controller;

import com.lz.wx.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 71426 on 2018/7/19.
 */
@Controller
public class Lottery {

    public void plus(int i, int j){
        int k = i+j;
    }

    public int tt(int i, int j){
        int k = i + j;
        return k;
    }

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("/index");
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId("1");
        user1.setName("李方针");
        User user2 = new User();
        user2.setId("2");
        user2.setName("闫柏龙");
        User user3 = new User();
        user3.setId("3");
        user3.setName("刘超");
        User user4 = new User();
        user4.setId("4");
        user4.setName("李歆瑶");
        User user5 = new User();
        user5.setId("5");
        user5.setName("闫桂龙");
        User user6 = new User();
        user6.setId("6");
        user6.setName("李玉芳");
        User user7 = new User();
        user7.setId("7");
        user7.setName("闫婧");
        User user8 = new User();
        user8.setId("8");
        user8.setName("闫家斌");
        User user9 = new User();
        user9.setId("9");
        user9.setName("盛世叶");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user9);


        mav.addObject("list", list);
        return mav;
    }
}
