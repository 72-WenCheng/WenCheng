package com.gaoji.duiaixang;

/**
 * 内部类（4种）
 * 一个类的内部又完整嵌套了另一个类结构
 * 嵌套其他类的类称为外部类
 * 内部类最大的特点是可以直接访问私有属性，并且可以体现类与类之间的包含关系
 * 语法：
 * public class Outer {//外部类
 *     class Inner{//内部类}
 * }
 * class Other{//外部类其他类}
 * 类的五大成员：属性、方法、构造器、代码块、内部类
 * 定义在外部类局部位置上（比如方法内）：
 * 1）局部内部类（有类名）
 * 2）匿名内部类（没有类名）
 * 定义在外部类的成员位置上：
 * 1）成员内部类（没有static修饰）
 * 2）静态内部类（使用static修饰）
 */
public class Cals01 {
    private int n1 = 100;

    public void m1(){
        System.out.println("m1()被执行...");
    }

    {
        System.out.println("代码块...");
    }

    public Cals01(int n1) {
        this.n1 = n1;
        System.out.println("有参方法被执行...");
    }

    //成员内部类
    class Inner{

    }
}

//外部其他类
class Other{

}
