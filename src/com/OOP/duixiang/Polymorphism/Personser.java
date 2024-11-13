package com.OOP.duixiang.Polymorphism;

public class Personser {
    private String name;
    private int age;

    public Personser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String say(){
        return name+"\n"+age;
    }
}
