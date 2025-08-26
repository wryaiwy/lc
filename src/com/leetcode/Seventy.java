package com.leetcode;

/**
 * @Author: wengrunyang
 * @Description: 爬楼梯
 * @DateTime: 2025/8/26 14:22
 **/
public class Seventy {

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
