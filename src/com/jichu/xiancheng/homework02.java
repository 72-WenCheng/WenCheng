package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 有两个用户分别从同一个卡上取钱
 * 每次都取1000，当余额不足提示
 * 不能出现超取现象
 */
public class homework02 {
    public static void main(String[] args) {
        Tt t = new Tt();
        Thread thread01 = new Thread(t);
        thread01.setName("t1");
        Thread thread02 = new Thread(t);
        thread02.setName("t2");
        thread01.start();
        thread02.start();
    }
}

class Tt implements Runnable{
    private int money = 100;

    @Override
    public void run() {
        while (true){
            synchronized (this){
                System.out.println("----------------");
                System.out.println("账户总额="+money);

                int num = (int)(Math.random() * 100);
                System.out.println(Thread.currentThread().getName() + "需要支出" + num + "元");

                if (num <= money){
                    money -= num;
                    System.out.println("当前余额：" + money);
                }

                if (num > money){
                    System.out.println("余额不足");
                    break;
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
