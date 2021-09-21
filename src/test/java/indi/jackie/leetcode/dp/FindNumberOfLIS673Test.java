package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/9/21
 * @description FindNumberOfLIS673Test
 */
public class FindNumberOfLIS673Test {

    @Test
    public void findNumberOfLIS() {
        int param[];
        int result;

        FindNumberOfLIS673 findNumberOfLIS673 = new FindNumberOfLIS673();

        param = new int[]{1, 3, 5, 4, 7};
        result = findNumberOfLIS673.findNumberOfLIS(param);
        Assert.assertEquals(2, result);
        param = new int[]{2, 2, 2, 2, 2};
        result = findNumberOfLIS673.findNumberOfLIS(param);
        Assert.assertEquals(5, result);
    }
}