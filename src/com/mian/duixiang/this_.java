package com.mian.duixiang;

/**
 * this关键字
 * 那个对象调用就指向那个对象
 * 可以用来访问本类的属性、方法、构造器
 * 用于区分当前类的全局变量（属性）和局部变量
 * 访问成员方法：this.方法名(参数列表)
 * 访问构造器：this(参数列表)，注意只能在构造器中使用
 * this不能在类定义的外部使用，只能在类定义的方法使用
 */
public class this_ {
    public static void main(String[] args) {
        Fr fr = new Fr("文成",18);
        System.out.println(fr.name);
        System.out.println(fr.age);

        Persony p1 = new Persony("文",12);
        Persony p2 = new Persony("文",12);
        System.out.println(p1.compar(p2));
    }
}
class Fr{
    String name;
    int age;

    public Fr(String name,int age){
        //这里的name，age指的是成员变量，所以输出默认值
//        name = name;
//        age = age;

        //这里fr对象调用了，所以直接向它，输出初始化的值
        this.name = name;
        this.age = age;
        System.out.println(this.hashCode());
    }
}

class Persony{
    String name;
    int age;

    public Persony(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean compar(Persony p){
        return this.name.equals(p.name) && this.age == p.age;
    }
}
