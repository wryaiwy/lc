package com.leetcode;

/**
 * @Author: wengrunyang
 * @Description: 爬楼梯
 * @DateTime: 2025/8/26 14:22
 **/
public class Seventy {

    /*
    假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
    每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

    示例 1：
    输入：n = 2
    输出：2
    解释：有两种方法可以爬到楼顶。
    1. 1 阶 + 1 阶
    2. 2 阶

    示例 2：
    输入：n = 3
    输出：3
    解释：有三种方法可以爬到楼顶。
    1. 1 阶 + 1 阶 + 1 阶
    2. 1 阶 + 2 阶
    3. 2 阶 + 1 阶
    */

    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }

    private static int climbStairs(int n) {
        if (n <= 1) return 1;
        int prev1 = 1;
        int prev2 = 1;
        int current = 0;
        for (int i = 2; i <= n; i++) {
            // 计算当前台阶的方法数
            current = prev1 + prev2;
            // 更新 prev2 为前一个状态
            prev2 = prev1;
            // 更新 prev1 为当前状态
            prev1 = current;
        }
        return current;
    }
}
