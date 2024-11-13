package com.gaoji.duiaixang;

/**
 * 代码块/初始化块
 * 属于类中的成员，是类的一部分，只有方法体
 * 不通过对象或者类显示调用，而是加载类时，或创建对象时隐式调用
 * 语法：修饰符{逻辑语句}
 * 修饰符只能是static
 * 好处：
 * 相当于另外一种形式的构造器（对构造器的补充机制），可以做初始化的操作
 * 场景：
 * 如果多个构造器中都有重复的语句，可以抽取到代码块中，提高重用性
 * 细节：
 * static代码块也叫静态代码块，作用就是对类进行初始化，而随着类的加载而执行，且只会执行一次
 * 普通代码块则是每创建一个对象，就执行一次
 * 类什么时候被加载：
 * 创建对象实例（new）
 * 创建子类对象实例，父类也会被加载
 * 使用类的静态成员时（静态属性、静态方法）
 * 普通代码块在创建对象实例时，会被隐式的调用
 * 如果只是使用类的静态成员，普通代码块并不会执行
 * 创建一个对象时，在一个类的调用顺序是：
 * 静态代码块-普通代码块-有参-无参（多个时按顺序即可）
 * 静态代码块只能直接调用静态成员，普通代码块则可以调用任意成员
 */
public class day4 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("你好");
        Movie movie2 = new Movie("不好",1,"嗯");
        Movie movie3 = new Movie("不好","嗯");
        Movie movie4 = new Movie();
    }
}

class Movie{
    private String name;
    private double price;
    private String director;

    public Movie(){
        System.out.println("无参方法...");
    }

    //不管我们调用哪个构造器，创建对象，都会先调用代码块
    {
        System.out.println("电影广告...");
        System.out.println("电影开始");
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影广告...");
//        System.out.println("电影开始");
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("Movie(String name, double price, String director)");
    }

    public Movie(String name, String director) {
//        System.out.println("电影广告...");
//        System.out.println("电影开始");
        this.name = name;
        this.director = director;
        System.out.println("Movie(String name, String director)");
    }

    public Movie(String director) {
//        System.out.println("电影广告...");
//        System.out.println("电影开始");
        this.director = director;
        System.out.println("Movie(String director)");
    }
}
