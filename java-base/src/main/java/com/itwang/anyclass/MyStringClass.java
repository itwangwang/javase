package com.itwang.anyclass;

public class MyStringClass {
    public static void main(String[] args) {
        //字符串常量存储在字符串常量池，目的是共享
        String s1 = "abc";
        //字符串非常量对象存储在堆中
        String s2 = new String("abc");
        System.out.println(s1==s2);

        //常量和常量的拼接结果在常量池，且常量池不会出现相同的常量
        //只要一个是变量，结果就在堆中
        //如果拼接的结果调用intern(),返回值就在常量池中
        String intern = s2.intern();


    }
}
