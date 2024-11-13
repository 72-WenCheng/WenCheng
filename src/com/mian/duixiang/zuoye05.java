package com.mian.duixiang;

import java.util.Scanner;

/**
 * 编写类Book，定义方法updatePrice，实现更改某本书的价格
 */
public class zuoye05 {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请你定义书籍数量：");
        int ch = scanner.nextInt();
        String[] arr1 = new String[ch];
        double[] arr2 = new double[ch];
        for (int i = 0; i < arr1.length; i++){
            System.out.println("请你定义书籍名称：");
            String name = scanner.next();
            arr1[i] = name;
        }

        for (int i = 0; i < arr2.length; i++){
            System.out.println("请你定义"+"《"+arr1[i]+"》"+"的书籍价格：");
            int yuan = scanner.nextInt();
            arr2[i] = yuan;
        }

        System.out.println("---定义后的书店---");
        for (int i = 0; i < arr1.length; i++){
            System.out.print("《"+arr1[i]+"》"+"$"+arr2[i]+"\t");
        }
        System.out.println();
        book.updatePrice(arr1,arr2);
        System.out.println("---更改后的书店---");
        for (int i = 0; i < arr1.length; i++){
            System.out.print("《"+arr1[i]+"》"+"$"+arr2[i]+"\t");
        }
    }
}

class Book{
    public double[] updatePrice(String[] arr1, double[] arr2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要更改的书籍");
        String name = scanner.next();
        System.out.println("请输入你要更改的价格");
        double price = scanner.nextDouble();
        int a = 0;
        for (int i = 0; i < arr1.length; i++){
            if (name.equals(arr1[i])){
                a = i;
                break;
            }
        }
        arr2[a] = price;
        return arr2;
    }
}
