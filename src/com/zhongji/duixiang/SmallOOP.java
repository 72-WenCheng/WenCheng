package com.zhongji.duixiang;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 使用OOP完成java开发零钱通项目
 * 该类编写功能
 * 各个功能封装方法
 */
public class SmallOOP {
        //菜单
        private boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        private String key;
        //明细：1.数组 2.对象 3.字符串拼接
        private String datails = "/明细";
        //收益
        private double money = 0;
        private double balance = 0;
        private Date date = null;
        private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//日期格式化
        //消费
        private String note;

    public void mainMenu(){
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
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                default:
                    System.out.println("欢迎下次光临");
            }
        }while (loop);
    }

    public void detail(){
        System.out.println("/明细");
        System.out.println(datails);
    }

    public void income(){
        System.out.println("/收益");
        money = scanner.nextDouble();
        if (money>0){
            balance += money;
            //打印账单
            date = new Date();
            datails += "\n入账\t"+money+"\t"+sdf.format(date)+"\t"+"余额："+balance;
        }else {
            System.out.println("收益金额要大于0");
        }
    }

    public void pay(){
        System.out.println("/消费");
        money = scanner.nextDouble();
        if (balance>=money){
            System.out.println("/消费说明");
            note = scanner.next();
            balance -= money;
            date = new Date();
            datails += "\n"+note+"\t"+money+"\t"+sdf.format(date)+"\t"+"余额："+balance;
        }else {
            System.out.println("余额不足");
        }
    }

    public void exit(){
        String choice;
        boolean ad = true;
        System.out.println("你确定要退出吗y/n");
        while (ad){
            choice = scanner.next();
            if ("y".equals(choice)){
                loop = false;
                ad = false;
            }else if ("n".equals(choice)){
                this.mainMenu();
            }else {
                System.out.println("请你输入y/n");
            }
        }
    }
}
