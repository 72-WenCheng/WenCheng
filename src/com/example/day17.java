package com.example;

/**
 * 数组Array
 * 可以存放多个同一类型的数据，数组也是一种数据类型（引用类型）
 * 动态初始化1
 * 数据类型 [] array = new 数据类型[index] 或 数据类型[] array = new 数据类型[index] 或 数据类型 [] array = new 数据类型[index]
 * int[] array = new array[index]
 * int array[] = new array[index]
 * int [] array = new array[index]
 * 动态初始化2
 * 先声明：数据类型[] array 或 数据类型 array[]
 * 后分配空间：array = new 数据类型[index]
 * 静态初始化
 * 数据类型[] array = {常量1，常量2...}
 * 注意的细节
 * 数组是可以存放多个同一类型的数据的组合，实现对这些数据的统一管理
 * 数组中的元素可以是任何数据类型，包括基本类型和引用类型
 * 数组创建后，如果没有赋值，具有默认值：int 0/short 0/byte 0/long 0/float 0/double 0/char u000 /boolean false/String null
 * 数组的索引是从0开始的，如果超出范围会报错，越界
 * 数组型数据是对象（object）
 */
public class day17 {
    //统计六只鸡的总体重和均体重
    //3、5、15、65、12、55kg
    //思路：定义六个变量double，求和，平均体重=和/6
    public static void main(String[] args) {
//        double ji1 = 3;
//        double ji2 = 5;
//        double ji3 = 15;
//        double ji4 = 65;
//        double ji5 = 12;
//        double ji6 = 55;
//        double sum = ji1+ji2+ji3+ji4+ji5+ji6;
//        double sumpiung = sum/6;
//        System.out.println("总体重："+sum);
//        System.out.println("均体重："+sumpiung);

        //代码繁琐，利用数组
        //初始化一个double类型的数组
//        double [] hens = {3,5,15,65,12,55};
//        //遍历数组：得到数组所有元素的和
//        //通过hens[index索引]来访问数组的元素，下标从0开始
//        double sumpiung = 0;
//        for (int i = 0; i < 6; i++){
//            System.out.println("第"+(i+1)+"个元素的值="+hens[i]);
//            sumpiung += hens[i];
//        }
//        System.out.println("总体重："+sumpiung);
//        System.out.println("均体重："+sumpiung/6);

        //动态初始化1
//        double[] scores = new double[5];
//        for (int i = 0; i < scores.length; i++){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("请录入第"+(i+1)+"位同学的成绩：");
//            scores[i] = scanner.nextDouble();
//        }
//        System.out.println("该班的成绩单");
//        System.out.println("--------------");
//        for (int i = 0; i < scores.length; i++){
//            System.out.println("该第"+(i+1)+"位的同学成绩为："+scores[i]);
//        }

        //动态初始化2
//        double[] scores;
//        scores = new double[5];

        //练习题1
        //创建一个char类型的26个元素的数组，分别放置A-Z，使用for循环把所有元素打印出来
//        char[] array = new char[26];
//        for (int i = 0; i < array.length; i++){
//            //char 是 char[]数组
//            //char[] 是 char类型
//            array[i] = (char)('A' + i);
//        }
//        System.out.println("===char数组===");
//        for (int i = 0; i<array.length; i++){
//            System.out.println((char)array[i]);
//        }

        //练习题2
        //请求出一个数组int[]的最大值{4,-1,9,10,23}
//        int[] array = {4,-1,9,10,23};
//        int max = array[0];
//        for (int i = 1; i < array.length; i++){
//            if(max < array[i]){
//                max = array[i];
//            }
//        }
//        System.out.println("最大值为"+max);
    }
}
