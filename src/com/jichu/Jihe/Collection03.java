package com.jichu.Jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * @author 彭文成
 * @version 1.0
 * Collection接口遍历元素-->增强for循环
 * 可以代替iterator迭代器
 * 本质还是迭代器，只能用于遍历集合或数组
 */
public class Collection03 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Person("jack"));
        col.add(new Person("min"));
        col.add(new Person("max"));

        for(Object person : col){
            System.out.println(person);
        }
    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
