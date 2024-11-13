package com.example;

import java.util.Scanner;

/**
 * 查找
 * 顺序查找
 * 二分查找
 */
public class day22 {
    public static void main(String[] args) {
        String[] myString = {"白","黑","红","蓝"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入颜色：");
        String findName =  scanner.next();
        //遍历数组，逐一比较，true则提示信息，并退出
        //定义一个指标
        int index = -1;
        for (int i = 0; i < myString.length; i++){
            if (findName.equals(myString[i])){
                System.out.println("恭喜你找到了"+myString[i]);
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("很遗憾你没有找到");
        }
    }
}
