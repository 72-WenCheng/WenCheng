package com.OOP.duixiang.Extends;

public class Extends02 extends Extends01 {

    public Extends02(){
        System.out.println("extends2被加载");
    }

    public static void main(String[] args) {
        Extends02 extends2 = new Extends02();
        extends2.setName("文成");
        System.out.println(extends2.getName());
//        extends2.setAge(21);
        Extends01.age = 21;
        System.out.println(age);
    }
}
