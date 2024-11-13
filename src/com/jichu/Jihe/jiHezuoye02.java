package com.jichu.Jihe;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 彭文成
 * @version 1.0
 */
public class jiHezuoye02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("宝马",18000));
        arrayList.add(new Car("法拉利",328000));
        arrayList.add(new Car("劳斯莱斯",118000));

        Car car01 = new Car("宝马x",50000);
        arrayList.add(car01);

        System.out.println("arrayList="+arrayList);

        arrayList.remove(1);
        arrayList.remove(car01);
        System.out.println("arrayList="+arrayList);

        System.out.println(arrayList.contains(car01));

        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());

//        arrayList.clear();

        arrayList.addAll(arrayList);//实现Collection接口的子类
        System.out.println(arrayList);

//        arrayList.removeAll(arrayList);//相当于清空

        //增强for
        for (Object obj : arrayList){
            System.out.println(obj);
        }
        System.out.println("--------");
        //迭代器
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
