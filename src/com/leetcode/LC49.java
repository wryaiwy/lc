package com.leetcode;

import java.util.*;

/**
 * @Author: wengrunyang
 * @Description: 字母异位词分组
 * @DateTime: 2026/7/5 21:12
 **/
public class LC49 {

    /**
     * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
     * 示例:
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出:
     * [
     *   ["ate","eat","tea"],
     *   ["nat","tan"],
     *   ["bat"]
     * ]
     */

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i=0;i<strs.length;i++) {
            String str = strs[i];
            char[] array = str.toCharArray();   // 把字符串转换成一个 char[] 数组  如："eat" -> ['e','a','t']
            Arrays.sort(array); // 对数组进行排序  如：['a','e','t']
            String mapKey = new String(array);  // "aet"
            List<String> list = map.getOrDefault(mapKey, new ArrayList<String>());   // 如果key不存在，则创建一个新的ArrayList
            list.add(str);
            map.put(mapKey, list);
        }
        return new ArrayList<List<String>>(map.values());
    }


}
