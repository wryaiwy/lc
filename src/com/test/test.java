package com.test;

/**
 * @Author: wengrunyang
 * @Description:
 * @DateTime: 2025/7/15 14:55
 **/
public class test {
    public static void main(String[] args) {
        new Son();
    }
}

class Parent{
    public String name = "Parent";
    public Parent(){
        sayName();
    }
    public void sayName(){
        System.out.println("1111"+name);
    }
}

class Son extends Parent{
    public String name = "Son";
    public Son(){
        sayName();
    }
    public void sayName(){
        System.out.println("222"+name);
    }
}
