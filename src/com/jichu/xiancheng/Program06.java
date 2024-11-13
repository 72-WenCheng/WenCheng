package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 线程终止：
 * 当任务完成自动退出
 * 可以通过使用变量来控制run方法退出的方式来停止线程，即通知方式
 */
public class Program06 {
    public static void main(String[] args) throws InterruptedException {
        //要求在main线程中终止t线程
        T t = new T();
        t.start();
        //如果希望主线程控制t线程结束，就必须可以修改loop变量
        //让主线程休眠10s在通知t线程退出
        Thread.sleep(10*1000);
        t.setLoop(false);
    }
}

class T extends Thread{
    int count = 0;
    //设置控制变量
    private boolean loop = true;
    @Override
    public void run() {
        super.run();
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T运行中..."+(++count));
        }
    }

    public void setLoop(boolean loop){
        this.loop = loop;
    }
}
