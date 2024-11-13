package com.OOP.duixiang.Polymorphism;

/**
 * 面向对象三大特征：封装、继承、多态
 * 多态：
 * 方法或对象具有多种形态，是面向对象的第三大特征
 * 多态是建立在继承和封装的基础之上
 * 方法的多态：
 * 重写和重载就体现出来
 * 对象的多态：
 * 一个对象的编译类型和运行类型可以不一致
 * 编译类型在定义对象时，就确定了，不能改变
 * 运行类型是可以变化的
 * 编译类型看定义时 = 左边
 * 运行类型看 = 右边
 * 多态的前提是两个对象（类）存在继承关系
 * 多态的向上转型：
 * 本质是父类的引用指向了子类的对象
 * 语法是父类类型 引用名 = new 子类类型()
 * 特点是
 * 可以调用父类的所有成员（需遵守访问权限）,子类调用不了，编译阶段，编译类型决定了
 * 不能调用子类中特有的成员
 * 最终运行效果看子类的具体实现（子类没有调用具体方法，就找父类）
 * 多态的向下转型：
 * 语法是：子类类型 引用名 = (子类类型) 父类引用
 * 只能强转父类的引用，不能强转父类的对象
 * 要求父类的引用必须指向的是当前目标类型的对象
 * 可以调用子类类型中所有的成员
 * 属性没有重写之说，看编译类型
 * instanceOf 比较操作符，用于判断对象的运行类型是否为xx类型或xx类型的子类
 */
public class Poly {
    public static void main(String[] args) {
        //向上转型，父子类有相同方法才能判定动态绑定机制
        Animal animal1 = new Dog("小狗");
        Food food1 = new Food("骨头");
        Master master = new Master();
        master.feed(animal1,food1);

        //向下转型，可以调用子类特有的成员方法
        Dog dog = (Dog) animal1;
        dog.cryatr();

        //属性没有动态绑定机制，编译类型是谁，就调用那个对象的属性
        As as = new Bs();
        System.out.println(as.cont);
    }
}

class As{
    int cont = 20;
}

class Bs extends As{
    int cont = 10;
}
