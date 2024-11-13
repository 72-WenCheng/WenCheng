package com.OOP.duixiang.Polymorphism;

public class Master {
    public void feed(Animal animal, Food food){
        System.out.println("主人给"+animal.getName()+"喂"+food.getName());
    }
}
