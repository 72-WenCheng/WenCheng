package com.zhongji.duixiang;

/**
 * 用断点查看对象的创建
 */
public class Duandian04 {
    public static void main(String[] args) {
        //加载Fr类信息
        //默认初始化、显示初始化、构造器初始化
        //返回对象地址
        Fr fr = new Fr("jack",18);
        System.out.println(fr);
    }
}

class Fr{
    private String name;
    private int age;

    public Fr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fr{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}