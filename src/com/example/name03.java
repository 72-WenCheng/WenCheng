package com.example;

public class name03 {
    String name;
    int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

//    public static void main(String[] args) {
//        name2 xiaoming = new name2();
//        xiaoming.getName();
//        System.out.println(xiaoming.getName());
//    }
    //学习对象（定义属性和定义实现的方法）和类（创建对象的模板）
    //类：定义对象的蓝图，包括属性和方法
    //public class Car { ... }
    //对象：类的实例，具有状态和行为
    //Car myCar = new Car();
    //继承：一个类可以继承另一个类的属性和方法
    //public class Dog extends Animal { ... }
    //封装：将对象的状态（字段）私有化，通过公共方法访问
//    private String name;
//    public String getname(){
//        return name;
//    }
    //多态：对象可以表现为多种形态，主要通过方法重载和方法重写实现
    //方法重载：同一个类中可以有多个同名的方法，但参数不同
//    public int add(int a,int b){
//
//    }
//    public double add(double a,double b){
//
//    }
    //方法重写
//    @Override public void makeSound() { System.out.println("Meow"); }
    //抽象：使用抽象类和接口来定义必须实现的方法，不提供具体实现
    //public abstract class Shape { abstract void draw(); }
    //public interface Animal { void eat(); }
    //接口：定义类必须实现的方法，支持多重继承
    //public interface Drivable { void drive(); }
    //方法：定义类的行为，包含在类中的函数
    //public void displayInfo() { System.out.println("Info"); }
    //局部变量：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁
    //成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问
    //类变量：类变量也声明在类中，方法体之外，但必须声明为 static 类型
    //构造方法
    //每个类都有构造方法。如果没有显式地为类定义构造方法，Java 编译器将会为该类提供一个默认构造方法
    //在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法
//    public name2(){
//
//    }
//    public name2(String name){
//
//    }
    //创建对象：对象是根据类创建的。在Java中，使用关键字 new 来创建一个新的对象
    //声明：声明一个对象，包括对象名称和对象类型
    //实例化：使用关键字 new 来创建一个对象
    //初始化：使用 new 创建对象时，会调用构造方法初始化对象
//public class Puppy{
//    public Puppy(String name){
//        //这个构造器仅有一个参数：name
//        System.out.println("小狗的名字是 : " + name );
//    }
//    public static void main(String[] args){
//        // 下面的语句将创建一个Puppy对象
//        Puppy myPuppy = new Puppy( "tommy" );
//    }
//}
    //下面的例子展示如何访问实例变量和调用成员方法
//public class Puppy {
//    private int age;
//    private String name;
//
//    // 构造器
//    public Puppy(String name) {
//        this.name = name;
//        System.out.println("小狗的名字是 : " + name);
//    }
//
//    // 设置 age 的值
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    // 获取 age 的值
//    public int getAge() {
//        return age;
//    }
//
//    // 获取 name 的值
//    public String getName() {
//        return name;
//    }
//
//    // 主方法
//    public static void main(String[] args) {
//        // 创建对象
//        Puppy myPuppy = new Puppy("Tommy");
//
//        // 通过方法来设定 age
//        myPuppy.setAge(2);
//
//        // 调用另一个方法获取 age
//        int age = myPuppy.getAge();
//        System.out.println("小狗的年龄为 : " + age);
//
//        // 也可以直接访问成员变量（通过 getter 方法）
//        System.out.println("变量值 : " + myPuppy.getAge());
//    }
//}
    //java包
    //包主要用来对类和接口进行分类。当开发 Java 程序时，可能编写成百上千的类，因此很有必要对类和接口进行分类
    //import 语句
    //在 Java 中，如果给出一个完整的限定名，包括包名、类名，那么 Java 编译器就可以很容易地定位到源代码或者类。import 语句就是用来提供一个合理的路径，使得编译器可以找到某个类
}
