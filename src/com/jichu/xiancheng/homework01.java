package com.jichu.xiancheng;

import java.util.Scanner;

/**
 * @author 彭文成
 * @version 1.0
 * 在main中启动两个线程
 * 在第一个线程循环随机打印100以内的整数
 * 直到第二个线程从键盘读取Q命令
 */
public class homework01 {
    public static void main(String[] args) {
        At at = new At();
        Bt bt = new Bt(at);
        at.start();
        bt.start();
    }
}

class At extends Thread{
    private boolean loop = true;

    @Override
    public void run() {
        super.run();
        while (loop){
            System.out.println((int)(Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class Bt extends Thread{
    private At at;
    private Scanner scanner = new Scanner(System.in);

    public Bt(At at) {
        this.at = at;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println("请输入你的指令：(Q表示退出...)");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q'){
                at.setLoop(false);
                System.out.println("Bt线程退出...");
                break;
            }
        }
    }
}
