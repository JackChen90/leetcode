package indi.jackie.leetcode.sort;

/**
 * @author jackie chen
 * @create 2023/4/8
 * @description SortArrayByParityII922
 */
public class SortArrayByParityII922 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int odd = 1;
        int even = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[even] = num;
                even += 2;
            } else {
                ans[odd] = num;
                odd += 2;
            }
        }

        return ans;
    }
}
