package com.gaoji.duiaixang;

/**
 * 接口Interface
 * 定义一些没有实现的方法，封装到一起，到某个类要使用的时候
 * 再根据具体情况把这些方法写出来
 * 语法：
 * interface 接口名{属性、方法}
 * class 类名 implements接口{属性、方法、实现接口的抽象方法}
 * jdk8后可以有静态方法，默认方法（使用default关键字）
 * 使用场景：
 * 开发软件中，项目经理为了控制和管理软件，可以定义一些接口，让程序员具体实现
 * 细节：
 * 接口不能实例化
 * 接口中所有的方法是public方法，接口中抽象方法，可以不用abstract修饰
 * 一个普通类实现接口，就必须将该接口的所有方法实现
 * 抽象类实现接口，可以不用实现接口的方法
 * 一个类同时可以实现多个接口
 * 接口中的属性只能是final的，而且是public static final修饰的
 * 属性访问：接口名.属性名
 * 一个接口不能继承其他的类，但是可以继承多个别的接口
 * 接口的修饰的只能是public和默认
 */
public interface InterfaceUsb {
    //静态方法
    static void chushihua(){
        System.out.println("静态方法");
    }

    //默认方法
    default void moren(){
        System.out.println("默认方法");
    }

    //定义接口属性
    int n1 = 1;

    //定义接口方法
    void start();
    void stop();
}
