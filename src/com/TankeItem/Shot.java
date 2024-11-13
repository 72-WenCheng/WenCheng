package com.TankeItem;

/**
 * @author 彭文成
 * @version 1.0
 */
public class Shot implements Runnable{
    public int x;
    public int y;
    public int direct;//子弹方向
    private static final int speed = 20;//子弹速度
    public boolean isLive = true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true){
            //延迟子弹射击
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //根据坦克方向改变子弹x，y坐标
            switch (direct){
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
            }

            //当子弹移动到面板边界时，就应该销毁（子弹线程销毁）
            //当子弹击中敌方坦克，也销毁
            if (!(x >= 0 && x <= 1000 && y >=0 && y <= 750 && isLive)){
                isLive = false;
                break;
            }

            //参数测试
            System.out.println("x="+x+"y="+y);
        }
    }
}
