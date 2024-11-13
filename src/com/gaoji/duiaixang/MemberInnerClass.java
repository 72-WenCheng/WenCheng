package com.gaoji.duiaixang;

/**
 * 成员内部类
 * 可以直接访问外部类的所有成员，包含私有
 * 可以添加任意访问修饰符，本质是一个全局成员
 * 作用域：作用域于本类整体，例如在外部类成员方法中创建该成员内部类对象，再调用该成员方法
 * 外部类访问内部类（创建对象后访问）
 * 外部其他类使用成员内部类（3种）
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        MemberInner memberInner = new MemberInner();
        memberInner.t1();

        //1.外部其他类使用成员内部类（3种）
        MemberInner.Inner01 inner01 = memberInner.new Inner01();
        inner01.say();

        //2.外部其他类使用成员内部类（3种）
        MemberInner.Inner01 inner02 = memberInner.getInner01();
        inner02.say();
    }
}
class MemberInner{
    private int n1 = 300;

    public String name = "彭文成";

    class Inner01{
        public void say(){
            System.out.println("n1="+n1);
            System.out.println("name="+name);
        }
        int b1 = 1;
    }

    //3.外部类使用成员内部类（3种）
    public void t1(){
        Inner01 inner01 = new Inner01();
        System.out.println(inner01.getClass());
    }
    //2.外部其他类使用成员内部类（3种）
    public Inner01 getInner01(){
        return new Inner01();
    }
}
