package com.itwang.anyclass;

import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.toString());
    }
}
