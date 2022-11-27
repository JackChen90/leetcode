package indi.jackie.leetcode.struct;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/11/27
 * @description Check1752Test
 */
public class Check1752Test {

    @Test
    public void check() {
        Check1752 check1752 = new Check1752();

        int[] nums = new int[]{3, 4, 5, 1, 2};
        boolean result = check1752.check(nums);
        Assert.assertTrue(result);

        nums = new int[]{6,10,6};
        result = check1752.check(nums);
        Assert.assertTrue(result);
    }
}