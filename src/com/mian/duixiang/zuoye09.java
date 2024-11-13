package com.mian.duixiang;

/**
 * 设计一个Dog类，定义属性名字、颜色、年龄，定义输出方法show显示其信息
 */
public class zuoye09 {
    public static void main(String[] args) {
        System.out.println("---欢迎来到宠物店，任你选购！---");
        Dog dog1 = new Dog("小黄","黑色",11);
        Dog dog2 = new Dog("小黑","白色",12);
        Dog dog3 = new Dog("小白","红色",18);
    }
}
class Dog{
    String name;
    String color;
    int age;
    Dog(String name,String color,int age){
        for (int i = 0; i < 11; i++){
            if (i==5){
                System.out.println("-----");
            }else if(i==6){
                System.out.println("名字："+name);
                System.out.println("颜色："+color);
                System.out.println("年龄："+age);
            }else if(i>6){
                System.out.print("————");
            }else{
                System.out.print("——");
            }
        }
    }
}