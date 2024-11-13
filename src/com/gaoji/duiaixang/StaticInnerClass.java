package com.gaoji.duiaixang;

/**
 * 静态内部类
 * 使用static修饰
 * 可以访问外部类的所有静态成员，非静态不能访问
 * 可以添加任意访问修饰符
 * 作用域为本类整体
 * 外部其他类访问静态内部类
 * 1）通过类名直接访问（遵循访问权限）
 * 2）定义方法返回静态内部类对象
 * 如果外部类和静态内部类成员重名时，就近原则，想访问外部类成员则：外部类类名.成员名
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        StaticInner staticInner = new StaticInner();
        //通过类名直接访问（遵循访问权限）
        StaticInner.Inner01 inner01 = new StaticInner.Inner01();
        //定义方法放回静态内部类对象
        StaticInner.Inner01 inner02 = staticInner.getInner01();
    }
}

class StaticInner{
    private int a1 = 400;

    private static int b1 = 500;

    private static void f1(){
        System.out.println("哈哈哈");
    }

    static class Inner01{
        public void m1(){
            System.out.println(b1);
//            System.out.println(a1);
            f1();
        }
    }

    public Inner01 getInner01(){
        return new Inner01();
    }
}
