package com.itwang.anyclass;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator {
    public static void main(String[] args) {
        Goods[] all = new Goods[4];
        all[0] = new Goods("红楼梦",100);
        all[1] = new Goods("红楼",10);
        all[2] = new Goods("红",10);
        all[3] = new Goods("",1);

        Arrays.sort(all);
        System.out.println(Arrays.toString(all));

        //方法二，定制排序Comparator
        //重写compare方法
        Arrays.sort(all, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}

class Goods implements Comparable {
    private String name;
    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //现在comparable的类必须实现compareTo方法，如果当前对象this大于形参对象obj，则返回正整数，如果当前对象this<则返回负整数
    //实现comparable对象可以通过Collections.sort获取Arrays.sort进行排序，无需指定比较器

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods other = (Goods) o;
            if (this.price > other.price){
                return 1;
            }else if (this.price < other.price){
                return -1;
            }
            return 0;
        }
        throw new RuntimeException("输入的数据类型不一致");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
