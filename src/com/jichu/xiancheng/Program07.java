package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 线程常用方法
 * setName设置线程名称，使之与参数name相同
 * getName返回该线程的名称
 * start使线程开始执行，底层会创建新的线程，调用run（普通方法，不会启动新线程）
 * run调用线程对象run方法
 * setPriority更改线程的优先级
 * getPriority获取线程的优先级
 * sleep在指定的毫秒数内让当前正在执行的线程休眠
 * interrupt中断线程，用于中断正在休眠的线程
 */
public class Program07 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.setName("文成");
        a.setPriority(Thread.MIN_PRIORITY);
        System.out.println(a.getName());
        a.start();

        for (int j = 0; j < 5; j++) {
            Thread.sleep(1000);
            System.out.println("提前休眠时间");
        }
        a.interrupt();
    }
}

class A extends Thread{
    @Override
    public void run() {
        super.run();
        while (true) {
                System.out.println(Thread.currentThread().getName() + "吃包子....");
            try {
                System.out.println(Thread.currentThread().getName() + "休息一下再吃....");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //当线程执行interrupt()时，就会catch一个异常
                System.out.println(Thread.currentThread().getName() + "起来吃饭");
            }
        }
    }
}
