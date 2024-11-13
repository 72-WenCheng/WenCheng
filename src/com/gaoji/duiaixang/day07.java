package com.gaoji.duiaixang;

/**
 * final
 * 修饰类、属性、方法和局部变量
 * 场景：
 * 当不希望被继承时
 * 当不希望父类的某个方法被子类覆盖/重写
 * 当不希望类的某个属性值被修改
 * 当不希望局部变量被修改
 * 细节：
 * final修饰的属性又叫常量，一帮用xx_xx来命名
 * 在定义时必须赋初始值，并且以后不能再修改：定义、构造器、代码块
 * 如果是静态的，只能再定义时、静态代码块中初始化
 * 可以实例化对象
 * 如果类不是final类，但是含有final方法，则该方法虽然不能重写，但可以被继承
 * 一般来说，如果一个类已经是final类了，就没有必要将方法修饰成final
 * final不能修饰构造方法
 * final和static往往搭配使用，效率更高，底层编译器做了优化处理（类不会被加载）
 * 包装类（Integer，Double，Float，Boolean、等都是final类）String也是
 *
 */
public class day07 {
    public static void main(String[] args) {
//        E e = new E();
//        e.num = 0.1;
    }
}

//final class A{}
//class B extends A{}

//class C{
//    public final void hi(){}
//}

//class D extends C{
//    @Override
//    public void hi() {
//        super.hi();
//    }
//}

//class E{
//    public final double num = 1;
//}

//class F{
//    public void cry(){
//        final double gr = 0.11;
//        gr = 0.111;
//    }
//}
