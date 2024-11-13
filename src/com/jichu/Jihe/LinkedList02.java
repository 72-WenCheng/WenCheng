package com.jichu.Jihe;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author 彭文成
 * @version 1.0
 * LinkedList增删改查
 */
public class LinkedList02 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 2; i++) {
            linkedList.add(i);
        }
        linkedList.add(100);
        linkedList.add(100);

        for (Object object : linkedList) {
            System.out.println(object);
        }

        linkedList.remove(0);

        linkedList.set(0,100);

        Object obj = linkedList.get(0);
        System.out.println("obj="+obj);
        System.out.println(linkedList.getFirst());
    }
}
