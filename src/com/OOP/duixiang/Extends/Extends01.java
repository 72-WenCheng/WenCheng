package com.OOP.duixiang.Extends;

/**
 * 面向对象三大特征：封装、继承、多态
 * 继承：
 * 提高代码的复用性
 * 语法：
 * class 子类 extends 父类{}
 * 子类会拥有父类定义的属性和方法
 * 子类继承了父类所有的属性和方法，但是私有属性不能在子类直接访问，要通过公共的方法
 * 子类必须调用父类的构造器，完成父类的初始化
 * 当创建子类对象时,不管使用子类的哪个构造器，默认情况下去调用父类的无参构造器
 * 如果父类没有提供无参构造器，则必须在子类的构造器中super指向父类的哪个构造器完成对父类的初始化工作
 * 如果希望指定去调用父类的某个构造器，则使用super指明
 * super在使用时，必须放在构造器第一行
 * super和this都只能放在构造器第一行，因此不能同时存在
 * java所有类都是Object类的子类
 * 父类构造器的调用不限于直接父类，将一直往上追溯直到Object类（顶级父类）
 * 子类最多只能继承一个父类（直接继承）
 * 不能滥用继承，子类和父类之间必须满足is-a的逻辑关系
 */
public class Extends01 {
    private String name;
    public static int age;

    //父类无参
    public Extends01(){
        System.out.println("extends1被调用");
    }

    //属性get、set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //静态属性，没必要this了
//    public void setAge(int age) {
//        this.age = age;
//    }
}
