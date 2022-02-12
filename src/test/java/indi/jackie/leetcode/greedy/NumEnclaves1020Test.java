package indi.jackie.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jackie chen
 * @create 2022/2/12
 * @description NumEnclaves1020Test
 */
public class NumEnclaves1020Test {

    @Test
    public void numEnclaves() {

        NumEnclaves1020 numEnclaves1020 = new NumEnclaves1020();

        int[][] grid = {{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        int result = numEnclaves1020.numEnclaves(grid);
        Assert.assertEquals(3, result);

        int[][] grid2 = {{0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}};
        result = numEnclaves1020.numEnclaves(grid2);
        Assert.assertEquals(0, result);

        int[][] grid3 = {{0,0,0,1,1,1,0,1,0,0},{1,1,0,0,0,1,0,1,1,1},{0,0,0,1,1,1,0,1,0,0},{0,1,1,0,0,0,1,0,1,0},{0,1,1,1,1,1,0,0,1,0},{0,0,1,0,1,1,1,1,0,1},{0,1,1,0,0,0,1,1,1,1},{0,0,1,0,0,1,0,1,0,1},{1,0,1,0,1,1,0,0,0,0},{0,0,0,0,1,1,0,0,0,1}};
        result = numEnclaves1020.numEnclaves(grid3);
        Assert.assertEquals(3, result);
    }
}