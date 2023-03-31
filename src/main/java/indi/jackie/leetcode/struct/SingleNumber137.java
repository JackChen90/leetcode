package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/31
 * @description SingleNumber137
 */
public class SingleNumber137 {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] data = new int[32];

        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num >> i & 1) == 1) {
                    data[i]++;
                }
            }
        }

        for (int i = 0; i < 32; i++) {
            data[i] %= 3;
        }

        int ans = 0;

        for (int i = 0; i < 32; i++) {
            if (data[i] == 1) {
                ans += 1 << i;
            }
        }

        return ans;
    }
}
