package com.mian.duixiang;

import java.util.Scanner;

/**
 * 类与对象
 * java设计者引入类与对象(oop)，根本原因就是现有技术，
 * 不能完美解决新的需求
 * 对象【属性，行为】
 * 类就是数据类型
 * 对象就是一个具体的实例
 * 对象在内存中存在形式：
 * 还是参考jvm（栈、堆、方法区）
 * 栈：一般存放基本数据类型（局部变量）
 * 堆：存放对象
 * 方法区：常量池，类加载信息，相同类只加载一次
 * Person person = new Person();先加载类信息（属性和方法），在堆中分配空间，进行默认初始化，把地址赋值p，p就指向对象
 * 栈0x0011 -- 堆0x0011(0x0022、0x0033等) -- 方法区的常量池0x0022
 * 属性/成员变量：
 * 属性可以是基本数据类型，也可以是引用数据类型
 * 定义语法 = 访问修饰符 属性类型 属性名
 * 不赋值则使用默认值
 * 成员方法的好处：
 * 提高代码的复用性
 * 可以将实现的细节封装起来，然后提供其他用户调用即可
 * 成员方法的定义：
 * 访问修饰符（控制使用的范围） 返回数据类型（只能有一个返回类型，返回类型可以是任意类型，有返回类型需要return，没有则void）
 * 方法名()或方法名(形参)，形参被调用并赋值则为实参
 * 方法里面不能在定义方法
 * 方法细节：
 * 同一个类中方法可以直接调用，不同则需要看类的访问权限，可以访问则使用另一个类的对象调用
 */

public class day01 {
    public static void main(String[] args) {
        //假设有x只小猫，年龄，大小，爱好....
        //传统定义每一个单独变量不利于数据的管理，效率低
        //数组，则数据类型、行为不能体现
        //使用opp面向对象解决
        //实例化一只猫
        Cat cat1 = new Cat();
        cat1.name = "大黑猫";
        cat1.age = 3;
        cat1.color = "白色";
        System.out.println("猫名："+cat1.name+"\n"+"年龄："+cat1.age+"\n"+"颜色："+cat1.color);

        Person person = new Person();
        person.age = 10;
        person.name = "小明";
        Person person1 = new Person();
        person1.age = 14;
        person1.name = "小红";
        System.out.println("person："+person.name+person.age+"岁"+"\n"+
                "person1："+person1.name+person1.age+"岁");

        Persons persons = new Persons();
        String mz = persons.name = "文成";
        int nl = persons.age = 21;
        System.out.println(mz+nl+"岁"+persons.speak());

        //如果方法没有返回值。不能将调用方法直接写在输出控制台上，因为控制台返回输出的是有返回类型的值
        //int a = persons.cal01();这种写法也不行
        persons.cal01();//直接调用方法即可

        persons.cal02(100);

        //定义一个二维数组
        int[][] map;
        map = new int[][]{{1, 2, 3}, {1, 2, 3, 4}};
        System.out.println("请输入你要遍历多少次");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        persons.prinArr(map,num); //遍历num次
    }
}
class Cat{
    String name;
    int age;
    String color;
}

class Person{
    String name;
    int age;
}

class Persons{
    String name;
    int age;
    public String speak(){
        return "是一个好人";
    }

    //计算1-10的和
    public void cal01(){
        int res = 0;//定义累计变量
        for (int i = 1; i <= 10; i++) {
            res += i;
        }
        System.out.println("1-10的和="+res);
    }

    //使用参数传递方式计算1-n的和
    public void cal02(int n){
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("1-"+n+"的和="+res);
    }

    //for循环遍历二维数组
    public void prinArr(int[][] map, int num){
        for (int a = 0; a < num; a++) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println(" ");
            }
        }
    }
}
