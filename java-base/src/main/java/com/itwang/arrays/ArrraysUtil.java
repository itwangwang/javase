package com.itwang.arrays;

import java.util.Arrays;

public class ArrraysUtil {
    public static void main(String[] args) {
        //equals 判断两个数组是否相等
        //toString 输出数组信息
        //fill 将指定值填充到数组之中
        //sort 对数组进行排序
        //binarySearch 对排序后的数组进行二分法检索指定的值
        int[] a = new int[]{1,5,4};
//        Arrays.fill(a,1);
//        Arrays.fill(a,2);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
