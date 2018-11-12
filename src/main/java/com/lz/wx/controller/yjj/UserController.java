package com.lz.wx.controller.yjj;

import com.lz.wx.model.User;
import com.lz.wx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yjingjing on 2018/11/12.
 */

@RestController
public class UserController{
    @Autowired private UserService userService;
    @GetMapping("/yjj/addUser")
    public void addUser(String name,String sex,Integer age) {
        userService.addUser(name,sex,age);
    };
   @GetMapping("/yjj/updateUser")
    public void updateUser(String id,String name,String sex,Integer age){
       userService.updateUserById(id,name,sex,age);
   };
   @GetMapping("/yjj/getUser")
    public void getUser(String id){
       userService.getUserById(id);
   };
   @GetMapping("/yjj/deleteUser")
    public void deleteUser(String id){
       userService.deleteUserById(id);
   };
}
