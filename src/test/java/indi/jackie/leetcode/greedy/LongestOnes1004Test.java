package indi.jackie.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/2/19
 * @description LongestOnes1004Test
 */
public class LongestOnes1004Test {

    @Test
    public void longestOnes() {
        int[] param = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int result = new LongestOnes1004().longestOnes(param, 1);
        Assert.assertEquals(5, result);

        param = new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        result = new LongestOnes1004().longestOnes(param, 3);
        Assert.assertEquals(10, result);

        param = new int[]{0, 0, 0, 0, 1};
        result = new LongestOnes1004().longestOnes(param, 5);
        Assert.assertEquals(5, result);

        param = new int[]{0, 1, 1, 0};
        result = new LongestOnes1004().longestOnes(param, 1);
        Assert.assertEquals(3, result);
    }
}
