package com.jichu.Jihe;

import java.util.HashSet;

/**
 * @author 彭文成
 * @version 1.0
 * 如何实现
 * 源码解读
 */
public class HashSet03 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("hashSet="+hashSet);
    }
}
