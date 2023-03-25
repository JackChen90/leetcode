package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/26
 * @description FindSubarrays2395
 */
public class FindSubarrays2395 {
    public boolean findSubarrays(int[] nums) {
        int length = nums.length;

        if (length == 2) {
            return false;
        }

        int leftIndex = 0;
        int rightIndex = 1;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j + 1 >= nums.length) {
                    break;
                }
                if (nums[i] + nums[i + 1] == nums[j] + nums[j + 1]) {
                    return true;
                }
            }
        }

        return false;
    }
}
