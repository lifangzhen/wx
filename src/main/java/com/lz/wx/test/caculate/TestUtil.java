package com.lz.wx.test.caculate;

/**
 * Created by 26949 on 2018/7/22.
 */
public class TestUtil {
    public String addObject(String i, String j){
        return i+":"+j;
    }

    public int plus(int i, int j){
        i = i*i;
        i = i+i;
        j = j*j;
        j = j+j;
        i=i+j;
        return i+j;
    }
}
