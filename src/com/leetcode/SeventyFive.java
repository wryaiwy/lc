package com.leetcode;

import java.util.Arrays;

/**
 * @Author: wry
 * @Description: 颜色分类
 * @DateTime: 2025/6/17 23:06
 **/
public class SeventyFive {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        bubbleSort(nums);
    }

    /**
     * 冒泡排序
     * @param nums
     */
    private static void bubbleSort(int[] nums){
        int temp;
        boolean flag = true;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) {
                break;
            }else{
                flag = true;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     * TODO
     * 三指针
     */

}
