package indi.jackie.leetcode.hot;

/**
 * MoveZeroes
 *
 * @author jackie chen
 * @date 2024/10/15 5:43 PM
 **/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
