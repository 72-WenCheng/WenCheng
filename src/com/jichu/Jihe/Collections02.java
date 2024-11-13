package com.jichu.Jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 彭文成
 * @version 1.0
 * 查找、替换：
 * Object max(Collection)根据元素自然顺序，返回最大值
 * Object max(Collection,Comparator)根据Comparator指定的顺序，返回最大值
 * Object min(Collection)
 * Object min(Collection,Comparator)
 * int frequency(Collection,Object)反回指定集合中指定元素的出现次数
 * void copy(List dest,List src)将src中的内容复制到dest中
 * boolean replaceAll(List list,Object oldVal,Object newVal)使用新值替换List对象的所有旧值
 */
public class Collections02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("milan");
        list.add("jack");
        list.add("ton");
        System.out.println("list="+list);

        System.out.println(Collections.max(list));

        Object max = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println(max);

        System.out.println("ton出现的次数="+Collections.frequency(list,"ton"));

        ArrayList dest = new ArrayList();
//        for (int i = 0; i < list.size(); i++) {
//            dest.add("");
//        }
        Collections.copy(dest,list);//会报异常，查看源码，会比较初始化的长度
        System.out.println("dest="+dest);

        Collections.replaceAll(list,"ton","汤姆");
        System.out.println("list替换后："+list);
    }
}
