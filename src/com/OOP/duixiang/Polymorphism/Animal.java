package com.OOP.duixiang.Polymorphism;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println("动物在叫...");
    }

    public String getName() {
        return name;
    }
}
