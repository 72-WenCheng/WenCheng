package com.mian.duixiang;

/**
 * 方法的传参机制
 * 对于基本数据类型，是值传递，形参的任何改变不影响实参
 * 引用数据类型是引用传递，地址改变则会影响实参
 * 类同理
 */
public class day02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        BB bb = new BB();
        bb.swap(a,b);
        //值传递
        System.out.println("---------");
        System.out.println("值传递 ");
        System.out.println("main方法中的"+"a="+a+" "+"b="+b);

        CC cc = new CC();
        int[] arr = {1,2,3};
        cc.test(arr);
        System.out.println("mian方法里面的数组");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("----------");

        //不同类调用方法
        Per per = new Per();
        List list = new List();
        per.name = "小明";
        per.age = 18;
        list.gaibian(per);
        System.out.println(per.age);
        System.out.println(per.name);
    }
}

class BB{
    public void swap(int a,int b){
        System.out.println("交换前");
        System.out.println("a="+a+" "+"b="+b);
        System.out.println("-------------");
        //设置temp临时变量
        int temp = a; //把a赋值给temp临时存放
        a = b; //把b赋值给a
        b = temp; //此时就交换了a与b的值
        System.out.println("交换后");
        System.out.println("引用传递");
        System.out.println("a="+a+" "+"b="+b);
    }
}

class CC{
    public void test(int[] arr){
        System.out.println("------------");
        //修改元素
        arr[0] = 100;
        System.out.println("test里面的数组");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}

class Per{
    String name;
    int age;
}

class List{
    public void gaibian(Per Pr){
        //修改属性
        Pr.age = 19;
        //定义对象为空
        Pr = null;
        //重新给对象分配空间
        Pr = new Per();
        Pr.name = "小米";
        Pr.age = 20;
    }
}

