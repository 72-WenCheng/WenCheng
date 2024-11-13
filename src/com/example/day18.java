package com.example;

/**
 * 数组赋值机制
 */
public class day18 {
    public static void main(String[] args) {
//        //基本数据类型赋值，方式为值拷贝
//        int n1 = 10;
//        int n2 = n1;
//        n2 = 20;
//        System.out.println("ni="+n1);
//        System.out.println("ni="+n2);
//        //数组默认情况下是引用传递，赋值的是地址
//        int[] arr1 = {1,2,3};
//        int[] arr2 = arr1;
//        arr2[0] = 10;
//        for (int i = 0; i < arr1.length;i++){
//            System.out.println(arr1[i]);
//        }

        //数组拷贝
        //要求数据空间是独立的
        int[] arr1 = {1,2,13,4};
        //创建一个新的数组，开辟新的数据空间
        int[] arr2 = new int[arr1.length];
        //遍历arr1，把每个元素拷贝到arr2对应的元素
        for (int i = 0; i < arr1.length; i++){
            arr2[i]  =arr1[i];
        }
        //如果改变arr2某个元素的值，不会影响到arr1
        arr2[0] = 10;
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
