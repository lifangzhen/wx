package com.lz.wx.utils;

import java.util.Random;

/**
 * Created by 26949 on 2018/8/20.
 */
public class IDGenerator {
    public static final String nextId() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(Long.valueOf(randomNum(9)));
        return sb.toString();
    }
    public static String randomNum(int length) {
        Random ram = new Random();
        int inum = Math.abs(ram.nextInt());
        String numt = String.valueOf(inum);
        StringBuffer sbbase = new StringBuffer("0");

        for(int i = 0; i < length; ++i) {
            sbbase.append("0");
        }

        String sbase = sbbase.toString();
        String snum = null;
        if(numt.length() < length) {
            snum = sbase.substring(0, length - numt.length()) + numt;
        } else {
            snum = numt.substring(0, length);
        }

        return snum;
    }
}
