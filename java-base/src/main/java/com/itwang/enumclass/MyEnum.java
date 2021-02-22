package com.itwang.enumclass;

public class MyEnum {
    public static void main(String[] args) {
        /**
         * Enum类的主要方法
         *  1.values:返回枚举类型的对象数组,该方法可以很方便的遍历所有枚举值
         *  2.valuesOf(String str):可以把一个字符串转化成对应的枚举对象,要求字符串必须是枚举类对象的名字,如果不是,会有运行时异常
         *  3.toString():返回当前枚举类对象常量的名称
         */
        System.out.println(SeasonEnum.SPIING.toString());
        SeasonEnum[] values = SeasonEnum.values();
        SeasonEnum spiing = SeasonEnum.valueOf("SPIING");

    }
}

/**
 * 自定义枚举类
 *  1.私有化类的构造器,保证不能在类的外部创建对象
 *  2.在类的内部创建枚举类的实列,声明为public static final
 *  3.对象如果有实例变量,应该声明为private final ,并在构造器进行初始化
 */

//类的对象只有有限个,确定的
//枚举类的属性不应该被改动,所以应该使用private final修饰
//枚举类使用private final修饰的属性应该在构造器为其赋值
class Season{
    private final String SEASONNAME; //季节的名称
    private final String SEASONDESC; //季节描述

    private Season(String seasonname, String seasondesc) {
        this.SEASONNAME = seasonname;
        this.SEASONDESC = seasondesc;
    }

    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","春暖花开");
    public static final Season AUTUMN = new Season("秋天","春暖花开");
    public static final Season WINNER = new Season("冬天","春暖花开");
}

/**
 * 使用enum定义的枚举类默认继承了Enum类,因此不能在继承其他类
 * 枚举类的构造器只能使用private权限修饰符
 * 枚举类的所有实例必须在枚举类显示列出,列出的实例会自动添加public static final 修饰
 * 必须在枚举类的第一行声明枚举类对象
 *
 * Java1.5中Switch可以使用Enum定义的枚举类对象作为表达式,case也可以使用枚举值的名字,无需添加枚举类作为限定
 */
enum SeasonEnum{
    SPIING("春天","chun"),
    SUMMER("夏天","xia"),
    AUTUMN("秋天","qiu"),
    WINNER("冬天","dong");

    private final String SEASONNAME; //季节的名称
    private final String SEASONDESC; //季节描述

    private SeasonEnum(String seasonname, String seasondesc) {
        this.SEASONNAME = seasonname;
        this.SEASONDESC = seasondesc;
    }


    public String getSEASONNAME() {
        return SEASONNAME;
    }

    public String getSEASONDESC() {
        return SEASONDESC;
    }
}


