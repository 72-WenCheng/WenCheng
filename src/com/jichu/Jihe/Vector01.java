package com.jichu.Jihe;

import java.util.Vector;

/**
 * @author 彭文成
 * @version 1.0
 * Vector
 * 底层依旧是数组
 * 线程同步，即线程安全，操作方法带有synchronized
 * 当使用无参构造器创建对象，容量默认10，满后直接2倍扩容
 * 如果指定大小，每次2倍扩容
 */
public class Vector01 {
    public static void main(String[] args) {
        //追源码
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
    }
}
