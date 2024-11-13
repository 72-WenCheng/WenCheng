package com.OOP.duixiang.Extends;

/**
 * java的动态绑定机制
 * 当调用对象方法的时候，该方法会和该对象内存地址/运行类型绑定
 * 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
 */
public class main {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
