package com.OOP.duixiang.Extends;

/**
 * 首先看子类是否有该属性
 * 如果可以访问，则返回信息
 * 如果没有这个属性就看父类有没有，有就返回
 * 查找直到Object
 */
public class Extends03 {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name); //动态绑定机制，谁调用，就指向那个对象的属性，如果没有就逐级往上找
        System.out.println(son.age);
        System.out.println(son.getHobby());
    }
}

class GrandPa{
    String name = "小鸡";
    private String hobby = "鸡蛋"; //私有属性要通过公共方法访问

    public String getHobby() {
        return hobby;
    }
}

class Father extends GrandPa{
//    String name = "小花";
    int age = 12;
}

class Son extends Father{
//    String name = "夏明";
}