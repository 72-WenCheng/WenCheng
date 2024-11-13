package com.mian.duixiang;

import java.util.Scanner;

/**
 * 编写类A01，定义方法max，实现求出某个double数组的最大值
 */
public class zuoye03 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请你定义arr数组的长度：");
        int ch = scanner.nextInt();
        double[] arr = new double[ch];
        for (int i = 0; i < arr.length; i++){
            System.out.println("请你定义arr数组的元素值：");
            int yuan = scanner.nextInt();
            arr[i] = yuan;
        }
        System.out.println("---定义后的数组arr---");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
        System.out.println("数组arr最大值为"+a01.max(arr));
    }
}
class A01{
    public double max(double[] arr){
        //冒泡排序
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                //定义一个存放最大值的临时变量
                double temp;
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-1];
    }
}
