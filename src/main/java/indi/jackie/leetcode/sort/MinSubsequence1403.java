package indi.jackie.leetcode.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jackie chen
 * @create 2023/7/29
 * @description MinSubsequence1403
 */
public class MinSubsequence1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int temp = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            temp += nums[i];
            if (temp > sum - temp) {
                return Arrays.stream(Arrays.copyOfRange(nums, i, nums.length))
                        .boxed().sorted((a, b) -> Integer.compare(b, a)).collect(Collectors.toList());
            }
        }
        return null;
    }
}
