package indi.jackie.leetcode.hot;

import java.util.Arrays;

/**
 * 只出现一次的数字
 *
 * @author jackie chen
 * @create 2024/11/3
 * @description SingleNumber
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 == nums.length) {
                return nums[i];
            }
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        //不存在此情况
        return Integer.MIN_VALUE;
    }
}
