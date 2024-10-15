package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 最长连续序列
 *
 * @author jackie chen
 * @date 2024/10/14 9:49 AM
 **/
public class LongestConsecutiveTest {

    @Test
    public void longestConsecutive() {
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        int result = longestConsecutive.longestConsecutive(nums);
        assertEquals(4, result);
    }
}