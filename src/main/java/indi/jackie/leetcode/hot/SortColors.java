package indi.jackie.leetcode.hot;

/**
 * 颜色分类
 *
 * @author jackie chen
 * @date 2024/11/11 5:30 PM
 **/
public class SortColors {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[right] == 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        int notZeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                notZeroIndex = i;
                break;
            }
        }
        if (notZeroIndex == -1) {
            return;
        }

        left = notZeroIndex;
        right = notZeroIndex;
        for (int i = notZeroIndex; i < nums.length; i++) {
            if (nums[right] == 1) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
