package com.OOP.duixiang.Polymorphism;

public class Dog extends Animal {
    public void cry() {
        System.out.println("Dog cry() 小狗猫猫叫...");
    }

    public Dog(String name) {
        super(name);
    }

    public void cryatr() {
        System.out.println("向下转型");
    }
}
