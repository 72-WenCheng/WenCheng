package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * java是单继承的，在某些情况下一个类已经继承某个父类
 * 所以java设计了实现Runnable接口来创建线程
 * Runnable没有start()，这样子写nb
 * 底层使用了静态代理模式
 * Tread thread = new Thread(dog);
 * thread.start();
 * 使用代码模拟实现Runnable接口开发线程的机制
 */
public class Program03 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //Runnable没有start()，这样子写nb
        //底层使用了静态代理模式
        Thread thread = new Thread(dog);
        thread.start();

        //
        Tiger tiger = new Tiger();
        Proxy proxy = new Proxy(tiger);
        proxy.start();
    }
}

class Dog implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("小狗叫..."+(++count)+"\n"+Thread.currentThread().getName());
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

//Proxy代理模式，模拟Thread类
class Proxy implements Runnable{
    private Runnable target = null;//类型是Runnable的属性
    @Override
    public void run() {
        if (target != null){
            target.run();
        }
    }

    //构造方法：当你创建对象时，可以把实现Runnable接口的对象传进去
    public Proxy(Runnable target) {
        this.target = target;
    }

    public void start(){
        start0();
    }

    public void start0(){
        run();
    }
}

class Animal{}
class Tiger extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫...");
    }
}

