package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2024/11/3
 * @description ClimbStairsTest
 */
public class ClimbStairsTest {

    @Test
    public void climbStairs() {
        ClimbStairs climbStairs = new ClimbStairs();
        assertEquals(1836311903, climbStairs.climbStairs(45));
    }
}