package com.mian.duixiang;

import java.util.Scanner;

/**
 * 编写一个Cale计算器，在其中定义2个变量表示两个操作数，定义4个方法实现
 * 求和
 * 差
 * 乘
 * 商（要求除数为0的话提示）
 * 并创建两个对象分别测试
 */
public class zuoye08 {
    public static void main(String[] args) {
        Cale ciecle1 = new Cale();
        Cale ciecle2 = new Cale();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数：");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        ciecle1.a = a;
        ciecle1.b = b;
        System.out.println(ciecle1.top1());
        System.out.println(ciecle1.top2());
        System.out.println(ciecle1.top3());
        ciecle1.top4();
        System.out.println();
        System.out.println("===========");
        ciecle2.a = a;
        ciecle2.b = b;
        System.out.println(ciecle2.top1());
        System.out.println(ciecle2.top2());
        System.out.println(ciecle2.top3());
        ciecle2.top4();
    }
}
class Cale{
    double a;
    double b;
    public double top1(){
        System.out.print("和：");
        return a+b;
    }
    public double top2(){
        System.out.print("差：");
        return a-b;
    }
    public double top3(){
        System.out.print("乘：");
        return a*b;
    }
    public void top4(){
        int res = 0;
        if (b == 0){
            System.out.print("除数不能为0");
        }else {
            res = (int) (a/b);
            System.out.print("商："+res);
        }
    }
}
