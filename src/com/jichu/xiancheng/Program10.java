package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 线程的生命周期
 * 官方文档有6种（Runnable细化为：Ready就绪、running运行，又具有7种）
 * NEW\RUNNABLE\TIMED_WAITING\WAITING\BLOCKED\TERMINATED
 * 详细看图
 */
public class Program10 {
    public static void main(String[] args) throws InterruptedException {
        K k = new K();
        //new状态
        System.out.println(k.getName()+"状态："+k.getState());
        //start后进入Runnable状态
        k.start();

        //没有终止，持续输入当前状态
        while (Thread.State.TERMINATED != k.getState()){
            System.out.println(k.getName()+"状态："+k.getState());
            Thread.sleep(2000);//进入超时等待状态
            if (K.i == 11){
                break;
            }
        }

        //终止后再次打印状态
        if (K.i == 11){
            System.out.println(k.getName()+"状态："+k.getState());
        }
    }
}

class K extends Thread{
    public static int i = 1;
    @Override
    public void run() {
        super.run();
        while (true){
            for (; i <= 10; i++) {
                System.out.println("hi..."+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (i==11){
                break;
            }
        }
    }
}