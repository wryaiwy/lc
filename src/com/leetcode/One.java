package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: wengrunyang
 * @Description: 两数之和----哈希表
 * @DateTime: 2025/7/23 22:42
 **/
public class One {
    /*
    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
    你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
    示例 1：
    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]。
    示例 2：
    输入：nums = [3,2,4], target = 6
    输出：[1,2]
    示例 3：
    输入：nums = [3,3], target = 6
    输出：[0,1]*/

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] twoSum = twoSum(nums, 9);
        System.out.println(Arrays.toString(twoSum));
    }
    
    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 看哈希表中是否存在target - nums[i]这个值，如果存在，则找到了两个数
            if (hashtable.containsKey(target - nums[i])){
                // 找到了两个数，返回他们的数组下标
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            else {
                hashtable.put(nums[i], i);
            }
        }
        return new int[0];
    }

}
