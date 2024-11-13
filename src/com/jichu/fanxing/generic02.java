package com.jichu.fanxing;

import java.util.*;

/**
 * @author 彭文成
 * @version 1.0
 * 细节：
 * T、E只能是引用类型String-包装类-数组-类
 * 子类类型也可以
 * 使用形式
 * HashSet<Student> students = new HashSet<Student>();
 * HashSet<Student> students = new HashSet<>();
 * HashSet students = new HashSet();//不声明默认是<Object>
 */
public class generic02 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack",19));
        students.add(new Student("time",19));
        students.add(new Student("rock",19));

        for (Student s : students){
            System.out.println(s);
        }

        HashMap<String, Student> stringStudentHashMap = new HashMap<String, Student>();
        stringStudentHashMap.put("lick",new Student("lick",20));
        stringStudentHashMap.put("pic",new Student("pic",20));
        stringStudentHashMap.put("auto",new Student("auto",20));

        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey()+"--"+next.getValue());
        }

        Pig<A> aPig = new Pig<A>(new A());
        Pig<A> aPig01 = new Pig<A>(new B());
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class A{}
class B extends A{}
class Pig<E>{
    E e;
    public Pig(E e){
        this.e = e;
    }
}
