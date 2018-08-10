package com.lz.wx.controller.Rewrite;

/**
 * Created by 26949 on 2018/8/9.
 */
public class Override {
    public static void main(String[] args) {
        double fee=480;//实际学费
        double money=500;//家长给的钱
        paernt p=new paernt();//家长类型对象
        Child1 c1=new Child1();//大儿子类型对象
        Child2 c2=new Child2();//小儿子类型对象
        //家长的要求
        p.pay(money,fee);
        //大儿子做法
        c1.pay(money,fee);
        //小儿子做法
        c2.pay(money,fee);

        /*动态方法调度 */

        paernt dad=null;//定义一个父类型的变量引用
        Child1 sin1=new Child1();
        Child2 sin2=new Child2();
        dad=sin1;//爸爸和大儿子一起做蛋炒饭
        dad.cook();
        dad=sin2;//爸爸和小儿子一起包饺子
        dad.cook();
        dad=new paernt();//只有父类型对象自己才能调用父类自己的方法
        dad.cook();



    }
}
/*交学费的方法
*   money家长给的钱数
*   fee 实际学费
* */
class paernt{
    /* 爸爸做饭的任务*/
    public void cook(){
        System.out.println("爸爸的任务是：做饭");
    }
    public void pay(double money,double fee){
        System.out.println("家长让交"+fee+"元学费，剩下的"+(money-fee)+"零花钱");
    }
}
/*
* 封装大儿子子类
* */
class Child1 extends paernt{
    /*大儿子任务卡是：蛋炒饭 */
    public void cook(){
        System.out.println("帮大儿子做蛋炒饭");
    }
   public void pay(double money,double fee){
       System.out.println("没交学费买了"+money+"元变形金刚");
   }
}
/*
* 封装小儿子的类
* */
class Child2 extends paernt{
    /*小儿子的任务卡是：包饺子*/
    public void cook(){
        System.out.println("帮小儿子包饺子");
    }
    public void pay(double money,double fee){
        //按照要求先交学费
        super.pay(money,fee);//使用super关键字，调用父类的方法
        //对父类方法进行了补充
        System.out.println("把零花钱存起来");
    }

}