package com.example;

/**
 * 跳转控制语句
 * break
 * 出现在多层嵌套的语句块中
 * 可以通过标签指明要终止哪里
 * continue
 * 结束本次循环，继续执行下一次循环，体现在while循环
 * return
 * 使用在方法，表示跳出所在的方法，如果在mian方法中，表示退出程序
 */
public class day16 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++){
//            if (i == 3){
//                break;
//            }
//            System.out.println("i="+i);
//        }

        //1-100内的数累加，求出当和第一次大于20的当前数
//        int sum = 0;
//        for (int i = 0; i <= 100; i++){
//            sum += i;
//            if (sum > 20){
//                System.out.println("满足条件i="+i);
//                break;
//            }
//        }

        //实现登录验证，有三次机会，如果用户名为“文成”，密码为123456，则登录成功
        //否则提示还有几次机会
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("欢迎进入登录系统！");
//            System.out.println("--------------");
//            System.out.println("请输入用户名：");
//            String name = scanner.next();
//            System.out.println("请输入密码：");
//            int passwd = scanner.nextInt();
//            if (name.equals("文成") && passwd == 123456) {
//                System.out.println("登录成功！");
//                break;
//            } else if(i < 3){
//                System.out.println("你还有" + (3 - i) + "次机会");
//            }else {
//                System.out.println("登录失败！");
//            }
//        }

        //
//        int i = 1;
//        while (i <= 4){
//            i++;
//            if (i == 2){
//                continue;
//            }
//            System.out.println("i="+i);
//        }
    }
}
