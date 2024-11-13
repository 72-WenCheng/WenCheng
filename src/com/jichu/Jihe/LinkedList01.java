package com.jichu.Jihe;

/**
 * @author 彭文成
 * @version 1.0
 * LinkedList
 * 实现了双向链表和双端队列特点
 * 可以添加任意元素（元素可以重复），包括null
 * 线程不安全，没有实现同步
 * 底层操作机制：
 * 维护了一个双向链表
 * 维护两个属性first和last分别指向首节点和尾节点
 * 每个节点Node对象，里面又维护了prev、next、item三个属性
 * 其中perv指向前一个，通过next指向后一个节点，最终实现双向链表
 * 所以LinkedList的元素的添加删除不是通过数组完成的，相对来说效率较高
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node pwc = new Node("pwc");
        //连接三个节点，形成双向链表
        jack.next = tom;
        tom.next = pwc;
        pwc.pre = tom;
        tom.pre = jack;

        Node first = jack;//first指向jack，头
        Node last = pwc;//last指向pwc.尾

        //从头遍历
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        System.out.println("------------");
        //从尾遍历
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        System.out.println("------------");
        //添加对象/数据
        Node smith = new Node("smith");
        smith.next = pwc;
        smith.pre = tom;
        pwc.pre = smith;
        tom.next = smith;
        first = jack;
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}
//Node表示链表的一个节点
class Node{
    public Object item;//存储数据
    public Node next;//前节点
    public Node pre;//后节点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = "+ item;
    }
}
