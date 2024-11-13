package com.jichu.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 彭文成
 * @version 1.0
 * 泛型的继承和通配符
 * 泛型不具备继承性
 * List<Object> list = new ArrayList<String>();
 * <?>支持任意泛型类
 * <? extends A>支持A类的子类，规定了泛型的上线
 * <? super A>支持A类以及A类的父类，不限于直接父类，规定了泛型的下限
 */
public class generic07 {
    public static void main(String[] args) {
//        List<Object> list = new ArrayList<String>();

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BBB> list4 = new ArrayList<>();
        List<CCC> list5 = new ArrayList<>();

        printCollection01(list1);
        printCollection01(list2);
        printCollection01(list3);
        printCollection01(list4);
        printCollection01(list5);

//        printCollection02(list1);
//        printCollection02(list2);
        printCollection02(list3);
        printCollection02(list4);
        printCollection02(list5);

        printCollection03(list1);
//        printCollection03(list2);
        printCollection03(list3);
//        printCollection03(list4);
//        printCollection03(list5);
    }

    public static void printCollection01(List<?> c){
        for (Object obj : c){
            System.out.println(obj);
        }
    }

    public static void printCollection02(List<? extends AAA> c){
        for (Object obj : c){
            System.out.println(obj);
        }
    }

    public static void printCollection03(List<? super AAA> c){
        for (Object obj : c){
            System.out.println(obj);
        }
    }
}

class AAA{}
class BBB extends AAA{}
class CCC extends BBB{}