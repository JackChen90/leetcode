package indi.jackie.leetcode.greedy;

/**
 * @author jackie chen
 * @create 2023/2/27
 * @description MovesToMakeZigzag1144
 */
public class MovesToMakeZigzag1144 {
    public int movesToMakeZigzag(int[] nums) {
        return Math.min(getMin(nums, 0), getMin(nums, 1));
    }

    private int getMin(int[] nums, int pos) {
        int result = 0;
        for (int i = pos; i < nums.length; i += 2) {
            int a = 0;
            if (i > 0) {
                a = Math.max(a, nums[i] - nums[i - 1] + 1);
            }
            if (i < nums.length - 1) {
                a = Math.max(a, nums[i] - nums[i + 1] + 1);
            }
            result += a;
        }
        return result;
    }
}
