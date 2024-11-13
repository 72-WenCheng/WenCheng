package com.zhongji.duixiang;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 使用java开发零钱通项目，完成收益入账，消费，查看明细，退出系统等等
 */
public class xiangmu01 {
    public static void main(String[] args) {
        //菜单
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key;
        //明细：1.数组 2.对象 3.字符串拼接
        String datails = "/明细";
        //收益
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//日期格式化
        //消费
        String note;
        do {
            System.out.println("------零钱通菜单------");
            System.out.println("\t"+"1.零钱通明细");
            System.out.println("\t"+"2.收益入账");
            System.out.println("\t"+"3.消费");
            System.out.println("\t"+"4.退出系统");
            System.out.println("请选择（1-4）");
            key = scanner.next();
            //使用swith分支控制
            switch (key){
                case "1":
                    System.out.println(datails);
                    break;
                case "2":
                    System.out.println("/收益");
                    money = scanner.nextDouble();
                    if (money>0){
                        balance += money;
                        //打印账单
                        date = new Date();
                        datails += "\n入账\t"+money+"\t"+sdf.format(date)+"\t"+"余额："+balance;
                        break;
                    }else {
                        System.out.println("收益金额要大于0");
                        break;
                    }
                case "3":
                    System.out.println("/消费");
                    money = scanner.nextDouble();
                    if (balance>=money){
                        System.out.println("/消费说明");
                        note = scanner.next();
                        balance -= money;
                        date = new Date();
                        datails += "\n"+note+"\t"+money+"\t"+sdf.format(date)+"\t"+"余额："+balance;
                        break;
                    }else {
                        System.out.println("余额不足");
                        break;
                    }
                case "4":
                    String choice;
                    while (true){
                        System.out.println("你确定要退出吗y/n");
                        choice = scanner.next();
                        if ("y".equals(choice)){
                            loop = false;
                            System.out.println("欢迎下次登录");
                            break;
                        }else if ("n".equals(choice)){
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("请输入1-4！");
            }
        }while (loop);
    }
}
