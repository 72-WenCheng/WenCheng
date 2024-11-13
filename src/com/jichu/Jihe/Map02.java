package com.jichu.Jihe;

import java.util.*;

/**
 * @author 彭文成
 * @version 1.0
 * Map遍历方式
 * containsKey查找键是否存在
 * keySet获取所有的键
 * entrySet获取所有的关系
 * values获取所有的值
 */
@SuppressWarnings("all")
public class Map02 {
    public static void main(String[] args) {
        Map map =  new HashMap();
        map.put("小明",18);
        map.put("小米",19);
        map.put("小粒",20);

        Set keyset = map.keySet();//把所有key取出
        //1.增强for
        for (Object key : keyset){
            System.out.println(key+"-"+map.get(key));
        }
        //2.迭代器
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key+"-"+map.get(key));
        }

        Collection values = map.values();//把所有values取出
        //3.增强for
        for (Object value : values){
            System.out.println(value);
        }
        //4.迭代器
        Iterator iterator01 = values.iterator();
        while (iterator01.hasNext()) {
            Object value =  iterator01.next();
            System.out.println("value="+value);
        }

        Set entrySet = map.entrySet();//EntrySet<Map.Entry<k,v>>
        //5.增强for
        for (Object entry : entrySet){
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        //6.迭代器
        Iterator iterator02 = entrySet.iterator();
        while (iterator02.hasNext()) {
            Object entry =  iterator02.next();
//            System.out.println(next.getClass());HashMap$Node实现了Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
    }
}
