package indi.jackie.leetcode.struct;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jackie chen
 * @create 2023/2/21
 * @description RepeatedNTimes961
 */
public class RepeatedNTimes961 {

    public int repeatedNTimes(int[] nums) {
        Set<Integer> ans = new HashSet<>(nums.length/2);
        for (int num : nums) {
            if (!ans.add(num)) {
                return num;
            }
        }
        return -1;
    }
}
