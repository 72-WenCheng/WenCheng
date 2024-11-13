package com.zhongji.duixiang;

import java.util.Arrays;

/**
 * idea debug如何进入源码
 * 使用force step into，alt+shift+F7
 */
public class Duandian03 {
    public static void main(String[] args) {
        int[] arr = {1,-1,3,4,100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
