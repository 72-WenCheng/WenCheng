package com.OOP.duixiang.Polymorphism;

public class Studentser extends Personser {
    private double score;

    public Studentser(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    //重写
    public String say(){
        return super.say()+"\n"+score;
    }

    public void stent(){
        System.out.println(getName()+"学生正在学java");
    }
}
