package com.gaoji.duiaixang;

/**
 * 类方法/静态方法（static）
 * 定义、访问与静态变量一致
 * 经典使用场景：
 * 当方法中不涉及到任何对象相关成员
 * 比如工具类中的方法utils
 * Math类、Arrays类、Collections集合
 * 在实际开发中，往往会将一些通用的方法，设计成静态方法
 * 这样子我们就不需要创建对象就可以使用了
 * 类方法和普通方法都是随着类的加载而加载，将结构信息存储在方法区
 * 类方法不允许使用和对象有关的关键字，比如this、super，只能访问静态变量/方法
 * 普通方法则都可以访问（遵守访问修饰符规则）
 */
public class day02 {
    public static void main(String[] args) {
        Stu stu1 = new Stu("jack");
        stu1.payFee(100);

        Stu stu2 = new Stu("ag");
        stu2.payFee(100);

        Stu.showFee();
    }
}
class Stu{
    private String name;

    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    public void payFee(double fee){
        Stu.fee += fee;
    }

    public static void showFee(){
        System.out.println("总学费："+Stu.fee);
    }
}
