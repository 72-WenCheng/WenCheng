package com.jichu.Jihe;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 彭文成
 * @version 1.0
 * hash值是用来判断存放在数组中的位置，equals是用来判断这个位置上的链表是否有相同的元素
 */
public class HashSet04 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack",4));
        hashSet.add(new Employee("smith",8));
        hashSet.add(new Employee("jack",4));
        System.out.println("hashSet="+hashSet);
    }
}
class Employee{
    private String name;
    public int age;

    public Employee(String name, int age) {
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //进行重写，name、age值相同，返回相同的哈希值
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
