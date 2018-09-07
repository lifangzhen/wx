package com.lz.wx.task;

import com.lz.wx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 71426 on 2018/8/7.
 */
@Component
@EnableAsync
public class SyncTest {
//    @Autowired private UserService userService;

//    @Async
//    @Scheduled(fixedDelay = 5)
//    public void test1() throws InterruptedException {
//        for (int i=0;i<1000;i++){
//            String name = "name"+i;
//            String mobile = (1590102000+i)+"";
//            String password = "123456";
//            Integer age = i==0?0:1000%i;
//            Integer sex = 1;
//            userService.regist(name, mobile, password, age, sex);
//        }
//    }

    @Async
//    @Scheduled(fixedDelay = 1)
    public void test2() throws InterruptedException {
//        for (int i=0;i<10;i++){
//            String userId = i+"id";
//            userService.getUser(userId);
//        }
    }
}
