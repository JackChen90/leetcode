package indi.jackie.leetcode.hot;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2024/11/3
 * @description MajorityElement
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int halfLength = nums.length / 2;
        return nums[halfLength];
    }
}
