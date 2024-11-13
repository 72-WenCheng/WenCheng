package com.zhongji.duixiang;

/**
 * 重写
 * 子类有一个方法和父类的某个方法的
 * 名称、返回类型（或者是父类返回类型的子类）
 * 例如父类Object，子类String，不能反过来，不兼容）、参数一样
 * 子类方法不能缩小父类方法的访问权限
 */
public class day04 {
    public void cry(){
        System.out.println("动物叫");
    }

    public Object m1(){
        return null;
    }

//    public String m2(){
//        return null;
//    }

    public AAA m3(){
        return null;
    }
}
