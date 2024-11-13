package com.gaoji.duiaixang;

/**
 * 类变量/静态变量
 * 该类所有对象共享的变量，任何对象的访问和修改都一样
 * 访问：类名.静态变量或者对象.静态变量，遵循访问修饰符规则
 * 细节：
 * 当我们需要统计时可以选择使用静态变量
 * 实例变量/普通变量/非静态变量/静态变量
 */
public class day01 {
    public static void main(String[] args) {
//        int count = 0;

        Child child1 = new Child("jack");
        child1.join();
//        count++;
        Child.count++;

        Child child2 = new Child("man");
        child2.join();
//        count++;
//        System.out.println("共有"+count+"个人加入了游戏");
        Child.count++;

        System.out.println("共有"+Child.count+"个人加入了游戏");
    }
}
class Child{
    private String name;
    //定义一个静态变量
    public static int count = 0;

    public Child(String name){
        this.name = name;
    }

    public void join(){
        System.out.println(name+"加入了游戏");
    }
}
