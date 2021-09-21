package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2021/9/21
 * @description LengthOfLIS300
 */
public class LengthOfLIS300 {
    public int lengthOfLIS(int[] nums) {
        int f[] = new int[nums.length];

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            f[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
            result = Math.max(result, f[i]);
        }
        return result;
    }
}
