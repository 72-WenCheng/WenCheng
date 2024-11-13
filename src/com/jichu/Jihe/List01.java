package com.jichu.Jihe;

import java.util.*;

/**
 * @author 彭文成
 * @version 1.0
 * List接口
 * 集合中的元素有序（添加和取出的顺序一致，且可重复）
 * 每个元素都有其对应的顺序索引
 * List容器中的元素对应一个整数型的序号记载其在容器中的位置
 * 实现子类ArrayList、LinkedList、Vector等
 * add(int index, Object ele)在索引位置插入元素
 * addAll(int index, Collection eles)从索引位置将集合添加进来
 * get(int index)获取指定索引的元素
 * indexOf(Object obj)返回obj在集合中首次出现的位置
 * lastIndexOf(Object obj)返回obj在集合中未次出现的位置
 * remove(int index)移除指定索引的元素，并返回
 * set(int index, Object ele)替换
 * subList(int fromIndex, int toIndex)返回索引范围的子集合
 */
public class List01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("maiko");
        list.add("jack");
        System.out.println(list.get(2));
        list.add(1,"pwc");
        System.out.println(list);
        List list2 = new ArrayList();
        list2.add("we");
        list2.add("edg");
        System.out.println(list2);
        list.addAll(1,list2);
        System.out.println(list);
        System.out.println(list.indexOf("pwc"));
        list.add("f");
        System.out.println(list.lastIndexOf("f"));
        list.remove(0);
        System.out.println(list);
        list.set(1,"m");
        System.out.println(list);
        List returnlist = list.subList(0,2);
        System.out.println(returnlist);
    }
}
