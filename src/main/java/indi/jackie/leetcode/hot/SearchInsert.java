package indi.jackie.leetcode.hot;

/**
 * 搜索插入位置
 *
 * @author jackie chen
 * @create 2024/11/3
 * @description SearchInsert
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        }

        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}
