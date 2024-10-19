package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * TODO
 *
 * @author jackie chen
 * @date 2024/10/16 4:22 PM
 **/
public class MaxAreaTest {

    @Test
    public void maxArea() {
        MaxArea maxArea = new MaxArea();
        int answer = maxArea.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, answer);
    }
}