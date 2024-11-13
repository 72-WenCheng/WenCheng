package com.jichu.changyongClass;

import java.util.Arrays;

/**
 * @author 彭文成
 * @version 1.0
 * System
 * exit 退出当前程序
 * arraycopy复制数组元素，适合底层调用
 * currentTimeMillis返回当前时间距离1970-1-1的毫秒数
 * gc运行垃圾回收机制System.gc()
 */
public class SystemClass {
    public static void main(String[] args) {
        System.out.println("---");
//        System.exit(0);

        int[] src = {1,2,3,};
        int[] dest = new int[3];
        System.arraycopy(src,0,dest,0,3);
        //原数组/初始索引/拷贝索引/拷贝多少个元素
        System.out.println(Arrays.toString(dest));

        System.out.println(System.currentTimeMillis());
    }
}
