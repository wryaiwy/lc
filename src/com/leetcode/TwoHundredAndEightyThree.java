package com.leetcode;

import java.util.Arrays;

/**
 * @Author: wry
 * @Description: 移动零
 * @DateTime: 2025/6/17 23:30
 **/
public class TwoHundredAndEightyThree {

    public static void main(String[] args) {
        int[] nums = {0,1,0,0,3,12};
        //bubbleSort(nums);
        doublePointer(nums);
    }

    /**
     * 冒泡排序
     * @param nums
     */
    private static void bubbleSort(int[] nums){
        long runTime = System.nanoTime();
        int temp;
        boolean flag = true;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]==0 && nums[j+1] != 0){
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
        System.out.println(Arrays.toString(nums) + "\n" +runTime);
    }

    /**
     * TODO
     * 双指针
     */
    private static void doublePointer(int[] nums){
        long startTime = System.nanoTime();
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        while(index<nums.length){
            nums[index++] = 0;
        }
        long runTime = System.nanoTime()-startTime;
        System.out.println(Arrays.toString(nums) + "\n" + runTime);
    }

}
