package com.jichu.changyongClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 彭文成
 * @version 1.0
 * Arrays
 * 包含一系列静态方法，用于管理或操作数组（比如排序和搜索）
 * toString返回数组的字符串形式，传统for循环遍历
 * sort排序（自然排序和定制排序），传统冒泡排序
 * sort是重载的，也可以通过传入一个接口Comparator实现定制排序，实现接口的匿名内部类，基于接口编程
 * binarySearch通过二分搜索法进行查找，要求必须排序好
 * copyOf数组元素复制
 * fill数组元素的填充
 * equals比较两个数组元素内容是否完全一致
 * asList将一组值转换成list
 */
public class ArraysClass {
    public static void main(String[] args) {
        Integer[] integers01 = {1,20,90};
        System.out.println(Arrays.toString(integers01));

        Integer[] integers02 = {1,20,-1,6,3};
//        Arrays.sort(integers02);
//        System.out.println(Arrays.toString(integers02));
        Arrays.sort(integers02, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(integers02));

        //自行实现定制排序
        int[] arr = {1,-1,8,0,30};
//        arra(arr);
//        System.out.println(Arrays.toString(arr));
        arrp(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));

        //
        Integer[] ary = {1,2,3};
        int index = Arrays.binarySearch(ary,2);
        System.out.println(index);

        //
        Integer[] newArr = Arrays.copyOf(ary,ary.length);
        System.out.println(Arrays.toString(newArr));

        //
        Integer[] num = new Integer[]{9,3,2};
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));

        //
        int[] ar01 = {1,3};
        int[] ar02 = {1,3};
        boolean equals = Arrays.equals(ar01,ar02);
        System.out.println(equals);

        //
        List<Integer> asList = Arrays.asList(2,3,4,5);
        System.out.println("asList="+asList);
    }

    //冒泡排序
//    public static void arra(int[] arr){
//        int temp = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                if(arr[j] > arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }

    //自定义
    public static void arrp(int[] arr, Comparator c){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(c.compare(arr[j], arr[j+1]) > 0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
