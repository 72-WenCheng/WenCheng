package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * 控制结构
 * 顺序控制：
 * 程序从上到下逐步执行，中间没有任何判断和跳转
 * 分支控制：
 * 单分支、双分支、多分支
 * 注意String是用equals来判断值相等，char是用==
 * if-else switch
 * 循环控制：
 * for while、do-while
 * 多重循环控制：尽量套三个循环就行了，不然可读性很差，实际上嵌套循环就是把内层循环当成外层循环的循环体，
 * 当只有内层循环的循环条件为false，才会完全跳出内存循环，才可结束外层循环的当次循环，
 * 开始下一次的循环
 * 假设外层循环次数为m次，内层为n次，则内层循环体实际上需要执行m*n次
 * break
 * continue
 * return
 */
public class day13 {

    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        System.out.println("请输入你的身高：");
        int age = scanner.nextInt();
        double ming = scanner.nextDouble();
        if (age >= 18) {
            if (ming >= 179.5) {
                System.out.println("恭喜你，获取本公司的offer！");
            } else {
                System.out.println("不好意思你的身高未达到公司标准，请另辟蹊径！");
            }
        } else if (ming >= 179.5) {
            System.out.println("不好意思你的年龄未达到公司标准，请另辟蹊径！");
        } else {
            System.out.println("不好意思你未达到公司标准，请另辟蹊径！");
        }

        //练习题1
        double d1 = 34.5;
        double d2 = 2.6;
        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println("两个数的和" + (d1 + d2));
        }

        //练习题2
        System.out.println("请输入第一个数：");
        System.out.println("请输入第二个数：");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int num = a1 + a2;
        if (a1 % 3 == 0 && a2 % 5 == 0) {
            System.out.println("可以被3和5整除");
        } else {
            System.out.println("不可以被3和5整除");
        }

        //练习题3
        System.out.println("请输入一个年份：");
        int agenian = scanner.nextInt();
        if ((agenian % 4 == 0 && agenian % 100 != 0) || agenian % 400 == 0) {
            System.out.println("该年份是闰年");
        } else {
            System.out.println("该年份不是闰年");
        }

        //练习题4
        System.out.println("请输入彭文成的芝麻信用分（1-100）：");
        int zmxyf = scanner.nextInt();
        try {
            FileReader fr = new FileReader("");
            if (zmxyf >= 1 && zmxyf <= 100) {
                if (zmxyf == 100) {
                    System.out.println("信用极好");
                } else if (zmxyf > 80 && zmxyf <= 99) {
                    System.out.println("优秀");
                } else if (zmxyf >= 60 && zmxyf <= 80) {
                    System.out.println("一般");
                } else {
                    System.out.println("不及格");
                }
            }else {
                System.out.println("输入值有误");
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        //嵌套分支练习题1
        System.out.println("请输入你的成绩：");
        double score = scanner.nextDouble();
        if (score > 80){
            System.out.println("恭喜你成功晋级！");
            System.out.println("请输入你的性别：");
            char gender = scanner.next().charAt(0);
            if (gender == '男'){
                System.out.println("你被分配到男子组！");
            } else if (gender == '女') {
                System.out.println("你被分配到女子组！");
            }else {
                System.out.println("你输入的性别有误");
            }
        }else {
            System.out.println("抱歉你被淘汰了！");
        }

        //嵌套分支练习题1
        System.out.println("欢迎你进入景区买票系统！");
        System.out.println("请输入月份：");
        int jj = scanner.nextInt();
        if (jj >= 1 && jj <= 12) {
            if (jj == 4 || jj == 10) {
                System.out.println("该季节是旺季");
                System.out.println("请问你多少岁：");
                int nl = scanner.nextInt();
                if (nl > 0) {
                    if (nl >= 18 && nl < 60) {
                        System.out.println("成人票价是60块钱");
                    } else if (nl < 18) {
                        System.out.println("儿童票价是半价");
                    } else if (nl >= 60) {
                        System.out.println("老人票价打3折");
                    }
                } else {
                    System.out.println("年龄输入有误");
                }
            } else {
                System.out.println("该季节是淡季");
                System.out.println("请问你多少岁？");
                int nl = scanner.nextInt();
                if (nl > 0) {
                    if (nl >= 18 && nl < 60) {
                        System.out.println("成人票价是40块钱");
                    } else if (nl < 18 || (nl >= 18 && nl < 60)) {
                        System.out.println("儿童、老人票价是20块钱");
                    }
                } else {
                    System.out.println("年龄输入有误");
                }
            }
        } else {
            System.out.println("你输入的月份有误");
        }

        //switch是关键字，case常量，没有case匹配则执行default，break表示退出swtich
        //表达式数据类型应和case后的常量类型一致，或者可以自动转换的
        //表达式中的返回值必须是byte，short,int,char,enum,String
        //case字句中的值必须是常量，而不能是变量
        //如果没有break，程序会顺序执行到switch结尾
        System.out.println("请输入星期：");
        String c1 = scanner.next();
        switch (c1){
            case "星期一" :
                System.out.println("打1折");
                break;
            case "星期二":
                System.out.println("打2折");
                break;
            case "星期三" :
                System.out.println("打3折");
                break;
            case "星期四" :
                System.out.println("打4折");
                break;
            case "星期五" :
                System.out.println("打5折");
                break;
            case "星期六" :
                System.out.println("打6折");
                break;
            case "星期七" :
                System.out.println("打7折");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
        System.out.println("退出");

        //练习题1
        double score1 = 88.5;
        if (score1 >= 0 && score1 <= 100){
            switch ((int)(score1 / 60)){
                case 0 :
                    System.out.println("不合格");
                    break;
                case 1 :
                    System.out.println("合格");
                    break;
            }
        }else {
            System.out.println("输入成绩有误");
        }

        //练习题2
        System.out.println("请输入一个月份");
        int month = scanner.nextInt();
        switch (month){
            case 3 :
            case 4 :
            case 5 :
                System.out.println("春季");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("夏季季");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("秋季");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("冬季");
                break;
            default:
                System.out.println("你输入的月份不对");
        }
    }
}

