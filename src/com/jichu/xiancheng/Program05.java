package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * Thread Vs Runnable
 * 使用多线程模拟三个售票窗口
 * 两种方式都会造成抢资源票数超卖，互斥同步
 * 引出线程退出Synchronized
 */
public class Program05 {
    public static void main(String[] args) {
        //会造成抢资源票数超卖，互斥同步
//        SellTicket01 sellTicket01 = new SellTicket01();
//        sellTicket01.start();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        sellTicket02.start();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket03.start();

        //还是出现超卖
//        SellTicket02 sellTicket0201 = new SellTicket02();
//        new Thread(sellTicket0201).start();
//        new Thread(sellTicket0201).start();
//        new Thread(sellTicket0201).start();

        //同步
        SellTicket03 sellTicket0301 = new SellTicket03();
        new Thread(sellTicket0301).start();
        new Thread(sellTicket0301).start();
        new Thread(sellTicket0301).start();

    }
}

//使用Thread方式
class SellTicket01 extends Thread{
    private static int num = 100;//多个窗口（线程）共享
    @Override
    public void run() {
        while (true){
            if (num <= 0){
                System.out.println("卖完了");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口"+Thread.currentThread().getName()+"卖出一张票..."
                    +"\n"+"剩余票数"+ (--num));
        }
        System.out.println("售票结束");
    }
}

//Runnable实现方式
class SellTicket02 implements Runnable{
    private int num = 100;
    @Override
    public void run() {
        while (true){
            if (num <= 0){
                System.out.println("卖完了");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口"+Thread.currentThread().getName()+"卖出一张票..."
                    +"\n"+"剩余票数"+ (--num));
        }
        System.out.println("售票结束");
    }
}

//使用synchronized线程同步
class SellTicket03 implements Runnable{
    private int num = 100;
    private boolean loop = true;
    //也可以是其他对象
    Object obj = new Object();

    //同步方法，锁在this对象
    //或者使用同步代码块
    public /*synchronized*/ void f(){
        synchronized (/*this*/obj/*new Object()*/){//new 不同对象还是会超卖
            if (num <= 0){
                System.out.println("卖完了");
                loop = false;
                return;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口"+Thread.currentThread().getName()+"卖出一张票..."
                    +"\n"+"剩余票数"+ (--num));
        }
//        if (num <= 0){
//            System.out.println("卖完了");
//            loop = false;
//            return;
//        }
//
//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("窗口"+Thread.currentThread().getName()+"卖出一张票..."
//                +"\n"+"剩余票数"+ (--num));
    }

    //如果是静态的同步方法
    //锁是加在类
//    public synchronized static void m(){
//
//    }
//
//    public  static void m1(){
//        synchronized (SellTicket03.class){
//            System.out.println("同步代码块");
//        }
//    }

    @Override
    public void run() {
        while (loop){
            f();
        }
    }
}

