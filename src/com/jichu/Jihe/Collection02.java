package com.jichu.Jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author 彭文成
 * @version 1.0
 * Collection接口遍历元素-->Iterator迭代器
 * Iterator对象称为迭代器，主要用于遍历Collection集合中的元素
 * 所有实现了Collection接口的集合类都有一个itrrator()方法
 * 用以返回一个实现Iterator接口的对象，即可以返回一个迭代器
 * Iterator仅用于遍历集合，本身不存放对象
 */
public class Collection02 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演绎","罗贯中",10.0));
        col.add(new Book("红楼梦","曹雪芹",10.0));
        //拿到迭代器对象
        Iterator iterator = col.iterator();
        //while遍历
        while (iterator.hasNext()){//快捷键itit
            Object obj = iterator.next();
            System.out.println("obj="+obj);
        }
//        iterator.next();
        //再次遍历，需要重置迭代器
        iterator = col.iterator();
        while (iterator.hasNext()){//快捷键itit
            Object obj = iterator.next();
            System.out.println("obj="+obj);
        }
    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}