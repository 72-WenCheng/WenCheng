package com.jichu.swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author 彭文成
 * @version 1.0
 * java绘图坐标体系
 * 计算机在屏幕显示的内容都是由屏幕上的每一个像素组成的
 * 例如分辨率800x600
 * 表示每一行由800个点组成，共有600行
 * 整个计算机就有480000个像素
 * 像素是一个密度单位
 * 绘图原理：
 * Component类提供了两个和绘图相关的方法
 * paint(Graphics g)绘制组件的外观
 * repaint()刷新组件的外观
 * 当组件第一次在屏幕显示的时候，程序会自动的调用paint()方法来绘制组件
 * 在以下情况paint()将会被调用：
 * 窗口最小化，再最大化
 * 窗口大小发生变化
 * repaint函数被调用
 * Graphics类
 * 提供各种绘图的方法
 */
public class DrawCircle extends JFrame{//继承JFrame，窗口类
    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序");
    }

    //定义一个面板
    private MyPanel mp = null;
    //初始化面板
    public DrawCircle(){
        mp = new MyPanel();
        //把面板放入到窗口
        this.add(mp);
        //设置大小
        this.setSize(400,300);
        //可视化
        this.setVisible(true);
        //释放
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//面板，继承JPanel
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {//Graphics，理解为画笔，提供各种绘制图形的方法
        super.paint(g);//调用父类构造器，完成初始化

        //画出一个圆形
        g.drawOval(10,10,100,100);//矩形配合的圆/椭圆w=h
        System.out.println("paint被调用");

        //画直线
        g.drawLine(10,10,100,100);

        //矩形边框
        g.drawRect(10,10,100,100);

        //填充矩形
        g.setColor(Color.blue);
        g.fillRect(10,10,10,10);

        //填充椭圆
        g.setColor(Color.blue);
        g.fillOval(90,90,10,100);

        //图片
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/图片.png"));
//        g.drawImage(image,50,50,150,100,this);

        //字符串
        g.setColor(Color.BLACK);
        g.setFont(new Font("宋体",Font.BOLD,50));
        g.drawString("北京",100,100);
    }
}
