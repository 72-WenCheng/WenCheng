package com.jichu.changyongClass;
@SuppressWarnings({"all"})
/**
 * @author 彭文成
 * @version 1.0
 * 注解
 * 也被称为元数据，用于修饰解释包、类、方法、属性、构造器、局部变量等信息
 * 和注释一样，注解不影响程序逻辑，但可以被编译运行，相当于嵌入式在代码中的补充信息
 * 在JavaSE中，注解的使用目的比较简单，例如标记过时的功能，忽略警告等
 * 用来配置应用程序的任何切面
 * 代替JavaEE旧版本中所遗留的繁冗代码和XML配置
 * 使用Annotation时要在其前面加上@
 * 三个基本的
 * @Override：限定某个方法，是重写父类方法，该注解只能用于方法
 * @Deprecated：用于表示某个程序元素（类、方法）-已过时
 * @SuppressWarnings：抑制编译器警告
 * 元注解
 * 用于修饰注解的注解
 * Retention：指定注解的作用范围（SOURCE\CLASS\RUNTIME）
 * Target：指定注解可以在哪些地方使用
 * Documented：指定该注解是否会在javadoc体现
 * Inherited：子类会继承父类注解
 */
public class Annotation {
    public static void main(String[] args) {
        Son son = new Son();
        son.fly();

        A a = new A();//过时，不推荐使用
    }
}

class Father{
    public void fly(){
        System.out.println("fly()");
    }
}

class Son extends Father{
    @Override//作语法校验
    public void fly() {
        System.out.println("Son()");
    }
}
@Deprecated
class A{
    public int n1 = 10;
    public void hi(){

    }
}