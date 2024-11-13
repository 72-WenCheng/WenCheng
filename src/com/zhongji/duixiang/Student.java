package com.zhongji.duixiang;

public class Student extends Person{
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age); //父类没有声明无参或声明了有参，需要子类super指向
        this.id = id;
        this.score = score;
    }

    public String say(){
        return super.say()+"\n"+"id："+id+"\n"+"score："+score;
    }
}
