package com.zhongji.duixiang;

/**
 * Object类
 * ==和equals的对比
 * ==既可以判断基本类型（判断值是否相等），又可以判断引用类型（判断地址是否相等）
 * equals是Object类中的方法，只能判断引用类型
 * 默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等
 * idea如何查看jdk源码
 * 一般来说idea配置好jdk以后，jdk的源码也自动配好
 * 如果没有点击File - Project Stucture - SDKs - Sourcepath
 * 光标放在方法，ctrl+b
 */
public class day06 {
    public static void main(String[] args) {
        A a = new A();
        A b = a; //地址拷贝，相当于b也指向了a在堆开辟的空间
        A c = b;
        System.out.println(a == c);
        System.out.println(b == c);

        B obj = a;
        System.out.println(obj == c); //由于B继承了A，所以也为true
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);

        "hello".equals("w"); //子类String重写了equals方法，判断字符串值是否相等

        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        //包装类Integer值相等，地址不相等，同理重写了equals方法
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));

        String str1 = new String("pwc");
        String str2 = new String("pwc");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    //Object的源代码
//    public boolean equals(Object obj){
//        return (this == obj);
//    }

    //Integer的源代码
//    public boolean equals(Object obj){
//        if(obj instanceof Integer){
//            return value == ((Integer)obj).intValue();
//        }
//        return false;
//    }

}
class B{

}

class A extends B{

}
