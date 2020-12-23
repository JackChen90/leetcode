package indi.jackie.leetcode.dp;

import java.util.Objects;

/**
 * @author jackie chen
 * @create 2020/12/22
 * @description MinCostClimbingStairs
 */
public class MinCostClimbingStairs746 {

    public int minCostClimbingStairs(int[] cost) {
        if (Objects.isNull(cost) || cost.length == 0) {
            return 0;
        }

        int[] result = new int[cost.length];

        // r[i] = min(r[i-1] + cost[i], r[i-2] + cost[i])
        result[0] = cost[0];
        result[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            result[i] = Math.min(result[i - 1] + cost[i], result[i - 2] + cost[i]);
        }
        return Math.min(result[result.length - 1], result[result.length - 2]);
    }
}
