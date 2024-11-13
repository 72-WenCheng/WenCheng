package com.OOP.duixiang.Extends;

public class A {
    public int i = 10;
    //动态绑定机制
    public int sum(){
        return getI()+10;
    }

    public int sum1(){
        return i+10;
    }

    public int getI(){
        return i;
    }
}
