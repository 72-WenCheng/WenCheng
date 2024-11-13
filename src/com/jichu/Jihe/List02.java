package com.jichu.Jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 彭文成
 * @version 1.0
 * List接口遍历的三种方式
 */
public class List02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0,"a");
        list.add(1,"b");
        list.add(2,"c");
        System.out.println(list);

        //使用迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("-------");
        //增强for循环
        for (Object obj : list){
            System.out.println(obj);
        }
        System.out.println("-------");
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }
}

