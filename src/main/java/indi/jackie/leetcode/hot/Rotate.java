package indi.jackie.leetcode.hot;

/**
 * 轮转数组
 *
 * @author jackie chen
 * @date 2024/10/21 8:53 AM
 **/
public class Rotate {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int length = nums.length;
        k = k % length;
        if (k == 0) {
            return;
        }

        reverse(nums, 0, length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
    }

    private static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}
