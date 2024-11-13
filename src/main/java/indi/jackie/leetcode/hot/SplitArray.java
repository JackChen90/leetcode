package indi.jackie.leetcode.hot;

/**
 * 分割数组
 * 四分数组，使得四个子数组的和相等. 子数组不包含3个分割点
 *
 * @author jackie chen
 * @create 2024/11/13
 * @description SplitArray
 */
public class SplitArray {

    public boolean splitArray(int[] nums) {
        int length = nums.length;
        if (length < 7) {
            return false;
        }

        int[] sum = new int[length];
        sum[0] = nums[0];
        for (int i = 1; i < length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        for (int j = 3; j < length - 3; j++) {
            if (check(sum, j)) {
                return true;
            }
        }
        return false;
    }

    private boolean check(int[] sum, int j) {
        for (int i = 1; i < j - 1; i++) {
            if (sum[i - 1] == sum[j - 1] - sum[i]) {
                for (int k = j + 2; k < sum.length - 1; k++) {
                    if (sum[k - 1] - sum[j] == sum[sum.length - 1] - sum[k] && sum[sum.length - 1] - sum[k] == sum[j - 1] - sum[i]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
