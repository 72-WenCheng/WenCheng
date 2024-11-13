package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 * 枚举enum
 * 是一组常量的集合
 * 属于一种特殊的类，里面只包含一组有限的特定对象
 * 1）自定义类实现枚举
 * 构造器私有化
 * 不需要提供set方法
 * 使用static+final修饰
 * 在本类中声明对象，对象名大写
 * 可以拥有多个属性
 * 2）使用关键字enum
 * 默认继承Enum类，使用javap工具演示
 * 简化静态常量对象名()，多个用‘，’间隔
 * 如果使用无参构造器创建枚举对象，则实参列表和小括号省略
 * 枚举对象必须放在枚举类的行首
 * 细节：
 * 使用enum关键字后，就不能再继承其他类，因为会隐式继承Enum类
 * 由于单继承模式
 * 枚举类和普通类一样，可以实现接口
 */
public class Enumeration {
    public static void main(String[] args) {
//        Season spring = new Season("春天","温暖");
//        Season winter = new Season("冬天","寒冷");
        //对于季节，只有春夏秋冬
        //只读，不能修改
        System.out.println(Season.SPRING);
        System.out.println(Season.WINTER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SUMMER);

        System.out.println(Season02.SPRING02);
        System.out.println(Season02.WINTER02);
        System.out.println(Season02.AUTUMN02);
        System.out.println(Season02.SUMMER02);
    }
}

class Season{
    private String name;
    private String desc;

    //
    public static final Season SPRING = new Season("春天","温暖");
    public static final Season WINTER = new Season("冬天","温暖");
    public static final Season AUTUMN = new Season("秋天","凉爽");
    public static final Season SUMMER = new Season("夏天","炎热");

    //构造方法私有化，防止直接new
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    //属性不能修改
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDesc() {
        return desc;
    }

//    public void setDesc(String desc) {
//        this.desc = desc;
//    }


    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

enum Season02{
    SPRING02("春天","温暖"),
    WINTER02("春天","温暖"),
    AUTUMN02("春天","温暖"),
    SUMMER02("春天","温暖"),
    Wath;

    private String name;
    private String desc;

    Season02() {
    }

    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}