package com.mian.duixiang;

/**
 * 汉诺塔
 */
public class xiangmu02 {
    public static void main(String[] args) {
        Nr nr = new Nr();
        nr.move(2,'A','B','C');
    }
}

class Nr{
    //num表示要移动的个数，a，b，c表示A，B，C塔
    public void move(int num, char a, char b, char c){
        //如果只有一个盘
        if (num == 1){
            System.out.println(a+"->"+c);
        }else {
            //如果有多个盘，可以看成两部分，最下面和上面所有的盘
            //先移动上面的所有盘到B，借助C
            move(num - 1,a,c,b);
            //把最下面的盘，移动到C
            System.out.println(a+"->"+c);
            //把B塔的所有盘，移动到C，借助A
            move(num - 1,b,a,c);
        }
    }
}
