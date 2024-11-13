package com.gaoji.duiaixang;

/**
 * 懒汉式
 *
 */
public class day06 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}

//只创建一个Cat对象
class Cat{
    private String name;

    private static Cat ca;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance(){
        if (ca == null){
            ca = new Cat("小可爱");
        }
        return ca;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
