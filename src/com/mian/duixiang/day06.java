package com.mian.duixiang;

/**
 * 构造器（构造方法）
 * 创建类的时候就直接指定对象的属性值以及完成对对象的初始化
 * 修饰符可以默认
 * 没有返回值
 * 方法名和类名一致
 * 如果没有定义构造器，系统会自动给类生成一个默认的无参构造器（无参构造方法）
 */
public class day06 {
    //定义全局变量的（默认）无参构造方法
//    String name;
//    int age;
//    public day6(){
//        System.out.println("构造方法被调用");
//    }

    public static void main(String[] args) {
          //通过new一个对象，并赋值
//        Preop preop = new Preop();
//        preop.name = "文成";
//        preop.age = 22;

//        //定义全局变量的（默认）无参构造方法
//        day6 dy = new day6();
//        System.out.println("name="+dy.name+"\n"+"age="+dy.age);

//        //在new一个对象时，就已经初始化（赋值）
//        Preop preop = new Preop("文成",22);

        Personses personses = new Personses();
        System.out.println("personses的name："+personses.name+"\n"+"personses的age："+personses.age);

        Personses personses1 = new Personses("scott",50);
        System.out.println("personses1的name："+personses1.name+"\n"+"personses1的age："+personses1.age);

    }
}

//通过new一个对象，并赋值
//class Preop{
//    String name;
//    int age;
//}

//在new一个对象时，就已经初始化（赋值）
//class Preop{
//    public Preop(String name, int age){
//        name = name;
//        age = age;
//        System.out.println("构造方法被调用");
//        System.out.println("name="+name+"\n"+"age="+age);
//    }
//}

class Personses{
    String name;
    int age;

    public Personses(){
        age = 18;
    }

    public Personses(String pName, int pAge){
        name = pName;
        age = pAge;
    }
}