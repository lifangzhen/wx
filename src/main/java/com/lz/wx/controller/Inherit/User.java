package com.lz.wx.controller.Inherit;

/**封装买家和买家公共属性和功能的类
 *
 * Created by 26949 on 2018/8/1.
 */
public class User {
    /*公共属性*/
    String name;
    String address;
    String mobile;

    /*公共功能*/
    public void searchProducts(){
        System.out.println(name+"查询商品。。。");
    }
    public void searchOrders(){
        System.out.println(name+"查询订单。。。");
    }
}
