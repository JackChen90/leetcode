package indi.jackie.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2021/4/24
 * @description CombinationSum4_377Test
 */
public class CombinationSum4_377Test {

    @Test
    public void combinationSum4() {
        int[] nums = {1, 2, 3};
        int target = 4;
        int result = new CombinationSum4_377().combinationSum4(nums, target);
        Assert.assertEquals(7, result);
    }
}