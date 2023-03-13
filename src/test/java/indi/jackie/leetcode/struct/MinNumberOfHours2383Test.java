package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/14
 * @description MinNumberOfHours2383Test
 */
public class MinNumberOfHours2383Test {

    @Test
    public void minNumberOfHours() {
        MinNumberOfHours2383 minNumberOfHours2383 = new MinNumberOfHours2383();
        int result = minNumberOfHours2383.minNumberOfHours(5, 3, new int[]{1, 4, 3, 2}, new int[]{2, 6, 3, 1});
        Assert.assertEquals(8, result);
        result = minNumberOfHours2383.minNumberOfHours(2, 4, new int[]{1}, new int[]{3});
        Assert.assertEquals(0, result);
    }
}