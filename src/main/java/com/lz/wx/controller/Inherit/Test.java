package com.lz.wx.controller.Inherit;

/**
 * Created by 26949 on 2018/8/1.
 */
public class Test {
    public static void main(String[] args) {
        User u=new User();
        Customer c=new Customer();
        Seller s=new Seller();
        c.name="白富美";
        s.name="店小二";
        c.searchOrders();
        s.searchProducts();


        /*继承中的构造方法测试*/
        Ipad air2=new Ipad(9.7,8759);
        System.out.println("屏幕:"+air2.screen+";电池"+air2.battery);
        Iphone if6=new Iphone(4.7,1810,"1212121211212");
        System.out.println("屏幕："+if6.screen
                            +";电池:"+if6.battery
                            +";手机号:" +if6.mobile);
        /*向上转型的测试*/
        Ipad charger;
        charger=air2;//编译正确：air2本身就是ipad父类/类型
        charger=if6;
        charger(charger);
    }
    public static void charger(Ipad charger) {
        System.out.println(charger.toString()+"正在充电");
    }
}
class Ipad{
    double screen;//屏幕大小
    int battery;//电池容量
    Ipad(){}
    Ipad(double screen,int battery){
        this.screen=screen;
        this.battery=battery;
    }
}

class Iphone extends Ipad{
    String mobile;//手机号


    Iphone(double screen,int battery,String mobile){
        super(screen,battery);
        this.mobile=mobile;


    }

}