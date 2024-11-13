package com.jichu.Jihe;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author 彭文成
 * @version 1.0
 * HashSet
 * 实际上是HashMap
 *     public HashSet(){
 *         map = new HashMap<>();
 *     }
 * 可以存放null，但只能有一个
 * 不能保证元素是有序的，取决于hash后，再确定索引的结果
 * add()返回一个boolean值
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();//查看源码
        hashSet.add(null);
        System.out.println(hashSet.add(null));
        hashSet.add("bai");
        hashSet.remove(null);
        System.out.println("hashSet="+hashSet);

        //重新创建对象，元素为空，理解HashMap底层
//        HashSet hashSet01 = new HashSet();
        hashSet = new HashSet();//相当于重置
        System.out.println("hashSet="+hashSet);
        hashSet.add("lucy");
        hashSet.add("lucy");
        hashSet.add(new Dog("tom"));
        hashSet.add(new Dog("tom"));//这个new出来的可以添加
        System.out.println("hashSet="+hashSet);

        //经典面试题
        //其主要String重写了hashcode()，内容一致的话字符串对象返回相同的hashcode
        hashSet.add(new String("pwc"));
        hashSet.add(new String("pwc"));//添加不了，查看HashMap底层机制，了解不能添加重复元素的原理
        System.out.println("hashSet="+hashSet);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
