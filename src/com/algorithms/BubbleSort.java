package com.algorithms;

import java.util.Arrays;

/**
 * @Author: wry
 * @Description: 冒泡排序
 * @DateTime: 2025/6/18 20:36
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] values =  {3,1,6,2,9,0,7,4,8,5};
        bubbleSort(values);
    }

    //封装，便于丰富利用
    public static void bubbleSort(int[] values) {   //留了个返回处理“void”
        System.out.println("排序前，数组：" + Arrays.toString(values));

        //冒泡排序的核心代码

        int temp;   //用于交换的临时变量
        boolean flag = true;    //定义一个布尔类型变量，标记数组是否已达到有序状态

        for (int i=0;i<values.length;i++){

            for (int j=0;j<values.length-i-1;j++){  //每比较一次，下次比较就可以少一次；所以“values.length”要减去“i”;
                if(values[j]>values[j+1]) {         //因为"values[j+1]"加了1，所有上一行代码“length-i-1”需要减1
                    //两两比较，如果大于，则互换元素
                    temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                    //本趟发生了交换，表面该数组在本趟处于无序状态，需要继续排序
                    flag = false;
                }
                System.out.println("第" + i + "趟：第" + j + "次：" + Arrays.toString(values));
            }

            //冒泡排序的优化
            if(flag){
                System.out.println("结束排序！");    //已经交换完了，“核心代码”运行完成，第28行的“flag = false;”不会运行，所有本行打印"结束排序！"
                break;
            }else{
                flag = true;    //把第二次的for循环“flag = false;”重置为本行的“flag = true;”
            }
            System.out.println("第" + i + "趟,完成时：" + Arrays.toString(values));
        }
    }

}
