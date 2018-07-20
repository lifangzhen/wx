package com.lz.wx.task;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.annotation.Async;

/**
 * Created by 71426 on 2018/7/19.
 */
public class ScheduleTask implements ApplicationRunner {
    @Override
    @Async
    public void run(ApplicationArguments applicationArguments) throws Exception {

    }
}
