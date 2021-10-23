package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/6/14
 * @description LargestNumber1449Test
 */
public class LargestNumber1449Test {

    @Test
    public void largestNumber() {
        int[] params = new int[]{4, 3, 2, 5, 6, 7, 2, 5, 5};
        int target = 9;
        LargestNumber1449 largestNumber1449 = new LargestNumber1449();

        String result = largestNumber1449.largestNumber(params, target);

        Assert.assertEquals("7772", result);
    }
}