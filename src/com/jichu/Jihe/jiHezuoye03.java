package com.jichu.Jihe;

import java.util.*;

/**
 * @author 彭文成
 * @version 1.0
 */
public class jiHezuoye03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",8000);//自动装箱
        hashMap.put("tom",9000);
        System.out.println(hashMap);

        hashMap.put("jack",79000);
        System.out.println(hashMap);

        Set keySet = hashMap.keySet();
        for (Object key : keySet){
            hashMap.put(key,(Integer)hashMap.get(key)+100);
        }
        System.out.println(hashMap);

        //遍历EntrySet
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        Collection values = hashMap.values();
        for (Object value : values){
            System.out.println("工资："+value);
        }
    }
}