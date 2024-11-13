package com.example;

/**
 * 基本数据类型转换
 * 当java程序在进行赋值或者运算时，精度小的类型自动转换精度大的类型
 * byte-short-int-long-float-double
 * char-int-long-float-double
 */
public class day05 {
    public static void main(String[] args) {
        //自动转换
        int a = 'c';
        double b = 80;
        System.out.println(a);
        System.out.println(b);
        //有多种类型的数据混合运算时
        //系统首先自动将所有数据转换成容量大的数据类型计算
        int n1 = 10;
        double d1 = n1 + 1.1;
        System.out.println(d1);
        //如果是数值赋值，在范围内，可以转换，如果是变量赋值，需判断类型，否则不兼容
        byte num2 = 10;

        //int num = 1;
        //byte num3 = num;

        //byte a1 = 1;
        //byte a2 = 1;
        //short b3 = a1 + a2;

        //强制类型转换，会丢失精度、数据溢出
        int s1 = (int)1.9;
        System.out.println(s1);
        int s2 = 2000;
        byte s3 = (byte)s2;
        System.out.println(s3);
        //强转符号只针对最近的操作数有效，往往使用小括号提升优先级
        //int x = (int)10*3.15+6*12.8;
        int x = (int)(10*3.15+6*12.8);
        System.out.println(x);
        //char类型可以保存int的常量值，但不能保存int的变量值，需要强转
        char m1 = 100;
        int m2 = 100;
        //char m3 = m2;
        char m4 = (char) m2;
        System.out.println(m4);
        //byte和short类型在进行运算时，当作int处理
        byte p1 = 1;
        short p2 = 2;
        int p3 = p1+p2;
    }
}
