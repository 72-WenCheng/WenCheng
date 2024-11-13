package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 死锁
 * 多个线程都占用了对方的锁资源。但不肯相让，导致死锁
 */
public class Program13 {
    public static void main(String[] args) {
        //模拟死锁
        DeadLock deadLock0a = new DeadLock(true);
        DeadLock deadLock0b = new DeadLock(false);
        deadLock0a.setName("0a");
        deadLock0b.setName("0b");
        deadLock0a.start();
        deadLock0b.start();
    }
}

class DeadLock extends Thread{
    //保证多线程，同一对象以及共享
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLock(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        super.run();
        //如果flag为T，线程先得到o1对象锁，然后尝试获取o2对象锁
        //拿不到o2，就会blocked阻塞
        if (flag) {
            synchronized (o1) {//对象互斥锁，形成同步代码
                System.out.println(Thread.currentThread().getName() + "进入一");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入二");
                }
            }
            //同理，假如0a线程拿到了o1的对象锁，0b线程拿到了o2的对象锁，0a线程想下一步拿o2的对象锁，但是0b线程已经持有了
            //0b线程同理，这样子就会造成死锁
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "进入二");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入一");
                }
            }
        }
    }
}
