package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 释放锁
 * 当前线程的同步方法、同步代码块执行结束
 * 当前线程在同步代码块、同步方法中遇到break、return
 * 当前线程在同步代码块、同步方法中出现了未处理的Error或Exception，导致异常结束
 * 当前线程在同步代码块、同步方法中执行了线程对象的wait()方法
 * 下面的情况不会释放：
 * 线程执行同步代码块或同步方法时，程序调用Thread.sleep()、Thread.yield()方法暂停当前线程的执行，不会释放锁
 * 还有一种，其他线程调用了该线程的suspend()方法将线程挂起
 * 建议避免使用suspend()、resume()来控制线程
 */
public class Program14 {
}
