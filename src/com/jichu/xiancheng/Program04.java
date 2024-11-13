package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 多个子线程
 */
public class Program04 {
    public static void main(String[] args) {
        EDG edg = new EDG();
        RNG rng = new RNG();
        Thread thread01 = new Thread(edg);
        Thread thread02 = new Thread(rng);
        thread01.start();
        thread02.start();
    }
}

class EDG implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("java..." + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10){
                break;
            }
        }
    }
}

class RNG implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("c++..." + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10){
                break;
            }
        }
    }
}
