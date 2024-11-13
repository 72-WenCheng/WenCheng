package com.gaoji.duiaixang;

/**
 * 单例模式（静态成员的经典场景）
 * 设计模式是在大量的实践中总结和理论化之后优选的代码结构、编程风格、以及解决问题的思考方式
 * 采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
 * 并且该类只提供一个取得其对象的方法
 * 单例模式有两种方式：饿汉式、懒汉式
 * 饿汉式（可能会造成资源浪费）：
 * 步骤：
 * 构造器私有化（防止new）
 * 类的内部创建对象
 * 向外暴露一个静态的公共方法
 * 代码实现
 */
public class day05 {
    public static void main(String[] args) {
//        Girl s1 = new Girl("小红");
//        Girl s2 = new Girl("小白");

        Girl instance = Girl.getInstance();
        System.out.println(instance);
    }
}
class Girl{
    private String name;

    private static Girl gf = new Girl("小米");

//    public Girl(String name) {
//        this.name = name;
//    }

    private Girl(String name) {
        this.name = name;
    }

    public static Girl getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}