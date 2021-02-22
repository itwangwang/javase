package com.itwang.anyclass;

import java.util.Calendar;
import java.util.Date;

public class MyCalendar {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        //从一个Calendar对象中获取Date对象
        System.out.println(instance.getTime());
        //使用给定的Date设置此Calendar的时间
        Date date = new Date(2342345464564L);
        instance.setTime(date);
        //获取月份时，一月是0
        //获取星期时，周日是1
        instance.set(Calendar.DAY_OF_MONTH,8);

        //格式化只对Date有用，而对Calendar不行
        //他们不是线程安全的，不能处理闰秒

        //LocalDate LocalTime LocalDateTime
        //LocalDate(yyyy-MM-dd)的日期
    }
}
