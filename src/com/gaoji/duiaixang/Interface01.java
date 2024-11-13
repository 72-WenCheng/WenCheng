package com.gaoji.duiaixang;

/**
 * 接口Interface
 */
public class Interface01 implements InterfaceUsb{
    //实现接口方法
    @Override
    public void start() {
        System.out.println("开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("结束工作...");
    }
}
