package com.example;

/**
 * 二维数组
 * 动态初始化
 * 类型[][] 数组名 = new 类型[几个一维数组][数组长度]
 */
public class day23 {
    public static void main(String[] args) {
        //二维数组的每个元素是一维数组
        //所有要再次遍历
//        int[][] arr = {{0,0,1,2,3,6},{0,0,0,0,0,0}};
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

        //一维数组的长度不确定的情况
//        int[][] arr = new int[3][];
//        for (int i = 0; i < arr.length; i++) {
//            //给每一个一维数组开辟空间
//            arr[i] = new int[i +1];
//            for (int j = 0; j < arr[i].length; j++){
//                arr[i][j] = i+1;
//                System.out.print(arr[i][j]);
//            }
//            System.out.println("");
//        }

        //杨辉三角
        //规律：arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            //给每一个一维数组开辟空间
            arr[i] = new int[i +1];
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
