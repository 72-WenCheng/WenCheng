package com.mian.duixiang;

import java.util.Scanner;

/**
 * 编写类A02，定义方法find，实现查找某个字符串数组的元素查找，并返回索引
 */
public class zuoye04 {
    public static void main(String[] args) {
        A02 a02 = new A02();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请你定义arr数组的长度：");
        int ch = scanner.nextInt();
        String[] arr = new String[ch];
        for (int i = 0; i < arr.length; i++){
            System.out.println("请你定义arr数组的元素值：");
            String yuan = scanner.next();
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
        a02.find(arr);
    }
}
class A02{
    public String find(String[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的值：");
        String name = scanner.next();
        //定义一个信标
        int a = -1;
        int b = 0;
        for (int i = 0; i < arr.length; i++){
            if (name.equals(arr[i])){
                a = 1;
                b = i;
                break;
            }
        }
        if (a == -1){
            System.out.println("arr数组没有你要查找的值");
        }else {
            System.out.println("恭喜你找到了：元素"+name+"对应的索引为："+b);
        }
        return "";
    }
}