package com.algorithms;

import java.util.Arrays;

/**
 * @Author: wengrunyang
 * @Description: 选择排序
 * @DateTime: 2025/6/25 11:54
 **/
public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {2,4,5,3,1};
        selectionSort(nums);
    }
    private static void selectionSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }

}
