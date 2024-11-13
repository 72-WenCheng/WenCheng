package com.gaoji.duiaixang;
/**
 * 抽象类最佳实践-模板设计模式
 * 需求
 * 有多个类，完成不同任务job
 * 要求能够得到各自完成任务的时间
 * 请编程实现
 */
public class BB extends Template{
    public static void main(String[] args) {
        BB bb = new BB();
        bb.calculate();
    }

//    public void calculate(){
//        long start = System.currentTimeMillis();//得到开始时间
//        long num = 0;
//        job();
//        long end = System.currentTimeMillis();
//        System.out.println("AA所用时间："+(end-start));
//    }


    //计算任务
//    public void job(){
//        long start = System.currentTimeMillis();//得到开始时间
//        long num = 0;
//        for (long i = 0; i < 100000000; i++) {
//            num *= i;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("BB所用时间："+(end-start));
//    }

    public void job() {
        long num = 0;
        for (long i = 0; i < 100000000; i++) {
            num += i;
        }
    }
}
