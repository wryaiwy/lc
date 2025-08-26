package com.algorithms;

/**
 * @Author: wengrunyang
 * @Description: 递归算法
 * @DateTime: 2025/6/24 19:06
 **/
public class RecursiveAlgorithm {

    public static void main(String[] args) {
        System.out.println(getSun(100));
        System.out.println(getFactorialRecursion(5));
    }

    private static int getSun(int number){
        if(number == 1){
            return 1;
        }

        return number + getSun(number - 1);
    }

    private static int getFactorialRecursion(int number){
        if(number == 1){
            return 1;
        }
        return number * getFactorialRecursion(number - 1);
    }

}
