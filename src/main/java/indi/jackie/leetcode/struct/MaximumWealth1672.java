package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/12
 * @description MaximumWealth1672
 */
public class MaximumWealth1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
