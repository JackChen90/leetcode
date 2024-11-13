package indi.jackie.leetcode.hot;

import java.util.Arrays;

/**
 * 多数元素
 * 多数元素是指在数组中出现次数大于 n/2 的元素
 *
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
