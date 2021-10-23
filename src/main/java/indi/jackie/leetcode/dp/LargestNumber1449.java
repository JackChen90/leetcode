package indi.jackie.leetcode.dp;

/**
 * @author jackie chen
 * @create 2021/6/13
 * @description LargestNumber1449
 */
public class LargestNumber1449 {

    /**
     * dp问题
     * 解为f, f(target) = "i" + f(target-cost[i-1]) , 0 < i < 10
     *
     * @param cost
     * @param target
     * @return
     */
    public String largestNumber(int[] cost, int target) {
        String[] dp = new String[target + 1];
        dp[0] = "";
        // 背包问题，先枚举物品
        for (int i = 0; i < cost.length; i++) {
            // 完全背包，从低到高枚举背包容量
            for (int j = cost[i]; j <= target; j++) {
                if (dp[j - cost[i]] == null) {
                    continue;
                }
                String temp = (i + 1) + dp[j - cost[i]];
                if (!dpBigger(temp, dp[j])) {
                    dp[j] = temp;
                }
            }
        }
        return dp[target] == null ? "0" : dp[target];
    }

    private boolean dpBigger(String temp, String dp) {
        if (dp == null) {
            return false;
        }
        if (temp.length() == dp.length()) {
            return dp.compareTo(temp) > 0;
        }
        return dp.length() > temp.length();
    }
}
