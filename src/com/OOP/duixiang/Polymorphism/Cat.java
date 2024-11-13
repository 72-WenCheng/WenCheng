package com.OOP.duixiang.Polymorphism;

public class Cat extends Animal {
    public void cry() {
        System.out.println("Cat cry() 小猫喵喵叫...");
    }

    public Cat(String name) {
        super(name);
    }
}
