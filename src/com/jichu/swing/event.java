package com.jichu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 彭文成
 * @version 1.0
 * 事件处理机制
 * 采取委派事件模型
 * 当事件发生时（事件源），产生事件对象，会把信息传递给事件监听者处理
 * java.awt.event事件类库里某个类创建的对象
 * 例如KeyEvent事件包含了被按下键code值
 */
@SuppressWarnings("all")
public class event extends JFrame{
    Mypanelevent mp = null;
    public static void main(String[] args) {
        event event = new event();
    }

    public event(){
        mp = new Mypanelevent();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);//让JFrame可以监听Mypanelevent发生的事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class Mypanelevent extends JPanel implements KeyListener {
    //初始化位置
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    //监听键盘字符
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按键按动触发
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char) e.getKeyCode()+"按下");
        if (e.getKeyCode() == KeyEvent.VK_DOWN){//向下的箭头对应code
            y++;
        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }

        //面板重绘
        this.repaint();
    }

    //按键释放触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
