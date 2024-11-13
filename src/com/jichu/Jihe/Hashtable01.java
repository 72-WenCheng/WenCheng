package com.jichu.Jihe;

import java.util.Hashtable;

/**
 * @author 彭文成
 * @version 1.0
 * Hashtable
 * 存放的元素是键值对
 * 键和值都不能为null
 * 使用方法基本上和HashMap一样
 * Hashtable是线程安全的
 * 简单看一下底层结构：
 * 数组Hashtable$Entry[] 初始化大小11
 * 临界值threshold=11*0.75
 */
public class Hashtable01 {
    public static void main(String[] args) {
        Hashtable table  = new Hashtable();
        table.put("jack",18);
//        table.put(null,18);
//        table.put("sb",null);
        table.put("lin",11);
        table.put("lin",12);
        System.out.println("table="+table);
    }
}
