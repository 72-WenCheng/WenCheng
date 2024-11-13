package com.gaoji.duiaixang;

/**
 * 局部内部类
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        LocalInner localInner = new LocalInner();
        localInner.m1();

        System.out.println("LocalInner哈希值="+localInner);
    }
}
class LocalInner{
    private int n1 = 100;

    private void m2(){
        System.out.println("m2()");
    }

    public void m1(){
        //1.不能添加访问修饰符，但是可以使用final
        final class Inner01{
            //2.可以直接访问外部类的所有成员、包含私有
            private void f1(){
                System.out.println("n1="+n1);
                m2();
            }
            //6.如果外部类和局部内部类成员重名时，就近原则，想访问外部类成员则：外部类类名.this.成员名
            private int n1 = 10;
            private void f2(){
                System.out.println("n1="+n1);
                System.out.println("n1="+LocalInner.this.n1);
                System.out.println("LocalInner哈希值="+LocalInner.this);
            }
        }

        //1.final修饰不能被继承
//        class Inner02 extends Inner01{
//
//        }

        //3.作用域：在定义的方法中或代码块中
//        {
//            class Inner03{
//
//            }
//        }

        //4.外部内方法中，创建局部内部类对象，调用成员
        Inner01 inner01 = new Inner01();
        inner01.f1();
        inner01.f2();
    }
}

//5.外部其他类不能访问局部内部类->本质是局部变量
class wai{
//    Inner01 inner02 = new Inner01();
}
