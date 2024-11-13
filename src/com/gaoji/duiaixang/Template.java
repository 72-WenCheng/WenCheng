package com.gaoji.duiaixang;

/**
 * 抽象类最佳实践-模板设计模式
 */
abstract public class Template {

    public abstract void job();

    //AA和BB共有的
    public void calculate(){
        long start = System.currentTimeMillis();//得到开始时间
        long num = 0;
        job();
        long end = System.currentTimeMillis();//得到结束时间
        System.out.println(this+"所用时间："+(end-start));
    }
}
