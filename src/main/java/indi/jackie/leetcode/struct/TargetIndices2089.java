package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jackie chen
 * @create 2023/3/7
 * @description TargetIndices2089
 */
public class TargetIndices2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        nums = Arrays.stream(nums).sorted().toArray();

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
            if (nums[i] > target) {
                break;
            }
        }

        return ans;
    }
}
