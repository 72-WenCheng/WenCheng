package com.zhongji.duixiang;

/**
 * finalize
 * 当对象被回收时，系统自动调用该对象的finalize方法
 * 子类可以重写，做一些释放资源的操作
 * 当对象没有任何引用，jvm会先调用finalize方法回收
 * 垃圾回收机制的调用，是由系统决定的，也可以通过System.gc()主动触发垃圾回收机制
 */
public class Finalize {
    public static void main(String[] args) {
        Sd sd = new Sd("牛魔王");
        sd = null;

        //自动触发
        System.gc();
    }
}

class Sd{
    private String name;

    public Sd(String name) {
        this.name = name;
    }

    //重写销毁方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁牛魔王");
    }
}
