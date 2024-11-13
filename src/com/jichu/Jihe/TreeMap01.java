package com.jichu.Jihe;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 彭文成
 * @version 1.0
 * TreeMap
 * 可以排序
 *         TreeMap treeMap = new TreeMap(new Comparator() {
 *             @Override
 *             public int compare(Object o1, Object o2) {
 *                 return ((String)o1).compareTo((String)o2);
 *             }
 *         });
 */
@SuppressWarnings("all")
public class TreeMap01 {
    public static void main(String[] args) {
//        TreeMap treeMap = new TreeMap();
//        treeMap.put("jack","杰克");
//        treeMap.put("tom","汤姆");
//        treeMap.put("smith","史密斯");
//        System.out.println("treeMap="+treeMap);

        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                return ((String)o1).compareTo((String)o2);
                return ((String)o1).length() - ((String)o2).length();//根据长度
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("smith","史密斯");
        System.out.println("treeMap="+treeMap);
    }
}
