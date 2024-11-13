package com.zhongji.duixiang;

/**
 * 断点调式
 * 在断点调试过程中，是运行状态，是以对象的运行类型执行的
 * 断点调试是指在程序的某一行设置一个断点，调式时，程序运行到这一行就会停止
 * 然后可以一步一步往下调式，观察各个变量的值，找出bug
 * 快捷键
 * F7跳入方法内、F8跳过，逐行执行代码、shift+F8跳出方法、F9（resume，执行到下一个断点）
 */
public class Duandian01 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += i;
            System.out.println("i="+i);
            System.out.println("res="+res);
        }
        System.out.println("退出");
    }
}
