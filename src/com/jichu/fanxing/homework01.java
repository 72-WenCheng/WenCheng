package com.jichu.fanxing;

import org.junit.Test;

import java.util.List;

/**
 * @author 彭文成
 * @version 1.0
 */
public class homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        Dao<User> dao = new Dao<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(1,10,"mai"));

        List<User> list = dao.list();
        System.out.println("list="+list);

        dao.update("002",new User(1,18,"milan"));
        list = dao.list();
        System.out.println("list="+list);

        dao.delete("001");
        list = dao.list();
        System.out.println("list="+list);

        System.out.println("id=002："+dao.get("002"));
    }
}



