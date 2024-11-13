package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 互斥锁
 * 每个对象都对应一个可称为”互斥锁“的标记
 * 这个标记用来保证任一时刻，只能有一个线程访问该对象
 * 使用关键字synchronized与对象的互斥锁联系
 * 同步的局限性：导致程序的执行效率降低
 * 同步方法（非静态的）的锁可以是this，也可以是其他对象（要求同一个对象）
 * 同步方法（静态的）的锁为当前类本身
 * 注意事项和细节
 * 需要分析上锁的代码
 * 选择同步代码块或同步方法
 * 要求多个线程的锁对象为同一个即可
 */
public class Program12 {
}