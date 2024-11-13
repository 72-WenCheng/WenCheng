package com.gaoji.duiaixang;

/**
 * main方法
 * java虚拟机需要调用类的main()方法，所以该方法的访问权限必须是public
 * java虚拟机在执行main()方法时不必创建对象，所以该方法必须是static
 * main方法接收String类型的数组参数，该数组中保存执行java命令时传递给所运行的类的参数
 * 在main方法中我们可以直接调用所在类的静态属性/方法
 * 但是不能直接访问非静态成员，需要实例化对象调用
 */
public class day04 {
    public static void main(String[] args) {
        //设置动态传值
        for (int i = 0; i < args.length; i++) {
            System.out.println("第"+(i+1)+"个"+"="+args[i]);
        }
    }
}
