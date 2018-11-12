package com.lz.wx.service;

import com.lz.wx.model.User;

/**
 * Created by yjingjing on 2018/11/12.
 */
public interface UserService{
    /**
     * addUser
     * @param name
     * @param sex
     * @param age
     */

    public void addUser(String name,String sex,Integer age);
    /**
     * updateUser
     * @param id
     * @param name
     * @param sex
     * @param age
     */
    public void updateUserById(String id,String name,String sex,Integer age);
    /**
     * getUser
     * @param id
     * @return
     */
    public void getUserById(String id);
    /**
     * deleteUser
     * @param id
     */
    public void deleteUserById(String id);




}
