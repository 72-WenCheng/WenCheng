package com.example;

/**
 * 数组翻转
 */
public class day19 {
    public static void main(String[] args) {
        //把arr{1,2,3,4,5} -> {5,4,3,2,1}
        //方式1
//        int[] arr = {1,2,3,4,5};
//        for (int i = 0;i < arr.length/2; i++){
//            int temp = arr[arr.length-1-i];
//            arr[arr.length-1-i] = arr[i];
//            arr[i] = temp;
//        }
//        for (int i = 0;i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        //方式2
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        //先定义一个新的数组
        //逆序遍历arr1，在拷贝值到arr2
        for (int i = arr1.length-1, j = 0; i >= 0; i--,j++){
            arr2[j] = arr1[i];
        }
        //让arr1指向arr2的数据空间，原先arr1的空间被销毁
        arr1 = arr2;
        for (int i = 0;i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
