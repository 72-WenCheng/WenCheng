package com.mian.duixiang;

import java.util.Scanner;

/**
 * 编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
 */
public class zuoye06 {
    public static void main(String[] args) {
        A03 a03 = new A03();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请你定义arr数组的长度：");
        int ch = scanner.nextInt();
        int[] arr = new int[ch];
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
        int[] arre = new int[arr.length];
        System.out.println("=========");
        if (arr != a03.copyArr(arr,arre)){
            System.out.println("克隆成功！");
            System.out.println("---克隆后的数组arre---");
        }else {
            System.out.println("克隆失败！");
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
}
class A03{
    public int[] copyArr(int[] arr,int[] arre){
        for (int i = 0; i < arr.length; i++){
            arre[i] = arr[i];
        }
        return arre;
    }
}
