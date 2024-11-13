package com.gaoji.duiaixang;

/**
 * 匿名内部类
 * 运用于底层框架、开发中非常重要
 * 语法：new 类或接口(参数列表){类体}
 * 细节：
 * 匿名内部类的语法比较奇特，即是一个类的定义本身也是一个对象
 * 从语法上看具有类定义的特征也有创建对象的特征
 * 可以直接访问外部类的所有成员，包含私有
 * 不能添加访问修饰符，本质是局部成员
 * 作用域：在定义的方法以及代码块中
 * 外部其他类不能访问
 * 如果外部类和局部内部类成员重名时，就近原则，想访问外部类成员则：外部类类名.this.成员名
 * 最佳实践：
 * 当作实参直接传递
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousInner anonymousInner = new AnonymousInner();
        anonymousInner.m1();

        //当作实参直接传递：

        //构造器实践打印椰汁
        Brcallss brcallss = new Brcallss(new Br() {
            @Override
            public void eat() {
                System.out.println("椰汁");
            }
        });

        //方法实践打印火龙果
        brcallss.al(new Br() {
            @Override
            public void eat() {
                System.out.println("火龙果");
            }
        });

        //静态方法实践
        f1(new Dr() {
            @Override
            public void show() {
                System.out.println("这是一副名画");
            }
        });
    }

    //静态方法实践
    public static void f1(Dr dr){
        dr.show();
    }
}

class AnonymousInner{
    private int n1 = 200;

    public void m1(){
        //1.基于接口的匿名内部类
        //Tiger和Dog只使用了一次，后续增多对象很繁琐
//        Tiger tiger = new Tiger();
//        tiger.cry();
//        Dog dog = new Dog();
//        dog.cry();

        //引出匿名内部类简化开发（接口本身不能实例化，编译类型是接口，运行类型是匿名内部类）
        F tiger = new F(){
            @Override
            public void cry() {
                System.out.println("老虎咆哮");
            }
        };
        tiger.cry();
        System.out.println("tiger的运行类型="+tiger.getClass());
        //底层原理（系统分配匿名内部类，使用一次就销毁）
//        class AnonymousInner$1 implements F{
//            @Override
//            public void cry() {
//                System.out.println("老虎咆哮");
//            }
//        }

        //2.基于类的匿名内部类
        //编译类型Father
        //运行类型AnonymousInner$2
        //参数传递给构造器
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写test()");
            }
        };
        System.out.println("father的运行类型="+father.getClass());
        father.test();

        //3.基于抽象类的匿名内部类
        An an = new An() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        System.out.println("an的运行类型="+an.getClass());
        an.eat();
    }
}

interface F{
    public void cry();
}

//class Tiger implements F{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫");
//    }
//}

//class Dog implements F{
//    @Override
//    public void cry() {
//        System.out.println("小狗叫");
//    }
//}

class Father{
    public Father(String name){
        System.out.println("name="+name);
    }

    public void test(){

    }
}

abstract class An{
    abstract void eat();
}

interface Dr{
    public void show();
}

interface Br{
    public void eat();
}

class Brcallss{
    public Brcallss(Br br) {
        br.eat();
    }
    public void al(Br br){
        br.eat();
    }
}


