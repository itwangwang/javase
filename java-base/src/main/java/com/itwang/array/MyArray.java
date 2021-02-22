package com.itwang.array;

import javax.xml.bind.annotation.XmlID;

public class MyArray {
    public static void main(String[] args) {
        int i;
        //数组的声明
        int[] a;
        //数组的动态初始化
        a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
//        a[3] = 4; //运行时异常 ArrayIndexOutOfBoundsException

        //数组的静态初始化
        int[] b = new int[] {1,2,3};
        int[] c = {1,2,3};

        int[] d = {1,8,45,12,8,20,50};
//        BubbleSort(d);
//        for (i=0;i<d.length;i++){
//            System.out.println(d[i]);
//        }
//        System.out.println(Search(d));
//        System.out.println("查找元素的下标为:" + BSerarch(d, 12));
//        int[] e = {1,8,45,12,8,20,50};
//        QuickSort(e,0,e.length-1);
//        for (i=0;i<e.length;i++){
//            System.out.println(e[i]);
//        }

        //二维数组的动态初始化
        int[][] arr = new int[3][4];
        int[][] arr2 = new int[3][];
        arr2[0] = new int[3];
        //静态初始化
        int[][] arr3 = new int[][]{{3,8,2},{1,1,1,}};
        int[][] arr4 = {{3,8,2},{1,1,1,}};

        randomMax();

        //数组中的常见异常
        //数组下标越界异常
        //空指针异常
    }

    static void BubbleSort(int[] a){
        int i,j,temp;
        for (i=a.length-1; i>=1; i--){
            int flag = 0;
            for (j=0;j<i;j++){
                if (a[j] > a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    flag = 1;
                }
            }
            if (flag == 0){
                return;
            }
        }
    }

    //查找数组中的最大值
    static int Search(int[] a){
        int i,max=0;
        for (i=0;i<a.length;i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    //数组的二分法查找
    static int BSerarch(int[] a, int k){
        int low = 0;
        int hign = a.length-1;
        int mid = -1;
        while (low <= hign){
            mid = (low+hign) / 2;
            if (a[mid] == k){
                return mid;
            }else if (a[mid] > k){
                low = mid + 1;
            }else {
                hign = mid -1;
            }
        }
        return mid;
    }

    //快速排序
    static void QuickSort(int[] a,int low, int hign){
        int temp;
        int i = low, j = hign;
        if (low < hign){
            temp = a[low];
            while(i < j){
                while(i<j && a[j] >=temp){
                    --j;
                }
                if(i<j){
                    a[i] = a[j];
                    ++i;
                }
                while(i<j && a[i] < temp){
                    ++i;
                }
                if (i<j){
                    a[j] = a[i];
                    --j;
                }
            }
            a[i] = temp;
            QuickSort(a,low,i-1);
            QuickSort(a,i+1,hign);
        }
    }

    //直接插入排序
    static void InsertSort(int[] a){
        int i,temp,j;
        for (i=1;i<a.length;i++){
            temp = a[i];
            j = i-1;
            while (j>=0 && temp<a[j]) {
                    a[j+1] = a[j];
                    --j;
            }
            a[j] = temp;
        }
    }

    //定义一个int型的一维数组，包含10个元素，分别赋一些随机数，求出所有元素的最大值
    //要求所有的随机数都是整数
    static void randomMax(){
        int i;
        int[] a = new int[10];
        for (i=0; i<10; i++){
            a[i] = (int) (Math.random() * 90 + 10);
        }
        for (i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }
}
