package com.lz.wx.controller;

/**
 * Created by 26949 on 2018/7/30.
 */
public class Day03 {
    public static void main(String[]args){
       /* for (int i=1;i<=9;i++){
            System.out.print(i+"*9="+(i*9)+" ");
        }
        System.out.println();
        for (int i=1;i<=8;i++){
            System.out.print(i+"*8="+(i*8)+" ");
        }
        System.out.println();
        for (int i=1;i<=7;i++){
            System.out.print(i+"*7="+(i*7)+" ");
        }*/



       for (int n=1;n<=9;n++){
           for (int i=1;i<=n;i++){
               System.out.print(i+"*"+n+"="+(i*n)+" ");
           }System.out.println();
       }

    }
}
