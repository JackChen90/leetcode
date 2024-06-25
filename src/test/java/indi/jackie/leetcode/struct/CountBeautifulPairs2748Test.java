package indi.jackie.leetcode.struct;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountBeautifulPairs2748Test {

    @Test
    public void countBeautifulPairs() {
        CountBeautifulPairs2748 countBeautifulPairs2748 = new CountBeautifulPairs2748();
        int[] nums = new int[]{11, 21, 12};
        int result = countBeautifulPairs2748.countBeautifulPairs(nums);
        assertEquals(2, result);
        nums = new int[]{31, 25, 72, 79, 74};
        result = countBeautifulPairs2748.countBeautifulPairs(nums);
        assertEquals(7, result);
    }
}