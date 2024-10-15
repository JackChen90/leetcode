package indi.jackie.leetcode.hot;

import java.util.Set;

/**
 * 最长连续序列
 *
 * @author jackie chen
 * @date 2024/10/14 9:35 AM
 **/
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new java.util.HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;
        for (int num : nums) {
            int currentLongest = 0;
            //可能是起点, 从起点开始计算, 直到不连续
            if(!numSet.contains(num - 1)) {
                currentLongest = 1;
                int currentNum = num + 1;
                while (numSet.contains(currentNum++)) {
                    currentLongest++;
                }
            } else {
                //不是起点, 直接跳过
                continue;
            }
            longest = Math.max(longest, currentLongest);
        }
        return longest;
    }
}
