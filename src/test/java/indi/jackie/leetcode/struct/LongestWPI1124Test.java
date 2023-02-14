package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2023/2/14
 * @description LongestWPI1124Test
 */
public class LongestWPI1124Test {

    @Test
    public void longestWPI() {
        int[] hours = new int[]{9, 9, 6, 0, 6, 6, 9};
        LongestWPI1124 longestWPI1124 = new LongestWPI1124();
        int result = longestWPI1124.longestWPI(hours);
        Assert.assertEquals(3, result);

        hours = new int[]{6,6,6};
        result = longestWPI1124.longestWPI(hours);
        Assert.assertEquals(0, result);
    }
}