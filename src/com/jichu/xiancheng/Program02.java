package com.jichu.xiancheng;

/**
 * @author 彭文成
 * @version 1.0
 * 创建线程的两种方式：
 * 继承Thread类，重写run方法
 * 实现Runnable接口，重写run方法
 * 追溯源码：
 * 当启动Cat进程，进入主方法，启动主线程main，start()后
 * 并伴随子线程Thread-0的启动，主线程并不会阻塞，交替执行
 * 看单或多核，决定并发或者并行，或者都有
 * 使用JConsole监控线程情况，可视化理解（控制台输入JConsole连接即可）
 * 为什么不直接调用run()，相当于没有启动线程，串行化处理，造成阻塞
 * start()源码解读：
 * private native void start0();本地方法，JVM调用，底层是c/c++
 * 该线程不一定会立马执行，只是将线程变成可运行状态
 * 具体什么时候执行取决于cpu
 * 参考操作系统原理
 */
public class Program02 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();//创建Cat线程对象
        cat.start();//启动线程，这里调用了run()，追溯源码
//        cat.run();

        //交替执行
        System.out.println("主线程"+Thread.currentThread().getName()+"继续执行...");
        for (int j = 0; j < 80; j++) {
            System.out.println("主线程..."+j);
            Thread.sleep(1000);//这里让它抛出异常
        }
    }
}

//继承了Thread，该类就是线程
//每隔一秒输出：联想小新...
//输出80次
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {//写上自己的业务逻辑
        super.run();//继承默认调用父类的无参构造方法，如果父类定义了有参构造方法，则需要声明super指向
        while (true) {
            System.out.println("联想小新..."+(++times)+"\n"+"Cat线程名称："+Thread.currentThread().getName());
            //使线程休眠一秒
            try {
                Thread.sleep(1000);//ctrl+alt+t，1000ms=1s
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80){
                break;
            }
        }
    }
}
