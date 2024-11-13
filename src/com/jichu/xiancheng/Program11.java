package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 解决前面票超卖问题
 * Synchronized
 * 在多线程编程，一些敏感数据不允许被多个线程同时访问
 * 保证数据任何时刻，最多只有一个线程访问，保证数据的完整性
 * 线程同步：
 * 当有一个线程在对内容进行操作时，其他线程都不可以对这个内存地址进行操作
 * 直到该线程完成操作
 * synchronized(对象){//得到对象的锁，才能操作同步代码//需要被同步的代码}
 * public synchronized void f(String name){需要被同步的代码}
 */
public class Program11 {
    public static void main(String[] args) {

    }
}
