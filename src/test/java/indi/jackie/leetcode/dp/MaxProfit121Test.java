package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/1/21
 * @description MaxProfit121Test
 */
public class MaxProfit121Test {

    @Test
    public void maxProfit() {
        int[] param = new int[]{7, 1, 5, 3, 6, 4};
        int benefit = new MaxProfit121().maxProfit(param);
        Assert.assertEquals(5, benefit);

        param = new int[]{7, 6, 5, 4, 3, 2};
        benefit = new MaxProfit121().maxProfit(param);
        Assert.assertEquals(0, benefit);
    }
}