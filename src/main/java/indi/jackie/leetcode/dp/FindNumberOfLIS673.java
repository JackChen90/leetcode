package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2021/9/21
 * @description FindNumberOfLIS673
 */
public class FindNumberOfLIS673 {

    public int findNumberOfLIS(int[] nums) {
        int f[] = new int[nums.length];
        int c[] = new int[nums.length];
        int max = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            f[i] = 1;
            c[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (f[i] < f[j] + 1) {
                        f[i] = f[j] + 1;
                        //第一次匹配, 直接赋值
                        c[i] = c[j];
                    } else if (f[i] == f[j] + 1) {
                        //非第一次匹配, 累加之前的结果
                        c[i] += c[j];
                    }
                }
            }
            max = Math.max(max, f[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (max == f[i]) {
                result += c[i];
            }
        }
        return result;
    }
}
