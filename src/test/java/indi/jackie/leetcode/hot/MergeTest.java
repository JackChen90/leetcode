package indi.jackie.leetcode.hot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 合并区间
 *
 * @author jackie chen
 * @date 2024/10/21 12:19 AM
 **/
public class MergeTest {

    @Test
    public void merge() {
        Merge merge = new Merge();
        int[][] result = merge.merge(new int[][]{{2, 3}, {5, 5}, {2, 2}, {3, 4}, {3, 4}});
        for (int[] ints : result) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }
}