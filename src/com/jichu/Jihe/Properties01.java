package com.jichu.Jihe;

import java.util.Properties;

/**
 * @author 彭文成
 * @version 1.0
 * Properties类继承自Hashtable类
 * 也是使用键值对的形式来保存数据
 * 还可以用于从xxx.properties文件中加载数据到类对象，并进行读取和修改
 * xxx.properties文件通常作为配置文件
 */
public class Properties01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john",100);
//        properties.put("john",null);
        properties.put("lic",100);
        properties.put("lic",10);
        System.out.println("properties="+properties);
    }
}
