package indi.jackie.leetcode.hot;

/**
 * 除自身以外数组的乘积
 * todo 尝试实现O(1)空间复杂度
 *
 * @author jackie chen
 * @date 2024/10/22 12:22 AM
 **/
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        //左前缀乘积
        int[] left = new int[nums.length];
        //右前缀乘积
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}
