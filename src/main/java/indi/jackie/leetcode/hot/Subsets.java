package indi.jackie.leetcode.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * Subsets (子集)
 *
 * @author jackie chen
 * @date 2024/11/7 8:36 PM
 **/
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int index) {
        result.add(new ArrayList<>(temp));

        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
