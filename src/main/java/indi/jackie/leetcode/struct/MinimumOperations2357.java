package indi.jackie.leetcode.struct;

import java.util.*;

/**
 * @author jackie chen
 * @create 2023/2/24
 * @description MinimumOperations2357
 */
public class MinimumOperations2357 {
    public int minimumOperations(int[] nums) {
        Set<Integer> ans = new HashSet<>(nums.length);
        for (int num : nums) {
            if (num > 0) {
                ans.add(num);
            }
        }
        return ans.size();
    }
}
