package indi.jackie.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/3/26
 * @description MostPoints2140Test
 */
public class MostPoints2140Test {

    @Test
    public void mostPoints() {
        MostPoints2140 mostPoints2140 = new MostPoints2140();
        assertEquals(7, mostPoints2140.mostPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}}));
        assertEquals(5, mostPoints2140.mostPoints(new int[][]{{3, 2}, {4, 3},{4, 4}, {2, 5}}));
        assertEquals(1, mostPoints2140.mostPoints(new int[][]{{1, 1}}));
    }
}