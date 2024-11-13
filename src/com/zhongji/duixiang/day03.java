package com.zhongji.duixiang;

/**
 * 访问修饰符
 * java提供四种访问控制修饰符号控制方法和属性（成员变量）的访问权限
 * 公开级别 public
 * 受保护 protected，对子类和同一个包中的类公开
 * 默认 没有修饰符号，向同一个包的类公开
 * 私有级别 private，只有类本身可以访问
 * public以及默认才可以修饰类
 */
public class day03 {
    public int n1 = 100;
    protected  int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    //该方法可以访问4个属性
    public void hg(){
        System.out.println("n1="+n1+"\n"+"n2="+n2+"\n"+"n3="+n3+"\n"+"n4="+n4);
    }
}
