package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2020/9/7
 * @description MaxSubArraySum53
 */
public class MaxSubArraySum53 {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sum[0] = nums[0];
                continue;
            }
            sum[i] = max(sum[i - 1] + nums[i], nums[i]);

            if (result < sum[i]) {
                result = sum[i];
            }
        }
        return result;
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
