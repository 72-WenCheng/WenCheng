package com.jichu.Jihe;

/**
 * @author 彭文成
 * @version 1.0
 * ArrayList底层结构和源码分析
 * 可存放permits all elements所有元素、including null空元素，可以加入null，并且多个
 * 由数组来实现数据存储
 * 基本等同于Vector，除了线程不安全（但执行效率高）
 * 多线程的情况下不建议使用ArrayList
 * 维护了一个Object类型的数组transient Object[] elementData
 * 当创建对象时，如果使用无参构造器，初始化容量为0
 * 当添加元素时，先判断是否需要扩容，需要则调用grow方法
 * 当第一次添加元素且使用无参构造器，需要扩容，容量为10，如需再次扩容，则elementData1.5倍
 * 当使用指定容量capacity的构造器，初始化容量为capacity指定的容量，需要扩容，则elementData1.5倍
 */
public class ArrayList {
    public static void main(String[] args) {
//        ArrayList objects = new ArrayList();
//        objects.add(null);
//        objects.add(null);
//        objects.add("hello");
//        System.out.println(objects);

        //追源码
        java.util.ArrayList objects = new java.util.ArrayList();
        for (int i = 0; i < 10; i++) {
            objects.add(i);
        }

        for (int i = 11; i <= 15 ; i++) {
            objects.add(i);
        }

        //debug的数据会简化，去设置一下
        objects.add(100);
        objects.add(200);
    }
}