package com.mian.duixiang;

/**
 * 可变参数
 * java允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法
 * 可变参数个数可以为0个或多个
 * 可变参数的实参可以为数组
 * 可变参数的本质就是数组
 * 可变参数可以和其他类型参数放在一起，但是要置后
 * 一个形参列表中只能出现一个可变参数
 */
public class day04 {
    public static void main(String[] args) {
        day04 hr = new day04();
        int sum = hr.sum(1,2,3,4);
        System.out.println(sum);
    }
    //可以计算多个数的和
    public int sum(int... num){
        System.out.println("接收参数的个数"+num.length);
        int res = 0;
        for (int i = 0; i < num.length; i++){
            res += num[i];
        }
        return res;
    }
}
