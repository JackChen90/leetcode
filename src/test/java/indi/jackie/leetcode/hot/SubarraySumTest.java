package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * SubarraySumTest
 *
 * @author jackie chen
 * @date 2024/10/20 2:08 PM
 **/
public class SubarraySumTest {

    @Test
    public void subarraySum() {
        SubarraySum subarraySum = new SubarraySum();
        System.out.println(subarraySum.subarraySum(new int[]{1,-1,0}, 0));
    }
}