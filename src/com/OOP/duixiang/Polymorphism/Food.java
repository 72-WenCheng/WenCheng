package com.OOP.duixiang.Polymorphism;

public class Food {
    private String name;

    //声明了有参，无参则被覆盖，需要的话，要显示写出来
    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
