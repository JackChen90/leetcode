package indi.jackie.leetcode.struct;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2023/2/19
 * @description MaxAverageRatio1792Test
 */
public class MaxAverageRatio1792Test {

    @Test
    public void maxAverageRatio() {
        int[][] param = new int[][]{{511, 910}, {289, 691}, {4, 279}, {87, 843}, {415, 788}};
        MaxAverageRatio1792 maxAverageRatio1792 = new MaxAverageRatio1792();

        double ans = maxAverageRatio1792.maxAverageRatio(param, 61437);
        System.out.println(ans);
    }
}