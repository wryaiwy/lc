package com.algorithms;

import java.util.Arrays;

/**
 * @Author: wry
 * @Description: 插入排序
 * @DateTime: 2025/6/24 18:45
 **/
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr =  {3,1,6,2,9,0,7,4,8,5};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr){
        int startIndex = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>arr[i+1]){
                //找到无序的哪一组数组是从哪个索引开始的
                startIndex = i+1;
                break;
            }
        }

        for(int i=startIndex;i<arr.length;i++){
            //记录当前要插入数据的索引
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
