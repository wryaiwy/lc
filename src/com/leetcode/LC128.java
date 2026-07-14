package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: wengrunyang
 * @Description: 最长连续序列
 * @DateTime: 2025/6/24 22:40
 **/
public class LC128 {

    /**
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     *
     * 示例1：
     * 输入：nums = [100,4,200,1,3,2]
     * 输出：4
     * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
     *
     * 示例2：
     * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
     * 输出：9
     *
     * 示例3：
     * 输入：nums = [1,0,1,2]
     * 输出：3
     */


    public static void main(String[] args) {
        // 测试数据
        int[] nums = {1,0,1,2};
        System.out.println(longestConsecutive_2(nums));
    }

    private static int longestConsecutive_1(int[] nums) {
        // 1、先将nums排序；
        Arrays.sort(nums);
        int max = 0;
        // 2、开始循环；
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // 重复元素作为起点无意义，跳过
            }
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[j - 1] == 1) {
                    count++;
                } else if (nums[j] == nums[j - 1]) {
                    continue; // 重复元素跳过，不中断序列
                } else {
                    break; // 差 > 1，序列断裂
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }

    private static int longestConsecutive_2(int[] nums) {
        // 1、将所有数放入哈希集合，去重且 O(1) 查询；
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        // 2、遍历每个数，仅当它是一段连续序列的起点时才向后统计；
        for (int num : set) {
            // 若 num-1 存在，说明 num 不是起点，跳过，避免重复统计；
            if (set.contains(num - 1)) {
                continue;
            }
            int count = 1;
            while (set.contains(num + count)) {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

}
