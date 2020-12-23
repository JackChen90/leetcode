package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2020/12/22
 * @description MinCostClimbingStairs746Test
 */
public class MinCostClimbingStairs746Test {

    @Test
    public void minCostClimbingStairs() {
        int[] stairs = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int result = new MinCostClimbingStairs746().minCostClimbingStairs(stairs);
        Assert.assertEquals(6, result);
        stairs = new int[]{10, 15, 20};
        result = new MinCostClimbingStairs746().minCostClimbingStairs(stairs);
        Assert.assertEquals(15, result);
    }
}