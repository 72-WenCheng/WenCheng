package com.example;

public class name02 {
    //一、基础语法
    //对象是类的一个实例，有状态和行为
    //类是一个模板，它描述一类对象的行为和状态
    //方法就是行为，一个类可以有很多方法。逻辑运算、数据修改以及所有动作都是在方法中完成的
    //每个对象都有独特的实例变量，对象的状态由这些实例变量的值决定
    //public访问修饰符 static关键字 void返回类型 main方法名(String[] args)
    //javac -encoding UTF-8 HelloWorld.java
    //大小写敏感，类名首字母应该大写，所有的方法名都应该以小写字母开头，源文件名必须和类名相同，所有的 Java 程序由 public static void main(String[] args) 方法开始执行
    //二、标识符
    //以首字母、$、_开头，任何字符组合
    //关键字不能用作标识符
    //标识符是大小写敏感的
    //三、修饰符
    //像其他语言一样，Java可以使用修饰符来修饰类中方法和属性
    //访问控制修饰符 : default, public , protected, private
    //非访问控制修饰符 : final, abstract, static, synchronized
    //四、变量
    //局部变量
    //类变量（静态变量）
    //成员变量（非静态变量）
    //五、数组
    //数组是储存在堆上的对象，可以保存多个同类型变量
    //六、枚举
    //Java 5.0引入了枚举，枚举限制变量只能是预先设定好的值
    //枚举可以单独声明或者声明在类里面。方法、变量、构造函数也可以在枚举中定义：enum
    //七、关键字
    //这些保留字不能用于常量、变量、和任何标识符的名称
    //访问控制：
    //private 私有的
    //protected 受保护的
    //public 公共的
    //default 默认
    //类、方法和变量修饰符：
    //abstract 声明抽象
    //class 类
    //extends 扩充、继承
    //final 最终值、不可改变的
    //implements 实现（接口）
    //interface 接口
    //native 本地、原生方法（非 Java 实现）
    //new 创建
    //static 静态
    //strictfp 严格浮点、精准浮点
    //synchronized 线程、同步
    //transient 短暂
    //volatile 易失
    //程序控制语句：
    //break 跳出循环
    //case 定义一个值以供 switch 选择
    //continue 继续
    //do 运行
    //else 否则
    //for 循环
    //if 如果
    //instanceof 实例
    //return 返回
    //switch 根据值选择执行
    //while 循环
    //错误处理：
    //assert 断言表达式是否为真
    //catch 捕捉异常
    //finally 有没有异常都执行
    //throw 抛出一个异常对象
    //throws 声明一个异常可能被抛出
    //try 捕获异常
    //包相关：
    //import 引入
    //package 包
    //基本类型：
    //boolean 布尔型
    //byte 字节型
    //char 字符型
    //double 双精度浮点
    //float 单精度浮点
    //int 整型
    //long 长整型
    //short 短整型
    //变量引用：
    //super 父类、超类
    //this 本类
    //void 无返回值
    //保留关键字：
    //goto 是关键字，但不能使用
    //const 是关键字，但不能使用
    //八、注释
    //1.// 2./*/
    //九、空行
    //空白行或者有注释的行，Java 编译器都会忽略掉
    //十、接口
    //在 Java 中，接口可理解为对象间相互通信的协议。接口在继承中扮演着很重要的角色，接口只定义派生要用到的方法，但是方法的具体实现完全取决于派生类
}
