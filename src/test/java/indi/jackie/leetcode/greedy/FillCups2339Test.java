package indi.jackie.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/2/11
 * @description FillCups2339Test
 */
public class FillCups2339Test {

    @Test
    public void fillCups() {
        FillCups2339 fillCups2339 = new FillCups2339();
        int[] amount = new int[]{5,0,0};

        int result = fillCups2339.fillCups(amount);
        Assert.assertEquals(5, result);

        amount = new int[] {5,4,4};
        result = fillCups2339.fillCups(amount);
        Assert.assertEquals(7, result);

    }
}