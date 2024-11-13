package com.jichu.Jihe;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 彭文成
 * @version 1.0
 * TreeSet
 * 可以排序
 *         TreeSet treeSet = new TreeSet(new Comparator() {
 *             @Override
 *             public int compare(Object o1, Object o2) {
 *                 return ((String)o1).compareTo((String)o2);
 *             }
 *         });
 *         底层就是TreeMap
 */
public class TreeSet01 {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
//        treeSet.add("jack");
//        treeSet.add("tom");
//        treeSet.add("sp");
//        System.out.println("treeSet="+treeSet);

        //元素按照字符串（字母）大小来排序，使用比较构造器（匿名内部类）
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        System.out.println("treeSet="+treeSet);
    }
}
