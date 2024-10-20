package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 最大子数组和
 *
 * @author jackie chen
 * @date 2024/10/20 5:09 PM
 **/
public class MaxSubArrayTest {

    @Test
    public void maxSubArray() {
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray.maxSubArray(new int[]{1}));
        System.out.println(maxSubArray.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        System.out.println(maxSubArray.maxSubArray(new int[]{-2,-1}));
    }
}