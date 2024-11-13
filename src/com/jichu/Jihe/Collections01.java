package com.jichu.Jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 彭文成
 * @version 1.0
 * Collections
 * 操作Set、List和Map等集合的工具类
 * 提供一系列静态方法对集合元素进行排序、查询修改等操作
 * 排序：
 * reverse（List）反转List中元素的顺序
 * shuffle（List）对List集合元素进行随机排序
 * sort（List）根据元素的自然顺序对指定List集合元素按升序排序
 * sort（List，Comparator）根据指定的Comparator产生的顺序对List集合元素进行排序
 * swap（List、int、int）将指定list集合的i处元素和j处元素进行交换
 *
 */
public class Collections01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("milan");
        list.add("jack");
        list.add("ton");
        System.out.println("list="+list);

        Collections.reverse(list);
        System.out.println("list="+list);

        Collections.shuffle(list);
        System.out.println("list="+list);

        Collections.sort(list);
        System.out.println("list="+list);

        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println("list="+list);

        Collections.swap(list,0,1);
        System.out.println("list="+list);
    }
}
