package com.example;

/**
 * 记住累加和累计的设计概念
 * sum+=num
 * connt++
 */

public class zuoye02 {
    public static void main(String[] args) {
        //第一题
        //某人有100000元，没经过一次路口，需要缴费
        //当现金>50000时，每次交5%
        //当现金<=50000时，每次交1000
        //计算垓人可以经过多少次路口
        //要求使用while循环，break语句
//        System.out.println("欢迎来到过路缴费查询系统：");
//        System.out.println("------------");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你的账户金额：");
//        double xianjin = scanner.nextDouble();
//        int i = 0;
//        double num = 0;
//        while (i>=0){
//            i++;
//            if (xianjin > 50000){
//                num = xianjin*0.05;
//                xianjin -= num;
//            }else if (xianjin <= 50000 && xianjin > 0){
//                num = xianjin-1000;
//                xianjin = num;
//            }else {
//                break;
//            }
//        }
//        System.out.println("根据计算你可以经过"+(i-1)+"次高速路段");

        //第二题
        //实现判断一个整数，属于那个范围：大于0；小于0；等于0；
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("欢迎进入数类型判断系统");
//        System.out.println("------------");
//        int i = 0;
//        try {
//            while (i == 0) {
//                System.out.println("请输入一个数：");
//                int num = scanner.nextInt();
//                if (num > 0) {
//                    System.out.println("大于0");
//                } else if (num < 0) {
//                    System.out.println("小于0");
//                } else if (num == 0) {
//                    System.out.println("等于0");
//                } else {}
//            }
//        }catch (Exception a){
//            System.out.println("输入有误，退出系统！");
//        }

        //第三题
        //判断一个年份是否为闰年（能被四整除，不能被100整除）
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("欢迎进入闰年判断系统");
//        System.out.println("------------");
//        int i = 0;
//        try {
//          while (i == 0){
//              System.out.println("请输入年份：");
//              int year = scanner.nextInt();
//              if (year % 4 == 1 && year % 100 ==1){
//                  System.out.println(year+"是闰年");
//              }else {
//                  System.out.println(year+"不是闰年");
//              }
//          }
//        }catch (Exception A){
//          System.out.println("输入有误，退出系统！");
//        }

        //第四题
        //判断一个整数是否是水仙花数（指一个三位数，其各个位上数字立方和等于其本身
        // 例如：153 = 1*1*1+3*3*3+5*5*5）
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("欢迎进入水仙花数判断系统");
//         System.out.println("------------");
//         try {
//             int a = 0;
//             while (a ==0){
//                 System.out.println("请输入一个三位数：");
//                 int num = scanner.nextInt();
//                 if (num >= 100 && num < 1000){
//                     int i1 = num%10;
//                     int i2 = num/10%10;
//                     int i3 = num/100%10;
//                     //注意运算符^不能用于boolean
//                     if (num == i1*i1*i1+i2*i2*i2+i3*i3*i3){
//                         System.out.println(num+"是水仙花数");
//                     }else {
//                         System.out.println(num+"不是水仙花数");
//                     }
//                 }else {
//                     System.out.println("请输入正确格式的位数！");
//                 }
//             }
//         }catch (Exception a){
//             System.out.println("输入有误，退出系统！");
//         }

        //第五题
        //输出1-100之间的不能被5整除的数，每5个一行
//        int coont = 0;
//        for (int i = 1; i<=100; i++){
//            if (i % 5 != 0){
//                System.out.print(i);
//                coont++;
//                if (coont % 5 == 0){
//                    System.out.println("");
//                }
//            }
//        }

        //第六题
        //输出小写的a-z以及大写的Z-A（参考ASCII码表）
        //97-122
//        for (int i = 97; i <= 122; i++){
//            char ch = (char)i;
//            System.out.println(ch);
//        }
//        //65-90
//        for (int i = 65; i <= 90; i++){
//            char ch = (char)i;
//            System.out.println(ch);
//        }

        //第七题
        //求出1-1/2+1/3-1/4.....1/100的和
        //思路：总结出公式=1/n
//        double sum = 0;
//        for (int i = 1; i<=100; i++){
//            if (i % 2 == 0){
//                sum -= 1/i;
//            }else{
//                sum += 1/i;
//            }
//        }
//        System.out.println("1-1/2+1/3-1/4.....1/100的和等于"+sum);

        //第八题
        //求1+(1+2)+(1+2+3)+...(1+...+100)的结果
//        int sum = 0;
//        for (int i = 0; i <= 100; i++){
//            for (int a = 0; a<=i; a++){
//                sum+=a;
//            }
//        }
//        System.out.println("1+(1+2)+(1+2+3)+...(1+...+100)的结果等于"+sum);
    }
}
