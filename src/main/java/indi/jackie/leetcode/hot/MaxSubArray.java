package indi.jackie.leetcode.hot;

/**
 * 最大子数组和
 *
 * @author jackie chen
 * @date 2024/10/20 5:00 PM
 **/
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        //前缀和, 最前面都要"补一位"
        int minSum = 0;

        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            ans = Math.max(ans, sum - minSum);
            if (minSum > sum) {
                minSum = sum;
            }
        }
        return ans;
    }
}
