package com.jichu.Jihe;

import java.util.TreeSet;

/**
 * @author 彭文成
 * @version 1.0
 */
public class jiHezuoye04 {
    public static void main(String[] args) {
        //HashSet的去重机制：hashCode()+equals()，底层先通过存入对象进行运算得到一个hash值
        //通过hash值得到对应的索引，如果table索引所在位置没有数据，直接替换
        //如果有数据就进行equals（方法程序员定义）比较，比较后不相同就加入，否则不加入

        //TreeSet的去重机制：如果你传入了一个Comparator匿名对象。就使用实现的Comparator去重
        //如果方法返回0，就认为是相同的元素，不添加
        //如果没有传入Comparator匿名对象，则以你添加的对象实现的Comparable接口的compareTo去重
        TreeSet treeSet = new TreeSet();
        treeSet.add(new AA());
//        treeSet.add("hsp");
//        treeSet.add("pwc");
//        treeSet.add("pwc");
        System.out.println(treeSet);
    }
}
class AA implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
