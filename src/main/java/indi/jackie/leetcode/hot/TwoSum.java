package indi.jackie.leetcode.hot;

/**
 * 两数之和
 * 给定一个整数数组nums和一个目标值target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标
 *
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
