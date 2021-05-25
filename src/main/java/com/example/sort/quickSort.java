package com.example.sort;

import java.util.Arrays;

public class quickSort {
    public static void sort(int[] arr, int low, int high) {
        int i, j;
        int temp, compare;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        compare = arr[low];
        while (i < j) {
            //从右往左找小于基准值的下标，若大于--
            while (arr[j] >= compare && i < j) {
                j--;
            }
            //从左往右找大于基准值的下标，若小于，++
            while (arr[i] <= compare && i < j) {
                i++;
            }
//            while (compare >= arr[j] && i < j) {
//                j--;
//            }
//            while (compare <= arr[i] && i < j) {
//                i++;
//            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //交换基准值和i,j相遇的下标的值
        arr[low] = arr[i];
        arr[i] = compare;
        //遍历左边
        sort(arr, low, i - 1);
        //遍历右边
        sort(arr, i + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 9, 10, 4, 6, 12};
//        quickSort(arr, 0, arr.length - 1);
        sort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(a -> System.out.println(a));
    }

    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }
}
