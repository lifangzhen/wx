package com.lz.wx.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created by 71426 on 2018/7/19.
 */
@Component
@EnableAsync
public class ScheduledTask {
    public static HashMap<String,String> map = new HashMap<>();
    public static Long start = System.currentTimeMillis();
    public static Integer init = 0;

    @Async
    @Scheduled(fixedDelay = 10)
    public void testDelay() throws InterruptedException {
//        Http http = new Http();
//        String response = http.get("http://uney.juniuo.com/trade/indexSells.json");
//        init++;
//        if (init%1000==0){
//            Long end = System.currentTimeMillis();
//            System.out.println("第"+init/1000+"个1000请求花费"+ (end-start)/1000+"秒");
//
//        }
    }

}
