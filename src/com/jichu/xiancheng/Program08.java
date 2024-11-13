package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * yield线程的礼让，让出cpu。让其它线程执行，时间不确定，所以不一定成功（cpu也可以交替运行它们）
 * join线程的插队，插队的线程一旦插队成功，则肯定先执行完插入线程所有的任务
 */
public class Program08 {
    public static void main(String[] args) throws InterruptedException {
        Y y = new Y();
        y.start();

        for (int j = 1; j <=20 ; j++) {
            Thread.sleep(1000);
            System.out.println("主线程吃包子："+j);
            if (j == 5){
                System.out.println("主线程吃了5个后，让子线程先吃完...");
                y.join();
//                Thread.yield();//如果资源不紧张，是不会礼让
                System.out.println("主线程可以吃了...");
            }
        }
    }
}

class Y extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 1; i <=20 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程在吃包子："+i);
        }
    }
}