package indi.jackie.leetcode.hot;

/**
 * @author jackie chen
 * @create 2024/10/13
 * @description TwoSum
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int first = nums[i];
            for (int j = i + 1; j < length; j++) {
                int second = nums[j];
                if (first + second == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
