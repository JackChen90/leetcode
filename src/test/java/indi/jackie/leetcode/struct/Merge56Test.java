package indi.jackie.leetcode.struct;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jackie chen
 * @create 2023/8/27
 * @description Merge56Test
 */
public class Merge56Test {

    @Test
    public void merge() {
        int[][] intervals = new int[][]{{1, 4}, {4, 5}};

        Merge56 merge56 = new Merge56();
        int[][] result = merge56.merge(intervals);
        for (int[] ints : result) {
            System.out.println(ints[0] + "," + ints[1]);
        }
    }
}