package com.itwang.extend;

import java.util.Random;

public class Man extends Person{
    public String name = "张三";

    public void hi(){
        System.out.println("我是子类");
    }

}

class Test{
    public static void main(String[] args) {
        Person person = new Man();
        person.hi();
        System.out.println(person.name);
        String str = "i";
        String str2 = new String("i");
        System.out.println(str == str2);
        String s = "abc";
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();

    }
}
