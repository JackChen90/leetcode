package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2021/4/24
 * @description CombinationSum4_377
 */
public class CombinationSum4_377 {

    /**
     * 设dp[i]为target为i的所有组合数, nums为入参数组. 考虑每个小于target的元素作为目标序列的最后一位数, 则计算dp[i]则转换为计算dp[i-num].
     * 这个方法考虑了元素的排序
     *
     * @param nums   入参nums
     * @param target 目标target
     * @return 由nums中元素组成target的所有组合(元素可重复, 组合内不同元素位置不同算新组合)
     */
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}
