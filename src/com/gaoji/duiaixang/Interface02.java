package com.gaoji.duiaixang;

public class Interface02 {
    public static void main(String[] args) {
        new C().pX();
    }
}

interface A{
    int x = 2;
}

class B{
    int x = 1;
}

class C extends B implements A{
    public void pX(){
//        System.out.println(x);//不能识别
        System.out.println(A.x);
        System.out.println(super.x);
    }
}