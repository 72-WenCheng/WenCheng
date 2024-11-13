package com.example;

public class xiangmu01 {
    public static void main(String[] args) {
        //打印空心金字塔
        //1.先打印一个矩形
//        for (int i = 0; i<=5; i++){
//            System.out.println("*****");
//        }

        //2.打印半个金字塔
//        for (int i = 0; i<=5; i++){
//            for (int j = 0; j<=j; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //3.打印一个金字塔
//        for (int i = 1; i <= 5; i++){
//            //在输出*之前，还要输出对应空格=总层数-当前层
//            for (int k = 1; k <= 5 - i; k++){
//                System.out.print(" ");
//            }
//            //控制打印每层*的个数
//            for (int j = 1; j <= 2 * i - 1; j++){
//                System.out.print("*");
//            }
//            //每打印完一层，就换行
//            System.out.println(" ");
//        }

        //4.实现最终结果
//        for (int i = 1; i <= 5; i++){
//            //在输出*之前，还要输出对应空格=总层数-当前层
//            for (int k = 1; k <= 5 - i; k++){
//                System.out.print(" ");
//            }
//            //控制打印每层*的个数
//            for (int j = 1; j <= 2 * i - 1; j++){
//                //当前行的第一个位置是*，最后一个位置也是*，最后一层全部打印
//                if (j == 1 || j == 2 * i - 1 || i == 5){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            //每打印完一层，就换行
//            System.out.println("");
//        }

        //打印空心菱形
        for (int i = 1; i <= 5; i++){
            //在输出*之前，还要输出对应空格=总层数-当前层
            for (int k = 1; k <= 5 - i; k++){
                System.out.print(" ");
            }
            //控制打印每层*的个数
            for (int j = 1; j <= 2 * i - 1; j++){
                //当前行的第一个位置是*，最后一个位置也是*，最后一层全部打印
                if (j == 1 || j == 2 * i - 1){
                    System.out.print("*");
                }else if(i == 5){
                    System.out.print(" ");
                }else
                    System.out.print(" ");
            }
            //每打印完一层，就换行
            System.out.println("");
        }

        for (int i = 4; i >= 1; i--){
            //在输出*之前，还要输出对应空格=总层数-当前层
            for (int k = 1; k <= 5 - i; k++){
                System.out.print(" ");
            }
            //控制打印每层*的个数
            for (int j = 1; j <= 2 * i - 1; j++){
                //当前行的第一个位置是*，最后一个位置也是*，最后一层全部打印
                if (j == 1 || j == 2 * i - 1 || i == 5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            //每打印完一层，就换行
            System.out.println("");
        }
    }
}
