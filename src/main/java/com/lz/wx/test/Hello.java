package com.lz.wx.test;

import com.lz.wx.test.caculate.TestUtil;

/**
 * Created by 26949 on 2018/7/20.
 */
public class Hello {
    public static void main(String[] args) {
        TestUtil test = new TestUtil(); //new 一个TestUtil的对象
        System.out.println(test.plus(2,3));

        int k = test.plus(3,5);
        System.out.println(k);
    }
}
