package com.jichu.Jihe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 彭文成
 * @version 1.0
 * Set接口
 * 无序（添加和取出的顺序不一样）没有索引
 * 不允许重复添加元素，所以最多包含一个null
 * 查看api其实现子类
 * 常用方法与父接口Collection一样
 * 遍历方式：
 * 迭代器、增强for循环
 */
public class Set01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("jack");
        set.add("mai");
//        set.add("mai");
        set.add(null);
        set.add(null);
//        for (int i = 0; i < 10; i++) {
//            System.out.println("------");
//            System.out.println("set="+set);
//        }
        set.remove(null);

        //遍历
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj="+obj);
        }

        //快捷键I
        for (Object o : set){
            System.out.println("o="+o);
        }
    }
}
