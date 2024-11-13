package com.jichu.Jihe;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 彭文成
 * @version 1.0
 * Map
 * Map与Collection并列存在，用于保存具有映射关系的数据Key-Value
 * Map中的key和value可以是任何引用类型的数据，会封装到HashMap$Node对象中
 * key不允许重复，原因和HashSet一样，value可以重复
 * key、value可以为null，注意key为null只能有一个
 * 常用String类作为Map的key
 * key和value之间存在单向一对一关系，即通过指定的key找到对应的value
 * 常用方法：
 * put添加
 * remove根据键删除映射关系
 * get根据键获取值
 * size获取元素个数
 * isEmpty判断个数是否为0
 * clear清除
 * containsKey查找键是否存在
 */
public class Map01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","彭文成");
        map.put("no2","张无忌");
        map.put("no2","小明");//替换
        map.put("no3","小明");
        map.put(null,null);
        map.put(null,"adc");
        map.put(01,null);
        map.put(02,null);
        map.put(03,03);
        map.put("cha","茶");
        map.put(new Object(),"集合");
        System.out.println("map="+map);
        System.out.println(map.get("no1"));
        System.out.println(map.size());
//        map.clear();
//        System.out.println("map="+map);
        System.out.println(map.containsKey("cha"));
    }
}
