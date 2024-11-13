package com.jichu.Jihe;

/**
 * @author 彭文成
 * @version 1.0
 * 不能添加重复元素的底层机制HashMap...
 * 数组+链表+红黑树
 */
public class HashSet02 {
    public static void main(String[] args) {
        //模拟简单的数组+链表结构
        Nodes[] table = new Nodes[10];//也称表
        Nodes john = new Nodes("john",null);
        table[2] = john;
        Nodes jack = new Nodes("jack",null);
        john.next = jack;
        System.out.println("table="+table);
    }
}
class Nodes{//创建结点，存储数据
    Object item;//存放数据
    Nodes next;//指向下一个节点

    public Nodes(Object item, Nodes next) {
        this.item = item;
        this.next = next;
    }
}
