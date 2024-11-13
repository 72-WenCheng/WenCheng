package com.example;

import java.util.Scanner;

/**
 * while循环
 * while(循环条件){循环语句，循环变量迭代}
 * do{循环语句，循环变量迭代}while(循环条件)
 */
public class day15 {
    public static void main(String[] args) {
//        int i = 0;
        //循环条件是返回一个boolean值的表达式
        //先判断再执行语句
//        while (i<=10){
//            i++;
//            System.out.println("彭文成"+i);
//        }
//        System.out.println("退出while循环");

        //打印1-100之间所有能被3整除的数
//        int a = 1;
//        while (a<=100){
//            if (a % 3 == 0){
//                System.out.println("a:"+a);
//            }
//            a++;
//        }

        //打印40-200之间所有的偶数
//        int y = 40;
//        while (y <= 200){
//            if (y % 2 == 0){
//                System.out.println(y);
//            }
//            y++;
//        }

        //do-while，先执行后判断，至少执行一次
//        int p = 0;
//        do {
//            p++;
//            System.out.println("你好"+p);
//        }while (p<=9);

        //统计1-200之间能被5整除但不能被3整除的个数
//        int s = 1;
//        do {
//            if (s % 5 == 0 && s % 3 != 0){
//                System.out.println(s);
//            }
//            s++;
//        }while (s<=200);

        //练习题
//        Scanner scanner = new Scanner(System.in);
//        char sta;
//        do {
//            System.out.println("请问李三还钱嘛");
//            sta = scanner.next().charAt(0);
//            if (sta == '不'){
//                System.out.println("五连鞭");
//            }
//        }while (sta != '还');

        //多重循环
//        for (int i = 0; i < 2; i++){
//            for (int j = 0; j < 3; j++){
//                System.out.println("i="+i+"j="+j);
//            }
//        }

        //统计三个班成绩情况，每个班有5名同学，求出各个班的平均分，和三个班级的总平均分，并统计及格人数
//        Scanner scanner = new Scanner(System.in);
//        int pingjunfen;
//        int pjf = 0;
//        int zongsum = 0;
//        int banji;
//        for (banji = 1; banji <= 3; banji++) {
//            int tongxue = 1;
//            int sum = 0;
//            do {
//                System.out.println(banji + "班第" + tongxue + "位同学的成绩为：");
//                pingjunfen = scanner.nextInt();
//                tongxue++;
//                sum += pingjunfen;
//            } while (tongxue <= 5);
//            pjf = sum / (tongxue-1);
//            System.out.println(banji + "班的平均分为：" + pjf);
//            zongsum += sum;
//        }
//        if (banji == 4){
//            System.out.println("这三个班的总平均分为：" + zongsum / (banji-1));
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用班级平均分系统：");
        System.out.println("请你设置班级数：");
        int bjs = scanner.nextInt();
        System.out.println("请设置班级人数：");
        int bjrs = scanner.nextInt();
        double totalScore = 0;
        int pass = 0;
        for (int i = 1; i<=bjs; i++){
            double sum = 0;
            for (int j = 1; j<=bjrs; j++){
                System.out.println("请输入"+i+"班第"+j+"个同学的成绩：");
                double score = scanner.nextDouble();
                if (score >= 60){
                    pass++;
                }
                sum += score;
                System.out.println("成绩为："+score);
            }
            System.out.println("平均分为："+sum/bjrs);
            totalScore += sum;
        }
        System.out.println("---------------------");
        System.out.println("三个班总平均分："+totalScore/(bjs*bjrs));
        System.out.println("及格人数："+pass);

        //打印九九乘法表
    }
}
