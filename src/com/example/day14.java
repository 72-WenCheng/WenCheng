package com.example;

import java.util.Scanner;

/**
 * 循环结构
 * for循环
 * for(循环变量初始化;循环条件;循环迭代){循环语句}
 */
public class day14 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++){
//            System.out.println("彭文成"+i);
//        }
//        System.out.println("结束for循环");

        //int i= 1;可以写在外面，改变i的作用域
//        int a = 1;
//        for (;a <= 10;){
//            System.out.println("彭文成"+a);
//            a++;
//        }
//            System.out.println("结束for循环");
//        System.out.println(a);

        //死循环
//        for (;;){
//            System.out.println("死循环");
//        }

        //也可以初始化两个变量和迭代
//        int count = 3;
//        for (int y = 1,f = 3; y < count; y++,f+=2){
//            System.out.println("y="+y);
//            System.out.println("f="+f);
//        }

        //编程思想：化繁为简，将复杂的需求，拆解成简单的需求
        //考虑固定的值，然后转成可以灵活变化的值
        //打印1-100之间所有是9的倍数，统计个数及总和
        //1.完成输出1-100的值
//        for (int w = 1; w <= 100; w++){
//            System.out.println(w);
//        }
        //2.在输出的过程中进行过滤，是9的倍数
        //if (w % 9 == 0){}
        //3.定义统计个数变量int count = 0;当条件满足时，count++
        //4.定义总和变量int sum = 0;当条件满足时sum+=w
//        int count1 = 0;
//        int sum = 0;
//        for (int w = 1; w <= 100; w++){
//            if (w % 9 == 0){
//                System.out.println("w="+w);
//                count1++;
//                sum += w;
//            }
//        }
//        System.out.println("sum="+sum);
        //我们还可以优化，把常量改为变化的值，这样子就可以灵活运用
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你需要打印的数值范围：");
//        int start1 = scanner.nextInt();
//        int start2 = scanner.nextInt();
//        System.out.println("请选择倍数：");
//        int t = scanner.nextInt();
//        int count = 0;
//        int sum = 0;
//        for (int i = start1; i <= start2; i++){
//            if (i % 9 == 0){
//                count++;
//                sum +=count;
//            }
//        }
//        System.out.println("在"+start1+"到"+start2+"之间"+"是"+t+"的倍数有"+count+"个\n"+"总和为："+sum);

        //练习题
        //请找出任在正数范围内两位数相加等于这个数的所有组合（可能）
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一位数：");
        int sty = scanner.nextInt();
        int sta1 = 0;
        int sta2 = sty-sta1;
        for (;(sta1!=sta2||sta1==sta2)&&sta1<=sty; sta1++,sta2--){
            System.out.println(sta1+"+"+sta2+"="+sty);
        }
    }
}
