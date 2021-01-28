package indi.jackie.leetcode.struct;

import java.util.Arrays;

/**
 * @author jackie chen
 * @create 2021/1/28
 * @description PivotIndex724
 */
public class PivotIndex724 {

    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int leftSum = 0;
        int total = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            if (2 * leftSum + nums[i] == total) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
