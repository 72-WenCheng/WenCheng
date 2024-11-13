package com.example;

public class name05 {
    //修饰符用来定义类、方法或者变量，通常放在语句的最前端

    //访问修饰符,可以使用访问控制符来保护对类、变量、方法和构造方法的访问
    //default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法
    //private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）\
    //public : 对所有类可见。使用对象：类、接口、变量、方法
    //protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
    //非访问修饰符，为了实现一些其他的功能，Java 也提供了许多非访问修饰符
    //static 修饰符，用来修饰类方法和类变量
    //final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的
    //abstract 修饰符，用来创建抽象类和抽象方法
    //synchronized 和 volatile 修饰符，主要用于线程的编程
    //final 表示"最后的、最终的"含义，变量一旦赋值后，不能被重新赋值
    //abstract 修饰符：抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充
    //抽象方法是一种没有任何实现的方法，该方法的具体实现由子类提供
    //synchronized 修饰符，关键字声明的方法同一时间只能被一个线程访问
    //transient 修饰符，序列化的对象包含被 transient 修饰的实例变量时，java 虚拟机(JVM)跳过该特定的变量
    //volatile 修饰符，volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值
}