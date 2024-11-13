package com.gaoji.duiaixang;

/**
 * 抽象类
 * 当父类的某些方法，需要声明，但是又不确定如何实现时
 * 没有方法体且类也要声明abstract
 * 抽象类的价值更多作用是在于设计，是设计者设计之后，让子类继承并实现抽象类
 * 在框架和设计模式使用较多
 * 细节：
 * 抽象类不能被实例化
 * 抽象类不一定要包含abstract方法
 * 类包含了abstract方法，类也要声明abstract
 * abstract只能修饰类和方法，不能修饰属性和其他的
 * 抽象类可以有任意成员{抽象方法、构造器、静态属性等等}
 * 抽象方法不能有主体，即不能实现
 * 如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法
 */
public class day08 {
    public static void main(String[] args) {
        Animal animal = new Animal("文成") {
            @Override
            public void eat() {

            }
        };
    }
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
}
