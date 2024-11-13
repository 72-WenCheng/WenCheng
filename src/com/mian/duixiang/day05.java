package com.mian.duixiang;

/**
 * 作用域
 * 变量的作用域是非常重要的知识点
 * 在java中主要的变量：属性（成员变量）和局部变量
 * 局部变量：指在本类的成员方法中或者代码块中定义，赋值后才能用
 * 全局/成员变量：也就是属性，作用于整个类（其他类可以调用），可以不赋值，有默认值
 * 注意事项：
 * 属性和局部变量可以重名，访问时遵循就近原则，在同一个作用域中，不能同名
 * 属性生命周期长，伴随着对象的创建而创建，销毁而销毁
 * 局部变量生命周期短，伴随着代码块的执行而创建，结束而销毁
 * 全局变量/属性可以加修饰符，局部变量不行
 */
public class day05 {
    public static void main(String[] args) {
        Cats cats = new Cats();
        cats.cry();
        cats.eat();

        {
            int a = 14;
            System.out.println("代码块："+a);
        }
    }
}
class Cats{
    int age = 18;//全局变量
    double dy;//默认值
    public void cry(){
        int age = 17;//局部变量
        System.out.println("cry中的age："+age);

//        double dy;
//        System.out.println("局部变量dy没有默认值:"+dy);
    }
    public void eat(){
        System.out.println("eat中的age："+age);
        System.out.println("全局变量dy有默认值:"+dy);
    }
}
