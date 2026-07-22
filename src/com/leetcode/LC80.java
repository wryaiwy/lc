package com.leetcode;

import java.util.Arrays;

/**
 * @Author: wengrunyang
 * @Description: 删除有序数组中的重复项 II
 * @DateTime: 2026/7/21 21:31
 **/
public class LC80 {

    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 最多出现两次 ，返回删除后数组的新长度。
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     * 示例 1：
     * 输入：nums = [1,1,1,2,2,3]
     * 输出：5, nums = [1,1,2,2,3]
     * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
     *
     * 示例 2：
     * 输入：nums = [0,0,1,1,1,1,2,3,3]
     * 输出：7, nums = [0,0,1,1,2,3,3]
     * 解释：函数应返回新长度 length = 7, 并且原数组的前七个元素被修改为 0, 0, 1, 1, 2, 3, 3。不需要考虑数组中超出新长度后面的元素。
     *
     */

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int len1 = removeDuplicates(nums1);
        System.out.println("长度: " + len1 + ", 数组: " + Arrays.toString(Arrays.copyOf(nums1, len1)));

        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int len2 = removeDuplicates(nums2);
        System.out.println("长度: " + len2 + ", 数组: " + Arrays.toString(Arrays.copyOf(nums2, len2)));
    }

    // TODO 双指针
    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // slow 为写指针：下一个可写入位置的下标
        // fast 为扫描指针：遍历整个数组
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            // 前两个元素直接保留；之后只有与 slow 前第 2 位不同时才保留，从而确保每个元素最多出现两次
            if (slow < 2 || nums[fast] != nums[slow - 2]) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

}
