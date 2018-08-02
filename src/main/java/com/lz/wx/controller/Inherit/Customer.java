package com.lz.wx.controller.Inherit;

/*封装买家个性属性和功能的类
 * Created by 26949 on 2018/8/1.
 */
public class Customer extends User {
/*买家独有的属性*/
    int lvl;
    /*买家独有的功能*/
    public void evaluste(){
        System.out.println(name+"谁评价商品。。。");
    }
}
