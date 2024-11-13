package com.jichu.Jihe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 彭文成
 * @version 1.0
 * Collection接口实现类的特点
 * public interface Collection<E> extends Iterable<E>
 * 可以存放多个元素，每个元素可以是Object
 * 其实现类有些可以存放重复的元素，有些不可以
 * 子类接口有序List，无序Set，Collection无直接实现的类，通过这两个子类接口实现类
 * 通过实现子类ArrayList演示
 * add添加单个元素
 * remove删除指定元素
 * contains查找元素是否存在
 * size获取元素个数
 * isEmpty判断是否为空
 * clear清空
 * addAll添加多个元素
 * containsAll查找多个元素是否存在
 * removeAll删除多个元素
 */
public class Collection01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list="+list);
        list.remove(1);//删除第一个元素
        list.remove("jack");//删除指定元素
        System.out.println("list="+list);
        System.out.println(list.contains("jack"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演义");
        list.addAll(arrayList);
        System.out.println("list="+list);
        System.out.println("arrayList="+arrayList);
        System.out.println(list.containsAll(arrayList));
        list.removeAll(arrayList);
        System.out.println(list);
    }
}
