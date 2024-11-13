package com.zhongji.duixiang;

/**
 * hashCode方法
 * 提高具有哈希结构的容器的效率
 * 两个引用类型，如果指向的是同一个对象，则哈希值是一样的，否则不一样
 * 哈希值主要根据地址号来，不能完全将哈希值等价于地址
 * 在集合中，hashCode方法需要的话，也会重写
 */
public class Hashcode {
    public static void main(String[] args) {
        Ad ad1 = new Ad();
        Ad ad2 = new Ad();
        System.out.println(ad1);
        System.out.println(ad1.hashCode());
        System.out.println(ad2.hashCode());
        Ad ad3 = new Ad();
        Ad ad4 = ad3;
        System.out.println(ad3.hashCode());
        System.out.println(ad4.hashCode());

    }
}

class Ad{

}