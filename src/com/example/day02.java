package com.example;
/**变量：是程序的基本组成单位，表示内存中的一个存储区域
 * 具有三个基本要素（类型+名称+值）
 * 声明 int a;
 * 赋值 a = 1;
 * 该区域的数据可以在同一类型范围内不断变化
 * 变量在同一个作用域内不能重命
 */
public class day02 {

    public static void main(String[] args) {
        int a = 1;
        int b;
        b = 4;
        System.out.println(a);
        System.out.println(b);
        //可变化
        a=2;
        System.out.println(a);
    }
}
