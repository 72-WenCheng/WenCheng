package com.jichu.fanxing;

/**
 * @author 彭文成
 * @version 1.0
 * 自定义泛型
 * class 类<T,R...>{}
 * 注意细节
 * 普通成员可以使用泛型（属性、方法）
 * 使用泛型的数组，不能初始化
 * 静态方法中不能使用类的泛型
 * 泛型类的类型，是在创建对象时确定的
 * 如果在创建对象时，没有指定类型，默认为Object
 */
public class generic04 {
    public static void main(String[] args) {

    }
}
class Tiger<T,R,M,E>{
    String name;
    T t;
    M m;
    R r;
    E e;

    public E f(){
        return e;
    }

//    T[] ts = new T[1];
    T[] ts;

//    public static void m(M m){
//
//    }
}
