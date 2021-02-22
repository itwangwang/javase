package com.itwang.anyclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MySimpleDateFormat {
    public static void main(String[] args) {
        //格式化
//        SimpleDateFormat format = new SimpleDateFormat();//默认的模式和语言环境创建对象
//        new SimpleDateFormat(String pattern); //用参数指定的格式创建一个对象
        //方法格式化时间对象date
//        format.format(Date date);
        //从给定字符串的开始解析文本，以生成一个日期
//        format.parse(String source);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(simpleDateFormat.format(date));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 EEE HH:mm:ss");
        System.out.println(simpleDateFormat1.format(date));

        try {
            Date date1 = simpleDateFormat1.parse("2021年02月22日 星期一 08:55:58");
            System.out.println(date1.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
