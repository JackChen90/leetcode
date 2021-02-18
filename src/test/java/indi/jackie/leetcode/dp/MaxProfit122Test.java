package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2021/2/18
 * @description MaxProfit122Test
 */
public class MaxProfit122Test {

    @Test
    public void maxProfit() {
        int[] param = new int[]{7, 1, 5, 3, 6, 4};
        int benefit = new MaxProfit122().maxProfit(param);
        Assert.assertEquals(7, benefit);

        param = new int[]{7, 6, 5, 4, 3, 2};
        benefit = new MaxProfit122().maxProfit(param);
        Assert.assertEquals(0, benefit);
    }
}