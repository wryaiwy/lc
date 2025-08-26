package com.algorithms;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author: wry
 * @Description: 快速排序
 * @DateTime: 2025/6/18 20:36
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[1000000];
        Random r = new Random();
        for(int i=0; i<arr.length;i++) {
           arr[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        quickSort(arr,0, arr.length-1);
        long end = System.currentTimeMillis();
        long runTime = end - start;
        System.out.println("运行时间：" + runTime + "ms");
    }

    /*
    * 参数一：要排序的数组
    * 参数二：要排序数组的起始索引
    * 参数三：要排序数组的结束索引
    *
    * */
    private static void quickSort(int[] arr,int i,int j){
        // 定义两个变量记录要查找的范围
        int start = i;
        int end = j;

        // 递归的出口
        if(start > end){
            return;
        }

        // 记录基准数
        int baseNumber = arr[i];

        // 利用循环找到要交换的数字
        while(start != end){
            // 利用end从后往前开始找，找比基准数小的数字
            while(true){
                if(end <= start || arr[end] < baseNumber){
                    break;
                }
                end--;
            }
            // 利用start，从前往后找，找比基准数大的数字
            while(true){
                if(end <= start || arr[end] > baseNumber){
                    break;
                }
                start++;
            }
            // 把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        // 当start和end指向了同一个元素的时候，那么上面的循环就会结束
        // 表示已经找到了基准数在数组中应存入的位置
        // 基准数归位
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        // 确定6左边的范围，重复刚刚所做的事情
        quickSort(arr,i,start-1);

        // 确定6右边的范围，重复刚刚所做的事情
        quickSort(arr,start+1,j);


    }





}
