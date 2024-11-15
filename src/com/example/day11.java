package com.example;

/**
 * 进制
 * 对于整数有四种表示方式
 * 二进制
 * 0，1 满2进1，以0b或0B开头
 * 十进制
 * 0-9 满10进1
 * 八进制
 * 0-7 满8进1，以数字0开头表示
 * 十六进制
 * 0-9以及A(10)-F(15)，满16进1，以0x或0X开头表示
 */
public class day11 {
    public static void main(String[] args) {
        int n1 = 0b1010;
        int n2 = 1010;
        int n3 = 071;
        int n4 = 0x1015;
        System.out.println("n1:"+n1);
        System.out.println("n2:"+n2);
        System.out.println("n3:"+n3);
        System.out.println("n4:"+n4);
        //二进制转十进制
        //0b1011 = 1*2的0次方 + 1*2的1次方 + 0*2的2次方 + 1*2的3次方 = 11

        //八进制转十进制
        //0234 = 4*8的0次方 + 3*8的1次方 + 2*8的2次方 = 156

        //十六进制转十进制
        //0x23A = 10*16^0 + 3*16^1 + 2*16^2 =

        //十进制转二进制
        //将该数不断除以2，直到商为0，然后将余数倒过来

        //十进制转八进制
        //将该数不断除以8，直到商为0，然后将余数倒过来

        //十进制十六进制
        //将该数不断除以16，直到商为0，然后将余数倒过来

        //二进制转成八进制
        //从低位开始，将二进制数每三位一组，转成对应的八进制数即可

        //二进制转成十六进制
        //从低位开始，将二进制数每四位一组，转成对应的十六进制数即可

        //八进制转成二进制
        //将八进制数每1位，转成对应的一个三位的二进制数即可

        //十六进制转成二进制
        //将十六进制数每1位，转成对应的一个四位的二进制数即可
    }
}
