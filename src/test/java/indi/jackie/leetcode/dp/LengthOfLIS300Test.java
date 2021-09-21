package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/9/21
 * @description LengthOfLIS300Test
 */
public class LengthOfLIS300Test {

    @Test
    public void lengthOfLIS() {
        LengthOfLIS300 lengthOfLIS30 = new LengthOfLIS300();
        int param[];
        int result;
        param = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        result = lengthOfLIS30.lengthOfLIS(param);
        Assert.assertEquals(4, result);
        param = new int[]{0, 1, 0, 3, 2, 3};
        result = lengthOfLIS30.lengthOfLIS(param);
        Assert.assertEquals(4, result);
        param = new int[]{7, 7, 7, 7, 7, 7, 7};
        result = lengthOfLIS30.lengthOfLIS(param);
        Assert.assertEquals(1, result);
    }
}