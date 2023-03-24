package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/24
 * @description CountKDifference2006
 */
public class CountKDifference2006 {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
