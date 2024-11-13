package indi.jackie.leetcode.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * 给你一个包含n个整数的数组nums，判断nums中是否存在三个元素a，b，c，使得a+b+c=0？请你找出所有和为0且不重复的三元组。
 *
 * @author jackie chen
 * @date 2024/10/17 9:03 AM
 **/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        // 排序
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return result;
            }
            // 去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            twoSum(nums, result, target, left, right);
        }
        return result;
    }

    private void twoSum(int[] nums, List<List<Integer>> result, int target, int left, int right) {
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                List<Integer> oneAnswer = new ArrayList<>();
                oneAnswer.add(nums[left]);
                oneAnswer.add(nums[right]);
                oneAnswer.add(-target);
                result.add(oneAnswer);

                left++;
                right--;
                // 去重
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
