package com.OOP.duixiang.Polymorphism;

public class Teachar extends Personser {
    private double salary;

    public Teachar(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String say() {
        return super.say()+"\n"+salary;
    }

    //特有方法
    public void tent(){
        System.out.println(getName()+"老师正在授课");
    }
}
