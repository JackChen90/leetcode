package indi.jackie.leetcode.dp;

import indi.jackie.leetcode.dp.MaxSubArraySum53;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2020/9/7
 * @description MaxSubArraySum53Test
 */
public class MaxSubArraySum53Test {

    int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

    @Test
    public void test() {
        int sum = new MaxSubArraySum53().maxSubArray(array);
        Assert.assertEquals(6, sum);
    }
}
