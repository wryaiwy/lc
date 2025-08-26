package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: wengrunyang
 * @Description: 对链表进行插入排序
 * @DateTime: 2025/6/24 19:12
 **/
public class OneHundredFortySeven {

    //TODO 147 链表

    public static void main(String[] args) {
        List<Integer> head = new ArrayList<>();
        head.addAll(Arrays.asList(-1, 5, 3, 4, 0));
        insertionSort(head);
    }

    /**
     * 插入排序
     * @param head
     */
    private static void insertionSort(List<Integer> head){
        int index = -1;
        for(int i=0;i<head.size();i++){
            if(head.get(i) > head.get(i + 1)){
                index = i+1;
                break;
            }
        }
        for(int i=index;i<head.size();i++){
            int j = i;
            while (j>0 && head.get(j)<head.get(j-1)) {
                int temp = head.get(j);
                head.set(j,head.get(j-1));
                head.set(j-1,temp);
                j--;
            }
        }
        System.out.println(head);
    }

    static class ListNode {
        int val;        // 节点值
        ListNode next;  // 下一个节点指针
        ListNode(int x) {
            val = x;
        }
    }
}


