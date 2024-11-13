package com.jichu.fanxing;

import java.util.ArrayList;

/**
 * @author 彭文成
 * @version 1.0
 * 引出泛型
 * 不能对加入到集合的数据类型进行约束
 * 遍历的时候需要类型转换，如果数据量大，对效率有影响
 * 好处：
 * 编译时检查元素的类型，提高了安全性
 * 减少了类型转换的次数，提高效率
 * 不在提醒编译错误
 * 理解：
 * 集合的约束，泛型就是表示数据类型的一种数据类型
 * 在类声明或实例化指定需要的具体类型即可
 * 运行时不会出现ClassCastException
 * class Person<E>{
 * E s;//在定义Person对象时候指定E的类型，例如new Person<String>("");
 * public Person(E s){this.s = s}
 * public E f(){return s;}
 * }
 * 泛型的声明：
 * interface<E>
 * calss<E,T>
 */
@SuppressWarnings("all")
public class generic01 {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
        ArrayList<Dog> arrayList = new ArrayList<Dog>();//只能存放Dog类型
        arrayList.add(new Dog("小狗",18));
        arrayList.add(new Dog("小黄",18));
        arrayList.add(new Dog("小名",18));

        //假如加入猫类
//        arrayList.add(new Cat("小猫",18));

//        for (Object o : arrayList){
//            Dog dog = (Dog) o;
//            System.out.println("名字："+dog.getName()+"--"+"年龄："+dog.getAge());
//        }

        //遍历的时候直接取出Dog类型
        for (Dog o : arrayList){
            System.out.println("名字："+o.getName()+"--"+"年龄："+o.getAge());
        }
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
