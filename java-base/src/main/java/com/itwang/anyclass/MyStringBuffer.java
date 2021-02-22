package com.itwang.anyclass;

public class MyStringBuffer {
    public static void main(String[] args) {
        //初始容量为16的字符串缓冲区
        StringBuffer buffer = new StringBuffer();
        //构造指定容量的字符串缓冲区
        StringBuffer buffer1 = new StringBuffer(16);
        //将内容初始化为指定字符串内容
        StringBuffer buffer2 = new StringBuffer("HELLO");

        //StringBuilder 效率高，线程不安全
    }
}
