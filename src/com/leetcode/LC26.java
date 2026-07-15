package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: wengrunyang
 * @Description:
 * @DateTime: 2025/8/28 16:30
 **/
public class LC26 {

    /**
     * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素只出现一次,返回删除后数组的新长度。元素的相对顺序应该保持一致 。然后返回 nums 中唯一元素的个数。
     * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
     * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
     * 返回 k 。
     *
     * 示例 1：
     * 输入：nums = [1,1,2]
     * 输出：2, nums = [1,2,_]
     * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
     *
     * 示例 2：
     * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
     * 输出：5, nums = [0,1,2,3,4]
     * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
     */

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates2(nums);
        System.out.println("k = " + k);
        System.out.print("nums = ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? "," : ""));
        }
    }

    private static int removeDuplicates1(int[] nums){
        Set<Integer> set = new HashSet<>();
        int k = 0;  // 下一个要写入的位置
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {   // 首次出现
                set.add(nums[i]);
                nums[k++] = nums[i];    // 原地写回前 k 个位置
            }
        }
        return k; // 返回唯一元素的个数
    }

    //  TODO 双指针
    private static int removeDuplicates2(int[] nums){
        if (nums.length == 0) return 0;
        int slow = 1; // 下一个要写入的位置（首元素必然保留）
        for (int fast = 1; fast < nums.length; fast++) {
            // 数组已排序，与已写入的最后一个元素比较即可
            if (nums[fast] != nums[slow - 1]) {
                nums[slow++] = nums[fast];
            }
        }
        return slow; // 唯一元素的个数 k
    }

}
