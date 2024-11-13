package com.TankeItem;

import javax.swing.*;

/**
 * @author 彭文成
 * @version 1.0
 */
public class Game extends JFrame {
    MyPa mp = null;
    public static void main(String[] args) {
        Game game = new Game();
    }

    public Game(){
        MyPa mp = new MyPa();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
