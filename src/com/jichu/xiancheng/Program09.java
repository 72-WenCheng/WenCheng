package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 用户线程：也叫工作线程，当线程的任务执行完成或通知方式结束
 * setDaemon(true);
 * 守护线程：一般是为工作线程服务的，当所有的用户线程结束，守护线程自动结束
 * 常见守护线程：垃圾回收机制
 */
public class Program09 {
    public static void main(String[] args) throws InterruptedException {
        //怎么把一个线程设置守护线程
        MyDead myDead = new MyDead();
        //希望主线程结束后，子线程自动结束
        //将子线程设置为守护线程
        myDead.setDaemon(true);
        myDead.start();

        for (int i = 1; i <=10 ; i++) {
            System.out.println("打篮球");
            Thread.sleep(1000);
        }
    }
}

class MyDead extends Thread{
    @Override
    public void run() {
        super.run();
        for (;;){//无限循环
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("打乒乓球");
        }
    }
}
