package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 线程
 * 程序：完成特定任务，用某种语言编写的一组指令的集合
 * 进程：运行中的程序，例如QQ启动了一个进程，操作系统就会为该进程分配内存空间
 * 指程序的一次执行过程或者是正在运行的程序，具有产生、存在、消亡的过程
 * 线程：由进程创建的，是进程的一个实体
 * 一个进程可以拥有多个线程，例如迅雷下载多个软件
 * 单线程：同一个时刻，只允许执行一个线程
 * 多线程：同一个时刻，可以执行多个线程，比如qq打开多个聊天窗口
 * 并发：同一个时刻，多个任务交替执行，单核cpu实现多任务
 * 并行：同一时刻，多个任务同时执行，多核cpu
 */
public class Program01 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpu = runtime.availableProcessors();
        System.out.println("当前电脑cpu="+cpu+"核");
    }
}
