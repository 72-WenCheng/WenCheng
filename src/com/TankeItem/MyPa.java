package com.TankeItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 彭文成
 * @version 1.0
 */
//为了让Panel不停重绘子弹，看到移动的效果，需要MyPa实现Runnable，当作一个线程使用
public class MyPa extends JPanel implements KeyListener,Runnable {
    //定义我的坦克
    Hero hero = null;
    //定义敌人坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTanksSiza = 20;
    //定义炸弹
    Vector<Bomb> bombs = new Vector<>();
    //定义炸弹效果
    Image image01 = null;
    Image image02 = null;
    Image image03 = null;

    public MyPa(){
        //初始化

        hero = new Hero(900,500);

        for (int j = 0; j < enemyTanksSiza; j++) {
            EnemyTank enemyTank = new EnemyTank(((int)(Math.random() * 30) * (j + 1)), (int)(Math.random() * 500));//创建
            enemyTank.setDirection(2);//设置方向
            new Thread(enemyTank).start();//启动敌方坦克线程
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirection());//加入子弹
            enemyTank.shots.add(shot);//加入到集合
            new Thread(shot).start();//启动shot对象
            enemyTanks.add(enemyTank);//加入到集合
        }

        image01 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb1.jpeg"));
        image02 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb2.jpeg"));
        image03 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb3.jpeg"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形

        if (hero != null && hero.isLive){
            //画出自己的坦克
            drawTank(hero.getX(),hero.getY(),g,hero.getDirection(),0);
        }

        //遍历，画出敌方坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLive) {//存活再绘制坦克
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);
                //画出enemyTank所有的子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //取出子弹
                    Shot shot = enemyTank.shots.get(j);
                    //绘制
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 2, 2, false);
                    } else {
                        //移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }

        //画出hero子弹
//        if (hero.shot != null && hero.shot.isLive){
//            g.draw3DRect(hero.shot.x,hero.shot.y,2,2,false);
//        }

        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive){
                g.draw3DRect(shot.x,shot.y,2,2,false);
            }else {
                hero.shots.remove(shot);
            }
        }

        //画出炸弹as
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据生命周期
            if (bomb.life > 6){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(image01, bomb.x, bomb.y, 60, 60, this);
            }else if (bomb.life > 3){
                g.drawImage(image02, bomb.x, bomb.y, 60, 60, this);
            }else {
                g.drawImage(image03, bomb.x, bomb.y, 60, 60, this);
            }
            bomb.lifeDown();
            //life=0，集合移除
            if (bomb.life == 0){
                bombs.remove(bomb);
            }
        }
    }

    //定义坦克形状、类型、方向
    public void drawTank(int x,int y, Graphics g, int direction, int type){
        switch (type){
            case 0://己方坦克颜色
                g.setColor(Color.cyan);
                break;
            case 1://敌方坦克颜色
                g.setColor(Color.yellow);
                break;
        }

        //绘制
        switch (direction){
            case 0://己方坦克向上
                g.fill3DRect(x, y,10,60,false);
                g.fill3DRect(x+30, y,10,60,false);
                g.fill3DRect(x+10, y+10,20,40,false);
                g.fillOval(x+10, y+20, 20, 20);
                g.drawLine(x+20, y+30, x+20, y-10);
                break;
            case 1://己方坦克向右
                g.fill3DRect(x, y,60,10,false);
                g.fill3DRect(x, y+30,60,10,false);
                g.fill3DRect(x+10, y+10,40,20,false);
                g.fillOval(x+20, y+10, 20, 20);
                g.drawLine(x+30, y+20, x+70, y+20);
                break;
            case 2://己方坦克向下
                g.fill3DRect(x, y,10,60,false);
                g.fill3DRect(x+30, y,10,60,false);
                g.fill3DRect(x+10, y+10,20,40,false);
                g.fillOval(x+10, y+20, 20, 20);
                g.drawLine(x+20, y+30, x+20, y+70);
                break;
            case 3://己方坦克向左
                g.fill3DRect(x, y,60,10,false);
                g.fill3DRect(x, y+30,60,10,false);
                g.fill3DRect(x+10, y+10,40,20,false);
                g.fillOval(x+20, y+10, 20, 20);
                g.drawLine(x+30, y+20, x-10, y+20);
                break;
            default:
                System.out.println("其他不做处理");
        }
    }

    //判断多颗子弹
    public void hitEnemyTank(){
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            //重绘之前判断子弹是否击中了敌方
            if (shot != null && shot.isLive){
                //子弹存活，遍历敌方坦克
                for (int j = 0; j < enemyTanks.size(); j++) {
                    EnemyTank enemyTank = enemyTanks.get(j);
                    hitTank(shot, enemyTank);
                }
            }
        }
    }

    //定义我方子弹是否击中敌方、创建爆炸效果对象
    public void hitTank(Shot s, Tank enemyTank){
        switch (enemyTank.getDirection()){
            case 0:
            case 2:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    //定义方法，判断敌人坦克是否击中我方
    public void hitHero(){
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (hero.isLive && shot.isLive){
                    hitTank(shot, hero);
                }
            }
        }
    }

    //监听移动wdsa
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){
            hero.setDirection(0);
//            hero.setY(hero.getY()-1);
            if (hero.getY() > 0){
                hero.moveUP();
            }
        }else if(e.getKeyCode() == KeyEvent.VK_D){
            hero.setDirection(1);
            if (hero.getX() + 100 < 1000){
                hero.moveRight();
            }
        }else if(e.getKeyCode() == KeyEvent.VK_S){
            hero.setDirection(2);
            if (hero.getY() + 120 < 750){
                hero.moveDown();
            }
        }else if(e.getKeyCode() == KeyEvent.VK_A){
            hero.setDirection(3);
            if (hero.getX() > 0){
                hero.moveLeft();
            }
        }

        //按下J键，发射子弹
        if (e.getKeyCode() == KeyEvent.VK_J){
            //判断hero子弹是否销毁（一颗子弹情况）
//            if (hero.shot == null || !hero.shot.isLive){
//                hero.shotEnemyTank();
//            }

            hero.shotEnemyTank();
        }

        //面板重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //每隔100毫秒重绘区域
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hitEnemyTank();
            hitHero();
            this.repaint();
        }
    }
}
