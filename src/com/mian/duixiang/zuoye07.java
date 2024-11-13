package com.mian.duixiang;

import java.util.Scanner;

/**
 * 定义一个圆类Ciecle，定义属性：半径，提供计算该园的周长功能的方法，以及面积
 */
public class zuoye07 {
    public static void main(String[] args) {
        Ciecle ciecle = new Ciecle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入圆半径：");
        double a = scanner.nextDouble();
        ciecle.r = a;
        System.out.println(ciecle.zhouchang());
        System.out.println(ciecle.mianji());
    }
}
class Ciecle{
    double r;
    public double zhouchang(){
        System.out.println("圆的周长为：");
        return 2*3.14*r;
    }
    public double mianji(){
        System.out.println("圆的面积为：");
        return 3.14*r*r;
    }
}
