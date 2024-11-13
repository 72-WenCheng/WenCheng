package com.zhongji.duixiang;

public class Test {
    public static void main(String[] args) {
        day03 dy3 = new day03();
        dy3.hg();

        System.out.println("-----");
        System.out.println("n1="+dy3.n1+"\n"+"n2="+dy3.n2+"\n"+"n3="+dy3.n3);

        day05 dy5 = new day05();
        dy5.cry();

        Student student = new Student("彭文成",18,1,150);
        System.out.println(student.say());
    }
}
