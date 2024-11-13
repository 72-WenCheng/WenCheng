package com.example;

import static com.sun.xml.internal.fastinfoset.tools.PrintTable.printArray;

/**
 * 数组扩容
 */
public class day20 {
    public static void main(String[] args) {
//        //实现动态的给数组添加元素效果，实现对数组的扩容
//        //原始数组使用静态分配int[] arr = {1,2,3}
//        //增加元素4，放在数组索引最后的元素
//        int[] arr = {1,2,3};
//        //定义一个新的数组int[] arrNew = new int[arr.lenght+1]
//        int[] arrNew = new int[arr.length+1];
//        //遍历arr，依次将arr的元素拷贝到arrNew数组
//        for (int i = 0; i < arr.length; i++){
//            arrNew[i] = arr[i];
//        }
//        //把4赋值给arrNew最后一个元素
//        arrNew[arrNew.length-1] = 4;
//        //让arr指向arrNew
//        arr = arrNew;
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        //实现用户动态添加
//        Scanner scanner = new Scanner(System.in);
//        char na;
//        do {
//            int[] arr = {1,2,3};
//            int[] arrNew = new int[arr.length+1];
//            for (int i = 0; i < arr.length; i++){
//                arrNew[i] = arr[i];
//            }
//            System.out.println("请输入你要增加的元素值");
//            int num = scanner.nextInt();
//            arrNew[arrNew.length-1] = num;
//            arr = arrNew;
//            System.out.println("---添加后的数组---");
//            for (int i = 0; i < arr.length; i++){
//                System.out.println(arr[i]);
//            }
//            System.out.println("你是否还要继续添加？y/n");
//            na = scanner.next().charAt(0);
//        }while (na == 'y');
//        System.out.println("退出程序");

        //实现用户动态缩减
        //        //实现动态的给数组添加元素效果，实现对数组的扩容
//        //原始数组使用静态分配int[] arr = {1,2,3}
//        //增加元素4，放在数组索引最后的元素
//        int[] arr = {1,2,3};
//        //定义一个新的数组int[] arrNew = new int[arr.lenght+1]
//        int[] arrNew = new int[arr.length+1];
//        //遍历arr，依次将arr的元素拷贝到arrNew数组
//        for (int i = 0; i < arr.length; i++){
//            arrNew[i] = arr[i];
//        }
//        //把4赋值给arrNew最后一个元素
//        arrNew[arrNew.length-1] = 4;
//        //让arr指向arrNew
//        arr = arrNew;
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        //实现用户动态添加
//        Scanner scanner = new Scanner(System.in);
//        char na;
//        do {
//            int[] arr = {1,2,3};
//            int[] arrNew = new int[arr.length+1];
//            for (int i = 0; i < arr.length; i++){
//                arrNew[i] = arr[i];
//            }
//            System.out.println("请输入你要增加的元素值");
//            int num = scanner.nextInt();
//            arrNew[arrNew.length-1] = num;
//            arr = arrNew;
//            System.out.println("---添加后的数组---");
//            for (int i = 0; i < arr.length; i++){
//                System.out.println(arr[i]);
//            }
//            System.out.println("你是否还要继续添加？y/n");
//            na = scanner.next().charAt(0);
//        }while (na == 'y');
//        System.out.println("退出程序");

        //实现用户动态缩减
//        Scanner scanner = new Scanner(System.in);
//        char na;
//        int[] arr = {1,2,3,4,5};
//        System.out.println("---初始数组---");
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        do {
//            System.out.println("请输入你要删减的元素");
//            int num = scanner.nextInt();
//            int cont = 0;
//            int[] arr1 = new int[arr.length-1];
//            for (int i = 0; i < arr.length; i++){
//                if (arr[i] != num && i == 0){
//                    arr1[0] = arr[0];
//                 } else if(arr[i] != num){
//                    arr1[i] = arr[i];
//                }
//            }
//
//            System.out.println("---删减后的数组---");
//            for (int i = 0; i < arr1.length; i++){
//                System.out.println(arr1[i]);
//            }
//            System.out.println("你是否还要继续删减？y/n");
//            na = scanner.next().charAt(0);
//            if (na == 'y'){
//                arr = arr1;
//            }
//        }while (na == 'y');
//        System.out.println("退出程序");
    }
}
