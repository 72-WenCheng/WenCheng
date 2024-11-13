package com.mian.duixiang;

import java.util.Scanner;

public class zuoye01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = scanner.nextInt();
        AA aa = new AA();
        aa.getAA(a);
    }
}
class AA{
    public void getAA(int a){
        if (a % 2 == 0){
            System.out.println("该数是偶数");
        }else {
            System.out.println("该数是奇数");
        }
    }
}
